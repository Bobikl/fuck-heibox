package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class c {
    private c() {
        throw new AssertionError("Uninstantiable");
    }

    @v8.a
    public static void a(@androidx.annotation.n0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS NOT the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(str);
    }

    @v8.a
    public static void b(@androidx.annotation.n0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkNotMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(str);
    }

    @mk.d({"#1"})
    @v8.a
    public static void c(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @mk.d({"#1"})
    @v8.a
    public static void d(@Nullable Object obj, @androidx.annotation.n0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @v8.a
    public static void e(@androidx.annotation.n0 Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @v8.a
    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @v8.a
    public static void g(boolean z10, @androidx.annotation.n0 Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
