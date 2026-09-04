package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u0016\u0012\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'¢\u0006\u0002\b*ø\u0001\u0001¢\u0006\u0004\b,\u0010-J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016R\u001d\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001d\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001d\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R!\u0010&\u001a\u00020\u0006*\u00020$8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010%\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "", "other", "", "equals", "hashCode", "Ls1/h;", "e", "F", "minWidth", "f", "minHeight", "g", "maxWidth", "maxHeight", "Z", "enforceIncoming", "Ls1/e;", "(Ls1/e;)J", "targetConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FFFFZLyh/l;Lkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class SizeModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    private SizeModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
        super(lVar);
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s1.h.f139219c.e() : f10, (i10 & 2) != 0 ? s1.h.f139219c.e() : f11, (i10 & 4) != 0 ? s1.h.f139219c.e() : f12, (i10 & 8) != 0 ? s1.h.f139219c.e() : f13, z10, lVar, null);
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    private final long f(s1.e eVar) {
        int iU;
        int iU2;
        float f10 = this.maxWidth;
        s1.h.a aVar = s1.h.f139219c;
        int i10 = 0;
        int iE1 = !s1.h.l(f10, aVar.e()) ? eVar.e1(((s1.h) fi.u.w(s1.h.d(this.maxWidth), s1.h.d(s1.h.g(0)))).w()) : Integer.MAX_VALUE;
        int iE2 = !s1.h.l(this.maxHeight, aVar.e()) ? eVar.e1(((s1.h) fi.u.w(s1.h.d(this.maxHeight), s1.h.d(s1.h.g(0)))).w()) : Integer.MAX_VALUE;
        if (s1.h.l(this.minWidth, aVar.e()) || (iU = fi.u.u(fi.u.B(eVar.e1(this.minWidth), iE1), 0)) == Integer.MAX_VALUE) {
            iU = 0;
        }
        if (!s1.h.l(this.minHeight, aVar.e()) && (iU2 = fi.u.u(fi.u.B(eVar.e1(this.minHeight), iE2), 0)) != Integer.MAX_VALUE) {
            i10 = iU2;
        }
        return s1.c.a(iU, iE1, i10, iE2);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(nVar);
        return s1.b.n(jF) ? s1.b.p(jF) : s1.c.g(jF, measurable.l1(i10));
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return s1.h.l(this.minWidth, sizeModifier.minWidth) && s1.h.l(this.minHeight, sizeModifier.minHeight) && s1.h.l(this.maxWidth, sizeModifier.maxWidth) && s1.h.l(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    @Override // androidx.compose.ui.layout.w
    public int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(nVar);
        return s1.b.n(jF) ? s1.b.p(jF) : s1.c.g(jF, measurable.w1(i10));
    }

    public int hashCode() {
        return ((((((s1.h.n(this.minWidth) * 31) + s1.h.n(this.minHeight)) * 31) + s1.h.n(this.maxWidth)) * 31) + s1.h.n(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.w
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(nVar);
        return s1.b.l(jF) ? s1.b.o(jF) : s1.c.f(jF, measurable.V(i10));
    }

    @Override // androidx.compose.ui.layout.w
    public int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(nVar);
        return s1.b.l(jF) ? s1.b.o(jF) : s1.c.f(jF, measurable.L0(i10));
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        long jA;
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jF = f(measure);
        if (this.enforceIncoming) {
            jA = s1.c.e(j10, jF);
        } else {
            float f10 = this.minWidth;
            s1.h.a aVar = s1.h.f139219c;
            jA = s1.c.a(!s1.h.l(f10, aVar.e()) ? s1.b.r(jF) : fi.u.B(s1.b.r(j10), s1.b.p(jF)), !s1.h.l(this.maxWidth, aVar.e()) ? s1.b.p(jF) : fi.u.u(s1.b.p(j10), s1.b.r(jF)), !s1.h.l(this.minHeight, aVar.e()) ? s1.b.q(jF) : fi.u.B(s1.b.q(j10), s1.b.o(jF)), !s1.h.l(this.maxHeight, aVar.e()) ? s1.b.o(jF) : fi.u.u(s1.b.o(j10), s1.b.q(jF)));
        }
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(jA);
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar2) {
                a(aVar2);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
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
