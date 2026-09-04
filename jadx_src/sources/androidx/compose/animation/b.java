package androidx.compose.animation;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/b;", "", "", "time", "Landroidx/compose/animation/b$a;", "b", "velocity", "friction", "", ak.av, "", "I", "NbSamples", "", ak.aF, "[F", "SplinePositions", "d", "SplineTimes", "<init>", "()V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f4092a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int NbSamples = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] SplinePositions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] SplineTimes;

    /* JADX INFO: renamed from: androidx.compose.animation.b$a, reason: from toString */
    /* JADX INFO: compiled from: SplineBasedDecay.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/b$a;", "", "", ak.av, "b", "distanceCoefficient", "velocityCoefficient", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "F", "e", "()F", "f", "<init>", "(FF)V", "animation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class FlingResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f4096c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distanceCoefficient;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float velocityCoefficient;

        public FlingResult(float f10, float f11) {
            this.distanceCoefficient = f10;
            this.velocityCoefficient = f11;
        }

        public static /* synthetic */ FlingResult d(FlingResult flingResult, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = flingResult.distanceCoefficient;
            }
            if ((i10 & 2) != 0) {
                f11 = flingResult.velocityCoefficient;
            }
            return flingResult.c(f10, f11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        @dl.d
        public final FlingResult c(float distanceCoefficient, float velocityCoefficient) {
            return new FlingResult(distanceCoefficient, velocityCoefficient);
        }

        public final float e() {
            return this.distanceCoefficient;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) other;
            return f0.g(Float.valueOf(this.distanceCoefficient), Float.valueOf(flingResult.distanceCoefficient)) && f0.g(Float.valueOf(this.velocityCoefficient), Float.valueOf(flingResult.velocityCoefficient));
        }

        public final float f() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.distanceCoefficient) * 31) + Float.floatToIntBits(this.velocityCoefficient);
        }

        @dl.d
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        u.b(fArr, fArr2, 100);
    }

    private b() {
    }

    public final double a(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }

    @dl.d
    public final FlingResult b(float time) {
        float f10;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * time);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = SplinePositions;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            f10 = f15 + ((time - f13) * f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        return new FlingResult(f10, f11);
    }
}
