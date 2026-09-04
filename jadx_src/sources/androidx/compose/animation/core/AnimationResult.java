package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.core.f, reason: from toString */
/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/f;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "", "toString", "Landroidx/compose/animation/core/j;", ak.av, "Landroidx/compose/animation/core/j;", "b", "()Landroidx/compose/animation/core/j;", "endState", "Landroidx/compose/animation/core/AnimationEndReason;", "Landroidx/compose/animation/core/AnimationEndReason;", "()Landroidx/compose/animation/core/AnimationEndReason;", "endReason", "<init>", "(Landroidx/compose/animation/core/j;Landroidx/compose/animation/core/AnimationEndReason;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class AnimationResult<T, V extends p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4418c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AnimationState<T, V> endState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AnimationEndReason endReason;

    public AnimationResult(@dl.d AnimationState<T, V> endState, @dl.d AnimationEndReason endReason) {
        kotlin.jvm.internal.f0.p(endState, "endState");
        kotlin.jvm.internal.f0.p(endReason, "endReason");
        this.endState = endState;
        this.endReason = endReason;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    @dl.d
    public final AnimationState<T, V> b() {
        return this.endState;
    }

    @dl.d
    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
