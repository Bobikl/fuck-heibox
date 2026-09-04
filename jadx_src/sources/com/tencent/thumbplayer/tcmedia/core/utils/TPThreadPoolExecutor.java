package com.tencent.thumbplayer.tcmedia.core.utils;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TPThreadPoolExecutor {
    private static final int QUEUE_CAPACITY = 20;
    private static final String TAG = "TPCore[TPThreadPoolExecutor]";
    private static final long THREAD_KEEP_ALIVE_TIME = 60;
    private static final String THREAD_POOL_NAME = "TP-Thread";

    public static class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
        private CustomRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
                TPNativeLog.printLog(2, TPThreadPoolExecutor.TAG, "rejectedExecution put task to queue");
            } catch (InterruptedException e10) {
                TPNativeLog.printLog(4, TPThreadPoolExecutor.TAG, "rejectedExecution has exception:" + e10.toString());
            }
        }
    }

    public static class CustomThreadFactory implements ThreadFactory {
        private AtomicInteger threadAtomicCount;

        private CustomThreadFactory() {
            this.threadAtomicCount = new AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(TPThreadPoolExecutor.THREAD_POOL_NAME + this.threadAtomicCount.incrementAndGet());
            return thread;
        }
    }

    public static ExecutorService newCustomThreadExecutor(int i10, int i11) {
        return new ThreadPoolExecutor(i10, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(20), new CustomThreadFactory(), new CustomRejectedExecutionHandler());
    }
}
