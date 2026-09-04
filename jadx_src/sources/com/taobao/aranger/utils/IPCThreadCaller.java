package com.taobao.aranger.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.n0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class IPCThreadCaller {
    private static final int CORE_POOL_SIZE = 3;
    private static final String TAG = "com.taobao.aranger.utils.IPCThreadCaller";
    private static volatile IPCThreadCaller sInstance;
    private final ExecutorService mExecutorService;
    private final Handler mHandler;
    private final Handler mUiHandler;

    public static class IPCThreadFactory implements ThreadFactory {
        private final AtomicInteger mCount;

        private IPCThreadFactory() {
            this.mCount = new AtomicInteger();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@n0 Runnable runnable) {
            return new Thread(runnable, "ARanger  Thread:" + this.mCount.getAndIncrement());
        }
    }

    private IPCThreadCaller() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.mUiHandler = new Handler(Looper.getMainLooper());
        this.mExecutorService = new ThreadPoolExecutor(3, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new IPCThreadFactory());
    }

    public static void execute(Runnable runnable) {
        if (runnable != null) {
            getImpl().mExecutorService.execute(runnable);
        }
    }

    private static IPCThreadCaller getImpl() {
        if (sInstance == null) {
            synchronized (IPCThreadCaller.class) {
                if (sInstance == null) {
                    sInstance = new IPCThreadCaller();
                }
            }
        }
        return sInstance;
    }

    public static void post(boolean z10, Runnable runnable) {
        (z10 ? getImpl().mUiHandler : getImpl().mHandler).post(runnable);
    }
}
