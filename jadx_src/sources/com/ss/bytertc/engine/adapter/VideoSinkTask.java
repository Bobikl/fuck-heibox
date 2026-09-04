package com.ss.bytertc.engine.adapter;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public class VideoSinkTask extends HandlerThread {
    private Handler mHandler;
    private Object mLock;

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
        this.mLock = new Object();
    }

    public void exit() {
        synchronized (this.mLock) {
            quitSafely();
            this.mHandler = null;
        }
    }

    public void init() {
        synchronized (this.mLock) {
            start();
            this.mHandler = new Handler(getLooper());
        }
    }

    public void post(Runnable runnable) {
        synchronized (this.mLock) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void postDelayed(Runnable runnable, long j10) {
        synchronized (this.mLock) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(runnable, j10);
            }
        }
    }
}
