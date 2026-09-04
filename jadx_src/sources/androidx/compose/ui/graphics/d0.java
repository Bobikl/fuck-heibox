package androidx.compose.ui.graphics;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00100\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J@\u00103\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u00104\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00105\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J-\u00108\u001a\u00020\u00022\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J0\u0010>\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010=\u001a\u00020<2\u0006\u0010\b\u001a\u00020\u0007H\u0016JH\u0010?\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010=\u001a\u00020<2\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010B\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0006\u0010=\u001a\u00020<2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010C\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H&J-\u0010G\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJM\u0010O\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020K2\b\b\u0002\u0010M\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020K2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ3\u0010U\u001a\u00020\u00022\u0006\u0010R\u001a\u00020Q2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020*0S2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ-\u0010X\u001a\u00020\u00022\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020W2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJ-\u0010^\u001a\u00020\u00022\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\b\u0010`\u001a\u00020\u0002H&J\b\u0010a\u001a\u00020\u0002H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/d0;", "", "Lkotlin/b2;", "f", ak.aG, "Lb1/i;", "bounds", "Landroidx/compose/ui/graphics/h1;", "paint", "l", "", "dx", "dy", "b", "sx", "sy", "q", "degrees", ak.aD, "B", "sxRad", "syRad", "y", "Landroidx/compose/ui/graphics/c1;", "matrix", "C", "([F)V", "rect", "Landroidx/compose/ui/graphics/k0;", "clipOp", "p", "(Lb1/i;I)V", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", ak.av, "(FFFFI)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "e", "(Landroidx/compose/ui/graphics/l1;I)V", "Lb1/f;", "p1", "p2", "x", "(JJLandroidx/compose/ui/graphics/h1;)V", androidx.exifinterface.media.a.W4, "r", "radiusX", "radiusY", "F", "n", ak.aB, com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", androidx.exifinterface.media.a.S4, "(JFLandroidx/compose/ui/graphics/h1;)V", "startAngle", "sweepAngle", "", "useCenter", "g", "m", "startAngleRad", "sweepAngleRad", "v", "D", "Landroidx/compose/ui/graphics/y0;", "image", "topLeftOffset", "t", "(Landroidx/compose/ui/graphics/y0;JLandroidx/compose/ui/graphics/h1;)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "i", "(Landroidx/compose/ui/graphics/y0;JJJJLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/t1;", "pointMode", "", "points", RXScreenCaptureService.KEY_HEIGHT, "(ILjava/util/List;Landroidx/compose/ui/graphics/h1;)V", "", "j", "(I[FLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/x;", "blendMode", "k", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/h1;)V", RXScreenCaptureService.KEY_WIDTH, "o", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface d0 {

    /* JADX INFO: compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static void c(@dl.d d0 d0Var, @dl.d b1.i rect, int i10) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            c0.a(d0Var, rect, i10);
        }

        @Deprecated
        public static void e(@dl.d d0 d0Var, @dl.d b1.i rect, float f10, float f11, boolean z10, @dl.d h1 paint) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            kotlin.jvm.internal.f0.p(paint, "paint");
            c0.b(d0Var, rect, f10, f11, z10, paint);
        }

        @Deprecated
        public static void f(@dl.d d0 d0Var, @dl.d b1.i rect, float f10, float f11, boolean z10, @dl.d h1 paint) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            kotlin.jvm.internal.f0.p(paint, "paint");
            c0.c(d0Var, rect, f10, f11, z10, paint);
        }

        @Deprecated
        public static void h(@dl.d d0 d0Var, @dl.d b1.i rect, @dl.d h1 paint) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            kotlin.jvm.internal.f0.p(paint, "paint");
            c0.d(d0Var, rect, paint);
        }

        @Deprecated
        public static void i(@dl.d d0 d0Var, @dl.d b1.i rect, @dl.d h1 paint) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            kotlin.jvm.internal.f0.p(paint, "paint");
            c0.e(d0Var, rect, paint);
        }

        @Deprecated
        public static void k(@dl.d d0 d0Var, float f10, float f11) {
            c0.f(d0Var, f10, f11);
        }
    }

    void A(@dl.d b1.i iVar, @dl.d h1 h1Var);

    void B(float f10, float f11);

    void C(@dl.d float[] matrix);

    void D(@dl.d l1 l1Var, @dl.d h1 h1Var);

    void E(long center, float radius, @dl.d h1 paint);

    void F(float f10, float f11, float f12, float f13, float f14, float f15, @dl.d h1 h1Var);

    void a(float left, float top, float right, float bottom, int clipOp);

    void b(float f10, float f11);

    void e(@dl.d l1 path, int clipOp);

    void f();

    void g(@dl.d b1.i iVar, float f10, float f11, boolean z10, @dl.d h1 h1Var);

    void h(int pointMode, @dl.d List<b1.f> points, @dl.d h1 paint);

    void i(@dl.d y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @dl.d h1 paint);

    void j(int pointMode, @dl.d float[] points, @dl.d h1 paint);

    void k(@dl.d Vertices vertices, int blendMode, @dl.d h1 paint);

    void l(@dl.d b1.i iVar, @dl.d h1 h1Var);

    void m(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @dl.d h1 h1Var);

    void n(@dl.d b1.i iVar, @dl.d h1 h1Var);

    void o();

    void p(@dl.d b1.i rect, int clipOp);

    void q(float f10, float f11);

    void r(float f10, float f11, float f12, float f13, @dl.d h1 h1Var);

    void s(float f10, float f11, float f12, float f13, @dl.d h1 h1Var);

    void t(@dl.d y0 image, long topLeftOffset, @dl.d h1 paint);

    void u();

    void v(@dl.d b1.i iVar, float f10, float f11, boolean z10, @dl.d h1 h1Var);

    void w();

    void x(long p10, long p11, @dl.d h1 paint);

    void y(float f10, float f11);

    void z(float f10);
}
