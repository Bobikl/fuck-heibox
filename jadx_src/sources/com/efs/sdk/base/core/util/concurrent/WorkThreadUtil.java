package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.n0;
import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class WorkThreadUtil {
    public static final int DEFAULT_THREAD_POOL_MAX_CNT = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolExecutor f42575a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static Future<?> submit(@n0 Runnable runnable) {
        try {
            return f42575a.submit(runnable);
        } catch (Throwable th2) {
            Log.e("efs.util.concurrent", "submit task error!", th2);
            return null;
        }
    }
}
