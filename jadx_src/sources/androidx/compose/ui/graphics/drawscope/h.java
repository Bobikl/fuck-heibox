package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.p0;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a1\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a=\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001aH\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aH\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0015\u001aP\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u0015\u001ah\u0010 \u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!\u001aH\u0010$\u001a\u00020\u0007*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%\u001a$\u0010'\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001aB\u0010+\u001a\u00020\u0007*\u00020\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "block", "f", "inset", RXScreenCaptureService.KEY_HEIGHT, "horizontal", "vertical", "g", "r", "degrees", "Lb1/f;", "pivot", "j", "(Landroidx/compose/ui/graphics/drawscope/g;FJLyh/l;)V", "radians", "l", "scaleX", "scaleY", "n", "(Landroidx/compose/ui/graphics/drawscope/g;FFJLyh/l;)V", "scale", "p", "Landroidx/compose/ui/graphics/k0;", "clipOp", ak.aF, "(Landroidx/compose/ui/graphics/drawscope/g;FFFFILyh/l;)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, ak.av, "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/graphics/l1;ILyh/l;)V", "Landroidx/compose/ui/graphics/d0;", "e", "Landroidx/compose/ui/graphics/drawscope/l;", "transformBlock", "drawBlock", "t", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    public static final void a(@dl.d g clipPath, @dl.d l1 path, int i10, @dl.d yh.l<? super g, b2> block) {
        f0.p(clipPath, "$this$clipPath");
        f0.p(path, "path");
        f0.p(block, "block");
        e drawContext = clipPath.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().e(path, i10);
        block.invoke(clipPath);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void b(g clipPath, l1 path, int i10, yh.l block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = k0.INSTANCE.b();
        }
        f0.p(clipPath, "$this$clipPath");
        f0.p(path, "path");
        f0.p(block, "block");
        e drawContext = clipPath.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().e(path, i10);
        block.invoke(clipPath);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void c(@dl.d g clipRect, float f10, float f11, float f12, float f13, int i10, @dl.d yh.l<? super g, b2> block) {
        f0.p(clipRect, "$this$clipRect");
        f0.p(block, "block");
        e drawContext = clipRect.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().a(f10, f11, f12, f13, i10);
        block.invoke(clipRect);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void d(g clipRect, float f10, float f11, float f12, float f13, int i10, yh.l block, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = b1.m.t(clipRect.c());
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = b1.m.m(clipRect.c());
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = k0.INSTANCE.b();
        }
        f0.p(clipRect, "$this$clipRect");
        f0.p(block, "block");
        e drawContext = clipRect.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().a(f14, f15, f16, f17, i10);
        block.invoke(clipRect);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void e(@dl.d g gVar, @dl.d yh.l<? super d0, b2> block) {
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        block.invoke(gVar.getDrawContext().a());
    }

    public static final void f(@dl.d g gVar, float f10, float f11, float f12, float f13, @dl.d yh.l<? super g, b2> block) {
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().h(f10, f11, f12, f13);
        block.invoke(gVar);
        gVar.getDrawContext().getTransform().h(-f10, -f11, -f12, -f13);
    }

    public static final void g(@dl.d g gVar, float f10, float f11, @dl.d yh.l<? super g, b2> block) {
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().h(f10, f11, f10, f11);
        block.invoke(gVar);
        float f12 = -f10;
        float f13 = -f11;
        gVar.getDrawContext().getTransform().h(f12, f13, f12, f13);
    }

    public static final void h(@dl.d g gVar, float f10, @dl.d yh.l<? super g, b2> block) {
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().h(f10, f10, f10, f10);
        block.invoke(gVar);
        float f11 = -f10;
        gVar.getDrawContext().getTransform().h(f11, f11, f11, f11);
    }

    public static /* synthetic */ void i(g gVar, float f10, float f11, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().h(f10, f11, f10, f11);
        block.invoke(gVar);
        float f12 = -f10;
        float f13 = -f11;
        gVar.getDrawContext().getTransform().h(f12, f13, f12, f13);
    }

    public static final void j(@dl.d g rotate, float f10, long j10, @dl.d yh.l<? super g, b2> block) {
        f0.p(rotate, "$this$rotate");
        f0.p(block, "block");
        e drawContext = rotate.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().g(f10, j10);
        block.invoke(rotate);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void k(g rotate, float f10, long j10, yh.l block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotate.I();
        }
        f0.p(rotate, "$this$rotate");
        f0.p(block, "block");
        e drawContext = rotate.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().g(f10, j10);
        block.invoke(rotate);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void l(@dl.d g rotateRad, float f10, long j10, @dl.d yh.l<? super g, b2> block) {
        f0.p(rotateRad, "$this$rotateRad");
        f0.p(block, "block");
        e drawContext = rotateRad.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().g(p0.a(f10), j10);
        block.invoke(rotateRad);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void m(g rotateRad, float f10, long j10, yh.l block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = rotateRad.I();
        }
        f0.p(rotateRad, "$this$rotateRad");
        f0.p(block, "block");
        e drawContext = rotateRad.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().g(p0.a(f10), j10);
        block.invoke(rotateRad);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void n(@dl.d g scale, float f10, float f11, long j10, @dl.d yh.l<? super g, b2> block) {
        f0.p(scale, "$this$scale");
        f0.p(block, "block");
        e drawContext = scale.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(f10, f11, j10);
        block.invoke(scale);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void o(g scale, float f10, float f11, long j10, yh.l block, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = scale.I();
        }
        f0.p(scale, "$this$scale");
        f0.p(block, "block");
        e drawContext = scale.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(f10, f11, j10);
        block.invoke(scale);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void p(@dl.d g scale, float f10, long j10, @dl.d yh.l<? super g, b2> block) {
        f0.p(scale, "$this$scale");
        f0.p(block, "block");
        e drawContext = scale.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(f10, f10, j10);
        block.invoke(scale);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void q(g scale, float f10, long j10, yh.l block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = scale.I();
        }
        f0.p(scale, "$this$scale");
        f0.p(block, "block");
        e drawContext = scale.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        drawContext.getTransform().f(f10, f10, j10);
        block.invoke(scale);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static final void r(@dl.d g gVar, float f10, float f11, @dl.d yh.l<? super g, b2> block) {
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().b(f10, f11);
        block.invoke(gVar);
        gVar.getDrawContext().getTransform().b(-f10, -f11);
    }

    public static /* synthetic */ void s(g gVar, float f10, float f11, yh.l block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        f0.p(gVar, "<this>");
        f0.p(block, "block");
        gVar.getDrawContext().getTransform().b(f10, f11);
        block.invoke(gVar);
        gVar.getDrawContext().getTransform().b(-f10, -f11);
    }

    public static final void t(@dl.d g gVar, @dl.d yh.l<? super l, b2> transformBlock, @dl.d yh.l<? super g, b2> drawBlock) {
        f0.p(gVar, "<this>");
        f0.p(transformBlock, "transformBlock");
        f0.p(drawBlock, "drawBlock");
        e drawContext = gVar.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        transformBlock.invoke(drawContext.getTransform());
        drawBlock.invoke(gVar);
        drawContext.a().u();
        drawContext.b(jC);
    }
}
