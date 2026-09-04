package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.x;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a£\u0001\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010!\u001a\u00020\u000e*\u00020\u001d2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001e¢\u0006\u0002\b\u001fH\u0082\b\u001a-\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0$H\u0007¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Ls1/h;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/l0;", "tintColor", "Landroidx/compose/ui/graphics/x;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/m0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/ui/graphics/vector/l;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "d", "(FFFFLjava/lang/String;JILyh/r;Landroidx/compose/runtime/p;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "", "autoMirror", "e", "(FFFFLjava/lang/String;JIZLyh/r;Landroidx/compose/runtime/p;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/c;", "image", ak.aF, "(Landroidx/compose/ui/graphics/vector/c;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/Function1;", "Lkotlin/t;", "block", "b", "Landroidx/compose/ui/graphics/vector/o;", MallPurchaseDetailDialogFragment.f89681y1, "", "Landroidx/compose/ui/graphics/vector/n;", "configs", ak.av, "(Landroidx/compose/ui/graphics/vector/o;Ljava/util/Map;Landroidx/compose/runtime/p;II)V", "Ljava/lang/String;", "RootGroupName", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class VectorPainterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f14125a = "VectorRootGroup";

    /* JADX INFO: compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements n {
        a() {
        }

        @Override // androidx.compose.ui.graphics.vector.n
        public /* synthetic */ Object a(s sVar, Object obj) {
            return m.a(this, sVar, obj);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b implements n {
        b() {
        }

        @Override // androidx.compose.ui.graphics.vector.n
        public /* synthetic */ Object a(s sVar, Object obj) {
            return m.a(this, sVar, obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x017b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Code duplicated, block: B:48:0x019b  */
    /* JADX WARN: Code duplicated, block: B:50:0x025a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0279  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final o group, @dl.e Map<String, ? extends n> map, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        Map<String, ? extends n> mapZ;
        Iterator<q> it;
        final Map<String, ? extends n> map2;
        androidx.compose.runtime.p pVar2;
        final q next;
        Map<String, ? extends n> map3;
        androidx.compose.runtime.p pVar3;
        final Map<String, ? extends n> map4;
        n bVar;
        n aVar;
        f0.p(group, "group");
        androidx.compose.runtime.p pVarF = pVar.F(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(group) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 16;
        }
        if (i13 == 2 && (i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
            map2 = map;
            pVar2 = pVarF;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                if (i13 != 0) {
                    mapZ = s0.z();
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:326)");
                }
                it = group.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next instanceof r) {
                        pVarF.T(-326285817);
                        r rVar = (r) next;
                        aVar = mapZ.get(rVar.getName());
                        if (aVar == null) {
                            aVar = new a();
                        }
                        n nVar = aVar;
                        androidx.compose.runtime.p pVar4 = pVarF;
                        VectorComposeKt.b((List) nVar.a(s.c.f14377b, rVar.g()), rVar.getPathFillType(), rVar.getName(), (a0) nVar.a(s.a.f14373b, rVar.getFill()), ((Number) nVar.a(s.b.f14375b, Float.valueOf(rVar.getFillAlpha()))).floatValue(), (a0) nVar.a(s.i.f14389b, rVar.getStroke()), ((Number) nVar.a(s.j.f14391b, Float.valueOf(rVar.getStrokeAlpha()))).floatValue(), ((Number) nVar.a(s.k.f14393b, Float.valueOf(rVar.getStrokeLineWidth()))).floatValue(), rVar.getStrokeLineCap(), rVar.getStrokeLineJoin(), rVar.getStrokeLineMiter(), ((Number) nVar.a(s.p.f14403b, Float.valueOf(rVar.getTrimPathStart()))).floatValue(), ((Number) nVar.a(s.n.f14399b, Float.valueOf(rVar.getTrimPathEnd()))).floatValue(), ((Number) nVar.a(s.o.f14401b, Float.valueOf(rVar.getTrimPathOffset()))).floatValue(), pVar4, 8, 0, 0);
                        pVar4.c0();
                        it = it;
                        mapZ = mapZ;
                        pVarF = pVar4;
                    } else {
                        Iterator<q> it2 = it;
                        map3 = mapZ;
                        pVar3 = pVarF;
                        if (next instanceof o) {
                            pVar3.T(-326283959);
                            o oVar = (o) next;
                            map4 = map3;
                            bVar = map4.get(oVar.getName());
                            if (bVar == null) {
                                bVar = new b();
                            }
                            VectorComposeKt.a(oVar.getName(), ((Number) bVar.a(s.f.f14383b, Float.valueOf(oVar.getAndroidx.constraintlayout.motion.widget.f.i java.lang.String()))).floatValue(), ((Number) bVar.a(s.d.f14379b, Float.valueOf(oVar.getPivotX()))).floatValue(), ((Number) bVar.a(s.e.f14381b, Float.valueOf(oVar.getPivotY()))).floatValue(), ((Number) bVar.a(s.g.f14385b, Float.valueOf(oVar.getScaleX()))).floatValue(), ((Number) bVar.a(s.h.f14387b, Float.valueOf(oVar.getScaleY()))).floatValue(), ((Number) bVar.a(s.l.f14395b, Float.valueOf(oVar.getTranslationX()))).floatValue(), ((Number) bVar.a(s.m.f14397b, Float.valueOf(oVar.getTranslationY()))).floatValue(), (List) bVar.a(s.c.f14377b, oVar.e()), androidx.compose.runtime.internal.b.b(pVar3, 1450046638, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar5, int i14) {
                                    if ((i14 & 11) == 2 && pVar5.b()) {
                                        pVar5.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1450046638, i14, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:412)");
                                    }
                                    VectorPainterKt.a((o) next, map4, pVar5, 64, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                    a(pVar5, num.intValue());
                                    return b2.f124493a;
                                }
                            }), pVar3, 939524096, 0);
                            pVar3.c0();
                        } else {
                            map4 = map3;
                            pVar3.T(-326282489);
                            pVar3.c0();
                        }
                        pVarF = pVar3;
                        mapZ = map4;
                        it = it2;
                    }
                }
                map2 = mapZ;
                pVar2 = pVarF;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
            }
            mapZ = map;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:326)");
            }
            it = group.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next instanceof r) {
                    pVarF.T(-326285817);
                    r rVar2 = (r) next;
                    aVar = mapZ.get(rVar2.getName());
                    if (aVar == null) {
                        aVar = new a();
                    }
                    n nVar2 = aVar;
                    androidx.compose.runtime.p pVar5 = pVarF;
                    VectorComposeKt.b((List) nVar2.a(s.c.f14377b, rVar2.g()), rVar2.getPathFillType(), rVar2.getName(), (a0) nVar2.a(s.a.f14373b, rVar2.getFill()), ((Number) nVar2.a(s.b.f14375b, Float.valueOf(rVar2.getFillAlpha()))).floatValue(), (a0) nVar2.a(s.i.f14389b, rVar2.getStroke()), ((Number) nVar2.a(s.j.f14391b, Float.valueOf(rVar2.getStrokeAlpha()))).floatValue(), ((Number) nVar2.a(s.k.f14393b, Float.valueOf(rVar2.getStrokeLineWidth()))).floatValue(), rVar2.getStrokeLineCap(), rVar2.getStrokeLineJoin(), rVar2.getStrokeLineMiter(), ((Number) nVar2.a(s.p.f14403b, Float.valueOf(rVar2.getTrimPathStart()))).floatValue(), ((Number) nVar2.a(s.n.f14399b, Float.valueOf(rVar2.getTrimPathEnd()))).floatValue(), ((Number) nVar2.a(s.o.f14401b, Float.valueOf(rVar2.getTrimPathOffset()))).floatValue(), pVar5, 8, 0, 0);
                    pVar5.c0();
                    it = it;
                    mapZ = mapZ;
                    pVarF = pVar5;
                } else {
                    Iterator<q> it3 = it;
                    map3 = mapZ;
                    pVar3 = pVarF;
                    if (next instanceof o) {
                        pVar3.T(-326283959);
                        o oVar2 = (o) next;
                        map4 = map3;
                        bVar = map4.get(oVar2.getName());
                        if (bVar == null) {
                            bVar = new b();
                        }
                        VectorComposeKt.a(oVar2.getName(), ((Number) bVar.a(s.f.f14383b, Float.valueOf(oVar2.getAndroidx.constraintlayout.motion.widget.f.i java.lang.String()))).floatValue(), ((Number) bVar.a(s.d.f14379b, Float.valueOf(oVar2.getPivotX()))).floatValue(), ((Number) bVar.a(s.e.f14381b, Float.valueOf(oVar2.getPivotY()))).floatValue(), ((Number) bVar.a(s.g.f14385b, Float.valueOf(oVar2.getScaleX()))).floatValue(), ((Number) bVar.a(s.h.f14387b, Float.valueOf(oVar2.getScaleY()))).floatValue(), ((Number) bVar.a(s.l.f14395b, Float.valueOf(oVar2.getTranslationX()))).floatValue(), ((Number) bVar.a(s.m.f14397b, Float.valueOf(oVar2.getTranslationY()))).floatValue(), (List) bVar.a(s.c.f14377b, oVar2.e()), androidx.compose.runtime.internal.b.b(pVar3, 1450046638, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i14) {
                                if ((i14 & 11) == 2 && pVar6.b()) {
                                    pVar6.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1450046638, i14, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:412)");
                                }
                                VectorPainterKt.a((o) next, map4, pVar6, 64, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                a(pVar6, num.intValue());
                                return b2.f124493a;
                            }
                        }), pVar3, 939524096, 0);
                        pVar3.c0();
                    } else {
                        map4 = map3;
                        pVar3.T(-326282489);
                        pVar3.c0();
                    }
                    pVarF = pVar3;
                    mapZ = map4;
                    it = it3;
                }
            }
            map2 = mapZ;
            pVar2 = pVarF;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i14) {
                VectorPainterKt.a(group, map2, pVar6, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                a(pVar6, num.intValue());
                return b2.f124493a;
            }
        });
    }

    private static final void b(androidx.compose.ui.graphics.drawscope.g gVar, yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> lVar) {
        long jI = gVar.I();
        androidx.compose.ui.graphics.drawscope.e drawContext = gVar.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(-1.0f, 1.0f, jI);
        lVar.invoke(gVar);
        drawContext.a().u();
        drawContext.b(jC);
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final VectorPainter c(@dl.d final c image, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(image, "image");
        pVar.T(1413834416);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:156)");
        }
        VectorPainter vectorPainterE = e(image.getDefaultWidth(), image.getDefaultHeight(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.getTintColor(), image.getTintBlendMode(), image.getAutoMirror(), androidx.compose.runtime.internal.b.b(pVar, 1873274766, true, new yh.r<Float, Float, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3
            {
                super(4);
            }

            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(Float f10, Float f11, androidx.compose.runtime.p pVar2, Integer num) {
                a(f10.floatValue(), f11.floatValue(), pVar2, num.intValue());
                return b2.f124493a;
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
            @androidx.compose.runtime.h
            public final void a(float f10, float f11, @dl.e androidx.compose.runtime.p pVar2, int i11) {
                if ((i11 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1873274766, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:166)");
                }
                VectorPainterKt.a(image.getRoot(), null, pVar2, 0, 2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }), pVar, 100663296, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return vectorPainterE;
    }

    @androidx.compose.runtime.j(index = -1)
    @dl.d
    @kotlin.k(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @kotlin.s0(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @androidx.compose.runtime.h
    public static final VectorPainter d(float f10, float f11, float f12, float f13, @dl.e String str, long j10, int i10, @dl.d yh.r<? super Float, ? super Float, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        f0.p(content, "content");
        pVar.T(-964365210);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) != 0 ? Float.NaN : f13;
        String str2 = (i12 & 16) != 0 ? f14125a : str;
        long jU = (i12 & 32) != 0 ? l0.INSTANCE.u() : j10;
        int iZ = (i12 & 64) != 0 ? x.INSTANCE.z() : i10;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-964365210, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter vectorPainterE = e(f10, f11, f14, f15, str2, jU, iZ, false, content, pVar, 12582912 | (i11 & 14) | (i11 & 112) | (i11 & bb.c.b.f30796me) | (i11 & bb.c.g.f32954lc) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return vectorPainterE;
    }

    @androidx.compose.runtime.j(index = -1)
    @dl.d
    @androidx.compose.runtime.h
    public static final VectorPainter e(float f10, float f11, float f12, float f13, @dl.e String str, long j10, int i10, boolean z10, @dl.d yh.r<? super Float, ? super Float, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        f0.p(content, "content");
        pVar.T(1068590786);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? f14125a : str;
        long jU = (i12 & 32) != 0 ? l0.INSTANCE.u() : j10;
        int iZ = (i12 & 64) != 0 ? x.INSTANCE.z() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1068590786, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:114)");
        }
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        float fE1 = eVar.E1(f10);
        float fE2 = eVar.E1(f11);
        if (Float.isNaN(f14)) {
            f14 = fE1;
        }
        if (Float.isNaN(f15)) {
            f15 = fE2;
        }
        l0 l0VarN = l0.n(jU);
        x xVarD = x.D(iZ);
        int i13 = i11 >> 15;
        pVar.T(511388516);
        boolean zS = pVar.s(l0VarN) | pVar.s(xVarD);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = !l0.y(jU, l0.INSTANCE.u()) ? m0.INSTANCE.c(jU, iZ) : null;
            pVar.N(objU);
        }
        pVar.c0();
        m0 m0Var = (m0) objU;
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new VectorPainter();
            pVar.N(objU2);
        }
        pVar.c0();
        VectorPainter vectorPainter = (VectorPainter) objU2;
        vectorPainter.w(b1.n.a(fE1, fE2));
        vectorPainter.t(z11);
        vectorPainter.v(m0Var);
        vectorPainter.l(str2, f14, f15, content, pVar, ((i11 >> 12) & 14) | 32768 | (i13 & bb.c.g.f32954lc));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return vectorPainter;
    }
}
