package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Verify.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public final class g0 {
    private g0() {
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new VerifyException();
        }
    }

    public static void b(boolean z10, String str, char c10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Character.valueOf(c10)));
        }
    }

    public static void c(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void d(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void e(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void f(boolean z10, String str, char c10, @CheckForNull Object obj) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Character.valueOf(c10), obj));
        }
    }

    public static void g(boolean z10, String str, int i10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Integer.valueOf(i10)));
        }
    }

    public static void h(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void i(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void j(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void k(boolean z10, String str, int i10, @CheckForNull Object obj) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Integer.valueOf(i10), obj));
        }
    }

    public static void l(boolean z10, String str, long j10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Long.valueOf(j10)));
        }
    }

    public static void m(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void n(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void o(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void p(boolean z10, String str, long j10, @CheckForNull Object obj) {
        if (!z10) {
            throw new VerifyException(b0.e(str, Long.valueOf(j10), obj));
        }
    }

    public static void q(boolean z10, String str, @CheckForNull Object obj) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj));
        }
    }

    public static void r(boolean z10, String str, @CheckForNull Object obj, char c10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, Character.valueOf(c10)));
        }
    }

    public static void s(boolean z10, String str, @CheckForNull Object obj, int i10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void t(boolean z10, String str, @CheckForNull Object obj, long j10) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, Long.valueOf(j10)));
        }
    }

    public static void u(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, obj2));
        }
    }

    public static void v(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, obj2, obj3));
        }
    }

    public static void w(boolean z10, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z10) {
            throw new VerifyException(b0.e(str, obj, obj2, obj3, obj4));
        }
    }

    public static void x(boolean z10, String str, @CheckForNull Object... objArr) {
        if (!z10) {
            throw new VerifyException(b0.e(str, objArr));
        }
    }

    @s9.a
    public static <T> T y(@CheckForNull T t10) {
        return (T) z(t10, "expected a non-null reference", new Object[0]);
    }

    @s9.a
    public static <T> T z(@CheckForNull T t10, String str, @CheckForNull Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new VerifyException(b0.e(str, objArr));
    }
}
