package androidx.work.impl;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u001c\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002¨\u0006\u001c"}, d2 = {"", ak.av, "Ljava/lang/String;", "CREATE_SYSTEM_ID_INFO", "b", "MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO", ak.aF, "PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT", "d", "REMOVE_ALARM_INFO", "e", "WORKSPEC_ADD_TRIGGER_UPDATE_DELAY", "f", "WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY", "g", "CREATE_WORK_PROGRESS", RXScreenCaptureService.KEY_HEIGHT, "CREATE_INDEX_PERIOD_START_TIME", "i", "CREATE_RUN_IN_FOREGROUND", "j", "CREATE_OUT_OF_QUOTA_POLICY", "k", "SET_DEFAULT_NETWORK_TYPE", "l", "SET_DEFAULT_CONTENT_URI_TRIGGERS", "m", "INITIALIZE_PERIOD_COUNTER", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f28800a = "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f28801b = "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f28802c = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f28803d = "DROP TABLE IF EXISTS alarmInfo";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f28804e = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f28805f = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f28806g = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f28807h = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f28808i = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f28809j = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final String f28810k = "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f28811l = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final String f28812m = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0";
}
