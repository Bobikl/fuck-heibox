package com.tencent.qcloud.core.task;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class UIThreadExecutor implements Executor {
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    UIThreadExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@n0 Runnable runnable) {
        this.mHandler.post(runnable);
    }
}
