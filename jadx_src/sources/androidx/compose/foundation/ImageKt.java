package androidx.compose.foundation;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.s0;

/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ae\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aU\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/c;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/graphics/y0;Ljava/lang/String;Landroidx/compose/ui/n;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/m0;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/r0;", "filterQuality", "d", "(Landroidx/compose/ui/graphics/y0;Ljava/lang/String;Landroidx/compose/ui/n;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/m0;ILandroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/vector/c;", "imageVector", ak.aF, "(Landroidx/compose/ui/graphics/vector/c;Ljava/lang/String;Landroidx/compose/ui/n;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/m0;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "b", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/n;Landroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/m0;Landroidx/compose/runtime/p;II)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ImageKt {
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @s0(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @androidx.compose.runtime.h
    public static final /* synthetic */ void a(y0 bitmap, String str, androidx.compose.ui.n nVar, androidx.compose.ui.c cVar, androidx.compose.ui.layout.c cVar2, float f10, androidx.compose.ui.graphics.m0 m0Var, androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        pVar.T(-2123228673);
        androidx.compose.ui.n nVar2 = (i11 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        androidx.compose.ui.c cVarI = (i11 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.c cVarI2 = (i11 & 16) != 0 ? androidx.compose.ui.layout.c.INSTANCE.i() : cVar2;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.m0 m0Var2 = (i11 & 64) != 0 ? null : m0Var;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2123228673, i10, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        d(bitmap, str, nVar2, cVarI, cVarI2, f11, m0Var2, r0.INSTANCE.b(), pVar, (i10 & 112) | 8 | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final Painter painter, @dl.e final String str, @dl.e androidx.compose.ui.n nVar, @dl.e androidx.compose.ui.c cVar, @dl.e androidx.compose.ui.layout.c cVar2, float f10, @dl.e androidx.compose.ui.graphics.m0 m0Var, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVarC;
        kotlin.jvm.internal.f0.p(painter, "painter");
        androidx.compose.runtime.p pVarF = pVar.F(1142754848);
        androidx.compose.ui.n nVar2 = (i11 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        androidx.compose.ui.c cVarI = (i11 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.c cVarI2 = (i11 & 16) != 0 ? androidx.compose.ui.layout.c.INSTANCE.i() : cVar2;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.m0 m0Var2 = (i11 & 64) != 0 ? null : m0Var;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1142754848, i10, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        pVarF.T(-816794123);
        if (str != null) {
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            pVarF.T(1157296644);
            boolean zS = pVarF.s(str);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        SemanticsPropertiesKt.e0(semantics, str);
                        SemanticsPropertiesKt.p0(semantics, androidx.compose.ui.semantics.g.INSTANCE.c());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            nVarC = SemanticsModifierKt.c(companion, false, (yh.l) objU, 1, null);
        } else {
            nVarC = androidx.compose.ui.n.INSTANCE;
        }
        pVarF.c0();
        androidx.compose.ui.n nVarB = PainterModifierKt.b(androidx.compose.ui.draw.d.b(nVar2.s0(nVarC)), painter, false, cVarI, cVarI2, f11, m0Var2, 2, null);
        ImageKt$Image$2 imageKt$Image$2 = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.foundation.ImageKt$Image$2
            @Override // androidx.compose.ui.layout.i0
            @dl.d
            public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> list, long j10) {
                kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                kotlin.jvm.internal.f0.p(list, "<anonymous parameter 0>");
                return androidx.compose.ui.layout.k0.p(Layout, s1.b.r(j10), s1.b.q(j10), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.ImageKt$Image$2$measure$1
                    public final void a(@dl.d e1.a layout) {
                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int b(androidx.compose.ui.layout.n nVar3, List list, int i12) {
                return androidx.compose.ui.layout.h0.c(this, nVar3, list, i12);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int c(androidx.compose.ui.layout.n nVar3, List list, int i12) {
                return androidx.compose.ui.layout.h0.d(this, nVar3, list, i12);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int d(androidx.compose.ui.layout.n nVar3, List list, int i12) {
                return androidx.compose.ui.layout.h0.a(this, nVar3, list, i12);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int e(androidx.compose.ui.layout.n nVar3, List list, int i12) {
                return androidx.compose.ui.layout.h0.b(this, nVar3, list, i12);
            }
        };
        pVarF.T(-1323940314);
        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion2.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarB);
        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVarF.h();
        if (pVarF.D()) {
            pVarF.L(aVarA);
        } else {
            pVarF.d();
        }
        pVarF.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVarF);
        Updater.j(pVarB, imageKt$Image$2, companion2.d());
        Updater.j(pVarB, eVar, companion2.b());
        Updater.j(pVarB, layoutDirection, companion2.c());
        Updater.j(pVarB, d2Var, companion2.f());
        pVarF.x();
        qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
        pVarF.T(2058660585);
        pVarF.T(-2077995625);
        pVarF.c0();
        pVarF.c0();
        pVarF.f();
        pVarF.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar3 = nVar2;
        final androidx.compose.ui.c cVar3 = cVarI;
        final androidx.compose.ui.layout.c cVar4 = cVarI2;
        final float f12 = f11;
        final androidx.compose.ui.graphics.m0 m0Var3 = m0Var2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.ImageKt$Image$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                ImageKt.b(painter, str, nVar3, cVar3, cVar4, f12, m0Var3, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(@dl.d androidx.compose.ui.graphics.vector.c imageVector, @dl.e String str, @dl.e androidx.compose.ui.n nVar, @dl.e androidx.compose.ui.c cVar, @dl.e androidx.compose.ui.layout.c cVar2, float f10, @dl.e androidx.compose.ui.graphics.m0 m0Var, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(imageVector, "imageVector");
        pVar.T(1595907091);
        androidx.compose.ui.n nVar2 = (i11 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        androidx.compose.ui.c cVarI = (i11 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.c cVarI2 = (i11 & 16) != 0 ? androidx.compose.ui.layout.c.INSTANCE.i() : cVar2;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.m0 m0Var2 = (i11 & 64) != 0 ? null : m0Var;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1595907091, i10, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        b(VectorPainterKt.c(imageVector, pVar, i10 & 14), str, nVar2, cVarI, cVarI2, f11, m0Var2, pVar, VectorPainter.f14106n | (i10 & 112) | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void d(@dl.d y0 bitmap, @dl.e String str, @dl.e androidx.compose.ui.n nVar, @dl.e androidx.compose.ui.c cVar, @dl.e androidx.compose.ui.layout.c cVar2, float f10, @dl.e androidx.compose.ui.graphics.m0 m0Var, int i10, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        pVar.T(-1396260732);
        androidx.compose.ui.n nVar2 = (i12 & 4) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        androidx.compose.ui.c cVarI = (i12 & 8) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar;
        androidx.compose.ui.layout.c cVarI2 = (i12 & 16) != 0 ? androidx.compose.ui.layout.c.INSTANCE.i() : cVar2;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.m0 m0Var2 = (i12 & 64) != 0 ? null : m0Var;
        int iB = (i12 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.g.INSTANCE.b() : i10;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(bitmap);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = androidx.compose.ui.graphics.painter.b.b(bitmap, 0L, 0L, iB, 6, null);
            pVar.N(objU);
        }
        pVar.c0();
        b((BitmapPainter) objU, str, nVar2, cVarI, cVarI2, f11, m0Var2, pVar, (i11 & 112) | 8 | (i11 & bb.c.b.f30796me) | (i11 & bb.c.g.f32954lc) | (57344 & i11) | (458752 & i11) | (3670016 & i11), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }
}
