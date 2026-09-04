package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/m0;", "Landroidx/compose/animation/core/h0;", "", "playTime", "f", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "e", ak.aF, "b", "", ak.av, "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "duration", "g", "delay", "Landroidx/compose/animation/core/b0;", "Landroidx/compose/animation/core/b0;", "easing", "<init>", "(IILandroidx/compose/animation/core/b0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class m0 implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4459d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 easing;

    public m0() {
        this(0, 0, null, 7, null);
    }

    public m0(int i10, int i11, @dl.d b0 easing) {
        kotlin.jvm.internal.f0.p(easing, "easing");
        this.duration = i10;
        this.delay = i11;
        this.easing = easing;
    }

    public /* synthetic */ m0(int i10, int i11, b0 b0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? d0.b() : b0Var);
    }

    private final long f(long playTime) {
        return fi.u.K(playTime - ((long) this.delay), 0L, this.duration);
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
        long jF = f(playTimeNanos / 1000000);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return initialVelocity;
        }
        return (e(jF * 1000000, initialValue, targetValue, initialVelocity) - e((jF - 1) * 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.h0
    public long c(float initialValue, float targetValue, float initialVelocity) {
        return ((long) (this.delay + this.duration)) * 1000000;
    }

    @Override // androidx.compose.animation.core.h0
    public /* synthetic */ float d(float f10, float f11, float f12) {
        return g0.a(this, f10, f11, f12);
    }

    @Override // androidx.compose.animation.core.h0
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long jF = f(playTimeNanos / 1000000);
        int i10 = this.duration;
        return VectorConvertersKt.k(initialValue, targetValue, this.easing.a(fi.u.H(i10 == 0 ? 1.0f : jF / i10, 0.0f, 1.0f)));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }
}
