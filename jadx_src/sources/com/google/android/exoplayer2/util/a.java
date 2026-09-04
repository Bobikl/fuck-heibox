package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Assertions.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    @Pure
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static int c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @Pure
    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @mk.d({"#1"})
    @Pure
    public static String e(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @mk.d({"#1"})
    @Pure
    public static String f(@androidx.annotation.p0 String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @mk.d({"#1"})
    @Pure
    public static <T> T g(@androidx.annotation.p0 T t10) {
        t10.getClass();
        return t10;
    }

    @mk.d({"#1"})
    @Pure
    public static <T> T h(@androidx.annotation.p0 T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void j(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @mk.d({"#1"})
    @Pure
    public static <T> T k(@androidx.annotation.p0 T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @mk.d({"#1"})
    @Pure
    public static <T> T l(@androidx.annotation.p0 T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
