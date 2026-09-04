package com.taobao.aranger.utils;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeStampGenerator {
    private static final AtomicLong sTimeStamp = new AtomicLong();

    private TimeStampGenerator() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String getTimeStamp() {
        return System.currentTimeMillis() + "." + sTimeStamp.incrementAndGet();
    }
}
