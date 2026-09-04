package com.max.commentimagepainter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bumptech.glide.Glide;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import fi.u;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AccelWorldKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ Bitmap a(Bitmap bitmap, float f10, float f11) {
        Object[] objArr = {bitmap, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1012, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : g(bitmap, f10, f11);
    }

    @e
    public static final Bitmap b(@d Bitmap originalBitmap, @d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{originalBitmap, context}, null, changeQuickRedirect, true, 1009, new Class[]{Bitmap.class, Context.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(originalBitmap, "originalBitmap");
        f0.p(context, "context");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(originalBitmap.getWidth(), originalBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        Resources resources = context.getResources();
        f0.o(resources, "getResources(...)");
        Resources resources2 = context.getResources();
        f0.o(resources2, "getResources(...)");
        Resources resources3 = context.getResources();
        f0.o(resources3, "getResources(...)");
        Resources resources4 = context.getResources();
        f0.o(resources4, "getResources(...)");
        path.addRoundRect(new RectF(0.0f, 0.0f, originalBitmap.getWidth(), originalBitmap.getHeight()), new float[]{0.0f, 0.0f, 0.0f, 0.0f, ShareCardDrawUtilsKt.d(10.0f, resources), ShareCardDrawUtilsKt.d(10.0f, resources2), ShareCardDrawUtilsKt.d(10.0f, resources3), ShareCardDrawUtilsKt.d(10.0f, resources4)}, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(originalBitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    private static final float c(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1011, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f12 = 1;
        return f11 * (f12 - ((float) Math.pow(f12 - (u.A(f10, f11) / f11), 1.2f)));
    }

    @e
    public static final Object d(@d Context context, @d Bitmap bitmap, int i10, int i11, float f10, @d c<? super Bitmap> cVar) {
        Object[] objArr = {context, bitmap, new Integer(i10), new Integer(i11), new Float(f10), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1008, new Class[]{Context.class, Bitmap.class, cls, cls, Float.TYPE, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i.h(e1.c(), new AccelWorldKt$fastGetBlurBitmap$3(bitmap, i11, i10, context, f10, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008f  */
    @e
    public static final Object e(@d Context context, @d String str, int i10, int i11, float f10, int i12, int i13, @d c<? super Bitmap> cVar) throws Throwable {
        AccelWorldKt$fastGetBlurBitmap$1 accelWorldKt$fastGetBlurBitmap$1;
        int i14;
        Context context2 = context;
        int i15 = i10;
        float f11 = f10;
        Object[] objArr = {context2, str, new Integer(i15), new Integer(i11), new Float(f11), new Integer(i12), new Integer(i13), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1005, new Class[]{Context.class, String.class, cls, cls, Float.TYPE, cls, cls, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AccelWorldKt$fastGetBlurBitmap$1) {
            accelWorldKt$fastGetBlurBitmap$1 = (AccelWorldKt$fastGetBlurBitmap$1) cVar;
            int i16 = accelWorldKt$fastGetBlurBitmap$1.f65093g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                accelWorldKt$fastGetBlurBitmap$1.f65093g = i16 - Integer.MIN_VALUE;
            } else {
                accelWorldKt$fastGetBlurBitmap$1 = new AccelWorldKt$fastGetBlurBitmap$1(cVar);
            }
        } else {
            accelWorldKt$fastGetBlurBitmap$1 = new AccelWorldKt$fastGetBlurBitmap$1(cVar);
        }
        Object objH = accelWorldKt$fastGetBlurBitmap$1.f65092f;
        Object objH2 = kotlin.coroutines.intrinsics.b.h();
        int i17 = accelWorldKt$fastGetBlurBitmap$1.f65093g;
        if (i17 != 0) {
            if (i17 == 1) {
                float f12 = accelWorldKt$fastGetBlurBitmap$1.f65091e;
                i14 = accelWorldKt$fastGetBlurBitmap$1.f65090d;
                i15 = accelWorldKt$fastGetBlurBitmap$1.f65089c;
                Context context3 = (Context) accelWorldKt$fastGetBlurBitmap$1.f65088b;
                t0.n(objH);
                f11 = f12;
                context2 = context3;
            } else {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(objH);
            }
        }
        t0.n(objH);
        com.bumptech.glide.i<Bitmap> iVarL = Glide.F(context).l();
        Resources resources = context.getResources();
        f0.o(resources, "getResources(...)");
        int iE = ShareCardDrawUtilsKt.e(i12, resources);
        Resources resources2 = context.getResources();
        f0.o(resources2, "getResources(...)");
        com.bumptech.glide.request.d dVarV1 = iVarL.B0(iE, ShareCardDrawUtilsKt.e(i13, resources2)).load(str).V1();
        f0.o(dVarV1, "submit(...)");
        CoroutineDispatcher coroutineDispatcherC = e1.c();
        AccelWorldKt$fastGetBlurBitmap$bitmap$1 accelWorldKt$fastGetBlurBitmap$bitmap$1 = new AccelWorldKt$fastGetBlurBitmap$bitmap$1(dVarV1, null);
        accelWorldKt$fastGetBlurBitmap$1.f65088b = context2;
        accelWorldKt$fastGetBlurBitmap$1.f65089c = i15;
        accelWorldKt$fastGetBlurBitmap$1.f65090d = i11;
        accelWorldKt$fastGetBlurBitmap$1.f65091e = f11;
        accelWorldKt$fastGetBlurBitmap$1.f65093g = 1;
        objH = i.h(coroutineDispatcherC, accelWorldKt$fastGetBlurBitmap$bitmap$1, accelWorldKt$fastGetBlurBitmap$1);
        if (objH == objH2) {
            return objH2;
        }
        i14 = i11;
        Bitmap bitmap = (Bitmap) objH;
        f0.m(bitmap);
        accelWorldKt$fastGetBlurBitmap$1.f65088b = null;
        accelWorldKt$fastGetBlurBitmap$1.f65093g = 2;
        objH = h(bitmap, context2, i15, i14, f11, accelWorldKt$fastGetBlurBitmap$1);
        return objH == objH2 ? objH2 : objH;
    }

    public static /* synthetic */ Object f(Context context, String str, int i10, int i11, float f10, int i12, int i13, c cVar, int i14, Object obj) {
        int i15 = i12;
        int i16 = i13;
        Object[] objArr = {context, str, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i15), new Integer(i16), cVar, new Integer(i14), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1006, new Class[]{Context.class, String.class, cls, cls, Float.TYPE, cls, cls, c.class, cls, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if ((i14 & 32) != 0) {
            i15 = 226;
        }
        if ((i14 & 64) != 0) {
            i16 = 331;
        }
        return e(context, str, i10, i11, f10, i15, i16, cVar);
    }

    private static final Bitmap g(Bitmap bitmap, float f10, float f11) {
        Object[] objArr = {bitmap, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1010, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int height = (int) (bitmap.getHeight() * f11);
        float f12 = f10 / height;
        int width = bitmap.getWidth() * height;
        float f13 = 0.0f;
        float fC = 0.0f;
        for (int i10 = 0; i10 < width; i10++) {
            if (i10 % bitmap.getWidth() == 0) {
                f13 += f12;
                fC = (c(f13, f10) * (iArr[i10] >>> 24)) / 255.0f;
            }
            iArr[i10] = (((int) Math.max(0.0d, Math.min(255.0d, Math.ceil(fC)))) << 24) | (iArr[i10] & 16777215);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        f0.o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @e
    public static final Object h(@d Bitmap bitmap, @d Context context, int i10, int i11, float f10, @d c<? super Bitmap> cVar) {
        Object[] objArr = {bitmap, context, new Integer(i10), new Integer(i11), new Float(f10), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 1007, new Class[]{Bitmap.class, Context.class, cls, cls, Float.TYPE, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : d(context, bitmap, i10, i11, f10, cVar);
    }
}
