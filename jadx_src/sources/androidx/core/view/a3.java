package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: ViewParentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21327a = "ViewParentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f21328b;

    /* JADX INFO: compiled from: ViewParentCompat.java */
    @androidx.annotation.w0(19)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }
    }

    /* JADX INFO: compiled from: ViewParentCompat.java */
    @androidx.annotation.w0(21)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        @androidx.annotation.u
        static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        @androidx.annotation.u
        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        @androidx.annotation.u
        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        @androidx.annotation.u
        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        @androidx.annotation.u
        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private a3() {
    }

    private static int[] a() {
        int[] iArr = f21328b;
        if (iArr == null) {
            f21328b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f21328b;
    }

    public static void b(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10) {
        a.a(viewParent, view, view2, i10);
    }

    public static boolean c(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, float f10, float f11, boolean z10) {
        try {
            return b.a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public static boolean d(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, float f10, float f11) {
        try {
            return b.b(viewParent, view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public static void e(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10, int i11, @androidx.annotation.n0 int[] iArr) {
        f(viewParent, view, i10, i11, iArr, 0);
    }

    public static void f(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10, int i11, @androidx.annotation.n0 int[] iArr, int i12) {
        if (viewParent instanceof v0) {
            ((v0) viewParent).O(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                b.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    public static void g(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        i(viewParent, view, i10, i11, i12, i13, 0, a());
    }

    public static void h(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10, int i11, int i12, int i13, int i14) {
        i(viewParent, view, i10, i11, i12, i13, i14, a());
    }

    public static void i(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10, int i11, int i12, int i13, int i14, @androidx.annotation.n0 int[] iArr) {
        if (viewParent instanceof w0) {
            ((w0) viewParent).h0(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof v0) {
            ((v0) viewParent).G(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                b.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    public static void j(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10) {
        k(viewParent, view, view2, i10, 0);
    }

    public static void k(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10, int i11) {
        if (viewParent instanceof v0) {
            ((v0) viewParent).j(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                b.e(viewParent, view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    public static boolean l(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10) {
        return m(viewParent, view, view2, i10, 0);
    }

    public static boolean m(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10, int i11) {
        if (viewParent instanceof v0) {
            return ((v0) viewParent).j0(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return b.f(viewParent, view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    public static void n(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view) {
        o(viewParent, view, 0);
    }

    public static void o(@androidx.annotation.n0 ViewParent viewParent, @androidx.annotation.n0 View view, int i10) {
        if (viewParent instanceof v0) {
            ((v0) viewParent).k(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError e10) {
                Log.e(f21327a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
