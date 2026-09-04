package androidx.core.view;

import android.view.ScaleGestureDetector;

/* JADX INFO: compiled from: ScaleGestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: compiled from: ScaleGestureDetectorCompat.java */
    @androidx.annotation.w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @androidx.annotation.u
        static void b(ScaleGestureDetector scaleGestureDetector, boolean z10) {
            scaleGestureDetector.setQuickScaleEnabled(z10);
        }
    }

    private e1() {
    }

    public static boolean a(@androidx.annotation.n0 ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(@androidx.annotation.n0 ScaleGestureDetector scaleGestureDetector, boolean z10) {
        a.b(scaleGestureDetector, z10);
    }

    @Deprecated
    public static void d(Object obj, boolean z10) {
        c((ScaleGestureDetector) obj, z10);
    }
}
