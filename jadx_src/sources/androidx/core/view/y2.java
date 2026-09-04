package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: ViewGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21830a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21831b = 1;

    /* JADX INFO: compiled from: ViewGroupCompat.java */
    @androidx.annotation.w0(18)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @androidx.annotation.u
        static void b(ViewGroup viewGroup, int i10) {
            viewGroup.setLayoutMode(i10);
        }
    }

    /* JADX INFO: compiled from: ViewGroupCompat.java */
    @androidx.annotation.w0(21)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @androidx.annotation.u
        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @androidx.annotation.u
        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    private y2() {
    }

    public static int a(@androidx.annotation.n0 ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static int b(@androidx.annotation.n0 ViewGroup viewGroup) {
        return b.a(viewGroup);
    }

    public static boolean c(@androidx.annotation.n0 ViewGroup viewGroup) {
        return b.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@androidx.annotation.n0 ViewGroup viewGroup, int i10) {
        a.b(viewGroup, i10);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void g(@androidx.annotation.n0 ViewGroup viewGroup, boolean z10) {
        b.c(viewGroup, z10);
    }
}
