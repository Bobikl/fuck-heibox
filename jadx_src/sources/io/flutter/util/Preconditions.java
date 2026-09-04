package io.flutter.util;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z10, @p0 Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
