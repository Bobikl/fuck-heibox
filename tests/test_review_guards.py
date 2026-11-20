"""Static regression guards, not Android/LSPosed behavioral tests."""
from pathlib import Path
import re
import unittest

SOURCE_PATH = Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HeyBoxModule.java"
SOURCE = SOURCE_PATH.read_text(encoding="utf-8")


def section(start, end):
    return SOURCE.split(start, 1)[1].split(end, 1)[0]


class ReviewGuards(unittest.TestCase):
    def test_removed_features_have_no_runtime_or_ui_entry(self):
        ui = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HostSettingsDialog.java").read_text(encoding="utf-8")
        for token in ("KEY_AD_CLEAN_FEED", "KEY_DISABLE_VIDEO_AUTOPLAY", "RuntimeBridge", "SelfCheck"):
            self.assertNotIn(token, SOURCE + ui)
        for token in ("hookFilteredFeedGetter", "feedContentStamp", "installRecommendedVideoAutoplayHooks", "hookGroupProgress"):
            self.assertNotIn(token, SOURCE)
        self.assertIn("KEY_DISABLE_GIF_AUTOPLAY", ui)

    def test_home_only_scoped_refresh_is_blocked(self):
        body = section("private int installScopedHomeRefresh(", "private void installImageEnhancementHook(")
        self.assertIn("deoptimize(entry)", body)
        self.assertIn("previouslyHidden.contains(fragment)", body)
        self.assertIn("!first.getBoolean(fragment)", body)
        self.assertIn("suppressHomeVisibilityRefresh.get() == chain.getThisObject()", body)
        self.assertIn("suppressHomeVisibilityRefresh.set(previous)", body)
        self.assertNotIn('getDeclaredMethod("onRefresh"', body)

    def test_normal_ready_does_not_hook_url_setter(self):
        body = section("private void installImageEnhancementHook(", "private void markViewerImageReady(")
        self.assertNotIn('getMethod("H"', body)
        self.assertIn('getDeclaredMethod("k", View.class, mediaData)', body)

    def test_long_image_event_not_polling(self):
        body = section("private void installLongImageReadyHook(", "private void requestOriginalImage(")
        self.assertIn('getDeclaredMethod("onImageLoaded")', body)
        self.assertIn("WeakIdentityMap<Object, WeakReference<Object>>", body)
        self.assertNotIn("postDelayed", body)
        self.assertNotIn('getDeclaredMethod("onDraw"', body)

    def test_host_share_chain_not_replayed(self):
        body = section("private void installTaskShareHook(", "private void installTaskButtonHook(")
        self.assertEqual(body.count("chain.proceed()"), 1)
        self.assertGreater(body.index("return chain.proceed()"), body.index('recordRuntimeFallback("'))

    def test_unbound_host_response_not_consumed(self):
        self.assertNotIn("scheduleObservedDailyShareTasks", SOURCE)
        body = section("hook(consume).intercept", 'info("HOOK_DAILY_TASK_OK')
        self.assertIn("triggerDailyShareFetch(classLoader)", body)
        self.assertNotIn("chain.getArg", body)

    def test_local_report_failure_enters_cooldown(self):
        body = section("if (completed <= 0)", 'info("DAILY_TASK_REPORT_FINISH')
        self.assertIn("applyDailyShareCooldownAndClose(runContext)", body)

    def test_migration_preserves_new_values(self):
        body = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/SafePreferences.java").read_text(encoding="utf-8")
        self.assertLess(body.index("host.contains(key)"), body.index("editor.putString(key"))
        self.assertIn("safePreferences.migrate(hostPreferences, legacy)", SOURCE)

    def test_splash_preserves_real_binding_initialization(self):
        body = section("private void installSplashAdHook(", "private void installGlobalAdHooks(")
        self.assertNotIn("bindingConstructor", body)
        self.assertNotIn("splashInitialize", body)
        self.assertNotIn("continueLaunch.invoke", body)
        self.assertIn("Modifier.isStatic(selectAd.getModifiers())", body)
        self.assertIn("com.max.xiaoheihe.bean.AdsInfoObj", body)

    def test_settings_entry_uses_lifecycle_manager_and_safe_reads(self):
        body = section("private void openModuleSettings(", "private ViewGroup.LayoutParams")
        self.assertIn("settingsDialogs.open(activity)", body)
        ui = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HostSettingsDialog.java").read_text(encoding="utf-8")
        self.assertNotIn("preferences.getBoolean(", ui)
        self.assertIn("safePreferences.putBoolean(", ui)

    def test_silent_messages_is_opt_in(self):
        body = section("private void initializeTarget(", "private void migrateRemotePreferencesIfNeeded(")
        self.assertIn("if (isEnabled(Config.KEY_SILENT_MESSAGES, false)) {\n"
                      "            installSilentMessagesHook(classLoader);", body)
        ui = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HostSettingsDialog.java").read_text(encoding="utf-8")
        self.assertIn("Config.KEY_SILENT_MESSAGES, false", ui)

    def test_silent_messages_is_scoped_to_badge_after_binding(self):
        body = section("private void installSilentMessagesHook(", "private void installExternalBrowserHooks(")
        self.assertIn("MessageCenterFragment$initViews$msgListAdapter$1", body)
        self.assertIn('getDeclaredMethod("C", holderClass, messageClass)', body)
        self.assertEqual(body.count("chain.proceed()"), 1)
        self.assertLess(body.index("chain.proceed()"), body.index("setVisibility(View.GONE)"))
        self.assertIn('getIdentifier("badge", "id", TARGET_PACKAGE)', body)
        self.assertIn('if ("official_message".equals(entry) || "official_msg_v2".equals(entry)\n'
                      '                            || "discount".equalsIgnoreCase(entry)) {', body)
        self.assertNotIn("setCount", body)

    def test_settings_follow_system_dark_mode(self):
        ui = Path(SOURCE_PATH.parent, "HostSettingsDialog.java").read_text(encoding="utf-8")
        self.assertIn("uiModeManager.getNightMode()", ui)
        self.assertIn("Resources.getSystem().getConfiguration().uiMode", ui)
        self.assertIn("uiMode & Configuration.UI_MODE_NIGHT_MASK", ui)
        self.assertIn("darkMode ? android.R.style.Theme_Material_NoActionBar", ui)
        self.assertIn("Switch toggle = new Switch(getContext())", ui)
        self.assertIn("int lightBarFlags = darkMode ? 0", ui)
        self.assertIn("window.setStatusBarColor(cardColor)", ui)
        self.assertIn("window.setNavigationBarColor(backgroundColor)", ui)

    def test_settings_text_contrast_in_both_palettes(self):
        ui = Path(SOURCE_PATH.parent, "HostSettingsDialog.java").read_text(encoding="utf-8")

        def luminance(color):
            if color == "Color.WHITE":
                return 1.0
            rgb = [int(color[i:i + 2], 16) / 255 for i in (4, 6, 8)]
            linear = [c / 12.92 if c <= 0.04045 else ((c + 0.055) / 1.055) ** 2.4
                      for c in rgb]
            return sum(c * weight for c, weight in zip(linear, (0.2126, 0.7152, 0.0722)))

        def palette(name):
            values = re.search(rf"{name} = darkMode \? (\S+) : (\S+);", ui)
            self.assertIsNotNone(values, name)
            return [luminance(value) for value in values.groups()]

        for text_color in ("primaryColor", "secondaryColor"):
            for surface in ("cardColor", "backgroundColor"):
                for text, background in zip(palette(text_color), palette(surface)):
                    ratio = (max(text, background) + 0.05) / (min(text, background) + 0.05)
                    self.assertGreaterEqual(ratio, 4.5, (text_color, surface))

    def test_original_skip_does_not_clear_failure(self):
        body = section("hook(updateOriginal).intercept", 'info("HOOK_IMAGE_ENHANCE_OK')
        self.assertNotIn("recordRuntimeSuccess", body)
        click = section("private void requestOriginalImage(", "private static boolean hasUsableWifi(")
        self.assertEqual(click.count("recordRuntimeSuccess"), 1)
        self.assertIn("!clickFailed && keepRegistered", click)
        self.assertEqual(click.count("hasUsableWifi(originalButton.getContext())"), 2)

    def test_wifi_does_not_guess_from_other_networks(self):
        body = section("private static boolean hasUsableWifi(", "private static boolean hasWifiInternet(")
        self.assertNotIn("getAllNetworks", body)


if __name__ == "__main__":
    unittest.main()
