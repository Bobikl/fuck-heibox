package com.tencent.cos.xml.utils;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class TimeUtils {
    private static final String TAG = "TimeUtil";

    public static long getTookTime(long j10) {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime() - j10, TimeUnit.NANOSECONDS);
    }
}
