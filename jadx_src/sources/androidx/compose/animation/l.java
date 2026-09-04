package androidx.compose.animation;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/l;", "", "Ls1/e;", "density", "", ak.av, "velocity", "", "f", "", ak.aF, "b", "Landroidx/compose/animation/l$a;", "d", "F", "friction", "magicPhysicalCoefficient", "Ls1/e;", "e", "()Ls1/e;", "<init>", "(FLs1/e;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final s1.e f4597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    /* JADX INFO: renamed from: androidx.compose.animation.l$a, reason: from toString */
    /* JADX INFO: compiled from: FlingCalculator.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/l$a;", "", "", "time", "", "i", "j", ak.av, "b", ak.aF, "initialVelocity", "distance", "duration", "d", "", "toString", "", "hashCode", "other", "", "equals", "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "f", "J", "g", "()J", "<init>", "(FFJ)V", "animation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class FlingInfo {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f4599d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float initialVelocity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long duration;

        public FlingInfo(float f10, float f11, long j10) {
            this.initialVelocity = f10;
            this.distance = f11;
            this.duration = j10;
        }

        public static /* synthetic */ FlingInfo e(FlingInfo flingInfo, float f10, float f11, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = flingInfo.initialVelocity;
            }
            if ((i10 & 2) != 0) {
                f11 = flingInfo.distance;
            }
            if ((i10 & 4) != 0) {
                j10 = flingInfo.duration;
            }
            return flingInfo.d(f10, f11, j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getDistance() {
            return this.distance;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @dl.d
        public final FlingInfo d(float initialVelocity, float distance, long duration) {
            return new FlingInfo(initialVelocity, distance, duration);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) other;
            return f0.g(Float.valueOf(this.initialVelocity), Float.valueOf(flingInfo.initialVelocity)) && f0.g(Float.valueOf(this.distance), Float.valueOf(flingInfo.distance)) && this.duration == flingInfo.duration;
        }

        public final float f() {
            return this.distance;
        }

        public final long g() {
            return this.duration;
        }

        public final float h() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.initialVelocity) * 31) + Float.floatToIntBits(this.distance)) * 31) + androidx.collection.k.a(this.duration);
        }

        public final float i(long time) {
            long j10 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * b.f4092a.b(j10 > 0 ? time / j10 : 1.0f).e();
        }

        public final float j(long time) {
            long j10 = this.duration;
            return (((b.f4092a.b(j10 > 0 ? time / j10 : 1.0f).f() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }

        @dl.d
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }
    }

    public l(float f10, @dl.d s1.e density) {
        f0.p(density, "density");
        this.friction = f10;
        this.f4597b = density;
        this.magicPhysicalCoefficient = a(density);
    }

    private final float a(s1.e density) {
        return m.c(0.84f, density.getF139217b());
    }

    private final double f(float velocity) {
        return b.f4092a.a(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final float b(float velocity) {
        return (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) m.f4605c) / (((double) m.f4605c) - 1.0d)) * f(velocity)));
    }

    public final long c(float velocity) {
        return (long) (Math.exp(f(velocity) / (((double) m.f4605c) - 1.0d)) * 1000.0d);
    }

    @dl.d
    public final FlingInfo d(float velocity) {
        double dF = f(velocity);
        double d10 = ((double) m.f4605c) - 1.0d;
        return new FlingInfo(velocity, (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) m.f4605c) / d10) * dF)), (long) (Math.exp(dF / d10) * 1000.0d));
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final s1.e getF4597b() {
        return this.f4597b;
    }
}
