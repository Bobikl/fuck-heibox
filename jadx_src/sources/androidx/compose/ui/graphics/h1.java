package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Paint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&R\u001c\u0010\n\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR%\u0010\u0016\u001a\u00020\u00118&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R%\u0010\u001c\u001a\u00020\u00178&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR%\u0010 \u001a\u00020\u001d8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010#\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR%\u0010'\u001a\u00020$8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR%\u0010+\u001a\u00020(8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001c\u0010.\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR%\u00102\u001a\u00020/8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR$\u00109\u001a\n\u0018\u000103j\u0004\u0018\u0001`48&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010?\u001a\u0004\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010E\u001a\u0004\u0018\u00010@8&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010Dø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/h1;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "l", "", "d", "()F", "f", "(F)V", "alpha", "", "o", "()Z", "b", "(Z)V", "isAntiAlias", "Landroidx/compose/ui/graphics/l0;", ak.av, "()J", "i", "(J)V", "color", "Landroidx/compose/ui/graphics/x;", "x", "()I", "t", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/j1;", ak.aB, "p", "style", "r", "q", "strokeWidth", "Landroidx/compose/ui/graphics/j2;", "g", ak.aF, "strokeCap", "Landroidx/compose/ui/graphics/k2;", "j", RXScreenCaptureService.KEY_HEIGHT, "strokeJoin", "k", "n", "strokeMiterLimit", "Landroidx/compose/ui/graphics/r0;", androidx.exifinterface.media.a.W4, "e", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "m", "()Landroid/graphics/Shader;", "y", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/m0;", ak.aG, "()Landroidx/compose/ui/graphics/m0;", ak.aD, "(Landroidx/compose/ui/graphics/m0;)V", "colorFilter", "Landroidx/compose/ui/graphics/m1;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/graphics/m1;", "v", "(Landroidx/compose/ui/graphics/m1;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface h1 {
    int A();

    long a();

    void b(boolean z10);

    void c(int i10);

    float d();

    void e(int i10);

    void f(float f10);

    int g();

    void h(int i10);

    void i(long j10);

    int j();

    float k();

    @dl.d
    Paint l();

    @dl.e
    Shader m();

    void n(float f10);

    boolean o();

    void p(int i10);

    void q(float f10);

    float r();

    int s();

    void t(int i10);

    @dl.e
    m0 u();

    void v(@dl.e m1 m1Var);

    @dl.e
    m1 w();

    int x();

    void y(@dl.e Shader shader);

    void z(@dl.e m0 m0Var);
}
