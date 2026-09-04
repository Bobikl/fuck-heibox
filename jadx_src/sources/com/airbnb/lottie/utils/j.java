package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.content.t;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37840a = 1000000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f37841b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f37842c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Path> f37843d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<float[]> f37844e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f37845f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f37846g = -1.0f;

    /* JADX INFO: compiled from: Utils.java */
    public class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: compiled from: Utils.java */
    public class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    private j() {
    }

    public static void a(Path path, float f10, float f11, float f12) {
        com.airbnb.lottie.e.a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f37841b.get();
        Path path2 = f37842c.get();
        Path path3 = f37843d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f11 - f10) - 1.0f) < 0.01d) {
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        float f13 = f10 * length;
        float f14 = f11 * length;
        float f15 = f12 * length;
        float fMin = Math.min(f13, f14) + f15;
        float fMax = Math.max(f13, f14) + f15;
        if (fMin >= length && fMax >= length) {
            fMin = i.g(fMin, length);
            fMax = i.g(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = i.g(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = i.g(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
    }

    public static void b(Path path, @p0 t tVar) {
        if (tVar == null || tVar.j()) {
            return;
        }
        a(path, ((com.airbnb.lottie.animation.keyframe.d) tVar.h()).p() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) tVar.f()).p() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) tVar.g()).p() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        }
        return path;
    }

    public static float e() {
        if (f37846g == -1.0f) {
            f37846g = Resources.getSystem().getDisplayMetrics().density;
        }
        return f37846g;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f37844e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f37845f;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f37844e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (bb.c.b.f30674h7 * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean j(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static boolean k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static Bitmap l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        z3.a aVar = new z3.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return bitmapCreateBitmap;
    }

    public static Bitmap m(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint) {
        o(canvas, rectF, paint, 31);
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint, int i10) {
        com.airbnb.lottie.e.a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.airbnb.lottie.e.b("Utils#saveLayer");
    }
}
