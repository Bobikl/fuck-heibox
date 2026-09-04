package androidx.core.view;

import android.view.ViewGroup;

/* JADX INFO: compiled from: MarginLayoutParamsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: compiled from: MarginLayoutParamsCompat.java */
    @androidx.annotation.w0(17)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @androidx.annotation.u
        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @androidx.annotation.u
        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @androidx.annotation.u
        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @androidx.annotation.u
        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.resolveLayoutDirection(i10);
        }

        @androidx.annotation.u
        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setLayoutDirection(i10);
        }

        @androidx.annotation.u
        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginEnd(i10);
        }

        @androidx.annotation.u
        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
            marginLayoutParams.setMarginStart(i10);
        }
    }

    private s() {
    }

    public static int a(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int iA = a.a(marginLayoutParams);
        if (iA == 0 || iA == 1) {
            return iA;
        }
        return 0;
    }

    public static int b(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int c(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean d(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void e(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.e(marginLayoutParams, i10);
    }

    public static void f(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.f(marginLayoutParams, i10);
    }

    public static void g(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.g(marginLayoutParams, i10);
    }

    public static void h(@androidx.annotation.n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        a.h(marginLayoutParams, i10);
    }
}
