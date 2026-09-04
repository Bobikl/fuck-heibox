package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/c1;", "Landroidx/compose/animation/core/i0;", "", "velocity", "", "g", "f", "initialValue", "initialVelocity", "d", "", "playTimeNanos", "e", ak.aF, "b", ak.av, "F", "magicPhysicalCoefficient", "()F", "absVelocityThreshold", "Ls1/e;", "density", "<init>", "(Ls1/e;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class c1 implements androidx.compose.animation.core.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    public c1(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        this.magicPhysicalCoefficient = density.getF139217b() * 386.0878f * 160.0f * 0.84f;
    }

    private final double g(float velocity) {
        return e.f6311a.a(velocity, WindowInsetsConnection_androidKt.f6158b * this.magicPhysicalCoefficient);
    }

    @Override // androidx.compose.animation.core.i0
    /* JADX INFO: renamed from: a */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.i0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        long jC = c(0.0f, initialVelocity);
        return ((e.a.f(e.f6311a.b(jC > 0 ? playTimeNanos / jC : 1.0f)) * f(initialVelocity)) / jC) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.i0
    public long c(float initialValue, float initialVelocity) {
        return (long) (Math.exp(g(initialVelocity) / WindowInsetsConnection_androidKt.f6162f) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.i0
    public float d(float initialValue, float initialVelocity) {
        return initialValue + f(initialVelocity);
    }

    @Override // androidx.compose.animation.core.i0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        long jC = c(0.0f, initialVelocity);
        return initialValue + (f(initialVelocity) * e.a.e(e.f6311a.b(jC > 0 ? playTimeNanos / jC : 1.0f)));
    }

    public final float f(float velocity) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.f6158b * this.magicPhysicalCoefficient)) * Math.exp((WindowInsetsConnection_androidKt.f6161e / WindowInsetsConnection_androidKt.f6162f) * g(velocity)))) * Math.signum(velocity);
    }
}
