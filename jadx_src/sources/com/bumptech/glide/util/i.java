package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: compiled from: LogTime.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f41998a = 1.0d / Math.pow(10.0d, 6.0d);

    private i() {
    }

    public static double a(long j10) {
        return (b() - j10) * f41998a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
