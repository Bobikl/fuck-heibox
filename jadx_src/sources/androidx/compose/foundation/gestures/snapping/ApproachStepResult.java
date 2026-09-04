package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.l;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.b, reason: from toString */
/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/b;", "", "", ak.av, "Landroidx/compose/animation/core/j;", "Landroidx/compose/animation/core/l;", "b", "remainingOffset", "currentAnimationState", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "F", "f", "()F", "Landroidx/compose/animation/core/j;", "e", "()Landroidx/compose/animation/core/j;", "<init>", "(FLandroidx/compose/animation/core/j;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ApproachStepResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float remainingOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AnimationState<Float, l> currentAnimationState;

    public ApproachStepResult(float f10, @dl.d AnimationState<Float, l> currentAnimationState) {
        f0.p(currentAnimationState, "currentAnimationState");
        this.remainingOffset = f10;
        this.currentAnimationState = currentAnimationState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApproachStepResult d(ApproachStepResult approachStepResult, float f10, AnimationState animationState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = approachStepResult.remainingOffset;
        }
        if ((i10 & 2) != 0) {
            animationState = approachStepResult.currentAnimationState;
        }
        return approachStepResult.c(f10, animationState);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getRemainingOffset() {
        return this.remainingOffset;
    }

    @dl.d
    public final AnimationState<Float, l> b() {
        return this.currentAnimationState;
    }

    @dl.d
    public final ApproachStepResult c(float remainingOffset, @dl.d AnimationState<Float, l> currentAnimationState) {
        f0.p(currentAnimationState, "currentAnimationState");
        return new ApproachStepResult(remainingOffset, currentAnimationState);
    }

    @dl.d
    public final AnimationState<Float, l> e() {
        return this.currentAnimationState;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApproachStepResult)) {
            return false;
        }
        ApproachStepResult approachStepResult = (ApproachStepResult) other;
        return f0.g(Float.valueOf(this.remainingOffset), Float.valueOf(approachStepResult.remainingOffset)) && f0.g(this.currentAnimationState, approachStepResult.currentAnimationState);
    }

    public final float f() {
        return this.remainingOffset;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.remainingOffset) * 31) + this.currentAnimationState.hashCode();
    }

    @dl.d
    public String toString() {
        return "ApproachStepResult(remainingOffset=" + this.remainingOffset + ", currentAnimationState=" + this.currentAnimationState + ')';
    }
}
