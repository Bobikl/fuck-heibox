package com.heytap.msp.push.notification;

import com.heytap.mcssdk.notification.b;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class PushNotificationManager {
    private PushNotification.Builder builder;
    private Executor executor;

    public static class SingletonHolder {
        private static final PushNotificationManager INSTANCE = new PushNotificationManager();

        private SingletonHolder() {
        }
    }

    public static PushNotificationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void enqueue(final ISortListener iSortListener) {
        if (this.executor == null) {
            this.executor = new ThreadPoolExecutor(1, 0, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(16), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.executor.execute(new Runnable() { // from class: com.heytap.msp.push.notification.PushNotificationManager.1
            @Override // java.lang.Runnable
            public void run() {
                b.i().s(PushNotificationManager.this.builder, iSortListener);
            }
        });
    }

    public void execute(ISortListener iSortListener) {
        b.i().s(this.builder, iSortListener);
    }

    public PushNotificationManager with(PushNotification.Builder builder) {
        this.builder = builder;
        return this;
    }
}
