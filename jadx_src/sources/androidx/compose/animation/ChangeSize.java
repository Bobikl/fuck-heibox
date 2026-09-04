package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003ø\u0001\u0000J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003ø\u0001\u0000J\t\u0010\r\u001a\u00020\fHÆ\u0003JU\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001ø\u0001\u0000J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/c;", ak.av, "Lkotlin/Function1;", "Ls1/r;", "Lkotlin/m0;", "name", "fullSize", "b", "Landroidx/compose/animation/core/f0;", ak.aF, "", "d", "alignment", UiKitSpanObj.TYPE_SIZE, "animationSpec", "clip", "e", "", "toString", "", "hashCode", "other", "equals", "Landroidx/compose/ui/c;", "g", "()Landroidx/compose/ui/c;", "Landroidx/compose/animation/core/f0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/animation/core/f0;", "Z", "i", "()Z", "Lyh/l;", "j", "()Lyh/l;", "<init>", "(Landroidx/compose/ui/c;Lyh/l;Landroidx/compose/animation/core/f0;Z)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ChangeSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final yh.l<s1.r, s1.r> size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final f0<s1.r> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@dl.d androidx.compose.ui.c alignment, @dl.d yh.l<? super s1.r, s1.r> size, @dl.d f0<s1.r> animationSpec, boolean z10) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = size;
        this.animationSpec = animationSpec;
        this.clip = z10;
    }

    public /* synthetic */ ChangeSize(androidx.compose.ui.c cVar, yh.l lVar, f0 f0Var, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(cVar, (i10 & 2) != 0 ? new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.ChangeSize.1
            public final long a(long j10) {
                return s1.s.a(0, 0);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                return s1.r.b(a(rVar.getF139248a()));
            }
        } : lVar, f0Var, (i10 & 8) != 0 ? true : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize f(ChangeSize changeSize, androidx.compose.ui.c cVar, yh.l lVar, f0 f0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = changeSize.alignment;
        }
        if ((i10 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i10 & 4) != 0) {
            f0Var = changeSize.animationSpec;
        }
        if ((i10 & 8) != 0) {
            z10 = changeSize.clip;
        }
        return changeSize.e(cVar, lVar, f0Var, z10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    @dl.d
    public final yh.l<s1.r, s1.r> b() {
        return this.size;
    }

    @dl.d
    public final f0<s1.r> c() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @dl.d
    public final ChangeSize e(@dl.d androidx.compose.ui.c alignment, @dl.d yh.l<? super s1.r, s1.r> size, @dl.d f0<s1.r> animationSpec, boolean z10) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return new ChangeSize(alignment, size, animationSpec, z10);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return kotlin.jvm.internal.f0.g(this.alignment, changeSize.alignment) && kotlin.jvm.internal.f0.g(this.size, changeSize.size) && kotlin.jvm.internal.f0.g(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @dl.d
    public final androidx.compose.ui.c g() {
        return this.alignment;
    }

    @dl.d
    public final f0<s1.r> h() {
        return this.animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31;
        boolean z10 = this.clip;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean i() {
        return this.clip;
    }

    @dl.d
    public final yh.l<s1.r, s1.r> j() {
        return this.size;
    }

    @dl.d
    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }
}
