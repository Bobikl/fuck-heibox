package com.tencent.liteav.txcplayer.common;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::licence")
public class VodPlayerControl {
    public static native void nativeIncrementCheckCount();

    public static native boolean nativeIsCheckCountLEThreshold();

    public static native void nativeSetLicenseFlexibleValid(boolean z10);
}
