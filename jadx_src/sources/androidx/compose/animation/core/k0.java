package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/k0;", "Landroidx/compose/animation/core/i0;", "", "playTimeNanos", "", "initialValue", "initialVelocity", "e", "b", ak.aF, "d", ak.av, "F", "()F", "absVelocityThreshold", "friction", "frictionMultiplier", "<init>", "(FF)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class k0 implements i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4444c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public k0(float f10, float f11) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f11));
        this.friction = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    public /* synthetic */ k0(float f10, float f11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.1f : f11);
    }

    @Override // androidx.compose.animation.core.i0
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.i0
    public float b(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) Math.exp(((playTimeNanos / 1000000) / 1000.0f) * this.friction));
    }

    @Override // androidx.compose.animation.core.i0
    public long c(float initialValue, float initialVelocity) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(initialVelocity))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // androidx.compose.animation.core.i0
    public float d(float initialValue, float initialVelocity) {
        if (Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
            return initialValue;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / initialVelocity));
        float f10 = this.friction;
        return (initialValue - (initialVelocity / f10)) + ((initialVelocity / f10) * ((float) Math.exp((((double) f10) * ((dLog / ((double) f10)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // androidx.compose.animation.core.i0
    public float e(long playTimeNanos, float initialValue, float initialVelocity) {
        float f10 = this.friction;
        return (initialValue - (initialVelocity / f10)) + ((initialVelocity / f10) * ((float) Math.exp((f10 * (playTimeNanos / 1000000)) / 1000.0f)));
    }
}
