"""Static regression guards, not Android/LSPosed behavioral tests."""
from pathlib import Path
import unittest

SOURCE = (Path(__file__).resolve().parents[1] / "app/src/main/java/dev/heybox/hook/HeyBoxModule.java").read_text(encoding="utf-8")


def section(start, end):
    return SOURCE.split(start, 1)[1].split(end, 1)[0]


class ReviewGuards(unittest.TestCase):
    def test_host_share_chain_not_replayed(self):
        body = section("private void installTaskShareHook(", "private void installTaskButtonHook(")
        self.assertEqual(body.count("chain.proceed()"), 1)
        self.assertGreater(body.index("return chain.proceed()"), body.index('recordRuntimeFallback("'))

    def test_unbound_host_response_not_consumed(self):
        self.assertNotIn("scheduleObservedDailyShareTasks", SOURCE)
        body = section("hook(consume).intercept", 'recordHookGroup("每日分享任务")')
        self.assertIn("triggerDailyShareFetch(classLoader)", body)
        self.assertNotIn("chain.getArg", body)

    def test_local_report_failure_enters_cooldown(self):
        body = section("if (completed <= 0)", 'info("DAILY_TASK_REPORT_FINISH')
        self.assertIn("applyDailyShareCooldownAndClose(runContext)", body)

    def test_migration_preserves_new_values(self):
        body = section("private void migrateRemotePreferencesIfNeeded(", "private ")
        self.assertLess(body.index("hostPreferences.contains(key)"), body.index("editor.putString(key"))

    def test_original_skip_does_not_clear_failure(self):
        body = section("hook(updateOriginal).intercept", 'recordHookGroup("图片增强")')
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
