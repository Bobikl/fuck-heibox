package com.taobao.downloader.util;

import android.annotation.TargetApi;
import android.os.Process;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.ThreadExecutor;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadUtil {
    @TargetApi(3)
    public static void execute(final Runnable runnable, boolean z10) {
        ThreadExecutor threadExecutor = Configuration.threadExecutor;
        if (threadExecutor != null) {
            threadExecutor.execute(runnable, z10);
        } else {
            new Thread(new Runnable() { // from class: com.taobao.downloader.util.ThreadUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }).start();
        }
    }

    public static void postDelayed(final Runnable runnable, long j10) {
        ThreadExecutor threadExecutor = Configuration.threadExecutor;
        if (threadExecutor != null) {
            threadExecutor.postDelayed(runnable, j10);
        } else {
            new Timer("download-sdk").schedule(new TimerTask() { // from class: com.taobao.downloader.util.ThreadUtil.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, j10);
        }
    }
}
