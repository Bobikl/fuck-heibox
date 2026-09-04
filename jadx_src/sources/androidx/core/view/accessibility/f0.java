package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21444b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21445c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21446d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21447e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21448f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21449g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21450a;

    /* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i10) {
            return accessibilityWindowInfo.getChild(i10);
        }

        @androidx.annotation.u
        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @androidx.annotation.u
        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @androidx.annotation.u
        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @androidx.annotation.u
        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @androidx.annotation.u
        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @androidx.annotation.u
        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @androidx.annotation.u
        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @androidx.annotation.u
        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
    @w0(24)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @androidx.annotation.u
        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
    @w0(33)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @androidx.annotation.u
        static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @androidx.annotation.u
        static boolean c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    private f0(Object obj) {
        this.f21450a = obj;
    }

    @p0
    public static f0 q() {
        return v(a.l());
    }

    @p0
    public static f0 r(@p0 f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        return v(a.m((AccessibilityWindowInfo) f0Var.f21450a));
    }

    private static String t(int i10) {
        if (i10 == 1) {
            return "TYPE_APPLICATION";
        }
        if (i10 == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i10 != 3) {
            return i10 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
    }

    static f0 v(Object obj) {
        if (obj != null) {
            return new f0(obj);
        }
        return null;
    }

    @p0
    public a0 a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a0.h2(b.a((AccessibilityWindowInfo) this.f21450a));
        }
        return null;
    }

    public void b(@n0 Rect rect) {
        a.a((AccessibilityWindowInfo) this.f21450a, rect);
    }

    @p0
    public f0 c(int i10) {
        return v(a.b((AccessibilityWindowInfo) this.f21450a, i10));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.f21450a);
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a((AccessibilityWindowInfo) this.f21450a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        Object obj2 = this.f21450a;
        if (obj2 == null) {
            return f0Var.f21450a == null;
        }
        return obj2.equals(f0Var.f21450a);
    }

    public int f() {
        return a.d((AccessibilityWindowInfo) this.f21450a);
    }

    public int g() {
        return a.e((AccessibilityWindowInfo) this.f21450a);
    }

    @p0
    public f0 h() {
        return v(a.f((AccessibilityWindowInfo) this.f21450a));
    }

    public int hashCode() {
        Object obj = this.f21450a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void i(@n0 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b((AccessibilityWindowInfo) this.f21450a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.f21450a, rect);
        region.set(rect);
    }

    @p0
    public a0 j() {
        return a0.h2(a.g((AccessibilityWindowInfo) this.f21450a));
    }

    @p0
    public CharSequence k() {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.b((AccessibilityWindowInfo) this.f21450a);
        }
        return null;
    }

    public int l() {
        return a.h((AccessibilityWindowInfo) this.f21450a);
    }

    public boolean m() {
        return a.i((AccessibilityWindowInfo) this.f21450a);
    }

    public boolean n() {
        return a.j((AccessibilityWindowInfo) this.f21450a);
    }

    public boolean o() {
        return a.k((AccessibilityWindowInfo) this.f21450a);
    }

    public boolean p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.c((AccessibilityWindowInfo) this.f21450a);
        }
        return false;
    }

    @Deprecated
    public void s() {
    }

    @n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb2.append("AccessibilityWindowInfo[");
        sb2.append("id=");
        sb2.append(f());
        sb2.append(", type=");
        sb2.append(t(l()));
        sb2.append(", layer=");
        sb2.append(g());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(o());
        sb2.append(", active=");
        sb2.append(n());
        sb2.append(", hasParent=");
        sb2.append(h() != null);
        sb2.append(", hasChildren=");
        sb2.append(d() > 0);
        sb2.append(']');
        return sb2.toString();
    }

    @p0
    public AccessibilityWindowInfo u() {
        return (AccessibilityWindowInfo) this.f21450a;
    }
}
