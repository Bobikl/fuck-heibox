package com.max.hbimage.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import android.util.Log;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: GlideTransformationUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f70449a = "TransformationUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70450b = 6;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f70452d = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f70454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70455g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f70456h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f70457i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f70458j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f70459k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f70460l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f70461m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f70462n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f70463o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f70464p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f70465q = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f70466r = 11;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f70467s = 12;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f70468t = 13;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f70469u = 14;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f70470v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f70471w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f70472x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List<String> f70473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Lock f70474z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f70451c = new Paint(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f70453e = new Paint(7);

    /* JADX INFO: compiled from: GlideTransformationUtils.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: GlideTransformationUtils.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: GlideTransformationUtils.java */
    public static final class c implements Lock {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @n0
        public Condition newCondition() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33195xd, new Class[0], Condition.class);
            if (patchProxyResultProxy.isSupported) {
                return (Condition) patchProxyResultProxy.result;
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, @n0 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        List<String> listAsList = Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098");
        f70473y = listAsList;
        listAsList.contains(Build.MODEL);
        f70474z = new c();
        Paint paint = new Paint(7);
        f70454f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private k() {
    }

    private static void a(@n0 Bitmap bitmap, @n0 Bitmap bitmap2, Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{bitmap, bitmap2, matrix}, null, changeQuickRedirect, true, bb.c.g.f33095sd, new Class[]{Bitmap.class, Bitmap.class, Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        f70474z.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f70451c);
            c(canvas);
        } finally {
            f70474z.unlock();
        }
    }

    public static Bitmap b(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, Context context, int i10, int i11) {
        Bitmap bitmapC;
        Object[] objArr = {eVar, bitmap, context, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33135ud, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, Context.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        com.bumptech.glide.util.m.b(i10 > 0 && i10 < 26, "radius must be greater than 0 and less than 26.");
        com.bumptech.glide.util.m.b(i11 > 0, "sampling must be greater than 0.");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i11 > width || i11 > height) {
            i11 = 1;
        }
        Bitmap bitmapE = e(eVar, bitmap);
        Bitmap bitmapE2 = eVar.e(width / i11, height / i11, Bitmap.Config.ARGB_8888);
        bitmapE2.setHasAlpha(true);
        f70474z.lock();
        try {
            Canvas canvas = new Canvas(bitmapE2);
            float f10 = 1.0f / i11;
            canvas.scale(f10, f10);
            Paint paint = new Paint();
            paint.setFlags(2);
            canvas.drawBitmap(bitmapE, 0.0f, 0.0f, paint);
            try {
                bitmapC = com.max.hbimage.image.c.g(context, bitmapE2, i10);
            } catch (RSRuntimeException unused) {
                bitmapC = com.max.hbimage.image.c.c(bitmapE2, i10, true);
            }
            c(canvas);
            f70474z.unlock();
            if (!bitmapE.equals(bitmap)) {
                eVar.d(bitmapE);
            }
            return bitmapC;
        } catch (Throwable th2) {
            f70474z.unlock();
            throw th2;
        }
    }

    private static void c(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, null, changeQuickRedirect, true, bb.c.g.f33055qd, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.setBitmap(null);
    }

    public static Bitmap d(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11, int i12) {
        float f10;
        Object[] objArr = {eVar, bitmap, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33175wd, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i10 == 0 && i11 != 0) {
            i10 = (width * i11) / height;
        } else if (i11 == 0 && i10 != 0) {
            i11 = (height * i10) / width;
        }
        if (i10 == 0) {
            i10 = width;
        }
        if (i11 == 0) {
            i11 = height;
        }
        Bitmap bitmapE = e(eVar, bitmap);
        Bitmap bitmapE2 = eVar.e(i10, i11, Bitmap.Config.ARGB_8888);
        bitmapE2.setHasAlpha(true);
        Lock lock = f70474z;
        lock.lock();
        float f11 = i10;
        float f12 = width;
        float f13 = i11;
        float f14 = height;
        try {
            float fMax = Math.max(f11 / f12, f13 / f14);
            float f15 = f12 * fMax;
            float f16 = fMax * f14;
            float f17 = (f11 - f15) / 2.0f;
            if (i12 == 0) {
                f10 = 0.0f;
            } else {
                f10 = i12 == 2 ? f13 - f16 : (f13 - f16) / 2.0f;
            }
            RectF rectF = new RectF(f17, f10, f15 + f17, f16 + f10);
            Canvas canvas = new Canvas(bitmapE2);
            canvas.drawBitmap(bitmapE, (Rect) null, rectF, (Paint) null);
            c(canvas);
            lock.unlock();
            if (!bitmapE.equals(bitmap)) {
                eVar.d(bitmapE);
            }
            return bitmapE2;
        } catch (Throwable th2) {
            f70474z.unlock();
            throw th2;
        }
    }

    private static Bitmap e(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, bitmap}, null, changeQuickRedirect, true, bb.c.g.f33035pd, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (Bitmap.Config.ARGB_8888.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapE = eVar.e(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapE).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapE;
    }

    public static Lock f() {
        return f70474z;
    }

    public static int g(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, null, changeQuickRedirect, true, bb.c.g.f33075rd, new Class[]{Bitmap.class}, Bitmap.Config.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap.Config) patchProxyResultProxy.result;
        }
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void i(int i10, Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), matrix}, null, changeQuickRedirect, true, bb.c.g.f33115td, new Class[]{Integer.TYPE, Matrix.class}, Void.TYPE).isSupported) {
        }
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean j(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap k(@n0 Bitmap bitmap, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f32995nd, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e10) {
            if (!Log.isLoggable(f70449a, 6)) {
                return bitmap;
            }
            Log.e(f70449a, "Exception when trying to orient image", e10);
            return bitmap;
        }
    }

    public static Bitmap l(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, bitmap, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f33015od, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (!j(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        i(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapE = eVar.e(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    public static Bitmap m(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11, int i12) {
        Object[] objArr = {eVar, bitmap, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33155vd, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapE = e(eVar, bitmap);
        Bitmap bitmapE2 = eVar.e(bitmapE.getWidth(), bitmapE.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapE2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapE, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Lock lock = f70474z;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float width = bitmapE2.getWidth() - i11;
            float height = bitmapE2.getHeight() - i11;
            int i13 = i10 * 2;
            switch (i12) {
                case 0:
                    float f10 = i11;
                    float f11 = i10;
                    canvas.drawRoundRect(new RectF(f10, f10, width, height), f11, f11, paint);
                    break;
                case 1:
                    float f12 = i11;
                    float f13 = i13 + i11;
                    RectF rectF = new RectF(f12, f12, f13, f13);
                    float f14 = i10;
                    canvas.drawRoundRect(rectF, f14, f14, paint);
                    float f15 = i10 + i11;
                    canvas.drawRect(new RectF(f12, f15, f15, height), paint);
                    canvas.drawRect(new RectF(f15, f12, width, height), paint);
                    break;
                case 2:
                    float f16 = i11;
                    float f17 = i10;
                    canvas.drawRoundRect(new RectF(width - i13, f16, width, i13 + i11), f17, f17, paint);
                    float f18 = width - f17;
                    canvas.drawRect(new RectF(f16, f16, f18, height), paint);
                    canvas.drawRect(new RectF(f18, i10 + i11, width, height), paint);
                    break;
                case 3:
                    float f19 = i11;
                    float f20 = height - i13;
                    float f21 = i13 + i11;
                    RectF rectF2 = new RectF(f19, f20, f21, height);
                    float f22 = i10;
                    canvas.drawRoundRect(rectF2, f22, f22, paint);
                    canvas.drawRect(new RectF(f19, f19, f21, height - f22), paint);
                    canvas.drawRect(new RectF(i10 + i11, f19, width, height), paint);
                    break;
                case 4:
                    float f23 = i13;
                    float f24 = i10;
                    canvas.drawRoundRect(new RectF(width - f23, height - f23, width, height), f24, f24, paint);
                    float f25 = i11;
                    float f26 = width - f24;
                    canvas.drawRect(new RectF(f25, f25, f26, height), paint);
                    canvas.drawRect(new RectF(f26, f25, width, height - f24), paint);
                    break;
                case 5:
                    float f27 = i11;
                    RectF rectF3 = new RectF(f27, f27, width, i13 + i11);
                    float f28 = i10;
                    canvas.drawRoundRect(rectF3, f28, f28, paint);
                    canvas.drawRect(new RectF(f27, i10 + i11, width, height), paint);
                    break;
                case 6:
                    float f29 = i11;
                    float f30 = i10;
                    canvas.drawRoundRect(new RectF(f29, height - i13, width, height), f30, f30, paint);
                    canvas.drawRect(new RectF(f29, f29, width, height - f30), paint);
                    break;
                case 7:
                    float f31 = i11;
                    RectF rectF4 = new RectF(f31, f31, i13 + i11, height);
                    float f32 = i10;
                    canvas.drawRoundRect(rectF4, f32, f32, paint);
                    canvas.drawRect(new RectF(i10 + i11, f31, width, height), paint);
                    break;
                case 8:
                    float f33 = i11;
                    float f34 = i10;
                    canvas.drawRoundRect(new RectF(width - i13, f33, width, height), f34, f34, paint);
                    canvas.drawRect(new RectF(f33, f33, width - f34, height), paint);
                    break;
                case 9:
                    float f35 = i11;
                    float f36 = i13;
                    float f37 = i10;
                    canvas.drawRoundRect(new RectF(f35, height - f36, width, height), f37, f37, paint);
                    canvas.drawRoundRect(new RectF(width - f36, f35, width, height), f37, f37, paint);
                    canvas.drawRect(new RectF(f35, f35, width - f37, height - f37), paint);
                    break;
                case 10:
                    float f38 = i11;
                    float f39 = i10;
                    canvas.drawRoundRect(new RectF(f38, f38, i11 + i13, height), f39, f39, paint);
                    canvas.drawRoundRect(new RectF(f38, height - i13, width, height), f39, f39, paint);
                    canvas.drawRect(new RectF(i10 + i11, f38, width, height - f39), paint);
                    break;
                case 11:
                    float f40 = i11;
                    float f41 = i10;
                    canvas.drawRoundRect(new RectF(f40, f40, width, i11 + i13), f41, f41, paint);
                    canvas.drawRoundRect(new RectF(width - i13, f40, width, height), f41, f41, paint);
                    canvas.drawRect(new RectF(f40, i10 + i11, width - f41, height), paint);
                    break;
                case 12:
                    float f42 = i11;
                    float f43 = i13 + i11;
                    float f44 = i10;
                    canvas.drawRoundRect(new RectF(f42, f42, width, f43), f44, f44, paint);
                    canvas.drawRoundRect(new RectF(f42, f42, f43, height), f44, f44, paint);
                    float f45 = i10 + i11;
                    canvas.drawRect(new RectF(f45, f45, width, height), paint);
                    break;
                case 13:
                    float f46 = i11;
                    float f47 = i11 + i13;
                    float f48 = i10;
                    canvas.drawRoundRect(new RectF(f46, f46, f47, f47), f48, f48, paint);
                    float f49 = i13;
                    float f50 = width - f49;
                    canvas.drawRoundRect(new RectF(f50, height - f49, width, height), f48, f48, paint);
                    canvas.drawRect(new RectF(f46, i10 + i11, f50, height), paint);
                    canvas.drawRect(new RectF(f47, f46, width, height - f48), paint);
                    break;
                case 14:
                    float f51 = i13;
                    float f52 = i11;
                    float f53 = i13 + i11;
                    float f54 = i10;
                    canvas.drawRoundRect(new RectF(width - f51, f52, width, f53), f54, f54, paint);
                    canvas.drawRoundRect(new RectF(f52, height - f51, f53, height), f54, f54, paint);
                    canvas.drawRect(new RectF(f52, f52, width - f54, height - f54), paint);
                    float f55 = i10 + i11;
                    canvas.drawRect(new RectF(f55, f55, width, height), paint);
                    break;
                default:
                    float f56 = i11;
                    float f57 = i10;
                    canvas.drawRoundRect(new RectF(f56, f56, width, height), f57, f57, paint);
                    break;
            }
            c(canvas);
            lock.unlock();
            if (!bitmapE.equals(bitmap)) {
                eVar.d(bitmapE);
            }
            return bitmapE2;
        } catch (Throwable th2) {
            f70474z.unlock();
            throw th2;
        }
    }

    public static void n(Bitmap bitmap, Bitmap bitmap2) {
        if (PatchProxy.proxy(new Object[]{bitmap, bitmap2}, null, changeQuickRedirect, true, bb.c.g.f32975md, new Class[]{Bitmap.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
