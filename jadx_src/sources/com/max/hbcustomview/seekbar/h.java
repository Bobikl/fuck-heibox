package com.max.hbcustomview.seekbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f69378a = "RangeSeekBar";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.np, new Class[]{cls, cls}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iRound = Math.round(f10 * 1000000.0f);
        int iRound2 = Math.round(f11 * 1000000.0f);
        if (iRound > iRound2) {
            return 1;
        }
        return iRound < iRound2 ? -1 : 0;
    }

    public static int b(float f10, float f11, int i10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.op, new Class[]{cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (Math.abs(f10 - f11) < Math.pow(0.1d, i10)) {
            return 0;
        }
        return f10 < f11 ? -1 : 1;
    }

    public static void c(Canvas canvas, Paint paint, Bitmap bitmap, Rect rect) {
        if (PatchProxy.proxy(new Object[]{canvas, paint, bitmap, rect}, null, changeQuickRedirect, true, bb.c.f.mp, new Class[]{Canvas.class, Paint.class, Bitmap.class, Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk())) {
                d(canvas, bitmap, rect);
                return;
            }
        } catch (Exception unused) {
        }
        canvas.drawBitmap(bitmap, rect.left, rect.top, paint);
    }

    public static void d(Canvas canvas, Bitmap bitmap, Rect rect) {
        if (PatchProxy.proxy(new Object[]{canvas, bitmap, rect}, null, changeQuickRedirect, true, bb.c.f.lp, new Class[]{Canvas.class, Bitmap.class, Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk());
        new NinePatch(bitmap, bitmap.getNinePatchChunk(), null).draw(canvas, rect);
    }

    public static Bitmap e(int i10, int i11, Drawable drawable) {
        Bitmap bitmap;
        Object[] objArr = {new Integer(i10), new Integer(i11), drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.kp, new Class[]{cls, cls, Drawable.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.postScale((i10 * 1.0f) / bitmap.getWidth(), (i11 * 1.0f) / bitmap.getHeight());
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap f(Context context, int i10, int i11, int i12) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.jp, new Class[]{Context.class, cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (context == null || i10 <= 0 || i11 <= 0 || i12 == 0) {
            return null;
        }
        return e(i10, i11, context.getResources().getDrawable(i12, null));
    }

    public static int g(Context context, @n int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.sp, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (context != null) {
            return androidx.core.content.d.f(context.getApplicationContext(), i10);
        }
        return -1;
    }

    public static Rect h(String str, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.qp, new Class[]{String.class, Float.TYPE}, Rect.class);
        if (patchProxyResultProxy.isSupported) {
            return (Rect) patchProxyResultProxy.result;
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTextSize(f10);
        paint.getTextBounds(str, 0, str.length(), rect);
        paint.reset();
        return rect;
    }

    public static float i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.pp, new Class[]{String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.hp, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(f69378a, str);
    }

    public static void k(Object... objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, null, changeQuickRedirect, true, bb.c.f.ip, new Class[]{Object[].class}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            sb2.append(obj);
        }
        Log.d(f69378a, sb2.toString());
    }

    public static boolean l(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.f.rp, new Class[]{Bitmap.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0;
    }
}
