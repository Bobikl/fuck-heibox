package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public class TimeUtil {
    public static long a() {
        return nativeGetTimeTick();
    }

    public static long b() {
        return nativeGetUtcTimeTick();
    }

    public static long c() {
        return nativeGetTimestamp();
    }

    private static native long nativeGetTimeTick();

    private static native long nativeGetTimestamp();

    private static native long nativeGetUtcTimeTick();
}
