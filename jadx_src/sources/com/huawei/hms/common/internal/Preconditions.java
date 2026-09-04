package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes7.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Cannot use constructor to make a new instance");
    }

    private static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkHandlerThread(Handler handler) {
        checkHandlerThread(handler, "Must be called on the handler thread");
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkMainThread(String str) {
        if (!a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkNotMainThread() {
        if (a()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }

    public static <O> O checkNotNull(O o10) {
        if (o10 != null) {
            return o10;
        }
        throw new NullPointerException("must not refer to a null object");
    }

    public static <O> O checkNotNull(O o10, Object obj) {
        if (o10 != null) {
            return o10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
