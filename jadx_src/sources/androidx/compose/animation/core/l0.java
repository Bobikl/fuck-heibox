package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/l0;", "Landroidx/compose/animation/core/h0;", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "e", "b", "d", ak.aF, ak.av, "F", "f", "()F", "dampingRatio", "g", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/x0;", "Landroidx/compose/animation/core/x0;", "spring", "<init>", "(FFF)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class l0 implements h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4450e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibilityThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x0 spring;

    public l0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public l0(float f10, float f11, float f12) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = f12;
        x0 x0Var = new x0(1.0f);
        x0Var.f(f10);
        x0Var.h(f11);
        this.spring = x0Var;
    }

    public /* synthetic */ l0(float f10, float f11, float f12, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }

    @Override // androidx.compose.animation.core.h0, androidx.compose.animation.core.h
    public /* bridge */ /* synthetic */ i1 a(f1 f1Var) {
        return a(f1Var);
    }

    @Override // androidx.compose.animation.core.h0, androidx.compose.animation.core.h
    public /* synthetic */ p1 a(f1 f1Var) {
        return g0.c(this, f1Var);
    }

    @Override // androidx.compose.animation.core.h0
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.g(targetValue);
        return q0.i(this.spring.i(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    @Override // androidx.compose.animation.core.h0
    public long c(float initialValue, float targetValue, float initialVelocity) {
        float fD = this.spring.d();
        float dampingRatio = this.spring.getDampingRatio();
        float f10 = initialValue - targetValue;
        float f11 = this.visibilityThreshold;
        return SpringEstimationKt.c(fD, dampingRatio, initialVelocity / f11, f10 / f11, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.h0
    public float d(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.h0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.g(targetValue);
        return q0.h(this.spring.i(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }
}
