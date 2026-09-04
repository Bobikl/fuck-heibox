package com.max.commentimagepainter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.core.view.j1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import fi.u;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: HBCommentTextToImagePainter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f65243b = 0.2f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f65244c = 0.1f;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f65245d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final Paint f65247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private static final Paint f65248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private static final TextPaint f65249h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f65242a = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f65246e = R.drawable.decorate_bubble_arrow;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        f65247f = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        f65248g = paint2;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(j1.f21601t);
        f65249h = textPaint;
    }

    private b() {
    }

    private final float a(int i10, Resources resources, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), resources, str}, this, changeQuickRedirect, false, 1029, new Class[]{Integer.TYPE, Resources.class, String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float fC = c(20.0f, resources);
        int iC = c(36.0f, resources);
        int iC2 = c(32.0f, resources);
        int iC3 = i10 - c(32.0f, resources);
        float f10 = iC;
        return (b(str, iC2, iC3, fC, resources) + f10) - f10;
    }

    private final float b(String str, int i10, int i11, float f10, Resources resources) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), new Float(f10), resources};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1030, new Class[]{String.class, cls, cls, cls2, Resources.class}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        TextPaint textPaint = f65249h;
        textPaint.setTextSize(c(18.0f, resources));
        float f11 = i11 - i10;
        float f12 = 2 * f10;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) (f11 - f12)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
        f0.o(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getHeight() + f12;
    }

    private final int c(float f10, Resources resources) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), resources}, this, changeQuickRedirect, false, 1031, new Class[]{Float.TYPE, Resources.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) TypedValue.applyDimension(1, f10, resources.getDisplayMetrics());
    }

    private final void d(int i10, int i11, Canvas canvas, String str) {
        Object[] objArr = {new Integer(i10), new Integer(i11), canvas, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1025, new Class[]{cls, cls, Canvas.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawColor(-1);
        float f10 = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f10, j(i(str, 0.2f)), j(i(str, 0.1f)), Shader.TileMode.CLAMP);
        Paint paint = f65248g;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, i10, f10, paint);
    }

    private final void f(int i10, float f10, Resources resources, Canvas canvas, String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10), resources, canvas, str}, this, changeQuickRedirect, false, 1026, new Class[]{Integer.TYPE, Float.TYPE, Resources.class, Canvas.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        float fC = c(20.0f, resources);
        int iC = c(36.0f, resources);
        int iC2 = c(32.0f, resources);
        int iC3 = i10 - c(32.0f, resources);
        float f11 = iC;
        RectF rectF = new RectF(iC2, f11, iC3, f10 + f11);
        float fC2 = c(((iC3 - iC2) / c(375.0f, resources)) * 8.0f, resources);
        canvas.drawRoundRect(rectF, fC2, fC2, f65247f);
        g(canvas, str, iC, iC2, iC3, fC, resources);
    }

    private final void g(Canvas canvas, String str, int i10, int i11, int i12, float f10, Resources resources) {
        Object[] objArr = {canvas, str, new Integer(i10), new Integer(i11), new Integer(i12), new Float(f10), resources};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1027, new Class[]{Canvas.class, String.class, cls, cls, cls, Float.TYPE, Resources.class}, Void.TYPE).isSupported) {
            return;
        }
        TextPaint textPaint = f65249h;
        textPaint.setTextSize(c(18.0f, resources));
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) ((i12 - i11) - (2 * f10))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
        f0.o(staticLayoutBuild, "build(...)");
        canvas.save();
        canvas.translate(i11 + f10, i10 + f10);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }

    private final void h(int i10, float f10, Resources resources, Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10), resources, canvas}, this, changeQuickRedirect, false, 1028, new Class[]{Integer.TYPE, Float.TYPE, Resources.class, Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float fC = f10 + c(36.0f, resources);
        int iC = c(72.0f, resources);
        float fC2 = i10 / c(375.0f, resources);
        float fC3 = c(34.0f * fC2, resources);
        float fC4 = c(fC2 * 32.0f, resources);
        Drawable drawable = resources.getDrawable(f65246e, null);
        if (drawable != null) {
            drawable.setBounds(iC, (int) fC, (int) (iC + fC3), (int) (fC + fC4));
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    private final String i(String str, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Float(f10)}, this, changeQuickRedirect, false, 1023, new Class[]{String.class, Float.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iJ = j(str);
        int iRed = Color.red(iJ);
        int iGreen = Color.green(iJ);
        int iBlue = Color.blue(iJ);
        float f11 = 255 * (1 - f10);
        int iH = (int) u.H((iRed * f10) + f11, 0.0f, 255.0f);
        int iH2 = (int) u.H((iGreen * f10) + f11, 0.0f, 255.0f);
        int iH3 = (int) u.H((iBlue * f10) + f11, 0.0f, 255.0f);
        v0 v0Var = v0.f124986a;
        String str2 = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iH), Integer.valueOf(iH2), Integer.valueOf(iH3)}, 3));
        f0.o(str2, "format(...)");
        return str2;
    }

    private final int j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1022, new Class[]{String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.hbutils.utils.a.d(str);
    }

    @d
    public final Bitmap e(int i10, @d Resources resources, @d String text, @d String colorString) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), resources, text, colorString}, this, changeQuickRedirect, false, 1024, new Class[]{Integer.TYPE, Resources.class, String.class, String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(resources, "resources");
        f0.p(text, "text");
        f0.p(colorString, "colorString");
        float fA = a(i10, resources, text);
        int iC = (int) ((c(64.0f, resources) * 2) + fA);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, iC, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        d(i10, iC, canvas, colorString);
        f(i10, fA, resources, canvas, text);
        h(i10, fA, resources, canvas);
        return bitmapCreateBitmap;
    }
}
