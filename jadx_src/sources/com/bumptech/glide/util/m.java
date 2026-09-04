package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collection;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private m() {
    }

    public static void a(boolean z10) {
        b(z10, "");
    }

    public static void b(boolean z10, @n0 String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    @n0
    public static String c(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @n0
    public static <T extends Collection<Y>, Y> T d(@n0 T t10) {
        if (t10.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t10;
    }

    @n0
    public static <T> T e(@p0 T t10) {
        return (T) f(t10, "Argument must not be null");
    }

    @n0
    public static <T> T f(@p0 T t10, @n0 String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
