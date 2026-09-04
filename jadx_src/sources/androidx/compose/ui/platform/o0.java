package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH&J\b\u0010\"\u001a\u00020!H&J\b\u0010#\u001a\u00020\u0004H&R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0014\u0010.\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00100\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R\u001c\u00106\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u0010<\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001c\u0010?\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010B\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010F\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010)\"\u0004\bD\u0010ER\u001c\u0010I\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010)\"\u0004\bH\u0010ER\u001c\u0010L\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00103\"\u0004\bK\u00105R\u001c\u0010O\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00103\"\u0004\bN\u00105R\u001c\u0010R\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\u001c\u0010U\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00103\"\u0004\bT\u00105R\u001c\u0010X\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00103\"\u0004\bW\u00105R\u001c\u0010[\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00103\"\u0004\bZ\u00105R\u001c\u0010`\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00103\"\u0004\be\u00105R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/o0;", "", "Landroid/graphics/Outline;", "outline", "Lkotlin/b2;", "v", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "", "B", androidx.constraintlayout.core.motion.utils.w.c.R, "q", "g", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "Landroidx/compose/ui/graphics/l1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "p", "x", "Landroid/graphics/Canvas;", "canvas", "b", "hasOverlappingRendering", "n", "Landroidx/compose/ui/platform/p0;", "k", "D", "", ak.av, "()J", "uniqueId", "F", "()I", "K", androidx.exifinterface.media.a.S4, "r", "getWidth", "width", "getHeight", "height", "", androidx.exifinterface.media.a.R4, "()F", "P", "(F)V", "scaleX", "b0", androidx.exifinterface.media.a.f23244d5, "scaleY", "H", "Z", "translationX", "G", "o", "translationY", androidx.exifinterface.media.a.X4, "e", "elevation", "I", "Q", "(I)V", "ambientShadowColor", "M", "U", "spotShadowColor", "O", "C", "rotationZ", "X", ak.aD, "rotationX", "N", androidx.exifinterface.media.a.W4, "rotationY", ak.aG, "y", "cameraDistance", "i", ak.aB, "pivotX", "j", "t", "pivotY", "l", "()Z", RXScreenCaptureService.KEY_WIDTH, "(Z)V", "clipToOutline", "J", ak.aF, "clipToBounds", "d", "f", "alpha", "Landroidx/compose/ui/graphics/y1;", "m", "()Landroidx/compose/ui/graphics/y1;", "R", "(Landroidx/compose/ui/graphics/y1;)V", "renderEffect", RXScreenCaptureService.KEY_HEIGHT, "hasDisplayList", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface o0 {
    void A(float f10);

    boolean B(int left, int top, int right, int bottom);

    void C(float f10);

    void D();

    int E();

    int F();

    float G();

    float H();

    int I();

    boolean J();

    int K();

    void L(@dl.d androidx.compose.ui.graphics.e0 e0Var, @dl.e androidx.compose.ui.graphics.l1 l1Var, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> lVar);

    int M();

    float N();

    float O();

    void P(float f10);

    void Q(int i10);

    void R(@dl.e androidx.compose.ui.graphics.y1 y1Var);

    float S();

    void T(float f10);

    void U(int i10);

    float V();

    float X();

    void Z(float f10);

    long a();

    void b(@dl.d Canvas canvas);

    float b0();

    void c(boolean z10);

    float d();

    void e(float f10);

    void f(float f10);

    void g(int i10);

    int getHeight();

    int getWidth();

    boolean h();

    float i();

    float j();

    @dl.d
    DeviceRenderNodeData k();

    boolean l();

    @dl.e
    androidx.compose.ui.graphics.y1 m();

    boolean n(boolean hasOverlappingRendering);

    void o(float f10);

    void p(@dl.d Matrix matrix);

    void q(int i10);

    int r();

    void s(float f10);

    void t(float f10);

    float u();

    void v(@dl.e Outline outline);

    void w(boolean z10);

    void x(@dl.d Matrix matrix);

    void y(float f10);

    void z(float f10);
}
