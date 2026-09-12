"""Static regression guards, not Android/LSPosed behavioral tests."""
from pathlib import Path
import unittest

SOURCE = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HeyBoxModule.java").read_text(encoding="utf-8")


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
        body = section("private void migrateRemotePreferencesIfNeeded(", "private ")
        self.assertLess(body.index("hostPreferences.contains(key)"), body.index("editor.putString(key"))

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
