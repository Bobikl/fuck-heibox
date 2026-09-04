package com.max.mediaselector.lib.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f75523a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f75524b = 104857600;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f75525c = 255.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.m.S7, new Class[]{Bitmap.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (bitmap == null) {
            return 0;
        }
        return Build.VERSION.SDK_INT >= 26 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
    }

    public static int b(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.H7, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i10 % 2 == 1) {
            i10++;
        }
        if (i11 % 2 == 1) {
            i11++;
        }
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(i10, i11) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d10 = fMin;
            if (d10 > 0.5625d || d10 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d10));
            }
            int i12 = iMax / 1280;
            if (i12 == 0) {
                return 1;
            }
            return i12;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public static Bitmap c(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Q7, new Class[]{cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i12);
        canvas.drawCircle(i10 / 2.0f, i11 / 2.0f, Math.min(i10, i11) / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    public static float d(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.L7, new Class[]{cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) (((double) f11) * (1.0d - Math.pow(1.0f - (Math.min(f10, f11) / f11), 1.2d)));
    }

    public static Bitmap e(Drawable drawable, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.I7, new Class[]{Drawable.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = i10;
        }
        if (intrinsicHeight > 0) {
            i10 = intrinsicHeight;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i10, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, i10);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static int f(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.m.R7, new Class[]{Bitmap.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (bitmap == null) {
            return -1;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= 5 && height >= 5) {
                int[] iArr = new int[5];
                int i10 = width - 5;
                int i11 = height - 5;
                for (int i12 = 0; i12 < 5; i12++) {
                    for (int i13 = 0; i13 < 5; i13++) {
                        iArr[i12] = bitmap.getPixel(i10 + i12, i11 + i13);
                    }
                }
                int i14 = i(iArr);
                if (i14 != -1) {
                    return i14;
                }
                int iRed = 0;
                int iGreen = 0;
                int iBlue = 0;
                for (int i15 = 0; i15 < 5; i15++) {
                    int i16 = iArr[i15];
                    iRed += Color.red(i16);
                    iGreen += Color.green(i16);
                    iBlue += Color.blue(i16);
                }
                return Color.rgb(iRed / 5, iGreen / 5, iBlue / 5);
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static Bitmap g(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.N7, new Class[]{cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public static int[] h(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.F7, new Class[]{cls, cls}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        if (i10 == 0 && i11 == 0) {
            return new int[]{-1, -1};
        }
        int iB = b(i10, i11);
        long jM = m();
        int i12 = -1;
        int i13 = -1;
        boolean z10 = false;
        while (!z10) {
            i12 = i10 / iB;
            i13 = i11 / iB;
            if (i12 * i13 * 4 > jM) {
                iB *= 2;
            } else {
                z10 = true;
            }
        }
        return new int[]{i12, i13};
    }

    public static int i(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            for (int i14 : iArr) {
                if (i12 == i14) {
                    i13++;
                }
            }
            if (i13 > i10) {
                i11 = i12;
                i10 = i13;
            }
        }
        if (i10 > 1) {
            return i11;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    public static Bitmap j(Context context, String str) throws Throwable {
        Bitmap bitmap;
        ?? r10;
        Bitmap bitmapDecodeFile;
        InputStream inputStreamA;
        InputStream inputStream;
        InputStream inputStreamA2;
        ?? r11 = changeQuickRedirect;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, r11, true, bb.c.m.A7, new Class[]{Context.class, String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            try {
                int iR = r(context, str);
                try {
                    if (iR > 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        if (com.max.mediaselector.lib.config.f.c(str)) {
                            InputStream inputStreamA3 = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                            BitmapFactory.decodeStream(inputStreamA3, null, options);
                            inputStream = inputStreamA3;
                        } else {
                            BitmapFactory.decodeFile(str, options);
                            inputStream = null;
                        }
                        options.inJustDecodeBounds = false;
                        if (com.max.mediaselector.lib.config.f.c(str)) {
                            inputStreamA2 = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                            bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamA2, null, options);
                        } else {
                            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                        }
                        if (bitmapDecodeFile != null) {
                            try {
                                inputStreamA = inputStream;
                                inputStreamA = inputStreamA2;
                                bitmapDecodeFile = t(bitmapDecodeFile, iR);
                            } catch (Exception e10) {
                                bitmap = bitmapDecodeFile;
                                e = e10;
                                r10 = inputStreamA;
                                e.printStackTrace();
                                n.a(r10);
                                n.a(null);
                                return bitmap;
                            }
                        }
                    } else if (com.max.mediaselector.lib.config.f.c(str)) {
                        inputStreamA = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                        bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamA);
                    } else {
                        bitmapDecodeFile = BitmapFactory.decodeFile(str);
                        inputStreamA = null;
                    }
                    inputStreamA = inputStream;
                    inputStreamA = inputStreamA2;
                    n.a(inputStreamA);
                    n.a(null);
                    return bitmapDecodeFile;
                } catch (Exception e11) {
                    e = e11;
                    bitmap = null;
                    r10 = r11;
                }
            } catch (Throwable th2) {
                th = th2;
                n.a(r11);
                n.a(null);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bitmap = null;
            r10 = 0;
        } catch (Throwable th3) {
            th = th3;
            r11 = 0;
            n.a(r11);
            n.a(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    public static int[] k(Context context, String str) throws Throwable {
        InputStream inputStreamA;
        ?? r10 = changeQuickRedirect;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, r10, true, bb.c.m.B7, new Class[]{Context.class, String.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int[] iArr = {0, 0};
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (com.max.mediaselector.lib.config.f.c(str)) {
                    inputStreamA = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                    try {
                        BitmapFactory.decodeStream(inputStreamA, null, options);
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                } else {
                    BitmapFactory.decodeFile(str, options);
                    inputStreamA = null;
                }
                if (r(context, str) % 180 == 0) {
                    iArr[0] = options.outWidth;
                    iArr[1] = options.outHeight;
                } else {
                    iArr[0] = options.outHeight;
                    iArr[1] = options.outWidth;
                }
            } catch (Throwable th2) {
                th = th2;
                n.a(r10);
                n.a(null);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            inputStreamA = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
            n.a(r10);
            n.a(null);
            throw th;
        }
        n.a(inputStreamA);
        n.a(null);
        return iArr;
    }

    public static Bitmap l(Bitmap bitmap, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.P7, new Class[]{Bitmap.class, Float.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public static long m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.G7, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        long j10 = Runtime.getRuntime().totalMemory();
        if (j10 > 104857600) {
            return 104857600L;
        }
        return j10;
    }

    public static Bitmap n(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.m.J7, new Class[]{Bitmap.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : o(bitmap, 255.0f, 1.0f);
    }

    public static Bitmap o(Bitmap bitmap, float f10, float f11) {
        Object[] objArr = {bitmap, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.K7, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int height = (int) (bitmap.getHeight() * f11);
        float f12 = f10 / height;
        int width = bitmap.getWidth() * height;
        float f13 = 0.0f;
        float fD = 0.0f;
        for (int i10 = 0; i10 < width; i10++) {
            if (i10 % bitmap.getWidth() == 0) {
                f13 += f12;
                fD = (d(f13, f10) * (iArr[i10] >>> 24)) / 255.0f;
            }
            iArr[i10] = (((int) Math.max(0.0d, Math.min(255.0d, Math.ceil(fD)))) << 24) | (iArr[i10] & 16777215);
        }
        return Bitmap.createBitmap(iArr, bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static Bitmap p(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.m.O7, new Class[]{Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        for (int i10 = 0; i10 < width; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                int pixel = bitmap.getPixel(i10, i11);
                bitmapCreateBitmap.setPixel(i10, i11, Color.argb(Color.alpha(pixel), 255 - Color.red(pixel), 255 - Color.green(pixel), 255 - Color.blue(pixel)));
            }
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap q(int i10, int i11, Bitmap bitmap, float f10, float f11, Bitmap bitmap2, float f12, float f13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), bitmap, new Float(f10), new Float(f11), bitmap2, new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.M7, new Class[]{cls, cls, Bitmap.class, cls2, cls2, Bitmap.class, cls2, cls2}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, f10, f11, (Paint) null);
        canvas.drawBitmap(bitmap2, f12, f13, (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static int r(Context context, String str) {
        androidx.exifinterface.media.a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.E7, new Class[]{Context.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        InputStream inputStreamA = null;
        try {
            try {
                if (com.max.mediaselector.lib.config.f.c(str)) {
                    inputStreamA = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                    aVar = new androidx.exifinterface.media.a(inputStreamA);
                } else {
                    aVar = new androidx.exifinterface.media.a(str);
                }
                int iL = aVar.l(androidx.exifinterface.media.a.C, 1);
                if (iL == 3) {
                    n.a(inputStreamA);
                    return 180;
                }
                if (iL == 6) {
                    n.a(inputStreamA);
                    return 90;
                }
                if (iL != 8) {
                    n.a(inputStreamA);
                    return 0;
                }
                n.a(inputStreamA);
                return 270;
            } catch (Exception e10) {
                e10.printStackTrace();
                n.a(inputStreamA);
                return 0;
            }
        } catch (Throwable th2) {
            n.a(inputStreamA);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    public static void s(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapT;
        FileOutputStream fileOutputStream2;
        InputStream inputStreamA;
        Bitmap bitmapDecodeFile;
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.f35171z7, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        InputStream inputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        InputStream inputStream2 = null;
        inputStream = null;
        try {
            int iR = r(context, str);
            if (iR > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (com.max.mediaselector.lib.config.f.c(str)) {
                    inputStreamA = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                    try {
                        BitmapFactory.decodeStream(inputStreamA, null, options);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = null;
                        bitmapT = null;
                        inputStream = inputStreamA;
                        try {
                            e.printStackTrace();
                            n.a(inputStream);
                            n.a(fileOutputStream);
                            if (bitmapT != null) {
                                return;
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            n.a(inputStream);
                            n.a(fileOutputStream);
                            if (bitmapT != null && !bitmapT.isRecycled()) {
                                bitmapT.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        bitmapT = null;
                        inputStream = inputStreamA;
                        n.a(inputStream);
                        n.a(fileOutputStream);
                        if (bitmapT != null) {
                            bitmapT.recycle();
                        }
                        throw th;
                    }
                } else {
                    BitmapFactory.decodeFile(str, options);
                    inputStreamA = null;
                }
                options.inSampleSize = b(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                if (com.max.mediaselector.lib.config.f.c(str)) {
                    inputStreamA = com.max.mediaselector.lib.basic.h.a(context, Uri.parse(str));
                    bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamA, null, options);
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                }
                if (bitmapDecodeFile != null) {
                    try {
                        bitmapT = t(bitmapDecodeFile, iR);
                        try {
                            fileOutputStream3 = com.max.mediaselector.lib.config.f.c(str) ? (FileOutputStream) com.max.mediaselector.lib.basic.h.b(context, Uri.parse(str)) : new FileOutputStream(str);
                            u(bitmapT, fileOutputStream3);
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamA;
                            e.printStackTrace();
                            n.a(inputStream);
                            n.a(fileOutputStream);
                            if (bitmapT != null || bitmapT.isRecycled()) {
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamA;
                            n.a(inputStream);
                            n.a(fileOutputStream);
                            if (bitmapT != null) {
                                bitmapT.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                        bitmapT = bitmapDecodeFile;
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = null;
                        bitmapT = bitmapDecodeFile;
                    }
                } else {
                    fileOutputStream2 = null;
                    bitmapT = bitmapDecodeFile;
                }
                inputStream2 = inputStreamA;
            } else {
                fileOutputStream2 = null;
                bitmapT = null;
            }
            n.a(inputStream2);
            n.a(fileOutputStream2);
            if (bitmapT == null || bitmapT.isRecycled()) {
                return;
            }
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
            bitmapT = null;
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            bitmapT = null;
        }
        bitmapT.recycle();
    }

    public static Bitmap t(Bitmap bitmap, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.C7, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static void u(Bitmap bitmap, FileOutputStream fileOutputStream) throws Throwable {
        if (PatchProxy.proxy(new Object[]{bitmap, fileOutputStream}, null, changeQuickRedirect, true, bb.c.m.D7, new Class[]{Bitmap.class, FileOutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                    fileOutputStream.write(byteArrayOutputStream2.toByteArray());
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    n.a(fileOutputStream);
                    n.a(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    e.printStackTrace();
                    n.a(fileOutputStream);
                    n.a(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    n.a(fileOutputStream);
                    n.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
