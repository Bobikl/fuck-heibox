package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCBaseJni {
    public static String callExperimentalAPI(String str) {
        return nativeCallExperimentalAPI(str);
    }

    private static native String nativeCallExperimentalAPI(String str);
}
