package com.max.mediaselector.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import com.max.hbutils.utils.s;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import dl.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;

/* JADX INFO: compiled from: ImageOptimizer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageOptimizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final ImageOptimizer f75653a = new ImageOptimizer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f75654b = "ImageOptimizer";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f75655c = "optimizer_disk_cache";
    public static ChangeQuickRedirect changeQuickRedirect;

    private ImageOptimizer() {
    }

    private final boolean A(int i10, int i11, int i12, int i13) {
        return (i12 == 0 || i13 == 0 || (i10 >= i12 && i11 >= i13)) ? false : true;
    }

    public static final /* synthetic */ Matrix a(ImageOptimizer imageOptimizer, Context context, Uri uri, float f10, BitmapFactory.Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageOptimizer, context, uri, new Float(f10), options}, null, changeQuickRedirect, true, bb.c.m.f34609ac, new Class[]{ImageOptimizer.class, Context.class, Uri.class, Float.TYPE, BitmapFactory.Options.class}, Matrix.class);
        return patchProxyResultProxy.isSupported ? (Matrix) patchProxyResultProxy.result : imageOptimizer.m(context, uri, f10, options);
    }

    public static final /* synthetic */ float b(ImageOptimizer imageOptimizer, BitmapFactory.Options options, boolean z10, float f10, float f11) {
        Object[] objArr = {imageOptimizer, options, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Yb, new Class[]{ImageOptimizer.class, BitmapFactory.Options.class, Boolean.TYPE, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : imageOptimizer.n(options, z10, f10, f11);
    }

    public static final /* synthetic */ float c(ImageOptimizer imageOptimizer, float f10, float f11, float f12, float f13, int i10, int i11, boolean z10) {
        Object[] objArr = {imageOptimizer, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34679dc, new Class[]{ImageOptimizer.class, cls, cls, cls, cls, cls2, cls2, Boolean.TYPE}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : imageOptimizer.o(f10, f11, f12, f13, i10, i11, z10);
    }

    public static final /* synthetic */ String d(ImageOptimizer imageOptimizer, Bitmap bitmap, File file, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageOptimizer, bitmap, file, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34771hc, new Class[]{ImageOptimizer.class, Bitmap.class, File.class, Integer.TYPE, Boolean.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : imageOptimizer.p(bitmap, file, i10, z10);
    }

    public static final /* synthetic */ BitmapFactory.Options e(ImageOptimizer imageOptimizer, Context context, Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageOptimizer, context, uri}, null, changeQuickRedirect, true, bb.c.m.Wb, new Class[]{ImageOptimizer.class, Context.class, Uri.class}, BitmapFactory.Options.class);
        return patchProxyResultProxy.isSupported ? (BitmapFactory.Options) patchProxyResultProxy.result : imageOptimizer.q(context, uri);
    }

    public static final /* synthetic */ int f(ImageOptimizer imageOptimizer, float f10, float f11) {
        Object[] objArr = {imageOptimizer, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34725fc, new Class[]{ImageOptimizer.class, cls, cls}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : imageOptimizer.s(f10, f11);
    }

    public static final /* synthetic */ int g(ImageOptimizer imageOptimizer, float f10, float f11) {
        Object[] objArr = {imageOptimizer, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34702ec, new Class[]{ImageOptimizer.class, cls, cls}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : imageOptimizer.t(f10, f11);
    }

    public static final /* synthetic */ Bitmap h(ImageOptimizer imageOptimizer, Context context, Uri uri, BitmapFactory.Options options, Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageOptimizer, context, uri, options, matrix}, null, changeQuickRedirect, true, bb.c.m.f34632bc, new Class[]{ImageOptimizer.class, Context.class, Uri.class, BitmapFactory.Options.class, Matrix.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : imageOptimizer.u(context, uri, options, matrix);
    }

    public static final /* synthetic */ File i(ImageOptimizer imageOptimizer, Uri uri, float f10, float f11, String str) {
        Object[] objArr = {imageOptimizer, uri, new Float(f10), new Float(f11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Xb, new Class[]{ImageOptimizer.class, Uri.class, cls, cls, String.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : imageOptimizer.v(uri, f10, f11, str);
    }

    public static final /* synthetic */ Bitmap j(ImageOptimizer imageOptimizer, Bitmap bitmap, int i10, int i11, float f10, boolean z10) {
        Object[] objArr = {imageOptimizer, bitmap, new Integer(i10), new Integer(i11), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34748gc, new Class[]{ImageOptimizer.class, Bitmap.class, cls, cls, Float.TYPE, Boolean.TYPE}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : imageOptimizer.y(bitmap, i10, i11, f10, z10);
    }

    public static final /* synthetic */ void k(ImageOptimizer imageOptimizer, BitmapFactory.Options options, float f10) {
        if (PatchProxy.proxy(new Object[]{imageOptimizer, options, new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.Zb, new Class[]{ImageOptimizer.class, BitmapFactory.Options.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        imageOptimizer.z(options, f10);
    }

    public static final /* synthetic */ boolean l(ImageOptimizer imageOptimizer, int i10, int i11, int i12, int i13) {
        Object[] objArr = {imageOptimizer, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34655cc, new Class[]{ImageOptimizer.class, cls, cls, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : imageOptimizer.A(i10, i11, i12, i13);
    }

    private final Matrix m(Context context, Uri uri, float f10, BitmapFactory.Options options) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri, new Float(f10), options}, this, changeQuickRedirect, false, bb.c.m.Pb, new Class[]{Context.class, Uri.class, Float.TYPE, BitmapFactory.Options.class}, Matrix.class);
        if (patchProxyResultProxy.isSupported) {
            return (Matrix) patchProxyResultProxy.result;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(inputStreamOpenInputStream);
        Matrix matrix = new Matrix();
        int iL = aVar.l(androidx.exifinterface.media.a.C, 1);
        if (iL == 3) {
            matrix.postRotate(180.0f);
        } else if (iL == 6) {
            matrix.postRotate(90.0f);
        } else if (iL == 8) {
            matrix.postRotate(270.0f);
        }
        float f11 = f10 / options.inSampleSize;
        if (f11 > 1.0f) {
            float f12 = 1.0f / f11;
            matrix.postScale(f12, f12);
        }
        inputStreamOpenInputStream.close();
        return matrix;
    }

    private final float n(BitmapFactory.Options options, boolean z10, float f10, float f11) {
        Object[] objArr = {options, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Ob, new Class[]{BitmapFactory.Options.class, Boolean.TYPE, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f12 = options.outWidth;
        float f13 = options.outHeight;
        if (f12 <= f10 || f13 <= f11) {
            return 1.0f;
        }
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        float fMax = z10 ? Math.max(f14, f15) : Math.min(f14, f15);
        if (fMax < 1.0f) {
            return 1.0f;
        }
        return fMax;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    private final float o(float f10, float f11, float f12, float f13, int i10, int i11, boolean z10) {
        float fMax;
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Rb, new Class[]{cls, cls, cls, cls, cls2, cls2, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (!z10) {
            return 1.0f;
        }
        float f14 = i10;
        if (f10 < f14 && f11 > i11) {
            fMax = f10 / f14;
        } else if (f10 > f14) {
            float f15 = i11;
            if (f11 < f15) {
                fMax = f11 / f15;
            } else {
                fMax = Math.max(f10 / f14, f11 / i11);
            }
        } else {
            fMax = Math.max(f10 / f14, f11 / i11);
        }
        return fMax;
    }

    private final String p(Bitmap bitmap, File file, int i10, boolean z10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, file, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Tb, new Class[]{Bitmap.class, File.class, Integer.TYPE, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (file.exists()) {
            g.f74531b.q("ImageOptimizer, compress file has exist");
            return file.getAbsolutePath();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress((!bitmap.hasAlpha() || z10) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, i10, fileOutputStream);
        fileOutputStream.close();
        bitmap.recycle();
        return file.getAbsolutePath();
    }

    private final BitmapFactory.Options q(Context context, Uri uri) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, this, changeQuickRedirect, false, bb.c.m.Nb, new Class[]{Context.class, Uri.class}, BitmapFactory.Options.class);
        if (patchProxyResultProxy.isSupported) {
            return (BitmapFactory.Options) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        return options;
    }

    private final int s(float f10, float f11) {
        return (int) (f10 / f11);
    }

    private final int t(float f10, float f11) {
        return (int) (f10 / f11);
    }

    private final Bitmap u(Context context, Uri uri, BitmapFactory.Options options, Matrix matrix) throws FileNotFoundException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri, options, matrix}, this, changeQuickRedirect, false, bb.c.m.Qb, new Class[]{Context.class, Uri.class, BitmapFactory.Options.class, Matrix.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = null;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (bitmapDecodeStream != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                f0.o(bitmapCreateBitmap, "createBitmap(...)");
                if (!f0.g(bitmapCreateBitmap, bitmapDecodeStream)) {
                    bitmapDecodeStream.recycle();
                    bitmapDecodeStream = bitmapCreateBitmap;
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return bitmapDecodeStream;
    }

    private final File v(Uri uri, float f10, float f11, String str) {
        Object[] objArr = {uri, new Float(f10), new Float(f11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Ub, new Class[]{Uri.class, cls, cls, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File fileH = PictureCacheManager.f75668a.h();
        String absolutePath = fileH != null ? fileH.getAbsolutePath() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(s.d(uri.getPath()));
        sb2.append('@');
        sb2.append(f10);
        sb2.append('x');
        sb2.append(f11);
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb2.append(str);
        return new File(sb2.toString());
    }

    public static /* synthetic */ Object x(ImageOptimizer imageOptimizer, Context context, Uri uri, float f10, float f11, boolean z10, int i10, int i11, int i12, boolean z11, boolean z12, kotlin.coroutines.c cVar, int i13, Object obj) {
        Object[] objArr = {imageOptimizer, context, uri, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), cVar, new Integer(i13), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Mb, new Class[]{ImageOptimizer.class, Context.class, Uri.class, cls, cls, cls2, cls3, cls3, cls3, cls2, cls2, kotlin.coroutines.c.class, cls3, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        return imageOptimizer.w(context, uri, f10, f11, z10, i10, i11, i12, (i13 & 256) != 0 ? false : z11 ? 1 : 0, (i13 & 512) != 0 ? true : z12 ? 1 : 0, cVar);
    }

    private final Bitmap y(Bitmap bitmap, int i10, int i11, float f10, boolean z10) {
        Bitmap bitmapCreateScaledBitmap;
        Object[] objArr = {bitmap, new Integer(i10), new Integer(i11), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Sb, new Class[]{Bitmap.class, cls, cls, Float.TYPE, Boolean.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (f10 > 1.0f || z10) {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
            f0.m(bitmapCreateScaledBitmap);
        } else {
            bitmapCreateScaledBitmap = bitmap;
        }
        if (!f0.g(bitmapCreateScaledBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    private final void z(BitmapFactory.Options options, float f10) {
        options.inJustDecodeBounds = false;
        int i10 = (int) f10;
        options.inSampleSize = i10;
        if (i10 % 2 == 0) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = i11 * 2;
            if (i12 >= options.inSampleSize) {
                options.inSampleSize = i11;
                return;
            }
            i11 = i12;
        }
    }

    @e
    public final String r(@d BitmapFactory.Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{options}, this, changeQuickRedirect, false, bb.c.m.Vb, new Class[]{BitmapFactory.Options.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(options, "options");
        try {
            String outMimeType = options.outMimeType;
            f0.o(outMimeType, "outMimeType");
            return u.l2(outMimeType, "image/", ".", false, 4, null);
        } catch (Exception unused) {
            return ".jpg";
        }
    }

    @e
    public final Object w(@d Context context, @d Uri uri, float f10, float f11, boolean z10, int i10, int i11, int i12, boolean z11, boolean z12, @d kotlin.coroutines.c<? super Uri> cVar) {
        Object[] objArr = {context, uri, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Lb, new Class[]{Context.class, Uri.class, cls, cls, cls2, cls3, cls3, cls3, cls2, cls2, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i.h(e1.c(), new ImageOptimizer$optimize$2(context, uri, f10, f11, z12, z10, i11, i12, i10, z11, null), cVar);
    }
}
