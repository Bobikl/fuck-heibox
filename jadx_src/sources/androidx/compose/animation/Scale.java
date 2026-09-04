package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.o2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.p, reason: from toString */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0005\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003J:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\u00020\u00048\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/p;", "", "", ak.av, "Landroidx/compose/ui/graphics/o2;", "b", "()J", "Landroidx/compose/animation/core/f0;", ak.aF, "scale", "transformOrigin", "animationSpec", "d", "(FJLandroidx/compose/animation/core/f0;)Landroidx/compose/animation/p;", "", "toString", "", "hashCode", "other", "", "equals", "F", "g", "()F", "J", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/animation/core/f0;", "f", "()Landroidx/compose/animation/core/f0;", "<init>", "(FJLandroidx/compose/animation/core/f0;Lkotlin/jvm/internal/u;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Scale {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f0<Float> animationSpec;

    private Scale(float f10, long j10, f0<Float> f0Var) {
        this.scale = f10;
        this.transformOrigin = j10;
        this.animationSpec = f0Var;
    }

    public /* synthetic */ Scale(float f10, long j10, f0 f0Var, kotlin.jvm.internal.u uVar) {
        this(f10, j10, f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Scale e(Scale scale, float f10, long j10, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = scale.scale;
        }
        if ((i10 & 2) != 0) {
            j10 = scale.transformOrigin;
        }
        if ((i10 & 4) != 0) {
            f0Var = scale.animationSpec;
        }
        return scale.d(f10, j10, f0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @dl.d
    public final f0<Float> c() {
        return this.animationSpec;
    }

    @dl.d
    public final Scale d(float scale, long transformOrigin, @dl.d f0<Float> animationSpec) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return new Scale(scale, transformOrigin, animationSpec, null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) other;
        return kotlin.jvm.internal.f0.g(Float.valueOf(this.scale), Float.valueOf(scale.scale)) && o2.i(this.transformOrigin, scale.transformOrigin) && kotlin.jvm.internal.f0.g(this.animationSpec, scale.animationSpec);
    }

    @dl.d
    public final f0<Float> f() {
        return this.animationSpec;
    }

    public final float g() {
        return this.scale;
    }

    public final long h() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.scale) * 31) + o2.m(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    @dl.d
    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) o2.n(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }
}
