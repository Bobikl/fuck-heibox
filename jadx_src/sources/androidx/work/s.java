package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PeriodicWorkRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/s;", "Landroidx/work/y;", "Landroidx/work/s$a;", "builder", "<init>", "(Landroidx/work/s$a;)V", RXScreenCaptureService.KEY_HEIGHT, ak.av, "b", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class s extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f29466i = 900000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f29467j = 300000;

    /* JADX INFO: compiled from: PeriodicWorkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012B;\b\u0016\u0012\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0015B+\b\u0017\u0012\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Landroidx/work/s$a;", "Landroidx/work/y$a;", "Landroidx/work/s;", androidx.exifinterface.media.a.W4, "()Landroidx/work/s;", "B", "()Landroidx/work/s$a;", "thisObject", "Ljava/lang/Class;", "Landroidx/work/m;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends y.a<a, s> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Class<? extends m> workerClass, long j10, @dl.d TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            f0.p(workerClass, "workerClass");
            f0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec().G(repeatIntervalTimeUnit.toMillis(j10));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Class<? extends m> workerClass, long j10, @dl.d TimeUnit repeatIntervalTimeUnit, long j11, @dl.d TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            f0.p(workerClass, "workerClass");
            f0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            f0.p(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().H(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @w0(26)
        public a(@dl.d Class<? extends m> workerClass, @dl.d Duration repeatInterval) {
            super(workerClass);
            f0.p(workerClass, "workerClass");
            f0.p(repeatInterval, "repeatInterval");
            getWorkSpec().G(androidx.work.impl.utils.d.a(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @w0(26)
        public a(@dl.d Class<? extends m> workerClass, @dl.d Duration repeatInterval, @dl.d Duration flexInterval) {
            super(workerClass);
            f0.p(workerClass, "workerClass");
            f0.p(repeatInterval, "repeatInterval");
            f0.p(flexInterval, "flexInterval");
            getWorkSpec().H(androidx.work.impl.utils.d.a(repeatInterval), androidx.work.impl.utils.d.a(flexInterval));
        }

        @Override // androidx.work.y.a
        @dl.d
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public s c() {
            if (!((getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) ? false : true)) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!getWorkSpec().expedited) {
                return new s(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }

        @Override // androidx.work.y.a
        @dl.d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.f());
        f0.p(builder, "builder");
    }
}
