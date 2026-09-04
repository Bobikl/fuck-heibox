package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: TransformationUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41540a = "TransformationUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41541b = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41543d = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f41545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f41546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Lock f41547h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f41542c = new Paint(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f41544e = new Paint(7);

    /* JADX INFO: compiled from: TransformationUtils.java */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f41548a;

        a(int i10) {
            this.f41548a = i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f41548a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f41549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f41550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f41551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f41552d;

        b(float f10, float f11, float f12, float f13) {
            this.f41549a = f10;
            this.f41550b = f11;
            this.f41551c = f12;
            this.f41552d = f13;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f41549a;
            float f11 = this.f41550b;
            float f12 = this.f41551c;
            float f13 = this.f41552d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    public static final class d implements Lock {
        d() {
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
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f41546g = hashSet;
        f41547h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f41545f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private d0() {
    }

    private static void a(@n0 Bitmap bitmap, @n0 Bitmap bitmap2, Matrix matrix) {
        f41547h.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f41542c);
            e(canvas);
        } finally {
            f41547h.unlock();
        }
    }

    public static Bitmap b(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = eVar.e(i10, i11, k(bitmap));
        t(bitmap, bitmapE);
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    public static Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable(f41540a, 2)) {
                Log.v(f41540a, "requested target size too big for input, fit centering instead");
            }
            return f(eVar, bitmap, i10, i11);
        }
        if (Log.isLoggable(f41540a, 2)) {
            Log.v(f41540a, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapE = eVar.e(iMin, iMin, h(bitmap));
        bitmapE.setHasAlpha(true);
        Lock lock = f41547h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f11, f11, f11, f41544e);
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f41545f);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapE;
        } catch (Throwable th2) {
            f41547h.unlock();
            throw th2;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable(f41540a, 2)) {
                Log.v(f41540a, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable(f41540a, 2)) {
                Log.v(f41540a, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapE = eVar.e((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
        t(bitmap, bitmapE);
        if (Log.isLoggable(f41540a, 2)) {
            Log.v(f41540a, "request: " + i10 + "x" + i11);
            Log.v(f41540a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v(f41540a, "toReuse: " + bitmapE.getWidth() + "x" + bitmapE.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(fMin);
            Log.v(f41540a, sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    private static Bitmap g(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapE = eVar.e(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapE).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapE;
    }

    @n0
    private static Bitmap.Config h(@n0 Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Lock i() {
        return f41547h;
    }

    public static int j(int i10) {
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

    @n0
    private static Bitmap.Config k(@n0 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @j1
    static void l(int i10, Matrix matrix) {
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

    public static boolean m(int i10) {
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

    public static Bitmap n(@n0 Bitmap bitmap, int i10) {
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e10) {
            if (!Log.isLoggable(f41540a, 6)) {
                return bitmap;
            }
            Log.e(f41540a, "Exception when trying to orient image", e10);
            return bitmap;
        }
    }

    public static Bitmap o(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapE = eVar.e(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    public static Bitmap p(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return s(eVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap q(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10) {
        com.bumptech.glide.util.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i10));
    }

    @Deprecated
    public static Bitmap r(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11, int i12) {
        return q(eVar, bitmap, i12);
    }

    private static Bitmap s(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, c cVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapE = eVar.e(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapE.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapE.getWidth(), bitmapE.getHeight());
        Lock lock = f41547h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapE;
        } catch (Throwable th2) {
            f41547h.unlock();
            throw th2;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
