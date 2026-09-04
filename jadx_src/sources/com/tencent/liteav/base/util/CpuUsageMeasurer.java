package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public class CpuUsageMeasurer {
    public static int[] a() {
        int[] iArrNativeGetCpuUsage = nativeGetCpuUsage();
        return new int[]{iArrNativeGetCpuUsage[0], iArrNativeGetCpuUsage[1]};
    }

    public static native int[] nativeGetCpuUsage();
}
