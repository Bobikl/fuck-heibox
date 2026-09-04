package androidx.compose.ui.graphics;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aQ\u0010\u0010\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0014\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0016\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u0016H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u0016\u0010\u001d\u001a\u00020\u0017*\u00020\u001cH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0016\u0010\u001f\u001a\u00020\u001a*\u00020\u001cH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u009f\u0001\u0010*\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012,\u0010%\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030 ¢\u0006\u0002\b$2,\u0010'\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00030 ¢\u0006\u0002\b$2,\u0010)\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030 ¢\u0006\u0002\b$H\u0082\b\u001a\u001a\u0010.\u001a\u00020\u0003*\u00020+2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,\u001a\f\u00100\u001a\u00020/*\u00020\u001cH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/l1;", "Landroidx/compose/ui/graphics/f1;", "outline", "Lkotlin/b2;", "b", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/l0;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/j;", "style", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Landroidx/compose/ui/graphics/x;", "blendMode", "f", "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/graphics/f1;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/a0;", "brush", "d", "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/graphics/f1;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Lb1/i;", "Lb1/f;", "l", "(Lb1/i;)J", "Lb1/m;", "j", "Lb1/k;", "m", "(Lb1/k;)J", "k", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "rect", "Lkotlin/t;", "drawRectBlock", "rrect", "drawRoundedRectBlock", FlutterActivityLaunchConfigs.EXTRA_PATH, "drawPathBlock", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/d0;", "Landroidx/compose/ui/graphics/h1;", "paint", ak.aF, "", "i", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class g1 {
    public static final void b(@dl.d l1 l1Var, @dl.d f1 outline) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        kotlin.jvm.internal.f0.p(outline, "outline");
        if (outline instanceof f1.b) {
            l1Var.m(((f1.b) outline).b());
        } else if (outline instanceof f1.c) {
            l1Var.p(((f1.c) outline).getF13848a());
        } else {
            if (!(outline instanceof f1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            k1.c(l1Var, ((f1.a) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void c(@dl.d d0 d0Var, @dl.d f1 outline, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(outline, "outline");
        kotlin.jvm.internal.f0.p(paint, "paint");
        if (outline instanceof f1.b) {
            d0Var.A(((f1.b) outline).b(), paint);
            return;
        }
        if (!(outline instanceof f1.c)) {
            if (!(outline instanceof f1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var.D(((f1.a) outline).getPath(), paint);
        } else {
            f1.c cVar = (f1.c) outline;
            l1 roundRectPath = cVar.getRoundRectPath();
            if (roundRectPath != null) {
                d0Var.D(roundRectPath, paint);
            } else {
                d0Var.F(cVar.getF13848a().q(), cVar.getF13848a().s(), cVar.getF13848a().r(), cVar.getF13848a().m(), b1.a.m(cVar.getF13848a().n()), b1.a.o(cVar.getF13848a().n()), paint);
            }
        }
    }

    public static final void d(@dl.d androidx.compose.ui.graphics.drawscope.g drawOutline, @dl.d f1 outline, @dl.d a0 brush, float f10, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e m0 m0Var, int i10) {
        l1 path;
        kotlin.jvm.internal.f0.p(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.f0.p(outline, "outline");
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(style, "style");
        if (outline instanceof f1.b) {
            b1.i iVarB = ((f1.b) outline).b();
            drawOutline.w0(brush, l(iVarB), j(iVarB), f10, style, m0Var, i10);
            return;
        }
        if (outline instanceof f1.c) {
            f1.c cVar = (f1.c) outline;
            path = cVar.getRoundRectPath();
            if (path == null) {
                b1.k f13848a = cVar.getF13848a();
                drawOutline.B1(brush, m(f13848a), k(f13848a), b1.b.b(b1.a.m(f13848a.n()), 0.0f, 2, null), f10, style, m0Var, i10);
                return;
            }
        } else {
            if (!(outline instanceof f1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((f1.a) outline).getPath();
        }
        drawOutline.m0(path, brush, f10, style, m0Var, i10);
    }

    public static /* synthetic */ void e(androidx.compose.ui.graphics.drawscope.g gVar, f1 f1Var, a0 a0Var, float f10, androidx.compose.ui.graphics.drawscope.j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = androidx.compose.ui.graphics.drawscope.o.f13826a;
        }
        androidx.compose.ui.graphics.drawscope.j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            m0Var = null;
        }
        m0 m0Var2 = m0Var;
        if ((i11 & 32) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.g.INSTANCE.a();
        }
        d(gVar, f1Var, a0Var, f11, jVar2, m0Var2, i10);
    }

    public static final void f(@dl.d androidx.compose.ui.graphics.drawscope.g drawOutline, @dl.d f1 outline, long j10, float f10, @dl.d androidx.compose.ui.graphics.drawscope.j style, @dl.e m0 m0Var, int i10) {
        l1 path;
        kotlin.jvm.internal.f0.p(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.f0.p(outline, "outline");
        kotlin.jvm.internal.f0.p(style, "style");
        if (outline instanceof f1.b) {
            b1.i iVarB = ((f1.b) outline).b();
            drawOutline.u1(j10, l(iVarB), j(iVarB), f10, style, m0Var, i10);
            return;
        }
        if (outline instanceof f1.c) {
            f1.c cVar = (f1.c) outline;
            path = cVar.getRoundRectPath();
            if (path == null) {
                b1.k f13848a = cVar.getF13848a();
                drawOutline.i1(j10, m(f13848a), k(f13848a), b1.b.b(b1.a.m(f13848a.n()), 0.0f, 2, null), style, f10, m0Var, i10);
                return;
            }
        } else {
            if (!(outline instanceof f1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((f1.a) outline).getPath();
        }
        drawOutline.z0(path, j10, f10, style, m0Var, i10);
    }

    private static final void h(androidx.compose.ui.graphics.drawscope.g gVar, f1 f1Var, yh.p<? super androidx.compose.ui.graphics.drawscope.g, ? super b1.i, kotlin.b2> pVar, yh.p<? super androidx.compose.ui.graphics.drawscope.g, ? super b1.k, kotlin.b2> pVar2, yh.p<? super androidx.compose.ui.graphics.drawscope.g, ? super l1, kotlin.b2> pVar3) {
        if (f1Var instanceof f1.b) {
            pVar.invoke(gVar, ((f1.b) f1Var).b());
            return;
        }
        if (!(f1Var instanceof f1.c)) {
            if (!(f1Var instanceof f1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar3.invoke(gVar, ((f1.a) f1Var).getPath());
        } else {
            f1.c cVar = (f1.c) f1Var;
            l1 roundRectPath = cVar.getRoundRectPath();
            if (roundRectPath != null) {
                pVar3.invoke(gVar, roundRectPath);
            } else {
                pVar2.invoke(gVar, cVar.getF13848a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    public static final boolean i(b1.k kVar) {
        boolean z10;
        boolean z11;
        if (b1.a.m(kVar.n()) == b1.a.m(kVar.o())) {
            if (b1.a.m(kVar.o()) == b1.a.m(kVar.u())) {
                if (b1.a.m(kVar.u()) == b1.a.m(kVar.t())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (b1.a.o(kVar.n()) == b1.a.o(kVar.o())) {
            if (b1.a.o(kVar.o()) == b1.a.o(kVar.u())) {
                if (b1.a.o(kVar.u()) == b1.a.o(kVar.t())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z10 && z11;
    }

    private static final long j(b1.i iVar) {
        return b1.n.a(iVar.G(), iVar.r());
    }

    private static final long k(b1.k kVar) {
        return b1.n.a(kVar.v(), kVar.p());
    }

    private static final long l(b1.i iVar) {
        return b1.g.a(iVar.t(), iVar.getF30372b());
    }

    private static final long m(b1.k kVar) {
        return b1.g.a(kVar.q(), kVar.s());
    }
}
