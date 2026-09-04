package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("base::android")
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    private PathService() {
    }

    private static native void nativeOverride(int i10, String str);

    public static void override(int i10, String str) {
        nativeOverride(i10, str);
    }
}
