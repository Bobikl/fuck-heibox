package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bP\u0010QJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001f\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u001f\"\u0004\b \u0010!R$\u0010'\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b\t\u0010&R-\u0010)\u001a\u00020(2\u0006\u0010)\u001a\u00020(8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0005\u0010*\"\u0004\b+\u0010,R-\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R-\u00105\u001a\u0002022\u0006\u0010\u0016\u001a\u0002028V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u00108\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R-\u0010;\u001a\u0002092\u0006\u0010\u0016\u001a\u0002098V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b:\u0010.\"\u0004\b\u000e\u00100R-\u0010?\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020<8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R$\u0010B\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R-\u0010E\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020C8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bD\u0010.\"\u0004\b\u0017\u00100R4\u0010J\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u0016\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010O\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/ui/graphics/h;", "Landroidx/compose/ui/graphics/h1;", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "l", ak.av, "Landroid/graphics/Paint;", "internalPaint", "Landroidx/compose/ui/graphics/x;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "Landroid/graphics/Shader;", "internalShader", "Landroidx/compose/ui/graphics/m0;", "d", "Landroidx/compose/ui/graphics/m0;", "internalColorFilter", "Landroidx/compose/ui/graphics/m1;", "value", "e", "Landroidx/compose/ui/graphics/m1;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/graphics/m1;", "v", "(Landroidx/compose/ui/graphics/m1;)V", "pathEffect", "", "()F", "f", "(F)V", "alpha", "", "o", "()Z", "(Z)V", "isAntiAlias", "Landroidx/compose/ui/graphics/l0;", "color", "()J", "i", "(J)V", "x", "()I", "t", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/j1;", ak.aB, "p", "style", "r", "q", "strokeWidth", "Landroidx/compose/ui/graphics/j2;", "g", "strokeCap", "Landroidx/compose/ui/graphics/k2;", "j", RXScreenCaptureService.KEY_HEIGHT, "strokeJoin", "k", "n", "strokeMiterLimit", "Landroidx/compose/ui/graphics/r0;", androidx.exifinterface.media.a.W4, "filterQuality", "m", "()Landroid/graphics/Shader;", "y", "(Landroid/graphics/Shader;)V", "shader", ak.aG, "()Landroidx/compose/ui/graphics/m0;", ak.aD, "(Landroidx/compose/ui/graphics/m0;)V", "colorFilter", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class h implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Paint internalPaint = i.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode = x.INSTANCE.B();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private m0 internalColorFilter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private m1 pathEffect;

    @Override // androidx.compose.ui.graphics.h1
    public int A() {
        return i.e(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public long a() {
        return i.d(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void b(boolean z10) {
        i.m(this.internalPaint, z10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void c(int i10) {
        i.t(this.internalPaint, i10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public float d() {
        return i.b(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void e(int i10) {
        i.q(this.internalPaint, i10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void f(float f10) {
        i.l(this.internalPaint, f10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public int g() {
        return i.f(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void h(int i10) {
        i.u(this.internalPaint, i10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void i(long j10) {
        i.o(this.internalPaint, j10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public int j() {
        return i.g(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public float k() {
        return i.h(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.h1
    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.h1
    public void n(float f10) {
        i.v(this.internalPaint, f10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public boolean o() {
        return i.c(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void p(int i10) {
        i.x(this.internalPaint, i10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void q(float f10) {
        i.w(this.internalPaint, f10);
    }

    @Override // androidx.compose.ui.graphics.h1
    public float r() {
        return i.i(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public int s() {
        return i.j(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void t(int i10) {
        this._blendMode = i10;
        i.n(this.internalPaint, i10);
    }

    @Override // androidx.compose.ui.graphics.h1
    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public m0 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.h1
    public void v(@dl.e m1 m1Var) {
        i.r(this.internalPaint, m1Var);
        this.pathEffect = m1Var;
    }

    @Override // androidx.compose.ui.graphics.h1
    @dl.e
    /* JADX INFO: renamed from: w, reason: from getter */
    public m1 getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.h1
    /* JADX INFO: renamed from: x, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.h1
    public void y(@dl.e Shader shader) {
        this.internalShader = shader;
        i.s(this.internalPaint, shader);
    }

    @Override // androidx.compose.ui.graphics.h1
    public void z(@dl.e m0 m0Var) {
        this.internalColorFilter = m0Var;
        i.p(this.internalPaint, m0Var);
    }
}
