package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: AccessibilityEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final int A = 128;
    public static final int B = 256;
    public static final int C = 512;
    public static final int D = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f21411a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f21412b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f21413c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f21414d = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f21415e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f21416f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f21417g = 8192;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21418h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21419i = 32768;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21420j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f21421k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21422l = 262144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f21423m = 524288;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21424n = 1048576;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f21425o = 2097152;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21426p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f21427q = 8388608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f21428r = 16777216;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f21429s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f21430t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f21431u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f21432v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21433w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21434x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f21435y = 32;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f21436z = 64;

    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @androidx.annotation.u
        static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @androidx.annotation.u
        static void c(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setAction(i10);
        }

        @androidx.annotation.u
        static void d(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setMovementGranularity(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @w0(19)
    public static class C0145b {
        private C0145b() {
        }

        @androidx.annotation.u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @androidx.annotation.u
        static void b(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: compiled from: AccessibilityEventCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private b() {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, d0 d0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) d0Var.g());
    }

    @Deprecated
    public static d0 b(AccessibilityEvent accessibilityEvent) {
        return new d0(accessibilityEvent);
    }

    public static int c(@n0 AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int d(@n0 AccessibilityEvent accessibilityEvent) {
        return C0145b.a(accessibilityEvent);
    }

    public static int e(@n0 AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static d0 f(AccessibilityEvent accessibilityEvent, int i10) {
        return new d0(accessibilityEvent.getRecord(i10));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(@n0 AccessibilityEvent accessibilityEvent, int i10) {
        a.c(accessibilityEvent, i10);
    }

    public static void i(@n0 AccessibilityEvent accessibilityEvent, int i10) {
        C0145b.b(accessibilityEvent, i10);
    }

    public static void j(@n0 AccessibilityEvent accessibilityEvent, int i10) {
        a.d(accessibilityEvent, i10);
    }
}
