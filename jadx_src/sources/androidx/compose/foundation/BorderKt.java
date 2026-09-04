package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.q1;
import androidx.compose.ui.graphics.x1;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.graphics.z0;
import androidx.compose.ui.node.h1;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a1\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0012\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002\u001a:\u0010\u001d\u001a\u00020\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001aW\u0010#\u001a\u00020\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001aA\u0010&\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a(\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0018\u0010.\u001a\u00020*2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002\u001a!\u00101\u001a\u00020/*\u00020/2\u0006\u00100\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/g;", "border", "Landroidx/compose/ui/graphics/g2;", "shape", "f", "Ls1/h;", "width", "Landroidx/compose/ui/graphics/l0;", "color", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/n;FJLandroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/a0;", "brush", "j", "(Landroidx/compose/ui/n;FLandroidx/compose/ui/graphics/a0;Landroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/n;", "Landroidx/compose/ui/node/h1;", "Landroidx/compose/foundation/f;", "q", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/k;", "m", "borderCacheRef", "Landroidx/compose/ui/graphics/f1$a;", "outline", "", "fillArea", "", "strokeWidth", "n", "Landroidx/compose/ui/graphics/f1$c;", "Lb1/f;", "topLeft", "Lb1/m;", "borderSize", "p", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/h1;Landroidx/compose/ui/graphics/a0;Landroidx/compose/ui/graphics/f1$c;JJZF)Landroidx/compose/ui/draw/k;", "strokeWidthPx", "o", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/a0;JJZF)Landroidx/compose/ui/draw/k;", "Landroidx/compose/ui/graphics/l1;", "targetPath", "Lb1/k;", "roundedRect", "l", "widthPx", "k", "Lb1/a;", "value", "r", "(JF)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BorderKt {
    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar, @dl.d BorderStroke border, @dl.d g2 shape) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(border, "border");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return j(nVar, border.getWidth(), border.getBrush(), shape);
    }

    public static /* synthetic */ androidx.compose.ui.n g(androidx.compose.ui.n nVar, BorderStroke borderStroke, g2 g2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = x1.a();
        }
        return f(nVar, borderStroke, g2Var);
    }

    @dl.d
    public static final androidx.compose.ui.n h(@dl.d androidx.compose.ui.n border, float f10, long j10, @dl.d g2 shape) {
        kotlin.jvm.internal.f0.p(border, "$this$border");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return j(border, f10, new SolidColor(j10, null), shape);
    }

    public static /* synthetic */ androidx.compose.ui.n i(androidx.compose.ui.n nVar, float f10, long j10, g2 g2Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            g2Var = x1.a();
        }
        return h(nVar, f10, j10, g2Var);
    }

    @dl.d
    public static final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n border, final float f10, @dl.d final androidx.compose.ui.graphics.a0 brush, @dl.d final g2 shape) {
        kotlin.jvm.internal.f0.p(border, "$this$border");
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return ComposedModifierKt.g(border, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("border");
                x0Var.getProperties().c("width", s1.h.d(f10));
                if (brush instanceof SolidColor) {
                    x0Var.getProperties().c("color", androidx.compose.ui.graphics.l0.n(((SolidColor) brush).getValue()));
                    x0Var.e(androidx.compose.ui.graphics.l0.n(((SolidColor) brush).getValue()));
                } else {
                    x0Var.getProperties().c("brush", brush);
                }
                x0Var.getProperties().c("shape", shape);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.BorderKt$border$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-1498088849);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1498088849, i10, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new h1();
                    pVar.N(objU);
                }
                pVar.c0();
                final h1 h1Var = (h1) objU;
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                final float f11 = f10;
                final g2 g2Var = shape;
                final androidx.compose.ui.graphics.a0 a0Var = brush;
                androidx.compose.ui.n nVarS0 = composed.s0(DrawModifierKt.b(companion, new yh.l<CacheDrawScope, androidx.compose.ui.draw.k>() { // from class: androidx.compose.foundation.BorderKt$border$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final androidx.compose.ui.draw.k invoke(@dl.d CacheDrawScope drawWithCache) {
                        kotlin.jvm.internal.f0.p(drawWithCache, "$this$drawWithCache");
                        if (!(drawWithCache.E1(f11) >= 0.0f && b1.m.q(drawWithCache.c()) > 0.0f)) {
                            return BorderKt.m(drawWithCache);
                        }
                        float f12 = 2;
                        float fMin = Math.min(s1.h.l(f11, s1.h.f139219c.a()) ? 1.0f : (float) Math.ceil(drawWithCache.E1(f11)), (float) Math.ceil(b1.m.q(drawWithCache.c()) / f12));
                        float f13 = fMin / f12;
                        long jA = b1.g.a(f13, f13);
                        long jA2 = b1.n.a(b1.m.t(drawWithCache.c()) - fMin, b1.m.m(drawWithCache.c()) - fMin);
                        boolean z10 = f12 * fMin > b1.m.q(drawWithCache.c());
                        f1 f1VarA = g2Var.a(drawWithCache.c(), drawWithCache.getLayoutDirection(), drawWithCache);
                        if (f1VarA instanceof f1.a) {
                            return BorderKt.n(drawWithCache, h1Var, a0Var, (f1.a) f1VarA, z10, fMin);
                        }
                        if (f1VarA instanceof f1.c) {
                            return BorderKt.p(drawWithCache, h1Var, a0Var, (f1.c) f1VarA, jA, jA2, z10, fMin);
                        }
                        if (f1VarA instanceof f1.b) {
                            return BorderKt.o(drawWithCache, a0Var, jA, jA2, z10, fMin);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    private static final b1.k k(float f10, b1.k kVar) {
        return new b1.k(f10, f10, kVar.v() - f10, kVar.p() - f10, r(kVar.t(), f10), r(kVar.u(), f10), r(kVar.o(), f10), r(kVar.n(), f10), null);
    }

    private static final l1 l(l1 l1Var, b1.k kVar, float f10, boolean z10) {
        l1Var.reset();
        l1Var.p(kVar);
        if (!z10) {
            l1 l1VarA = androidx.compose.ui.graphics.o.a();
            l1VarA.p(k(f10, kVar));
            l1Var.s(l1Var, l1VarA, q1.INSTANCE.a());
        }
        return l1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.k m(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.T0();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, androidx.compose.ui.graphics.y0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    public static final androidx.compose.ui.draw.k n(CacheDrawScope cacheDrawScope, h1<BorderCache> h1Var, final androidx.compose.ui.graphics.a0 a0Var, final f1.a aVar, boolean z10, float f10) {
        int iB;
        androidx.compose.ui.graphics.m0 m0VarD;
        boolean z11;
        ?? r11;
        androidx.compose.ui.graphics.d0 d0Var;
        if (z10) {
            return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                    kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.T0();
                    androidx.compose.ui.graphics.drawscope.f.F(onDrawWithContent, aVar.getPath(), a0Var, 0.0f, null, null, 0, 60, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                    a(dVar);
                    return b2.f124493a;
                }
            });
        }
        if (a0Var instanceof SolidColor) {
            iB = z0.INSTANCE.a();
            m0VarD = androidx.compose.ui.graphics.m0.Companion.d(androidx.compose.ui.graphics.m0.INSTANCE, ((SolidColor) a0Var).getValue(), 0, 2, null);
        } else {
            iB = z0.INSTANCE.b();
            m0VarD = null;
        }
        final b1.i bounds = aVar.getPath().getBounds();
        BorderCache borderCacheQ = q(h1Var);
        l1 l1VarN = borderCacheQ.n();
        l1VarN.reset();
        l1VarN.m(bounds);
        l1VarN.s(l1VarN, aVar.getPath(), q1.INSTANCE.a());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long jA = s1.s.a((int) Math.ceil(bounds.G()), (int) Math.ceil(bounds.r()));
        y0 y0Var = borderCacheQ.imageBitmap;
        androidx.compose.ui.graphics.d0 d0Var2 = borderCacheQ.canvas;
        z0 z0VarF = y0Var != null ? z0.f(y0Var.d()) : null;
        if (!(z0VarF == null ? false : z0.i(z0VarF.m(), z0.INSTANCE.b()))) {
            z11 = z0.h(iB, y0Var != null ? z0.f(y0Var.d()) : null);
        }
        if (y0Var == null || d0Var2 == null || b1.m.t(cacheDrawScope.c()) > y0Var.getWidth() || b1.m.m(cacheDrawScope.c()) > y0Var.getHeight() || !z11) {
            y0 y0VarB = a1.b(s1.r.m(jA), s1.r.j(jA), iB, false, null, 24, null);
            borderCacheQ.imageBitmap = y0VarB;
            androidx.compose.ui.graphics.d0 d0VarA = androidx.compose.ui.graphics.f0.a(y0VarB);
            borderCacheQ.canvas = d0VarA;
            r11 = y0VarB;
            d0Var = d0VarA;
        } else {
            r11 = y0Var;
            d0Var = d0Var2;
        }
        androidx.compose.ui.graphics.drawscope.a aVar2 = borderCacheQ.canvasDrawScope;
        if (aVar2 == null) {
            aVar2 = new androidx.compose.ui.graphics.drawscope.a();
            borderCacheQ.canvasDrawScope = aVar2;
        }
        androidx.compose.ui.graphics.drawscope.a aVar3 = aVar2;
        long jF = s1.s.f(jA);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams = aVar3.getDrawParams();
        s1.e density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.d0 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams2 = aVar3.getDrawParams();
        drawParams2.l(cacheDrawScope);
        drawParams2.m(layoutDirection);
        drawParams2.k(d0Var);
        drawParams2.n(jF);
        d0Var.f();
        long jA2 = androidx.compose.ui.graphics.l0.INSTANCE.a();
        androidx.compose.ui.graphics.x.Companion companion = androidx.compose.ui.graphics.x.INSTANCE;
        androidx.compose.ui.graphics.drawscope.f.K(aVar3, jA2, 0L, jF, 0.0f, null, null, companion.a(), 58, null);
        float f11 = -bounds.t();
        float f12 = -bounds.getF30372b();
        aVar3.getDrawContext().getTransform().b(f11, f12);
        androidx.compose.ui.graphics.drawscope.f.F(aVar3, aVar.getPath(), a0Var, 0.0f, new Stroke(f10 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f13 = 1;
        float fT = (b1.m.t(aVar3.c()) + f13) / b1.m.t(aVar3.c());
        float fM = (b1.m.m(aVar3.c()) + f13) / b1.m.m(aVar3.c());
        long jI = aVar3.I();
        androidx.compose.ui.graphics.drawscope.e drawContext = aVar3.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(fT, fM, jI);
        androidx.compose.ui.graphics.drawscope.f.F(aVar3, l1VarN, a0Var, 0.0f, null, null, companion.a(), 28, null);
        drawContext.a().u();
        drawContext.b(jC);
        aVar3.getDrawContext().getTransform().b(-f11, -f12);
        d0Var.u();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams3 = aVar3.getDrawParams();
        drawParams3.l(density);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas);
        drawParams3.n(size);
        r11.b();
        objectRef.f124891b = r11;
        final androidx.compose.ui.graphics.m0 m0Var = m0VarD;
        return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.T0();
                float fT2 = bounds.t();
                float f30372b = bounds.getF30372b();
                Ref.ObjectRef<y0> objectRef2 = objectRef;
                long j10 = jA;
                androidx.compose.ui.graphics.m0 m0Var2 = m0Var;
                onDrawWithContent.getDrawContext().getTransform().b(fT2, f30372b);
                androidx.compose.ui.graphics.drawscope.f.z(onDrawWithContent, objectRef2.f124891b, 0L, j10, 0L, 0L, 0.0f, null, m0Var2, 0, 0, bb.c.b.f30658ge, null);
                onDrawWithContent.getDrawContext().getTransform().b(-fT2, -f30372b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.k o(CacheDrawScope cacheDrawScope, final androidx.compose.ui.graphics.a0 a0Var, long j10, long j11, boolean z10, float f10) {
        final long jE = z10 ? b1.f.f30364b.e() : j10;
        final long jC = z10 ? cacheDrawScope.c() : j11;
        final androidx.compose.ui.graphics.drawscope.j stroke = z10 ? androidx.compose.ui.graphics.drawscope.o.f13826a : new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.T0();
                androidx.compose.ui.graphics.drawscope.f.J(onDrawWithContent, a0Var, jE, jC, 0.0f, stroke, null, 0, 104, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.k p(CacheDrawScope cacheDrawScope, h1<BorderCache> h1Var, final androidx.compose.ui.graphics.a0 a0Var, f1.c cVar, final long j10, final long j11, final boolean z10, final float f10) {
        if (!b1.l.q(cVar.getF13848a())) {
            final l1 l1VarL = l(q(h1Var).n(), cVar.getF13848a(), f10, z10);
            return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                    kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.T0();
                    androidx.compose.ui.graphics.drawscope.f.F(onDrawWithContent, l1VarL, a0Var, 0.0f, null, null, 0, 60, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                    a(dVar);
                    return b2.f124493a;
                }
            });
        }
        final long jT = cVar.getF13848a().t();
        final float f11 = f10 / 2;
        final Stroke stroke = new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                kotlin.jvm.internal.f0.p(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.T0();
                if (z10) {
                    androidx.compose.ui.graphics.drawscope.f.L(onDrawWithContent, a0Var, 0L, 0L, jT, 0.0f, null, null, 0, bb.c.b.M1, null);
                    return;
                }
                float fM = b1.a.m(jT);
                float f12 = f11;
                if (fM >= f12) {
                    androidx.compose.ui.graphics.drawscope.f.L(onDrawWithContent, a0Var, j10, j11, BorderKt.r(jT, f12), 0.0f, stroke, null, 0, 208, null);
                    return;
                }
                float f13 = f10;
                float fT = b1.m.t(onDrawWithContent.c()) - f10;
                float fM2 = b1.m.m(onDrawWithContent.c()) - f10;
                int iA = androidx.compose.ui.graphics.k0.INSTANCE.a();
                androidx.compose.ui.graphics.a0 a0Var2 = a0Var;
                long j12 = jT;
                androidx.compose.ui.graphics.drawscope.e drawContext = onDrawWithContent.getDrawContext();
                long jC = drawContext.c();
                drawContext.a().f();
                drawContext.getTransform().a(f13, f13, fT, fM2, iA);
                androidx.compose.ui.graphics.drawscope.f.L(onDrawWithContent, a0Var2, 0L, 0L, j12, 0.0f, null, null, 0, bb.c.b.M1, null);
                drawContext.a().u();
                drawContext.b(jC);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return b2.f124493a;
            }
        });
    }

    private static final BorderCache q(h1<BorderCache> h1Var) {
        BorderCache borderCacheA = h1Var.a();
        if (borderCacheA != null) {
            return borderCacheA;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        h1Var.b(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(long j10, float f10) {
        return b1.b.a(Math.max(0.0f, b1.a.m(j10) - f10), Math.max(0.0f, b1.a.o(j10) - f10));
    }
}
