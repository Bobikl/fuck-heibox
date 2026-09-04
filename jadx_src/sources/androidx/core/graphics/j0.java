package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: compiled from: PaintCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20746a = "\udfffd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20747b = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.k<Rect, Rect>> f20748c = new ThreadLocal<>();

    /* JADX INFO: compiled from: PaintCompat.java */
    @androidx.annotation.w0(23)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: compiled from: PaintCompat.java */
    @androidx.annotation.w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private j0() {
    }

    public static boolean a(@androidx.annotation.n0 Paint paint, @androidx.annotation.n0 String str) {
        return a.a(paint, str);
    }

    private static androidx.core.util.k<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.k<Rect, Rect>> threadLocal = f20748c;
        androidx.core.util.k<Rect, Rect> kVar = threadLocal.get();
        if (kVar == null) {
            androidx.core.util.k<Rect, Rect> kVar2 = new androidx.core.util.k<>(new Rect(), new Rect());
            threadLocal.set(kVar2);
            return kVar2;
        }
        kVar.f21263a.setEmpty();
        kVar.f21264b.setEmpty();
        return kVar;
    }

    public static boolean c(@androidx.annotation.n0 Paint paint, @androidx.annotation.p0 BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, blendModeCompat != null ? f.b.a(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = f.a(blendModeCompat);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
