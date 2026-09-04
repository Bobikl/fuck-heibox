package androidx.compose.ui.draw;

import androidx.compose.foundation.b0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.o1;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import s1.s;
import yh.p;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BZ\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00100\u001a\u00020\u000b\u0012\b\b\u0002\u00105\u001a\u000201\u0012\b\b\u0002\u0010:\u001a\u000206\u0012\b\b\u0002\u0010?\u001a\u00020;\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010@\u0012\u0017\u0010J\u001a\u0013\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u001f0G¢\u0006\u0002\bI¢\u0006\u0004\bK\u0010LJ\u001d\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0019\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001a\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001d\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\f\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u0013\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010&\u001a\u00020%H\u0016R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00100\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010D\u001a\u0004\u0018\u00010@8\u0006¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/platform/y0;", "Lb1/m;", "dstSize", "f", "(J)J", "Ls1/b;", "constraints", ak.aD, "", "y", "(J)Z", ak.aG, "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", RXScreenCaptureService.KEY_HEIGHT, "width", "j", "i", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "hashCode", "", "other", "equals", "", "toString", "Landroidx/compose/ui/graphics/painter/Painter;", "e", "Landroidx/compose/ui/graphics/painter/Painter;", "q", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Z", "r", "()Z", "sizeToIntrinsics", "Landroidx/compose/ui/c;", "g", "Landroidx/compose/ui/c;", "()Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/c;", "Landroidx/compose/ui/layout/c;", "o", "()Landroidx/compose/ui/layout/c;", "contentScale", "", "F", "m", "()F", "alpha", "Landroidx/compose/ui/graphics/m0;", "Landroidx/compose/ui/graphics/m0;", "n", "()Landroidx/compose/ui/graphics/m0;", "colorFilter", ak.aB, "useIntrinsicSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/m0;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class PainterModifier extends y0 implements w, j {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final Painter painter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.c alignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.layout.c contentScale;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final m0 colorFilter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(@dl.d Painter painter, boolean z10, @dl.d androidx.compose.ui.c alignment, @dl.d androidx.compose.ui.layout.c contentScale, float f10, @dl.e m0 m0Var, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        f0.p(painter, "painter");
        f0.p(alignment, "alignment");
        f0.p(contentScale, "contentScale");
        f0.p(inspectorInfo, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z10;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = m0Var;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z10, androidx.compose.ui.c cVar, androidx.compose.ui.layout.c cVar2, float f10, m0 m0Var, yh.l lVar, int i10, u uVar) {
        this(painter, z10, (i10 & 4) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar, (i10 & 8) != 0 ? androidx.compose.ui.layout.c.INSTANCE.k() : cVar2, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : m0Var, lVar);
    }

    private final long f(long dstSize) {
        if (!s()) {
            return dstSize;
        }
        long jA = b1.n.a(!y(this.painter.getIntrinsicSize()) ? b1.m.t(dstSize) : b1.m.t(this.painter.getIntrinsicSize()), !u(this.painter.getIntrinsicSize()) ? b1.m.m(dstSize) : b1.m.m(this.painter.getIntrinsicSize()));
        if (!(b1.m.t(dstSize) == 0.0f)) {
            if (!(b1.m.m(dstSize) == 0.0f)) {
                return o1.k(jA, this.contentScale.a(jA, dstSize));
            }
        }
        return b1.m.f30386b.c();
    }

    private final boolean s() {
        if (this.sizeToIntrinsics) {
            if (this.painter.getIntrinsicSize() != b1.m.f30386b.a()) {
                return true;
            }
        }
        return false;
    }

    private final boolean u(long j10) {
        if (!b1.m.k(j10, b1.m.f30386b.a())) {
            float fM = b1.m.m(j10);
            if ((Float.isInfinite(fM) || Float.isNaN(fM)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean y(long j10) {
        if (!b1.m.k(j10, b1.m.f30386b.a())) {
            float fT = b1.m.t(j10);
            if ((Float.isInfinite(fT) || Float.isNaN(fT)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final long z(long constraints) {
        boolean z10 = s1.b.j(constraints) && s1.b.i(constraints);
        boolean z11 = s1.b.n(constraints) && s1.b.l(constraints);
        if ((!s() && z10) || z11) {
            return s1.b.e(constraints, s1.b.p(constraints), 0, s1.b.o(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        long jF = f(b1.n.a(s1.c.g(constraints, y(intrinsicSize) ? di.d.L0(b1.m.t(intrinsicSize)) : s1.b.r(constraints)), s1.c.f(constraints, u(intrinsicSize) ? di.d.L0(b1.m.m(intrinsicSize)) : s1.b.q(constraints))));
        return s1.b.e(constraints, s1.c.g(constraints, di.d.L0(b1.m.t(jF))), 0, s1.c.f(constraints, di.d.L0(b1.m.m(jF))), 0, 10, null);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        if (!s()) {
            return measurable.l1(i10);
        }
        long jZ = z(s1.c.b(0, 0, 0, i10, 7, null));
        return Math.max(s1.b.r(jZ), measurable.l1(i10));
    }

    public boolean equals(@dl.e Object other) {
        PainterModifier painterModifier = other instanceof PainterModifier ? (PainterModifier) other : null;
        if (painterModifier != null && f0.g(this.painter, painterModifier.painter) && this.sizeToIntrinsics == painterModifier.sizeToIntrinsics && f0.g(this.alignment, painterModifier.alignment) && f0.g(this.contentScale, painterModifier.contentScale)) {
            return ((this.alpha > painterModifier.alpha ? 1 : (this.alpha == painterModifier.alpha ? 0 : -1)) == 0) && f0.g(this.colorFilter, painterModifier.colorFilter);
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.ui.layout.w
    public int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        if (!s()) {
            return measurable.w1(i10);
        }
        long jZ = z(s1.c.b(0, 0, 0, i10, 7, null));
        return Math.max(s1.b.r(jZ), measurable.w1(i10));
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + b0.a(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        m0 m0Var = this.colorFilter;
        return iHashCode + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.layout.w
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        if (!s()) {
            return measurable.V(i10);
        }
        long jZ = z(s1.c.b(0, i10, 0, 0, 13, null));
        return Math.max(s1.b.q(jZ), measurable.V(i10));
    }

    @Override // androidx.compose.ui.layout.w
    public int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        if (!s()) {
            return measurable.L0(i10);
        }
        long jZ = z(s1.c.b(0, i10, 0, 0, 13, null));
        return Math.max(s1.b.q(jZ), measurable.L0(i10));
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        f0.p(measure, "$this$measure");
        f0.p(measurable, "measurable");
        final e1 e1VarZ1 = measurable.z1(z(j10));
        return k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.ui.draw.PainterModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final m0 getColorFilter() {
        return this.colorFilter;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final androidx.compose.ui.layout.c getContentScale() {
        return this.contentScale;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final Painter getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
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
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    @Override // androidx.compose.ui.draw.j
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        long jC;
        f0.p(dVar, "<this>");
        long intrinsicSize = this.painter.getIntrinsicSize();
        long jA = b1.n.a(y(intrinsicSize) ? b1.m.t(intrinsicSize) : b1.m.t(dVar.c()), u(intrinsicSize) ? b1.m.m(intrinsicSize) : b1.m.m(dVar.c()));
        if (b1.m.t(dVar.c()) == 0.0f) {
            jC = b1.m.f30386b.c();
        } else {
            if (b1.m.m(dVar.c()) == 0.0f) {
                jC = b1.m.f30386b.c();
            } else {
                jC = o1.k(jA, this.contentScale.a(jA, dVar.c()));
            }
        }
        long j10 = jC;
        long jA2 = this.alignment.a(s.a(di.d.L0(b1.m.t(j10)), di.d.L0(b1.m.m(j10))), s.a(di.d.L0(b1.m.t(dVar.c())), di.d.L0(b1.m.m(dVar.c()))), dVar.getLayoutDirection());
        float fM = s1.n.m(jA2);
        float fO = s1.n.o(jA2);
        dVar.getDrawContext().getTransform().b(fM, fO);
        this.painter.g(dVar, j10, this.alpha, this.colorFilter);
        dVar.getDrawContext().getTransform().b(-fM, -fO);
        dVar.T0();
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
