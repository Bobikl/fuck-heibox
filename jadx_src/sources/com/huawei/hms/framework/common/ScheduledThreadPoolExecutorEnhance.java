package com.huawei.hms.framework.common;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public class ScheduledThreadPoolExecutorEnhance extends ScheduledThreadPoolExecutor {
    private static final String TAG = "ScheduledThreadPoolExec";

    public ScheduledThreadPoolExecutorEnhance(int i10, ThreadFactory threadFactory) {
        super(i10, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof RunnableScheduledFutureEnhance) {
            String parentName = ((RunnableScheduledFutureEnhance) runnable).getParentName();
            int iLastIndexOf = parentName.lastIndexOf(" -->");
            if (iLastIndexOf != -1) {
                parentName = StringUtils.substring(parentName, iLastIndexOf + 4);
            }
            String name = thread.getName();
            int iLastIndexOf2 = name.lastIndexOf(" -->");
            if (iLastIndexOf2 != -1) {
                name = StringUtils.substring(name, iLastIndexOf2 + 4);
            }
            thread.setName(parentName + " -->" + name);
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(runnable, runnableScheduledFuture));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(callable, runnableScheduledFuture));
    }
}
