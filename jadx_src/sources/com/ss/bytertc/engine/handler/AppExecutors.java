package com.ss.bytertc.engine.handler;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class AppExecutors {
    private static final AppExecutors INSTANCE = new AppExecutors(new MainThreadExecutor());
    private final Executor mMainThread;

    public static class MainThreadExecutor implements Executor {
        private Handler mainThreadHandler;

        private MainThreadExecutor() {
            this.mainThreadHandler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            this.mainThreadHandler.post(runnable);
        }
    }

    private AppExecutors(Executor executor) {
        this.mMainThread = executor;
    }

    public static AppExecutors getInstance() {
        return INSTANCE;
    }

    public Executor mainThread() {
        return this.mMainThread;
    }
}
