package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: WindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21542a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21543b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21544c = 10;

    /* JADX INFO: compiled from: WindowCompat.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | bb.c.b.zv);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    @androidx.annotation.w0(28)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static <T> T a(Window window, int i10) {
            return (T) window.requireViewById(i10);
        }
    }

    /* JADX INFO: compiled from: WindowCompat.java */
    @androidx.annotation.w0(30)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.n0 Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    private g3() {
    }

    @androidx.annotation.n0
    public static b4 a(@androidx.annotation.n0 Window window, @androidx.annotation.n0 View view) {
        return new b4(window, view);
    }

    @androidx.annotation.n0
    public static <T extends View> T b(@androidx.annotation.n0 Window window, @androidx.annotation.d0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i10);
        }
        T t10 = (T) window.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@androidx.annotation.n0 Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
