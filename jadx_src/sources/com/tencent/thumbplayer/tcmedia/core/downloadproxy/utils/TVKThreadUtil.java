package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class TVKThreadUtil {
    private static volatile ScheduledExecutorService mScheduler;

    public static ScheduledExecutorService getScheduledExecutorServiceInstance() {
        if (mScheduler == null) {
            synchronized (TVKThreadUtil.class) {
                if (mScheduler == null) {
                    mScheduler = Executors.newScheduledThreadPool(4);
                }
            }
        }
        return mScheduler;
    }
}
