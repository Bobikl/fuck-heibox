package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010-\u001a\u00020\u0007\u0012\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1¢\u0006\u0004\b3\u00104J\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\f\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ#\u0010\r\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\nJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001d\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0013\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\"H\u0016R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Ls1/b;", "Ls1/r;", "f", "(J)J", "", "enforceConstraints", "q", "(JZ)J", "n", "y", ak.aB, "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", RXScreenCaptureService.KEY_HEIGHT, "width", "j", "i", "", "other", "equals", "hashCode", "", "toString", "", "e", "F", "g", "()F", com.max.mediaselector.lib.config.b.f75079g, "Z", "m", "()Z", "matchHeightConstraintsFirst", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FZLyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class AspectRatioModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float aspectRatio;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f10, boolean z10, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    private final long f(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jO = o(this, j10, false, 1, null);
            s1.r.a aVar = s1.r.f139246b;
            if (!s1.r.h(jO, aVar.a())) {
                return jO;
            }
            long jR = r(this, j10, false, 1, null);
            if (!s1.r.h(jR, aVar.a())) {
                return jR;
            }
            long jU = u(this, j10, false, 1, null);
            if (!s1.r.h(jU, aVar.a())) {
                return jU;
            }
            long jZ = z(this, j10, false, 1, null);
            if (!s1.r.h(jZ, aVar.a())) {
                return jZ;
            }
            long jN = n(j10, false);
            if (!s1.r.h(jN, aVar.a())) {
                return jN;
            }
            long jQ = q(j10, false);
            if (!s1.r.h(jQ, aVar.a())) {
                return jQ;
            }
            long jS = s(j10, false);
            if (!s1.r.h(jS, aVar.a())) {
                return jS;
            }
            long jY = y(j10, false);
            if (!s1.r.h(jY, aVar.a())) {
                return jY;
            }
        } else {
            long jR2 = r(this, j10, false, 1, null);
            s1.r.a aVar2 = s1.r.f139246b;
            if (!s1.r.h(jR2, aVar2.a())) {
                return jR2;
            }
            long jO2 = o(this, j10, false, 1, null);
            if (!s1.r.h(jO2, aVar2.a())) {
                return jO2;
            }
            long jZ2 = z(this, j10, false, 1, null);
            if (!s1.r.h(jZ2, aVar2.a())) {
                return jZ2;
            }
            long jU2 = u(this, j10, false, 1, null);
            if (!s1.r.h(jU2, aVar2.a())) {
                return jU2;
            }
            long jQ2 = q(j10, false);
            if (!s1.r.h(jQ2, aVar2.a())) {
                return jQ2;
            }
            long jN2 = n(j10, false);
            if (!s1.r.h(jN2, aVar2.a())) {
                return jN2;
            }
            long jY2 = y(j10, false);
            if (!s1.r.h(jY2, aVar2.a())) {
                return jY2;
            }
            long jS2 = s(j10, false);
            if (!s1.r.h(jS2, aVar2.a())) {
                return jS2;
            }
        }
        return s1.r.f139246b.a();
    }

    private final long n(long j10, boolean z10) {
        int iL0;
        int iO = s1.b.o(j10);
        if (iO != Integer.MAX_VALUE && (iL0 = di.d.L0(iO * this.aspectRatio)) > 0) {
            long jA = s1.s.a(iL0, iO);
            if (!z10 || s1.c.h(j10, jA)) {
                return jA;
            }
        }
        return s1.r.f139246b.a();
    }

    static /* synthetic */ long o(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.n(j10, z10);
    }

    private final long q(long j10, boolean z10) {
        int iL0;
        int iP = s1.b.p(j10);
        if (iP != Integer.MAX_VALUE && (iL0 = di.d.L0(iP / this.aspectRatio)) > 0) {
            long jA = s1.s.a(iP, iL0);
            if (!z10 || s1.c.h(j10, jA)) {
                return jA;
            }
        }
        return s1.r.f139246b.a();
    }

    static /* synthetic */ long r(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.q(j10, z10);
    }

    private final long s(long j10, boolean z10) {
        int iQ = s1.b.q(j10);
        int iL0 = di.d.L0(iQ * this.aspectRatio);
        if (iL0 > 0) {
            long jA = s1.s.a(iL0, iQ);
            if (!z10 || s1.c.h(j10, jA)) {
                return jA;
            }
        }
        return s1.r.f139246b.a();
    }

    static /* synthetic */ long u(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.s(j10, z10);
    }

    private final long y(long j10, boolean z10) {
        int iR = s1.b.r(j10);
        int iL0 = di.d.L0(iR / this.aspectRatio);
        if (iL0 > 0) {
            long jA = s1.s.a(iR, iL0);
            if (!z10 || s1.c.h(j10, jA)) {
                return jA;
            }
        }
        return s1.r.f139246b.a();
    }

    static /* synthetic */ long z(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.y(j10, z10);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? di.d.L0(i10 * this.aspectRatio) : measurable.l1(i10);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // androidx.compose.ui.layout.w
    public int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? di.d.L0(i10 * this.aspectRatio) : measurable.w1(i10);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + androidx.compose.foundation.b0.a(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.w
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? di.d.L0(i10 / this.aspectRatio) : measurable.V(i10);
    }

    @Override // androidx.compose.ui.layout.w
    public int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? di.d.L0(i10 / this.aspectRatio) : measurable.L0(i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(j10);
        if (!s1.r.h(jF, s1.r.f139246b.a())) {
            j10 = s1.b.f139198b.c(s1.r.m(jF), s1.r.j(jF));
        }
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(j10);
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
