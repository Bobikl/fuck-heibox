package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f99738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a<CpuUsageMeasurer> f99739b = new a<>(v.b());

    public static int[] a() {
        if (!f99738a) {
            f99739b.a();
            return CpuUsageMeasurer.a();
        }
        f99738a = false;
        f99739b.a();
        CpuUsageMeasurer.a();
        return new int[]{0, 0};
    }
}
