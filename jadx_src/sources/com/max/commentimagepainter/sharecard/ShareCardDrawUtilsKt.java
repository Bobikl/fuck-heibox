package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.l;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.max.commentimagepainter.AccelWorldKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import fi.u;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.w0;

/* JADX INFO: compiled from: ShareCardDrawUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nShareCardDrawUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareCardDrawUtils.kt\ncom/max/commentimagepainter/sharecard/ShareCardDrawUtilsKt\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,720:1\n28#2:721\n*S KotlinDebug\n*F\n+ 1 ShareCardDrawUtils.kt\ncom/max/commentimagepainter/sharecard/ShareCardDrawUtilsKt\n*L\n439#1:721\n*E\n"})
public final class ShareCardDrawUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65300a = 468;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65301b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65302c = 30;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f65303d = 38;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65304e = 424;

    @dl.d
    public static final Path a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1107, new Class[0], Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(300.0f, 0.0f);
        path.lineTo(300.0f, 525.0f);
        path.lineTo(0.0f, 525.0f);
        path.lineTo(0.0f, 0.0f);
        path.close();
        return path;
    }

    @dl.d
    public static final Path b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1108, new Class[0], Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        Path path = new Path();
        path.moveTo(0.0f, 9.0f);
        path.cubicTo(0.0f, 4.02944f, 4.02943f, 0.0f, 8.99999f, 0.0f);
        path.lineTo(291.0f, 0.0f);
        path.cubicTo(295.971f, 0.0f, 300.0f, 4.02944f, 300.0f, 9.00001f);
        path.lineTo(300.0f, 331.388f);
        path.cubicTo(300.0f, 336.224f, 295.711f, 339.935f, 292.089f, 343.139f);
        path.cubicTo(289.888f, 345.086f, 288.524f, 347.788f, 288.524f, 350.776f);
        path.cubicTo(288.524f, 353.764f, 289.888f, 356.467f, 292.089f, 358.414f);
        path.cubicTo(295.711f, 361.617f, 300.0f, 365.329f, 300.0f, 370.165f);
        path.lineTo(300.0f, 459.0f);
        path.cubicTo(300.0f, 463.971f, 295.971f, 468.0f, 291.0f, 468.0f);
        path.lineTo(9.0f, 468.0f);
        path.cubicTo(4.02944f, 468.0f, 0.0f, 463.971f, 0.0f, 459.0f);
        path.lineTo(0.0f, 370.514f);
        path.cubicTo(0.0f, 365.544f, 4.52088f, 361.768f, 8.29606f, 358.535f);
        path.cubicTo(10.5785f, 356.58f, 11.9999f, 353.827f, 11.9999f, 350.776f);
        path.cubicTo(11.9999f, 347.726f, 10.5785f, 344.973f, 8.29606f, 343.018f);
        path.cubicTo(4.52088f, 339.784f, 0.0f, 336.009f, 0.0f, 331.038f);
        path.lineTo(0.0f, 9.0f);
        path.close();
        return path;
    }

    @dl.d
    public static final LinearGradient c(@l int i10, @l int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Ei, new Class[]{cls, cls, cls, cls}, LinearGradient.class);
        return patchProxyResultProxy.isSupported ? (LinearGradient) patchProxyResultProxy.result : new LinearGradient(0.0f, 0.0f, 0.0f, i13, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public static final float d(float f10, @dl.d Resources resources) {
        Object[] objArr = {new Float(f10), resources};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Di, new Class[]{cls, Resources.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(resources, "resources");
        return TypedValue.applyDimension(1, f10, resources.getDisplayMetrics());
    }

    public static final int e(int i10, @dl.d Resources resources) {
        Object[] objArr = {new Integer(i10), resources};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Ci, new Class[]{cls, Resources.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(resources, "resources");
        return (int) TypedValue.applyDimension(1, i10, resources.getDisplayMetrics());
    }

    @dl.d
    public static final Canvas f(@dl.d Canvas canvas, @l int i10, @l int i11, int i12, int i13, @dl.d Path path, float f10, float f11) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), path, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1112, new Class[]{Canvas.class, cls, cls, cls, cls, Path.class, cls2, cls2}, Canvas.class);
        if (patchProxyResultProxy.isSupported) {
            return (Canvas) patchProxyResultProxy.result;
        }
        f0.p(canvas, "<this>");
        f0.p(path, "path");
        Matrix matrix = new Matrix();
        matrix.postScale(i12 / f10, i13 / f11, 0.0f, 0.0f);
        path.transform(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(c(i10, i11, i12, i13));
        b2 b2Var = b2.f124493a;
        canvas.drawPath(path, paint);
        return canvas;
    }

    @dl.d
    public static final Canvas g(@dl.d Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1110, new Class[]{Canvas.class, cls, cls, cls, cls, cls}, Canvas.class);
        if (patchProxyResultProxy.isSupported) {
            return (Canvas) patchProxyResultProxy.result;
        }
        f0.p(canvas, "<this>");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        paint.setColor(Color.parseColor("#66FFFFFF"));
        paint.setStrokeWidth(i12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{i13, i14}, 0.0f));
        b2 b2Var = b2.f124493a;
        canvas.drawLine((canvas.getWidth() - i11) / 2.0f, i10, ((canvas.getWidth() - i11) / 2.0f) + i11, i10 + i12, paint);
        return canvas;
    }

    @dl.d
    public static final Canvas h(@dl.d Canvas canvas, @l int i10, @l int i11, int i12, int i13, @dl.d Path path) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), path};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1113, new Class[]{Canvas.class, cls, cls, cls, cls, Path.class}, Canvas.class);
        if (patchProxyResultProxy.isSupported) {
            return (Canvas) patchProxyResultProxy.result;
        }
        f0.p(canvas, "<this>");
        f0.p(path, "path");
        return f(canvas, i10, i11, i12, i13, path, 300.0f, 525.0f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0818 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x0819  */
    /* JADX WARN: Code duplicated, block: B:105:0x081f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0847  */
    /* JADX WARN: Code duplicated, block: B:109:0x0849  */
    /* JADX WARN: Code duplicated, block: B:111:0x084c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0863  */
    /* JADX WARN: Code duplicated, block: B:11:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x0703  */
    /* JADX WARN: Code duplicated, block: B:92:0x072b  */
    /* JADX WARN: Code duplicated, block: B:93:0x073a  */
    /* JADX WARN: Code duplicated, block: B:95:0x073f  */
    /* JADX WARN: Code duplicated, block: B:97:0x074a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0750  */
    @dl.e
    public static final Object i(@l int i10, @l int i11, @l int i12, @dl.d String str, @dl.d String str2, @dl.d String str3, @dl.d String str4, @dl.d String str5, @dl.d String str6, @dl.d String str7, @dl.d String str8, @dl.d String str9, @dl.d String str10, int i13, int i14, @dl.d y yVar, @dl.d Context context, @dl.d kotlin.coroutines.c<? super Bitmap> cVar) throws Throwable {
        ShareCardDrawUtilsKt$drawShareCardSvgPath$1 shareCardDrawUtilsKt$drawShareCardSvgPath$1;
        char c10;
        int i15;
        ShareCardDrawUtilsKt$drawShareCardSvgPath$1 shareCardDrawUtilsKt$drawShareCardSvgPath$2;
        String str11;
        y yVar2;
        Context context2;
        int i16;
        Object obj;
        Canvas canvas;
        String str12;
        String str13;
        Object obj2;
        Bitmap bitmap;
        int i17;
        String string;
        String string2;
        String string3;
        String string4;
        float fE;
        int iE;
        Object obj3;
        String str14;
        Canvas canvas2;
        float f10;
        String str15;
        Bitmap bitmap2;
        Object obj4;
        Context context3;
        String str16;
        Bitmap bitmap3;
        Object obj5;
        boolean z10;
        Bitmap bitmap4;
        Object obj6;
        String str17;
        Bitmap bitmap5;
        Bitmap bitmapB;
        float fE2;
        float fE3;
        float f11;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap6;
        boolean z11;
        Bitmap bitmapB2;
        String str18 = str;
        String string5 = str3;
        String string6 = str5;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), str18, str2, string5, str4, string6, str6, str7, str8, str9, str10, new Integer(i13), new Integer(i14), yVar, context, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1114, new Class[]{cls, cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, y.class, Context.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof ShareCardDrawUtilsKt$drawShareCardSvgPath$1) {
            shareCardDrawUtilsKt$drawShareCardSvgPath$1 = (ShareCardDrawUtilsKt$drawShareCardSvgPath$1) cVar;
            int i18 = shareCardDrawUtilsKt$drawShareCardSvgPath$1.f65318o;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                shareCardDrawUtilsKt$drawShareCardSvgPath$1.f65318o = i18 - Integer.MIN_VALUE;
            } else {
                shareCardDrawUtilsKt$drawShareCardSvgPath$1 = new ShareCardDrawUtilsKt$drawShareCardSvgPath$1(cVar);
            }
        } else {
            shareCardDrawUtilsKt$drawShareCardSvgPath$1 = new ShareCardDrawUtilsKt$drawShareCardSvgPath$1(cVar);
        }
        ShareCardDrawUtilsKt$drawShareCardSvgPath$1 shareCardDrawUtilsKt$drawShareCardSvgPath$3 = shareCardDrawUtilsKt$drawShareCardSvgPath$1;
        Object objP = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65317n;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i19 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65318o;
        if (i19 != 0) {
            if (i19 == 1) {
                int i20 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65306c;
                i17 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65305b;
                canvas = (Canvas) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65314k;
                bitmap = (Bitmap) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65313j;
                Context context4 = (Context) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65312i;
                y yVar3 = (y) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65311h;
                str13 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65310g;
                String str19 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65309f;
                String str20 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65308e;
                String str21 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65307d;
                kotlin.t0.n(objP);
                context2 = context4;
                str12 = str19;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2 = shareCardDrawUtilsKt$drawShareCardSvgPath$3;
                i16 = bb.c.b.f30919s1;
                obj = objH;
                i15 = i20;
                str18 = str21;
                yVar2 = yVar3;
                str11 = str20;
                obj2 = objP;
            } else if (i19 == 2) {
                int i21 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65306c;
                f10 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65316m;
                float f12 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65315l;
                int i22 = shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65305b;
                Canvas canvas3 = (Canvas) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65313j;
                Bitmap bitmap7 = (Bitmap) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65312i;
                Context context5 = (Context) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65311h;
                y yVar4 = (y) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65310g;
                String str22 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65309f;
                String str23 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65308e;
                String str24 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65307d;
                kotlin.t0.n(objP);
                bitmap2 = bitmap7;
                str16 = str23;
                obj3 = objH;
                str14 = str24;
                canvas2 = canvas3;
                obj4 = objP;
                yVar2 = yVar4;
                iE = i21;
                context3 = context5;
                str15 = str22;
                i15 = i22;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2 = shareCardDrawUtilsKt$drawShareCardSvgPath$3;
                fE = f12;
                bitmap3 = (Bitmap) obj4;
                if (bitmap3 != null) {
                    bitmapB = AccelWorldKt.b(bitmap3, context3);
                    obj5 = obj3;
                    Resources resources = context3.getResources();
                    f0.o(resources, "getResources(...)");
                    fE2 = f10 + e(bb.c.b.M1, resources);
                    Resources resources2 = context3.getResources();
                    f0.o(resources2, "getResources(...)");
                    fE3 = e(bb.c.b.f30941t1, resources2) + fE;
                    f11 = iE + fE2;
                    if (bitmapB != null) {
                        Resources resources3 = context3.getResources();
                        f0.o(resources3, "getResources(...)");
                        bitmapDrawable = new BitmapDrawable(resources3, bitmapB);
                    } else {
                        bitmapDrawable = null;
                    }
                    if (bitmapDrawable != null) {
                        bitmapDrawable.setBounds((int) fE, (int) fE2, (int) fE3, (int) f11);
                        b2 b2Var = b2.f124493a;
                    }
                    if (bitmapDrawable != null) {
                        bitmapDrawable.draw(canvas2);
                        b2 b2Var2 = b2.f124493a;
                    }
                } else {
                    bitmap2 = bitmap2;
                    obj5 = obj3;
                }
                Resources resources4 = context3.getResources();
                f0.o(resources4, "getResources(...)");
                float fE4 = e(202, resources4);
                TextPaint textPaint = new TextPaint();
                Resources resources5 = context3.getResources();
                f0.o(resources5, "getResources(...)");
                textPaint.setTextSize(e(16, resources5));
                textPaint.setColor(Color.parseColor("#FFFFFF"));
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                z10 = false;
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str16, 0, str16.length(), textPaint, (int) fE4).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
                f0.o(staticLayoutBuild, "build(...)");
                int height = staticLayoutBuild.getHeight();
                Resources resources6 = context3.getResources();
                f0.o(resources6, "getResources(...)");
                float fE5 = e(360, resources6) - height;
                Resources resources7 = context3.getResources();
                f0.o(resources7, "getResources(...)");
                float fE6 = (i15 - e(bb.c.b.f30919s1, resources7)) / 2.0f;
                Resources resources8 = context3.getResources();
                f0.o(resources8, "getResources(...)");
                float fE7 = fE6 + e(12, resources8);
                canvas2.save();
                canvas2.translate(fE7, fE5);
                staticLayoutBuild.draw(canvas2);
                canvas2.restore();
                Resources resources9 = context3.getResources();
                f0.o(resources9, "getResources(...)");
                int iE2 = e(16, resources9);
                Resources resources10 = context3.getResources();
                f0.o(resources10, "getResources(...)");
                w0<Bitmap> w0VarO = o(yVar2, context3, str15, iE2, e(16, resources10));
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65307d = str14;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65308e = context3;
                bitmap4 = bitmap2;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65309f = bitmap4;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65310g = canvas2;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65311h = null;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65312i = null;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65313j = null;
                shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65318o = 3;
                objP = w0VarO.p(shareCardDrawUtilsKt$drawShareCardSvgPath$2);
                obj6 = obj5;
                if (objP == obj6) {
                    return obj6;
                }
                str17 = str14;
                bitmap5 = bitmap4;
            } else {
                if (i19 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                canvas2 = (Canvas) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65310g;
                bitmap5 = (Bitmap) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65309f;
                context3 = (Context) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65308e;
                str17 = (String) shareCardDrawUtilsKt$drawShareCardSvgPath$3.f65307d;
                kotlin.t0.n(objP);
                z10 = false;
            }
            bitmap6 = (Bitmap) objP;
            if (bitmap6 != null) {
                Resources resources11 = context3.getResources();
                f0.o(resources11, "getResources(...)");
                float fE8 = e(12, resources11);
                Resources resources12 = context3.getResources();
                f0.o(resources12, "getResources(...)");
                canvas2.drawBitmap(bitmap6, fE8, e(15, resources12), (Paint) null);
                b2 b2Var3 = b2.f124493a;
            }
            if (str17.length() > 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (z11) {
                Resources resources13 = context3.getResources();
                f0.o(resources13, "getResources(...)");
                bitmapB2 = ob.a.b().b(str17, e(42, resources13));
                if (bitmapB2 != null) {
                    Resources resources14 = context3.getResources();
                    f0.o(resources14, "getResources(...)");
                    float fE9 = e(37, resources14);
                    Resources resources15 = context3.getResources();
                    f0.o(resources15, "getResources(...)");
                    float fE10 = e(bb.c.b.V5, resources15);
                    Resources resources16 = context3.getResources();
                    f0.o(resources16, "getResources(...)");
                    canvas2.drawBitmap(p(bitmapB2, e(5, resources16)), fE9, fE10, (Paint) null);
                    b2 b2Var4 = b2.f124493a;
                }
            }
            return bitmap5;
        }
        kotlin.t0.n(objP);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        Canvas canvasH = h(new Canvas(bitmapCreateBitmap), i10, i11, i13, i14, a());
        Resources resources17 = context.getResources();
        f0.o(resources17, "getResources(...)");
        int iE3 = e(bb.c.b.C4, resources17);
        Resources resources18 = context.getResources();
        f0.o(resources18, "getResources(...)");
        int iE4 = e(bb.c.b.f30919s1, resources18);
        Resources resources19 = context.getResources();
        f0.o(resources19, "getResources(...)");
        int iE5 = e(1, resources19);
        Resources resources20 = context.getResources();
        f0.o(resources20, "getResources(...)");
        int iE6 = e(5, resources20);
        Resources resources21 = context.getResources();
        f0.o(resources21, "getResources(...)");
        Canvas canvasG = g(canvasH, iE3, iE4, iE5, iE6, e(5, resources21));
        if (str6.length() > 0) {
            Paint paint = new Paint();
            Resources resources22 = context.getResources();
            f0.o(resources22, "getResources(...)");
            paint.setTextSize(e(12, resources22));
            paint.setColor(Color.parseColor("#FFFFFF"));
            paint.setAntiAlias(true);
            Resources resources23 = context.getResources();
            f0.o(resources23, "getResources(...)");
            float fE11 = e(100, resources23);
            if (paint.measureText(str6) > fE11) {
                int iU = u.u(paint.breakText(str6, true, fE11, null) - 3, 0);
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = str6.substring(0, iU);
                f0.o(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("...");
                string4 = sb2.toString();
            } else {
                string4 = str6;
            }
            Resources resources24 = context.getResources();
            f0.o(resources24, "getResources(...)");
            float fE12 = (i13 - e(bb.c.b.f30919s1, resources24)) / 2.0f;
            Resources resources25 = context.getResources();
            f0.o(resources25, "getResources(...)");
            canvasG.drawText(string4, fE12, e(423, resources25), paint);
        }
        if (str7.length() > 0) {
            Paint paint2 = new Paint();
            Resources resources26 = context.getResources();
            f0.o(resources26, "getResources(...)");
            paint2.setTextSize(e(12, resources26));
            paint2.setColor(Color.parseColor("#FFFFFF"));
            paint2.setAntiAlias(true);
            Resources resources27 = context.getResources();
            f0.o(resources27, "getResources(...)");
            float fE13 = e(100, resources27);
            if (paint2.measureText(str7) > fE13) {
                int iMax = Math.max(paint2.breakText(str7, true, fE13, null) - 3, 0);
                StringBuilder sb3 = new StringBuilder();
                String strSubstring2 = str7.substring(0, iMax);
                f0.o(strSubstring2, "substring(...)");
                sb3.append(strSubstring2);
                sb3.append("...");
                string3 = sb3.toString();
            } else {
                string3 = str7;
            }
            Resources resources28 = context.getResources();
            f0.o(resources28, "getResources(...)");
            float fE14 = (i13 - ((i13 - e(bb.c.b.f30919s1, resources28)) / 2.0f)) - paint2.measureText(string3);
            Resources resources29 = context.getResources();
            f0.o(resources29, "getResources(...)");
            canvasG.drawText(string3, fE14, e(423, resources29), paint2);
        }
        if (str8.length() > 0) {
            Paint paint3 = new Paint();
            Resources resources30 = context.getResources();
            f0.o(resources30, "getResources(...)");
            paint3.setTextSize(e(12, resources30));
            paint3.setColor(Color.parseColor("#FFFFFF"));
            paint3.setAntiAlias(true);
            Resources resources31 = context.getResources();
            f0.o(resources31, "getResources(...)");
            float fE15 = e(100, resources31);
            if (paint3.measureText(str8) > fE15) {
                int iMax2 = Math.max(paint3.breakText(str8, true, fE15, null) - 3, 0);
                StringBuilder sb4 = new StringBuilder();
                String strSubstring3 = str8.substring(0, iMax2);
                f0.o(strSubstring3, "substring(...)");
                sb4.append(strSubstring3);
                sb4.append("...");
                string2 = sb4.toString();
            } else {
                string2 = str8;
            }
            Resources resources32 = context.getResources();
            f0.o(resources32, "getResources(...)");
            float fE16 = (i13 - e(bb.c.b.f30919s1, resources32)) / 2.0f;
            Resources resources33 = context.getResources();
            f0.o(resources33, "getResources(...)");
            canvasG.drawText(string2, fE16, e(bb.c.b.A5, resources33), paint3);
        }
        if (str9.length() > 0) {
            Paint paint4 = new Paint();
            Resources resources34 = context.getResources();
            f0.o(resources34, "getResources(...)");
            c10 = '\f';
            paint4.setTextSize(e(12, resources34));
            paint4.setColor(Color.parseColor("#FFFFFF"));
            paint4.setAntiAlias(true);
            Resources resources35 = context.getResources();
            f0.o(resources35, "getResources(...)");
            float fE17 = e(100, resources35);
            if (paint4.measureText(str9) > fE17) {
                int iMax3 = Math.max(paint4.breakText(str9, true, fE17, null) - 3, 0);
                StringBuilder sb5 = new StringBuilder();
                String strSubstring4 = str9.substring(0, iMax3);
                f0.o(strSubstring4, "substring(...)");
                sb5.append(strSubstring4);
                sb5.append("...");
                string = sb5.toString();
            } else {
                string = str9;
            }
            Resources resources36 = context.getResources();
            f0.o(resources36, "getResources(...)");
            float fE18 = (i13 - ((i13 - e(bb.c.b.f30919s1, resources36)) / 2.0f)) - paint4.measureText(string);
            Resources resources37 = context.getResources();
            f0.o(resources37, "getResources(...)");
            canvasG.drawText(string, fE18, e(bb.c.b.A5, resources37), paint4);
        } else {
            c10 = '\f';
        }
        Resources resources38 = context.getResources();
        f0.o(resources38, "getResources(...)");
        float fE19 = (i13 - e(bb.c.b.f30919s1, resources38)) / 2.0f;
        Resources resources39 = context.getResources();
        f0.o(resources39, "getResources(...)");
        float fE20 = e(bb.c.b.f30742k6, resources39);
        Paint paint5 = new Paint();
        Resources resources40 = context.getResources();
        f0.o(resources40, "getResources(...)");
        paint5.setTextSize(e(11, resources40));
        paint5.setColor(Color.parseColor("#FFFFFF"));
        Resources resources41 = context.getResources();
        f0.o(resources41, "getResources(...)");
        canvasG.drawText("扫码领取正版游戏优惠券", fE19 + e(56, resources41), fE20, paint5);
        Resources resources42 = context.getResources();
        f0.o(resources42, "getResources(...)");
        float fE21 = (i13 - e(bb.c.b.f30919s1, resources42)) / 2.0f;
        Resources resources43 = context.getResources();
        f0.o(resources43, "getResources(...)");
        float fE22 = e(bb.c.b.E6, resources43);
        Paint paint6 = new Paint();
        Resources resources44 = context.getResources();
        f0.o(resources44, "getResources(...)");
        paint6.setTextSize(e(11, resources44));
        paint6.setColor(Color.parseColor("#FFFFFF"));
        Resources resources45 = context.getResources();
        f0.o(resources45, "getResources(...)");
        canvasG.drawText("小黑盒商城", fE21 + e(56, resources45), fE22, paint6);
        if (str5.length() > 0) {
            Paint paint7 = new Paint();
            Resources resources46 = context.getResources();
            f0.o(resources46, "getResources(...)");
            paint7.setTextSize(e(11, resources46));
            paint7.setColor(Color.parseColor("#000000"));
            paint7.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            Resources resources47 = context.getResources();
            f0.o(resources47, "getResources(...)");
            float fE23 = e(100, resources47);
            if (paint7.measureText(string6) > fE23) {
                int iMax4 = Math.max(paint7.breakText(string6, true, fE23, null) - 3, 0);
                StringBuilder sb6 = new StringBuilder();
                String strSubstring5 = string6.substring(0, iMax4);
                f0.o(strSubstring5, "substring(...)");
                sb6.append(strSubstring5);
                sb6.append("...");
                string6 = sb6.toString();
            }
            Resources resources48 = context.getResources();
            f0.o(resources48, "getResources(...)");
            float fE24 = e(33, resources48);
            Resources resources49 = context.getResources();
            f0.o(resources49, "getResources(...)");
            canvasG.drawText(string6, fE24, e(27, resources49), paint7);
        }
        Paint paint8 = new Paint();
        Resources resources50 = context.getResources();
        f0.o(resources50, "getResources(...)");
        paint8.setTextSize(e(11, resources50));
        paint8.setColor(Color.parseColor("#000000"));
        paint8.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        Resources resources51 = context.getResources();
        f0.o(resources51, "getResources(...)");
        float fE25 = e(130, resources51);
        float fMeasureText = paint8.measureText(string5);
        if (fMeasureText > fE25) {
            int iMax5 = Math.max(paint8.breakText(string5, true, fE25, null) - 3, 0);
            StringBuilder sb7 = new StringBuilder();
            String strSubstring6 = string5.substring(0, iMax5);
            f0.o(strSubstring6, "substring(...)");
            sb7.append(strSubstring6);
            sb7.append("...");
            string5 = sb7.toString();
        }
        float fA = u.A(fMeasureText, fE25);
        Resources resources52 = context.getResources();
        f0.o(resources52, "getResources(...)");
        float fE26 = (i13 - e(11, resources52)) - fA;
        Resources resources53 = context.getResources();
        f0.o(resources53, "getResources(...)");
        canvasG.drawText(string5, fE26, e(27, resources53), paint8);
        f0.o(bitmapCreateBitmap, "let(...)");
        Canvas canvas4 = new Canvas(bitmapCreateBitmap);
        i15 = i13;
        w0<Bitmap> w0VarN = n(yVar, context, str10, bb.c.b.f30919s1, bb.c.b.f30943t3, 12);
        shareCardDrawUtilsKt$drawShareCardSvgPath$2 = shareCardDrawUtilsKt$drawShareCardSvgPath$3;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65307d = str18;
        str11 = str2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65308e = str11;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65309f = str4;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65310g = str10;
        yVar2 = yVar;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65311h = yVar2;
        context2 = context;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65312i = context2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65313j = bitmapCreateBitmap;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65314k = canvas4;
        i16 = 226;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65305b = i12;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65306c = i15;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65318o = 1;
        Object objP2 = w0VarN.p(shareCardDrawUtilsKt$drawShareCardSvgPath$2);
        obj = objH;
        if (objP2 == obj) {
            return obj;
        }
        canvas = canvas4;
        str12 = str4;
        str13 = str10;
        obj2 = objP2;
        bitmap = bitmapCreateBitmap;
        i17 = i12;
        Bitmap bitmap8 = (Bitmap) obj2;
        int width = bitmap.getWidth();
        Resources resources54 = context2.getResources();
        f0.o(resources54, "getResources(...)");
        fE = (width - e(i16, resources54)) / 2.0f;
        Object obj7 = obj;
        Resources resources55 = context2.getResources();
        f0.o(resources55, "getResources(...)");
        float fE27 = e(44, resources55);
        if (bitmap8 != null) {
            canvas.drawBitmap(bitmap8, fE, fE27, (Paint) null);
            b2 b2Var5 = b2.f124493a;
        }
        Resources resources56 = context2.getResources();
        f0.o(resources56, "getResources(...)");
        iE = e(85, resources56);
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65307d = str18;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65308e = str11;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65309f = str12;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65310g = yVar2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65311h = context2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65312i = bitmap;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65313j = canvas;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65314k = null;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65305b = i15;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65315l = fE;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65316m = fE27;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65306c = iE;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65318o = 2;
        Object objF = AccelWorldKt.f(context2, str13, i17, iE, 0.6f, 0, 0, shareCardDrawUtilsKt$drawShareCardSvgPath$2, 96, null);
        obj3 = obj7;
        if (objF == obj3) {
            return obj3;
        }
        Bitmap bitmap9 = bitmap;
        str14 = str18;
        canvas2 = canvas;
        f10 = fE27;
        str15 = str12;
        bitmap2 = bitmap9;
        String str25 = str11;
        obj4 = objF;
        context3 = context2;
        str16 = str25;
        bitmap3 = (Bitmap) obj4;
        if (bitmap3 != null) {
            bitmapB = AccelWorldKt.b(bitmap3, context3);
            obj5 = obj3;
            Resources resources57 = context3.getResources();
            f0.o(resources57, "getResources(...)");
            fE2 = f10 + e(bb.c.b.M1, resources57);
            Resources resources58 = context3.getResources();
            f0.o(resources58, "getResources(...)");
            fE3 = e(bb.c.b.f30941t1, resources58) + fE;
            f11 = iE + fE2;
            if (bitmapB != null) {
                Resources resources59 = context3.getResources();
                f0.o(resources59, "getResources(...)");
                bitmapDrawable = new BitmapDrawable(resources59, bitmapB);
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null) {
                bitmapDrawable.setBounds((int) fE, (int) fE2, (int) fE3, (int) f11);
                b2 b2Var6 = b2.f124493a;
            }
            if (bitmapDrawable != null) {
                bitmapDrawable.draw(canvas2);
                b2 b2Var7 = b2.f124493a;
            }
        } else {
            bitmap2 = bitmap2;
            obj5 = obj3;
        }
        Resources resources60 = context3.getResources();
        f0.o(resources60, "getResources(...)");
        float fE28 = e(202, resources60);
        TextPaint textPaint2 = new TextPaint();
        Resources resources61 = context3.getResources();
        f0.o(resources61, "getResources(...)");
        textPaint2.setTextSize(e(16, resources61));
        textPaint2.setColor(Color.parseColor("#FFFFFF"));
        textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        z10 = false;
        StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(str16, 0, str16.length(), textPaint2, (int) fE28).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
        f0.o(staticLayoutBuild2, "build(...)");
        int height2 = staticLayoutBuild2.getHeight();
        Resources resources62 = context3.getResources();
        f0.o(resources62, "getResources(...)");
        float fE29 = e(360, resources62) - height2;
        Resources resources63 = context3.getResources();
        f0.o(resources63, "getResources(...)");
        float fE30 = (i15 - e(bb.c.b.f30919s1, resources63)) / 2.0f;
        Resources resources64 = context3.getResources();
        f0.o(resources64, "getResources(...)");
        float fE31 = fE30 + e(12, resources64);
        canvas2.save();
        canvas2.translate(fE31, fE29);
        staticLayoutBuild2.draw(canvas2);
        canvas2.restore();
        Resources resources65 = context3.getResources();
        f0.o(resources65, "getResources(...)");
        int iE7 = e(16, resources65);
        Resources resources110 = context3.getResources();
        f0.o(resources110, "getResources(...)");
        w0<Bitmap> w0VarO2 = o(yVar2, context3, str15, iE7, e(16, resources110));
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65307d = str14;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65308e = context3;
        bitmap4 = bitmap2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65309f = bitmap4;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65310g = canvas2;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65311h = null;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65312i = null;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65313j = null;
        shareCardDrawUtilsKt$drawShareCardSvgPath$2.f65318o = 3;
        objP = w0VarO2.p(shareCardDrawUtilsKt$drawShareCardSvgPath$2);
        obj6 = obj5;
        if (objP == obj6) {
            return obj6;
        }
        str17 = str14;
        bitmap5 = bitmap4;
        bitmap6 = (Bitmap) objP;
        if (bitmap6 != null) {
            Resources resources111 = context3.getResources();
            f0.o(resources111, "getResources(...)");
            float fE32 = e(12, resources111);
            Resources resources112 = context3.getResources();
            f0.o(resources112, "getResources(...)");
            canvas2.drawBitmap(bitmap6, fE32, e(15, resources112), (Paint) null);
            b2 b2Var8 = b2.f124493a;
        }
        if (str17.length() > 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if (z11) {
            Resources resources113 = context3.getResources();
            f0.o(resources113, "getResources(...)");
            bitmapB2 = ob.a.b().b(str17, e(42, resources113));
            if (bitmapB2 != null) {
                Resources resources114 = context3.getResources();
                f0.o(resources114, "getResources(...)");
                float fE33 = e(37, resources114);
                Resources resources115 = context3.getResources();
                f0.o(resources115, "getResources(...)");
                float fE110 = e(bb.c.b.V5, resources115);
                Resources resources116 = context3.getResources();
                f0.o(resources116, "getResources(...)");
                canvas2.drawBitmap(p(bitmapB2, e(5, resources116)), fE33, fE110, (Paint) null);
                b2 b2Var9 = b2.f124493a;
            }
        }
        return bitmap5;
    }

    @dl.d
    public static final Canvas j(@dl.d Canvas canvas, @l int i10, @l int i11, int i12, int i13, @dl.d Path path) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), path};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1111, new Class[]{Canvas.class, cls, cls, cls, cls, Path.class}, Canvas.class);
        if (patchProxyResultProxy.isSupported) {
            return (Canvas) patchProxyResultProxy.result;
        }
        f0.p(canvas, "<this>");
        f0.p(path, "path");
        return f(canvas, i10, i11, i12, i13, path, 300.0f, 468.0f);
    }

    @dl.d
    public static final Bitmap k(@l int i10, @l int i11, int i12, int i13, @dl.d Resources resources) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), resources};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1109, new Class[]{cls, cls, cls, cls, Resources.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(resources, "resources");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        g(j(new Canvas(bitmapCreateBitmap), i10, i11, i12, i13, b()), e(bb.c.b.C4, resources), e(bb.c.b.f30919s1, resources), e(1, resources), e(5, resources), e(5, resources));
        f0.o(bitmapCreateBitmap, "let(...)");
        return bitmapCreateBitmap;
    }

    @dl.d
    public static final w0<Bitmap> l(@dl.d y lifecycleOwner, @dl.d Context context, @dl.d String url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lifecycleOwner, context, url}, null, changeQuickRedirect, true, 1117, new Class[]{y.class, Context.class, String.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(context, "context");
        f0.p(url, "url");
        return k.b(z.a(lifecycleOwner), e1.e(), null, new ShareCardDrawUtilsKt$getBitmapFromGlide$1(context, url, null), 2, null);
    }

    @dl.d
    public static final w0<Bitmap> m(@dl.d y lifecycleOwner, @dl.d Context context, @dl.d String url, int i10, int i11) {
        Object[] objArr = {lifecycleOwner, context, url, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1118, new Class[]{y.class, Context.class, String.class, cls, cls}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(context, "context");
        f0.p(url, "url");
        return k.b(z.a(lifecycleOwner), e1.e(), null, new ShareCardDrawUtilsKt$getBitmapFromGlide$2(context, i10, i11, url, null), 2, null);
    }

    @dl.d
    public static final w0<Bitmap> n(@dl.d y lifecycleOwner, @dl.d Context context, @dl.d String url, int i10, int i11, int i12) {
        Object[] objArr = {lifecycleOwner, context, url, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1116, new Class[]{y.class, Context.class, String.class, cls, cls, cls}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(context, "context");
        f0.p(url, "url");
        return k.b(z.a(lifecycleOwner), e1.e(), null, new ShareCardDrawUtilsKt$getBitmapFromGlideWithCornerRadius$1(context, i10, i11, i12, url, null), 2, null);
    }

    @dl.d
    public static final w0<Bitmap> o(@dl.d y lifecycleOwner, @dl.d Context context, @dl.d String url, int i10, int i11) {
        Object[] objArr = {lifecycleOwner, context, url, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Bi, new Class[]{y.class, Context.class, String.class, cls, cls}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(context, "context");
        f0.p(url, "url");
        return k.b(z.a(lifecycleOwner), e1.e(), null, new ShareCardDrawUtilsKt$getCircleAvatarFromGlide$1(context, i10, i11, url, null), 2, null);
    }

    @dl.d
    public static final Bitmap p(@dl.d Bitmap bitmap, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, new Integer(i10)}, null, changeQuickRedirect, true, 1115, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-12434878);
        Rect rect = new Rect(0, 0, width, height);
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        float f10 = i10;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }
}
