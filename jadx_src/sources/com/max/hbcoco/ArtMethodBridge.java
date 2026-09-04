package com.max.hbcoco;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes9.dex */
public class ArtMethodBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        System.loadLibrary("libhbcoco");
    }

    public static native void printLoadedClassEnd();

    public static native void printLoadedClassStart(String str);
}
