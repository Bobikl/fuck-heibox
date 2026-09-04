package com.tencent.qcloud.core.task;

import androidx.annotation.n0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TaskExecutors {
    public static final ThreadPoolExecutor COMMAND_EXECUTOR;
    public static final ThreadPoolExecutor DOWNLOAD_EXECUTOR;
    public static final UIThreadExecutor UI_THREAD_EXECUTOR;
    public static final ThreadPoolExecutor UPLOAD_EXECUTOR;

    public static final class TaskThreadFactory implements ThreadFactory {
        private final AtomicInteger increment = new AtomicInteger(1);
        private final int priority;
        private final String tag;

        TaskThreadFactory(String str, int i10) {
            this.tag = str;
            this.priority = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@n0 Runnable runnable) {
            Thread thread = new Thread(runnable, "QCloud-" + this.tag + this.increment.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new TaskThreadFactory("Command-", 8));
        COMMAND_EXECUTOR = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5L, timeUnit, new PriorityBlockingQueue(), new TaskThreadFactory("Upload-", 3));
        UPLOAD_EXECUTOR = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new TaskThreadFactory("Download-", 3));
        DOWNLOAD_EXECUTOR = threadPoolExecutor3;
        UI_THREAD_EXECUTOR = new UIThreadExecutor();
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
    }
}
