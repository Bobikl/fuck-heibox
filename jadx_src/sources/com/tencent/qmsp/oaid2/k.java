package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f101619c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f101621b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101620a = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f101622a;

        public a(IBinder iBinder) {
            this.f101622a = iBinder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.this.f101621b.offer(this.f101622a);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            f101619c.execute(new a(iBinder));
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
