package com.huawei.hms.push;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ReceiverThreadPoolExecutor.java */
/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f61282a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f61283b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f61282a) {
            threadPoolExecutor = f61283b;
        }
        return threadPoolExecutor;
    }
}
