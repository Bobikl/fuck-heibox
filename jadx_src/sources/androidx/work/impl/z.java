package androidx.work.impl;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", ak.av, "Ljava/lang/String;", "PRUNE_SQL_FORMAT_PREFIX", "b", "PRUNE_SQL_FORMAT_SUFFIX", "", ak.aF, "J", "PRUNE_THRESHOLD_MILLIS", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f29426a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f29427b = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f29428c = TimeUnit.DAYS.toMillis(1);
}
