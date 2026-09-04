package com.tencent.thumbplayer.tcmedia.core.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class TPThreadPool {
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAX_POOL_SIZE = 20;
    private static final String PRE_THREAD_NAME = "TPCoreHdr";
    private static final String SHARE_THREAD_NAME = "TPCore-ShareThread";
    private static final String TAG = "TPCore[TPThreadPool]";
    private static volatile ExecutorService sCustomExecutor;
    private static volatile HandlerThread sHandlerThread;
    private static volatile TPThreadPool sInstance;
    private static volatile Handler sMainThreadHandler;
    private static volatile ScheduledExecutorService sScheduler;
    private static volatile ExecutorService sShareSingleExecutor;
    private static int sShareThreadCount;

    private TPThreadPool() {
    }

    public static TPThreadPool getInstance() {
        if (sInstance == null) {
            synchronized (TPThreadPool.class) {
                if (sInstance == null) {
                    sInstance = new TPThreadPool();
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0010, B:11:0x001f, B:13:0x0027, B:14:0x0038, B:8:0x0014, B:10:0x001c), top: B:19:0x0003 }] */
    private static void initHandlerThread() {
        HandlerThread handlerThread;
        synchronized (TPThreadPool.class) {
            if (sHandlerThread == null) {
                handlerThread = new HandlerThread(SHARE_THREAD_NAME);
                sHandlerThread = handlerThread;
            } else {
                if (!sHandlerThread.isAlive()) {
                    handlerThread = sHandlerThread;
                }
                if (sHandlerThread.getLooper() == null) {
                    sHandlerThread.quit();
                    HandlerThread handlerThread2 = new HandlerThread(SHARE_THREAD_NAME);
                    sHandlerThread = handlerThread2;
                    handlerThread2.start();
                }
            }
            handlerThread.start();
            if (sHandlerThread.getLooper() == null) {
                sHandlerThread.quit();
                HandlerThread handlerThread3 = new HandlerThread(SHARE_THREAD_NAME);
                sHandlerThread = handlerThread3;
                handlerThread3.start();
            }
        }
    }

    private static void initMainThreadHandler() {
        if (sMainThreadHandler != null) {
            return;
        }
        synchronized (TPThreadPool.class) {
            if (sMainThreadHandler != null) {
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                sMainThreadHandler = new Handler(mainLooper);
            } else {
                sMainThreadHandler = null;
                TPNativeLog.printLog(4, TAG, "cannot get thread looper");
            }
        }
    }

    public HandlerThread obtainHandleThread(String str) {
        return obtainHandleThread(str, 0);
    }

    public HandlerThread obtainHandleThread(String str, int i10) {
        if (i10 >= 19 || i10 <= -19) {
            i10 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            str = PRE_THREAD_NAME;
        }
        HandlerThread handlerThread = new HandlerThread(str, i10);
        handlerThread.start();
        return handlerThread;
    }

    public ScheduledExecutorService obtainScheduledExecutorService() {
        if (sScheduler == null) {
            synchronized (TPThreadPool.class) {
                if (sScheduler == null) {
                    sScheduler = Executors.newScheduledThreadPool(1);
                }
            }
        }
        return sScheduler;
    }

    public HandlerThread obtainShareThread() {
        HandlerThread handlerThread;
        initHandlerThread();
        synchronized (TPThreadPool.class) {
            sShareThreadCount++;
            TPNativeLog.printLog(2, TAG, "handlerThread obtainShareThread mShareThreadCount:" + sShareThreadCount);
            handlerThread = sHandlerThread;
        }
        return handlerThread;
    }

    public ExecutorService obtainSingleThreadExecutor() {
        if (sShareSingleExecutor == null) {
            synchronized (TPThreadPool.class) {
                if (sShareSingleExecutor == null) {
                    sShareSingleExecutor = Executors.newSingleThreadExecutor();
                }
            }
        }
        return sShareSingleExecutor;
    }

    public ExecutorService obtainThreadExecutor() {
        if (sCustomExecutor == null) {
            synchronized (TPThreadPool.class) {
                if (sCustomExecutor == null) {
                    sCustomExecutor = TPThreadPoolExecutor.newCustomThreadExecutor(1, 20);
                }
            }
        }
        return sCustomExecutor;
    }

    public void postDelayRunnableOnMainThread(Runnable runnable, long j10) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postDelayed(runnable, j10);
        }
    }

    public void postRunnableOnMainThread(Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.post(runnable);
        }
    }

    public void postRunnableOnMainThreadFront(Runnable runnable) {
        initMainThreadHandler();
        if (sMainThreadHandler != null) {
            sMainThreadHandler.postAtFrontOfQueue(runnable);
        }
    }

    public void recycle(HandlerThread handlerThread, Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(sHandlerThread)) {
            handlerThread.quit();
            return;
        }
        synchronized (TPThreadPool.class) {
            sShareThreadCount--;
            TPNativeLog.printLog(2, TAG, "handlerThread recycle mShareThreadCount:" + sShareThreadCount);
        }
    }
}
