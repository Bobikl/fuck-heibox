package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes13.dex */
public class NDKTools {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        System.loadLibrary("native-lib");
    }

    public static native int checkSignature(Object obj);

    public static native synchronized String encode(Object obj, String str, String str2, String str3);

    public static native String getrsakey(Object obj, String str, String str2);
}
