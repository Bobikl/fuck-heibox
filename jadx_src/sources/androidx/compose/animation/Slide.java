package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.t, reason: from toString */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\tø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003ø\u0001\u0000J\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003ø\u0001\u0000JA\u0010\r\u001a\u00020\u00002#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001ø\u0001\u0000J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R5\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/t;", "", "Lkotlin/Function1;", "Ls1/r;", "Lkotlin/m0;", "name", "fullSize", "Ls1/n;", ak.av, "Landroidx/compose/animation/core/f0;", "b", "slideOffset", "animationSpec", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/animation/core/f0;", "e", "()Landroidx/compose/animation/core/f0;", "Lyh/l;", "f", "()Lyh/l;", "<init>", "(Lyh/l;Landroidx/compose/animation/core/f0;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Slide {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @dl.d
    private final yh.l<s1.r, s1.n> slideOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f0<s1.n> animationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(@dl.d yh.l<? super s1.r, s1.n> slideOffset, @dl.d f0<s1.n> animationSpec) {
        kotlin.jvm.internal.f0.p(slideOffset, "slideOffset");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        this.slideOffset = slideOffset;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide d(Slide slide, yh.l lVar, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = slide.slideOffset;
        }
        if ((i10 & 2) != 0) {
            f0Var = slide.animationSpec;
        }
        return slide.c(lVar, f0Var);
    }

    @dl.d
    public final yh.l<s1.r, s1.n> a() {
        return this.slideOffset;
    }

    @dl.d
    public final f0<s1.n> b() {
        return this.animationSpec;
    }

    @dl.d
    public final Slide c(@dl.d yh.l<? super s1.r, s1.n> slideOffset, @dl.d f0<s1.n> animationSpec) {
        kotlin.jvm.internal.f0.p(slideOffset, "slideOffset");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return new Slide(slideOffset, animationSpec);
    }

    @dl.d
    public final f0<s1.n> e() {
        return this.animationSpec;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) other;
        return kotlin.jvm.internal.f0.g(this.slideOffset, slide.slideOffset) && kotlin.jvm.internal.f0.g(this.animationSpec, slide.animationSpec);
    }

    @dl.d
    public final yh.l<s1.r, s1.n> f() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @dl.d
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
