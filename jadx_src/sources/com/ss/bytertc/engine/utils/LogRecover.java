package com.ss.bytertc.engine.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class LogRecover {
    private static LogRecover instance;
    private static boolean isRunning;
    private static Timer timer;

    public static LogRecover getInstance() {
        if (instance == null) {
            synchronized (LogRecover.class) {
                if (instance == null) {
                    instance = new LogRecover();
                    timer = new Timer();
                    isRunning = false;
                }
            }
        }
        return instance;
    }

    public static native void nativeSendLogRecoverRequest();

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public synchronized void startTimer() {
        if (isRunning) {
            return;
        }
        timer.schedule(new TimerTask() { // from class: com.ss.bytertc.engine.utils.LogRecover.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                LogRecover.this.runOnUIThread(new Runnable() { // from class: com.ss.bytertc.engine.utils.LogRecover.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LogRecover.nativeSendLogRecoverRequest();
                    }
                });
            }
        }, 1000L, 600000L);
        isRunning = true;
    }
}
