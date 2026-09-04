package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCInitializer {
    private static int sRefCount;

    public static synchronized void initialize() {
        if (sRefCount == 0) {
            nativeInitialize();
        }
        sRefCount++;
    }

    private static native void nativeInitialize();

    private static native void nativeUninitialize();

    public static synchronized void uninitialize() {
        if (sRefCount == 1) {
            nativeUninitialize();
        }
        int i10 = sRefCount;
        if (i10 > 0) {
            sRefCount = i10 - 1;
        }
    }
}
