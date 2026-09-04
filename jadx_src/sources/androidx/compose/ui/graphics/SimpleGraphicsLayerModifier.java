package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B¥\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u0006\u0010%\u001a\u00020\u0013\u0012\u0006\u0010'\u001a\u00020\u0013\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\u000f\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010;\u001a\u000207\u0012\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<¢\u0006\u0002\b?ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010!\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010#\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u001d\u0010+\u001a\u00020(8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00109\u001a\u0002078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010*R\u001d\u0010;\u001a\u0002078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "hashCode", "", "other", "", "equals", "", "toString", "", "e", "F", "scaleX", "f", "scaleY", "g", "alpha", RXScreenCaptureService.KEY_HEIGHT, "translationX", "i", "translationY", "j", "shadowElevation", "rotationX", "l", "rotationY", "m", "rotationZ", "n", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "o", "J", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "p", "Landroidx/compose/ui/graphics/g2;", "shape", "q", "Z", "clip", "Landroidx/compose/ui/graphics/y1;", "r", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "Landroidx/compose/ui/graphics/l0;", ak.aB, "ambientShadowColor", "t", "spotShadowColor", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;JJLyh/l;Lkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SimpleGraphicsLayerModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationX;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float shadowElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationY;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationZ;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraDistance;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final g2 shape;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final y1 renderEffect;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final yh.l<v0, kotlin.b2> f13642u;

    private SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, y1 y1Var, long j11, long j12, yh.l<? super androidx.compose.ui.platform.x0, kotlin.b2> lVar) {
        super(lVar);
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = g2Var;
        this.clip = z10;
        this.renderEffect = y1Var;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.f13642u = new yh.l<v0, kotlin.b2>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            public final void a(@dl.d v0 v0Var) {
                kotlin.jvm.internal.f0.p(v0Var, "$this$null");
                v0Var.P(this.f13643b.scaleX);
                v0Var.T(this.f13643b.scaleY);
                v0Var.f(this.f13643b.alpha);
                v0Var.Z(this.f13643b.translationX);
                v0Var.o(this.f13643b.translationY);
                v0Var.r0(this.f13643b.shadowElevation);
                v0Var.z(this.f13643b.rotationX);
                v0Var.A(this.f13643b.rotationY);
                v0Var.C(this.f13643b.rotationZ);
                v0Var.y(this.f13643b.cameraDistance);
                v0Var.q0(this.f13643b.transformOrigin);
                v0Var.K0(this.f13643b.shape);
                v0Var.p0(this.f13643b.clip);
                v0Var.R(this.f13643b.renderEffect);
                v0Var.c1(this.f13643b.ambientShadowColor);
                v0Var.f1(this.f13643b.spotShadowColor);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(v0 v0Var) {
                a(v0Var);
                return kotlin.b2.f124493a;
            }
        };
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, y1 y1Var, long j11, long j12, yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g2Var, z10, y1Var, j11, j12, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.d(this, nVar, mVar, i10);
    }

    public boolean equals(@dl.e Object other) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = other instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) other : null;
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        if (!(this.scaleX == simpleGraphicsLayerModifier.scaleX)) {
            return false;
        }
        if (!(this.scaleY == simpleGraphicsLayerModifier.scaleY)) {
            return false;
        }
        if (!(this.alpha == simpleGraphicsLayerModifier.alpha)) {
            return false;
        }
        if (!(this.translationX == simpleGraphicsLayerModifier.translationX)) {
            return false;
        }
        if (!(this.translationY == simpleGraphicsLayerModifier.translationY)) {
            return false;
        }
        if (!(this.shadowElevation == simpleGraphicsLayerModifier.shadowElevation)) {
            return false;
        }
        if (!(this.rotationX == simpleGraphicsLayerModifier.rotationX)) {
            return false;
        }
        if (!(this.rotationY == simpleGraphicsLayerModifier.rotationY)) {
            return false;
        }
        if (this.rotationZ == simpleGraphicsLayerModifier.rotationZ) {
            return ((this.cameraDistance > simpleGraphicsLayerModifier.cameraDistance ? 1 : (this.cameraDistance == simpleGraphicsLayerModifier.cameraDistance ? 0 : -1)) == 0) && o2.i(this.transformOrigin, simpleGraphicsLayerModifier.transformOrigin) && kotlin.jvm.internal.f0.g(this.shape, simpleGraphicsLayerModifier.shape) && this.clip == simpleGraphicsLayerModifier.clip && kotlin.jvm.internal.f0.g(this.renderEffect, simpleGraphicsLayerModifier.renderEffect) && l0.y(this.ambientShadowColor, simpleGraphicsLayerModifier.ambientShadowColor) && l0.y(this.spotShadowColor, simpleGraphicsLayerModifier.spotShadowColor);
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.shadowElevation)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + o2.m(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + androidx.compose.foundation.b0.a(this.clip)) * 31;
        y1 y1Var = this.renderEffect;
        return ((((iFloatToIntBits + (y1Var != null ? y1Var.hashCode() : 0)) * 31) + l0.K(this.ambientShadowColor)) * 31) + l0.K(this.spotShadowColor);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int i(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int j(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(j10);
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.D(layout, e1VarZ1, 0, 0, 0.0f, this.f13642u, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
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

    @dl.d
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) o2.n(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) l0.L(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) l0.L(this.spotShadowColor)) + ')';
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
