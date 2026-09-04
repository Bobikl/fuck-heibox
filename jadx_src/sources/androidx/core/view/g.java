package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DisplayCutoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f21541a;

    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @androidx.annotation.u
        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @androidx.annotation.u
        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @androidx.annotation.u
        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @androidx.annotation.u
        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @androidx.annotation.u
        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.w0(30)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @androidx.annotation.u
        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public g(@androidx.annotation.p0 Rect rect, @androidx.annotation.p0 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private g(DisplayCutout displayCutout) {
        this.f21541a = displayCutout;
    }

    public g(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var, @androidx.annotation.p0 Rect rect, @androidx.annotation.p0 Rect rect2, @androidx.annotation.p0 Rect rect3, @androidx.annotation.p0 Rect rect4, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var2) {
        this(a(h0Var, rect, rect2, rect3, rect4, h0Var2));
    }

    private static DisplayCutout a(@androidx.annotation.n0 androidx.core.graphics.h0 h0Var, @androidx.annotation.p0 Rect rect, @androidx.annotation.p0 Rect rect2, @androidx.annotation.p0 Rect rect3, @androidx.annotation.p0 Rect rect4, @androidx.annotation.n0 androidx.core.graphics.h0 h0Var2) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return c.a(h0Var.h(), rect, rect2, rect3, rect4, h0Var2.h());
        }
        if (i10 >= 29) {
            return b.a(h0Var.h(), rect, rect2, rect3, rect4);
        }
        if (i10 < 28) {
            return null;
        }
        Rect rect5 = new Rect(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.a(rect5, arrayList);
    }

    static g i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new g(displayCutout);
    }

    @androidx.annotation.n0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f21541a) : Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f21541a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f21541a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f21541a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.j.a(this.f21541a, ((g) obj).f21541a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f21541a);
        }
        return 0;
    }

    @androidx.annotation.n0
    public androidx.core.graphics.h0 g() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.h0.g(c.b(this.f21541a)) : androidx.core.graphics.h0.f20741e;
    }

    @androidx.annotation.w0(28)
    DisplayCutout h() {
        return this.f21541a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f21541a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @androidx.annotation.n0
    public String toString() {
        return "DisplayCutoutCompat{" + this.f21541a + z5.g.f141884d;
    }
}
