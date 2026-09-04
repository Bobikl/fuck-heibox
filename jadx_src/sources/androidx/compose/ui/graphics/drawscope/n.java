package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Vertices;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.y0;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EmptyCanvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J0\u0010)\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u0010,\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u0010-\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101JH\u00106\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u00107\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010;\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<JE\u0010C\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ3\u0010I\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020$0G2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020K2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ-\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SJ\b\u0010T\u001a\u00020\u0002H\u0016J\b\u0010U\u001a\u00020\u0002H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/n;", "Landroidx/compose/ui/graphics/d0;", "Lkotlin/b2;", "f", ak.aG, "Lb1/i;", "bounds", "Landroidx/compose/ui/graphics/h1;", "paint", "l", "", "dx", "dy", "b", "sx", "sy", "q", "degrees", ak.aD, "B", "Landroidx/compose/ui/graphics/c1;", "matrix", "C", "([F)V", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Landroidx/compose/ui/graphics/k0;", "clipOp", ak.av, "(FFFFI)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "e", "(Landroidx/compose/ui/graphics/l1;I)V", "Lb1/f;", "p1", "p2", "x", "(JJLandroidx/compose/ui/graphics/h1;)V", "r", "radiusX", "radiusY", "F", ak.aB, com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", androidx.exifinterface.media.a.S4, "(JFLandroidx/compose/ui/graphics/h1;)V", "startAngle", "sweepAngle", "", "useCenter", "m", "D", "Landroidx/compose/ui/graphics/y0;", "image", "topLeftOffset", "t", "(Landroidx/compose/ui/graphics/y0;JLandroidx/compose/ui/graphics/h1;)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "i", "(Landroidx/compose/ui/graphics/y0;JJJJLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/t1;", "pointMode", "", "points", RXScreenCaptureService.KEY_HEIGHT, "(ILjava/util/List;Landroidx/compose/ui/graphics/h1;)V", "", "j", "(I[FLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/x;", "blendMode", "k", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/h1;)V", RXScreenCaptureService.KEY_WIDTH, "o", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class n implements d0 {
    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void A(b1.i iVar, h1 h1Var) {
        c0.e(this, iVar, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void B(float f10, float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void C(@dl.d float[] matrix) {
        f0.p(matrix, "matrix");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void D(@dl.d l1 path, @dl.d h1 paint) {
        f0.p(path, "path");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void E(long center, float radius, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void F(float f10, float f11, float f12, float f13, float f14, float f15, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void a(float left, float top, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void b(float f10, float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void e(@dl.d l1 path, int clipOp) {
        f0.p(path, "path");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void g(b1.i iVar, float f10, float f11, boolean z10, h1 h1Var) {
        c0.b(this, iVar, f10, f11, z10, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void h(int pointMode, @dl.d List<b1.f> points, @dl.d h1 paint) {
        f0.p(points, "points");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void i(@dl.d y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @dl.d h1 paint) {
        f0.p(image, "image");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void j(int pointMode, @dl.d float[] points, @dl.d h1 paint) {
        f0.p(points, "points");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void k(@dl.d Vertices vertices, int blendMode, @dl.d h1 paint) {
        f0.p(vertices, "vertices");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void l(@dl.d b1.i bounds, @dl.d h1 paint) {
        f0.p(bounds, "bounds");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void m(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void n(b1.i iVar, h1 h1Var) {
        c0.d(this, iVar, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void p(b1.i iVar, int i10) {
        c0.a(this, iVar, i10);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void q(float f10, float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void r(float f10, float f11, float f12, float f13, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void s(float f10, float f11, float f12, float f13, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void t(@dl.d y0 image, long topLeftOffset, @dl.d h1 paint) {
        f0.p(image, "image");
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void u() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void v(b1.i iVar, float f10, float f11, boolean z10, h1 h1Var) {
        c0.c(this, iVar, f10, f11, z10, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void w() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public void x(long p10, long p11, @dl.d h1 paint) {
        f0.p(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void y(float f10, float f11) {
        c0.f(this, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void z(float f10) {
        throw new UnsupportedOperationException();
    }
}
