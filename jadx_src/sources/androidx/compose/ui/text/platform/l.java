package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.j1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010,\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R3\u0010$\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b)\u0010\"\u001a\u0004\b\u001c\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/text/platform/l;", "Landroid/text/TextPaint;", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "Lkotlin/b2;", "l", "Landroidx/compose/ui/graphics/e2;", "shadow", "k", "Landroidx/compose/ui/graphics/l0;", "color", "i", "(J)V", "Landroidx/compose/ui/graphics/a0;", "brush", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "", "alpha", "f", "(Landroidx/compose/ui/graphics/a0;JF)V", "Landroidx/compose/ui/graphics/drawscope/j;", "drawStyle", "j", ak.av, "Landroidx/compose/ui/text/style/i;", "b", "Landroidx/compose/ui/graphics/e2;", ak.aF, "Landroidx/compose/ui/graphics/a0;", "()Landroidx/compose/ui/graphics/a0;", "e", "(Landroidx/compose/ui/graphics/a0;)V", "getBrush$ui_text_release$annotations", "()V", "Landroidx/compose/ui/graphics/drawscope/j;", "brushSize", "Lb1/m;", "()Lb1/m;", RXScreenCaptureService.KEY_HEIGHT, "(Lb1/m;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "", Constants.KEY_FLAGS, "density", "<init>", "(IF)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class l extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.text.style.i textDecoration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Shadow shadow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a0 brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private b1.m f16866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.drawscope.j drawStyle;

    public l(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.textDecoration = androidx.compose.ui.text.style.i.INSTANCE.d();
        this.shadow = Shadow.INSTANCE.a();
    }

    @j1
    public static /* synthetic */ void b() {
    }

    @j1
    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void g(l lVar, a0 a0Var, long j10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        lVar.f(a0Var, j10, f10);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a0 getBrush() {
        return this.brush;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final b1.m getF16866d() {
        return this.f16866d;
    }

    public final void e(@dl.e a0 a0Var) {
        this.brush = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    public final void f(@dl.e a0 brush, long size, float alpha) {
        if (brush == null) {
            setShader(null);
            this.brush = null;
            this.f16866d = null;
            return;
        }
        if (brush instanceof SolidColor) {
            i(androidx.compose.ui.text.style.k.c(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (brush instanceof c2) {
            if (getShader() == null || !f0.g(this.brush, brush)) {
                if (size != b1.m.f30386b.a()) {
                    this.brush = brush;
                    this.f16866d = b1.m.c(size);
                    setShader(((c2) brush).c(size));
                }
            } else {
                b1.m mVar = this.f16866d;
                if (!(mVar == null ? false : b1.m.k(mVar.getF30389a(), size))) {
                    if (size != b1.m.f30386b.a()) {
                        this.brush = brush;
                        this.f16866d = b1.m.c(size);
                        setShader(((c2) brush).c(size));
                    }
                }
            }
            m.c(this, alpha);
        }
    }

    public final void h(@dl.e b1.m mVar) {
        this.f16866d = mVar;
    }

    public final void i(long color) {
        if (color != l0.INSTANCE.u()) {
            int iS = n0.s(color);
            if (getColor() != iS) {
                setColor(iS);
            }
            setShader(null);
            this.brush = null;
            this.f16866d = null;
        }
    }

    public final void j(@dl.e androidx.compose.ui.graphics.drawscope.j jVar) {
        if (jVar == null || f0.g(this.drawStyle, jVar)) {
            return;
        }
        this.drawStyle = jVar;
        if (f0.g(jVar, androidx.compose.ui.graphics.drawscope.o.f13826a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (jVar instanceof Stroke) {
            setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) jVar;
            setStrokeWidth(stroke.getWidth());
            setStrokeMiter(stroke.getMiter());
            setStrokeJoin(m.e(stroke.getJoin()));
            setStrokeCap(m.d(stroke.getCap()));
            m1 pathEffect = stroke.getPathEffect();
            setPathEffect(pathEffect != null ? androidx.compose.ui.graphics.l.e(pathEffect) : null);
        }
    }

    public final void k(@dl.e Shadow shadow) {
        if (shadow == null || f0.g(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (f0.g(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(androidx.compose.ui.text.platform.extensions.e.b(this.shadow.getBlurRadius()), b1.f.p(this.shadow.getOffset()), b1.f.r(this.shadow.getOffset()), n0.s(this.shadow.getColor()));
        }
    }

    public final void l(@dl.e androidx.compose.ui.text.style.i iVar) {
        if (iVar == null || f0.g(this.textDecoration, iVar)) {
            return;
        }
        this.textDecoration = iVar;
        androidx.compose.ui.text.style.i.Companion companion = androidx.compose.ui.text.style.i.INSTANCE;
        setUnderlineText(iVar.d(companion.f()));
        setStrikeThruText(this.textDecoration.d(companion.b()));
    }
}
