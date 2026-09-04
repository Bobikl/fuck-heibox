package androidx.compose.animation;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.animation.x, reason: from toString */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/animation/x;", "", "Landroidx/compose/animation/k;", ak.av, "Landroidx/compose/animation/t;", "b", "Landroidx/compose/animation/ChangeSize;", ak.aF, "Landroidx/compose/animation/p;", "d", "fade", "slide", "changeSize", "scale", "e", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/animation/k;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/animation/k;", "Landroidx/compose/animation/t;", "j", "()Landroidx/compose/animation/t;", "Landroidx/compose/animation/ChangeSize;", "g", "()Landroidx/compose/animation/ChangeSize;", "Landroidx/compose/animation/p;", "i", "()Landroidx/compose/animation/p;", "<init>", "(Landroidx/compose/animation/k;Landroidx/compose/animation/t;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/p;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TransitionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Fade fade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Slide slide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final ChangeSize changeSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Scale scale;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public TransitionData(@dl.e Fade fade, @dl.e Slide slide, @dl.e ChangeSize changeSize, @dl.e Scale scale) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : fade, (i10 & 2) != 0 ? null : slide, (i10 & 4) != 0 ? null : changeSize, (i10 & 8) != 0 ? null : scale);
    }

    public static /* synthetic */ TransitionData f(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i10 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i10 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i10 & 8) != 0) {
            scale = transitionData.scale;
        }
        return transitionData.e(fade, slide, changeSize, scale);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Fade getFade() {
        return this.fade;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Slide getSlide() {
        return this.slide;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @dl.d
    public final TransitionData e(@dl.e Fade fade, @dl.e Slide slide, @dl.e ChangeSize changeSize, @dl.e Scale scale) {
        return new TransitionData(fade, slide, changeSize, scale);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) other;
        return f0.g(this.fade, transitionData.fade) && f0.g(this.slide, transitionData.slide) && f0.g(this.changeSize, transitionData.changeSize) && f0.g(this.scale, transitionData.scale);
    }

    @dl.e
    public final ChangeSize g() {
        return this.changeSize;
    }

    @dl.e
    public final Fade h() {
        return this.fade;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return iHashCode3 + (scale != null ? scale.hashCode() : 0);
    }

    @dl.e
    public final Scale i() {
        return this.scale;
    }

    @dl.e
    public final Slide j() {
        return this.slide;
    }

    @dl.d
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ')';
    }
}
