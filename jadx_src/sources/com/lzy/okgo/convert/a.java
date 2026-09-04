package com.lzy.okgo.convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: BitmapConvert.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b<Bitmap> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap.Config f64687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f64688d;

    public a() {
        this(1000, 1000, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE);
    }

    public a(int i10, int i11) {
        this(i10, i11, Bitmap.Config.ARGB_8888, ImageView.ScaleType.CENTER_INSIDE);
    }

    public a(int i10, int i11, Bitmap.Config config, ImageView.ScaleType scaleType) {
        this.f64685a = i10;
        this.f64686b = i11;
        this.f64687c = config;
        this.f64688d = scaleType;
    }

    private static int i(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 413, new Class[]{cls, cls, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int j(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
        }
        double d12 = i11;
        return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
    }

    private Bitmap k(byte[] bArr) throws OutOfMemoryError {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, 412, new Class[]{byte[].class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f64685a == 0 && this.f64686b == 0) {
            options.inPreferredConfig = this.f64687c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        int iJ = j(this.f64685a, this.f64686b, i10, i11, this.f64688d);
        int iJ2 = j(this.f64686b, this.f64685a, i11, i10, this.f64688d);
        options.inJustDecodeBounds = false;
        options.inSampleSize = i(i10, i11, iJ, iJ2);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (bitmapDecodeByteArray == null) {
            return bitmapDecodeByteArray;
        }
        if (bitmapDecodeByteArray.getWidth() <= iJ && bitmapDecodeByteArray.getHeight() <= iJ2) {
            return bitmapDecodeByteArray;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iJ, iJ2, true);
        bitmapDecodeByteArray.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [android.graphics.Bitmap, java.lang.Object] */
    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ Bitmap g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 414, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h(c0Var);
    }

    public Bitmap h(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 411, new Class[]{c0.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        d0 d0VarQ = c0Var.q();
        if (d0VarQ == null) {
            return null;
        }
        return k(d0VarQ.bytes());
    }
}
