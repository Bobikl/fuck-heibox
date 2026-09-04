package androidx.compose.animation;

import androidx.compose.animation.core.i0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/v;", "Landroidx/compose/animation/core/i0;", "", "startVelocity", "f", "initialValue", "initialVelocity", "d", "", "playTimeNanos", "e", ak.aF, "b", "Landroidx/compose/animation/l;", ak.av, "Landroidx/compose/animation/l;", "flingCalculator", "()F", "absVelocityThreshold", "Ls1/e;", "density", "<init>", "(Ls1/e;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class v implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4619b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l flingCalculator;

    public v(@dl.d s1.e density) {
        f0.p(density, "density");
        this.flingCalculator = new l(w.a(), density);
    }

    private final float f(float startVelocity) {
        return this.flingCalculator.b(startVelocity) * Math.signum(startVelocity);
    }

    @Override // androidx.compose.animation.core.i0
    /* JADX INFO: renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.i0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.d(initialVelocity).j(playTimeNanos / 1000000);
    }

    @Override // androidx.compose.animation.core.i0
    public long c(float initialValue, float initialVelocity) {
        return this.flingCalculator.c(initialVelocity) * 1000000;
    }

    @Override // androidx.compose.animation.core.i0
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // androidx.compose.animation.core.i0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.flingCalculator.d(initialVelocity).i(playTimeNanos / 1000000);
    }
}
