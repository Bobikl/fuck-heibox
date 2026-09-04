package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static float a(float f10, float f11) {
        if (f10 < f11) {
            return f11;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static int a(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static long a(long j10, long j11, long j12) {
        if (j10 < j11) {
            return j11;
        }
        return j10 > j12 ? j12 : j10;
    }
}
