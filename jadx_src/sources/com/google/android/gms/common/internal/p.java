package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class p {
    private p() {
        throw new AssertionError("Uninstantiable");
    }

    @v8.a
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @v8.a
    public static void b(boolean z10, @androidx.annotation.n0 Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @v8.a
    public static void c(boolean z10, @androidx.annotation.n0 String str, @androidx.annotation.n0 Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @v8.a
    public static void d(@androidx.annotation.n0 Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @v8.a
    public static void e(@androidx.annotation.n0 Handler handler, @androidx.annotation.n0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @v8.a
    public static void f() {
        g("Must be called on the main application thread");
    }

    @v8.a
    public static void g(@androidx.annotation.n0 String str) {
        if (!z8.g0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @androidx.annotation.n0
    @mk.d({"#1"})
    @v8.a
    public static String h(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @androidx.annotation.n0
    @mk.d({"#1"})
    @v8.a
    public static String i(@androidx.annotation.p0 String str, @androidx.annotation.n0 Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @v8.a
    public static void j() {
        k("Must not be called on the main application thread");
    }

    @v8.a
    public static void k(@androidx.annotation.n0 String str) {
        if (z8.g0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @androidx.annotation.n0
    @mk.d({"#1"})
    @v8.a
    public static <T> T l(@androidx.annotation.p0 T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    @androidx.annotation.n0
    @mk.d({"#1"})
    @v8.a
    public static <T> T m(@androidx.annotation.n0 T t10, @androidx.annotation.n0 Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @v8.a
    public static int n(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @v8.a
    public static int o(int i10, @androidx.annotation.n0 Object obj) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @v8.a
    public static long p(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @v8.a
    public static long q(long j10, @androidx.annotation.n0 Object obj) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @v8.a
    public static void r(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @v8.a
    public static void s(boolean z10, @androidx.annotation.n0 Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @v8.a
    public static void t(boolean z10, @androidx.annotation.n0 String str, @androidx.annotation.n0 Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
