package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Locale;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o {
    private o() {
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, @n0 Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10, @n0 String str, @n0 Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f10, @n0 String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f10)) {
            return f10;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static double e(double d10, double d11, double d12, @n0 String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
        if (d10 <= d12) {
            return d10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
    }

    public static float f(float f10, float f11, float f12, @n0 String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static int g(int i10, int i11, int i12, @n0 String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public static long h(long j10, long j11, long j12, @n0 String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
        if (j10 <= j12) {
            return j10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
    }

    @androidx.annotation.f0(from = 0)
    public static int i(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    @androidx.annotation.f0(from = 0)
    public static int j(int i10, @p0 String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    @n0
    public static <T> T l(@p0 T t10) {
        t10.getClass();
        return t10;
    }

    @n0
    public static <T> T m(@p0 T t10, @n0 Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z10) {
        o(z10, null);
    }

    public static void o(boolean z10, @p0 String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @n0
    public static <T extends CharSequence> T p(@p0 T t10) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException();
        }
        return t10;
    }

    @n0
    public static <T extends CharSequence> T q(@p0 T t10, @n0 Object obj) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t10;
    }

    @n0
    public static <T extends CharSequence> T r(@p0 T t10, @n0 String str, @n0 Object... objArr) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }
}
