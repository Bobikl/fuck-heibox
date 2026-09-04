package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.k, reason: from toString */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/k;", "", "", ak.av, "Landroidx/compose/animation/core/f0;", "b", "alpha", "animationSpec", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "F", "e", "()F", "Landroidx/compose/animation/core/f0;", "f", "()Landroidx/compose/animation/core/f0;", "<init>", "(FLandroidx/compose/animation/core/f0;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Fade {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f0<Float> animationSpec;

    public Fade(float f10, @dl.d f0<Float> animationSpec) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        this.alpha = f10;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fade d(Fade fade, float f10, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fade.alpha;
        }
        if ((i10 & 2) != 0) {
            f0Var = fade.animationSpec;
        }
        return fade.c(f10, f0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @dl.d
    public final f0<Float> b() {
        return this.animationSpec;
    }

    @dl.d
    public final Fade c(float alpha, @dl.d f0<Float> animationSpec) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return new Fade(alpha, animationSpec);
    }

    public final float e() {
        return this.alpha;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) other;
        return kotlin.jvm.internal.f0.g(Float.valueOf(this.alpha), Float.valueOf(fade.alpha)) && kotlin.jvm.internal.f0.g(this.animationSpec, fade.animationSpec);
    }

    @dl.d
    public final f0<Float> f() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    @dl.d
    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
