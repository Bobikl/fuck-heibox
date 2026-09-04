package androidx.work;

import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PeriodicWorkRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b\u001a\u001d\u0010\t\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a5\u0010\f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\b\u001a%\u0010\r\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0087\b¨\u0006\u000e"}, d2 = {"Landroidx/work/m;", androidx.exifinterface.media.a.T4, "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "Landroidx/work/s$a;", ak.av, "Ljava/time/Duration;", ak.aF, "flexTimeInterval", "flexTimeIntervalUnit", "b", "d", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    public static final /* synthetic */ <W extends m> s.a a(long j10, TimeUnit repeatIntervalTimeUnit) {
        f0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        f0.y(4, androidx.exifinterface.media.a.T4);
        return new s.a((Class<? extends m>) m.class, j10, repeatIntervalTimeUnit);
    }

    public static final /* synthetic */ <W extends m> s.a b(long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexTimeIntervalUnit) {
        f0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        f0.p(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        f0.y(4, androidx.exifinterface.media.a.T4);
        return new s.a(m.class, j10, repeatIntervalTimeUnit, j11, flexTimeIntervalUnit);
    }

    @w0(26)
    public static final /* synthetic */ <W extends m> s.a c(Duration repeatInterval) {
        f0.p(repeatInterval, "repeatInterval");
        f0.y(4, androidx.exifinterface.media.a.T4);
        return new s.a(m.class, repeatInterval);
    }

    @w0(26)
    public static final /* synthetic */ <W extends m> s.a d(Duration repeatInterval, Duration flexTimeInterval) {
        f0.p(repeatInterval, "repeatInterval");
        f0.p(flexTimeInterval, "flexTimeInterval");
        f0.y(4, androidx.exifinterface.media.a.T4);
        return new s.a((Class<? extends m>) m.class, repeatInterval, flexTimeInterval);
    }
}
