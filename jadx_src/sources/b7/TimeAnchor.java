package b7;

import android.os.SystemClock;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: b7.f, reason: from toString */
/* JADX INFO: compiled from: TimeAnchor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u0015"}, d2 = {"Lb7/f;", "", "Lkotlin/b2;", "g", ak.av, "", "toString", "Lb7/f$a;", "absoluteTime", "Lb7/f$a;", "b", "()Lb7/f$a;", "e", "(Lb7/f$a;)V", "nanoTime", ak.aF, "threadTime", "d", "f", "<init>", "()V", "basics_release"}, k = 1, mv = {1, 4, 0})
public final class TimeAnchor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @dl.d
    private TimeAnchorBean absoluteTime = new TimeAnchorBean();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final TimeAnchorBean nanoTime = new TimeAnchorBean();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @dl.d
    private TimeAnchorBean threadTime = new TimeAnchorBean();

    /* JADX INFO: renamed from: b7.f$a, reason: from toString */
    /* JADX INFO: compiled from: TimeAnchor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lb7/f$a;", "", "", ak.av, "", "toString", AnalyticsConfig.RTD_START_TIME, "J", ak.aF, "()J", "e", "(J)V", "endTime", "b", "d", "<init>", "()V", "basics_release"}, k = 1, mv = {1, 4, 0})
    public static final class TimeAnchorBean {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        private long startTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        private long endTime;

        public final long a() {
            long j10 = this.endTime - this.startTime;
            if (j10 < 0) {
                return 0L;
            }
            return j10;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public final void d(long j10) {
            this.endTime = j10;
        }

        public final void e(long j10) {
            this.startTime = j10;
        }

        @dl.d
        public String toString() {
            return "TimeAnchorBean(startTime=" + this.startTime + ", endTime=" + this.endTime + ",costTime=" + a() + ')';
        }
    }

    public TimeAnchor() {
        g();
    }

    public final void a() {
        this.absoluteTime.d(System.currentTimeMillis());
        this.nanoTime.d(System.nanoTime());
        this.threadTime.d(SystemClock.currentThreadTimeMillis());
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final TimeAnchorBean getAbsoluteTime() {
        return this.absoluteTime;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TimeAnchorBean getNanoTime() {
        return this.nanoTime;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TimeAnchorBean getThreadTime() {
        return this.threadTime;
    }

    public final void e(@dl.d TimeAnchorBean timeAnchorBean) {
        f0.q(timeAnchorBean, "<set-?>");
        this.absoluteTime = timeAnchorBean;
    }

    public final void f(@dl.d TimeAnchorBean timeAnchorBean) {
        f0.q(timeAnchorBean, "<set-?>");
        this.threadTime = timeAnchorBean;
    }

    public final void g() {
        this.absoluteTime.e(System.currentTimeMillis());
        this.nanoTime.e(System.nanoTime());
        this.threadTime.e(SystemClock.currentThreadTimeMillis());
    }

    @dl.d
    public String toString() {
        return "TimeAnchor(absoluteTime=" + this.absoluteTime + ", threadTime=" + this.threadTime + ", nanoTime=" + this.nanoTime + ')';
    }
}
