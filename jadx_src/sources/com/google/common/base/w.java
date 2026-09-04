package com.google.common.base;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class w {
    private w() {
    }

    public static void A(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, obj2, obj3, obj4));
        }
    }

    public static void A0(boolean z10, String str, @CheckForNull Object obj, long j10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, Long.valueOf(j10)));
        }
    }

    public static void B(boolean z10, String str, @CheckForNull Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, objArr));
        }
    }

    public static void B0(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, obj2));
        }
    }

    @s9.a
    public static int C(int i10, int i11) {
        return D(i10, i11, UCropPlusActivity.ARG_INDEX);
    }

    public static void C0(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, obj2, obj3));
        }
    }

    @s9.a
    public static int D(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static void D0(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, obj2, obj3, obj4));
        }
    }

    @s9.a
    public static <T> T E(@CheckForNull T t10) {
        t10.getClass();
        return t10;
    }

    public static void E0(boolean z10, @CheckForNull String str, @CheckForNull Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, objArr));
        }
    }

    @s9.a
    public static <T> T F(@CheckForNull T t10, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @s9.a
    public static <T> T G(@CheckForNull T t10, String str, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Character.valueOf(c10)));
    }

    @s9.a
    public static <T> T H(@CheckForNull T t10, String str, char c10, char c11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Character.valueOf(c10), Character.valueOf(c11)));
    }

    @s9.a
    public static <T> T I(@CheckForNull T t10, String str, char c10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Character.valueOf(c10), Integer.valueOf(i10)));
    }

    @s9.a
    public static <T> T J(@CheckForNull T t10, String str, char c10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Character.valueOf(c10), Long.valueOf(j10)));
    }

    @s9.a
    public static <T> T K(@CheckForNull T t10, String str, char c10, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Character.valueOf(c10), obj));
    }

    @s9.a
    public static <T> T L(@CheckForNull T t10, String str, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Integer.valueOf(i10)));
    }

    @s9.a
    public static <T> T M(@CheckForNull T t10, String str, int i10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Integer.valueOf(i10), Character.valueOf(c10)));
    }

    @s9.a
    public static <T> T N(@CheckForNull T t10, String str, int i10, int i11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @s9.a
    public static <T> T O(@CheckForNull T t10, String str, int i10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Integer.valueOf(i10), Long.valueOf(j10)));
    }

    @s9.a
    public static <T> T P(@CheckForNull T t10, String str, int i10, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Integer.valueOf(i10), obj));
    }

    @s9.a
    public static <T> T Q(@CheckForNull T t10, String str, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Long.valueOf(j10)));
    }

    @s9.a
    public static <T> T R(@CheckForNull T t10, String str, long j10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Long.valueOf(j10), Character.valueOf(c10)));
    }

    @s9.a
    public static <T> T S(@CheckForNull T t10, String str, long j10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Long.valueOf(j10), Integer.valueOf(i10)));
    }

    @s9.a
    public static <T> T T(@CheckForNull T t10, String str, long j10, long j11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    @s9.a
    public static <T> T U(@CheckForNull T t10, String str, long j10, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, Long.valueOf(j10), obj));
    }

    @s9.a
    public static <T> T V(@CheckForNull T t10, String str, @CheckForNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj));
    }

    @s9.a
    public static <T> T W(@CheckForNull T t10, String str, @CheckForNull Object obj, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, Character.valueOf(c10)));
    }

    @s9.a
    public static <T> T X(@CheckForNull T t10, String str, @CheckForNull Object obj, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, Integer.valueOf(i10)));
    }

    @s9.a
    public static <T> T Y(@CheckForNull T t10, String str, @CheckForNull Object obj, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, Long.valueOf(j10)));
    }

    @s9.a
    public static <T> T Z(@CheckForNull T t10, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, obj2));
    }

    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return b0.e("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return b0.e("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @s9.a
    public static <T> T a0(@CheckForNull T t10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, obj2, obj3));
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return b0.e("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return b0.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    @s9.a
    public static <T> T b0(@CheckForNull T t10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, obj, obj2, obj3, obj4));
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        return (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : b0.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    @s9.a
    public static <T> T c0(@CheckForNull T t10, String str, @CheckForNull Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(b0.e(str, objArr));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @s9.a
    public static int d0(int i10, int i11) {
        return e0(i10, i11, UCropPlusActivity.ARG_INDEX);
    }

    public static void e(boolean z10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @s9.a
    public static int e0(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void f(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Character.valueOf(c10)));
        }
    }

    public static void f0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void g(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void g0(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void h0(boolean z10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void i(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void i0(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Character.valueOf(c10)));
        }
    }

    public static void j(boolean z10, String str, char c10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Character.valueOf(c10), obj));
        }
    }

    public static void j0(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void k(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Integer.valueOf(i10)));
        }
    }

    public static void k0(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void l(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void l0(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void m(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void m0(boolean z10, String str, char c10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Character.valueOf(c10), obj));
        }
    }

    public static void n(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void n0(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Integer.valueOf(i10)));
        }
    }

    public static void o(boolean z10, String str, int i10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Integer.valueOf(i10), obj));
        }
    }

    public static void o0(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void p(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Long.valueOf(j10)));
        }
    }

    public static void p0(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void q(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void q0(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void r(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void r0(boolean z10, String str, int i10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Integer.valueOf(i10), obj));
        }
    }

    public static void s(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void s0(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Long.valueOf(j10)));
        }
    }

    public static void t(boolean z10, String str, long j10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, Long.valueOf(j10), obj));
        }
    }

    public static void t0(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void u(boolean z10, String str, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj));
        }
    }

    public static void u0(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void v(boolean z10, String str, @CheckForNull Object obj, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, Character.valueOf(c10)));
        }
    }

    public static void v0(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void w(boolean z10, String str, @CheckForNull Object obj, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void w0(boolean z10, String str, long j10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, Long.valueOf(j10), obj));
        }
    }

    public static void x(boolean z10, String str, @CheckForNull Object obj, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, Long.valueOf(j10)));
        }
    }

    public static void x0(boolean z10, String str, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj));
        }
    }

    public static void y(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, obj2));
        }
    }

    public static void y0(boolean z10, String str, @CheckForNull Object obj, char c10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, Character.valueOf(c10)));
        }
    }

    public static void z(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(b0.e(str, obj, obj2, obj3));
        }
    }

    public static void z0(boolean z10, String str, @CheckForNull Object obj, int i10) {
        if (!z10) {
            throw new IllegalStateException(b0.e(str, obj, Integer.valueOf(i10)));
        }
    }
}
