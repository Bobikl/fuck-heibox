package com.tencent.liteav.base.util;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class CommonUtil {
    private static long mNativeNtpTimeManagerListener;
    private static a sCallback;

    public interface a {
        void a(int i10, String str);
    }

    static {
        s.a();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String getFileExtension(String str) {
        int iLastIndexOf;
        if (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static long getNetworkTimestamp() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeGetNetworkTimestamp(mNativeNtpTimeManagerListener);
        }
        return 0L;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    private static native long nativeCreate();

    private static native long nativeGetNetworkTimestamp(long j10);

    public static native String nativeGetSDKVersion();

    private static boolean nativeNtpTimeManagerListenerHasBeenCreated() {
        return sCallback != null;
    }

    private static native int nativeSetGlobalEnv(String str);

    private static native boolean nativeSetSocks5Proxy(String str, int i10, String str2, String str3, boolean z10, boolean z11, boolean z12);

    private static native int nativeUpdateNetworkTime(long j10);

    public static void onUpdateNetworkTime(int i10, String str) {
        a aVar = sCallback;
        if (aVar != null) {
            aVar.a(i10, str);
        }
    }

    public static int setGlobalEnv(String str) {
        return nativeSetGlobalEnv(str);
    }

    public static boolean setSocks5Proxy(String str, int i10, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return nativeSetSocks5Proxy(str, i10, str2, str3, z10, z11, z12);
    }

    public static void setUpdateNetworkTimeCallback(a aVar) {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return;
        }
        mNativeNtpTimeManagerListener = nativeCreate();
        sCallback = aVar;
    }

    public static int updateNetworkTime() {
        if (nativeNtpTimeManagerListenerHasBeenCreated()) {
            return nativeUpdateNetworkTime(mNativeNtpTimeManagerListener);
        }
        return -1;
    }
}
