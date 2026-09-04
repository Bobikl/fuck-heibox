package com.tencent.qmsp.sdk.g.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f101958c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f101960b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101959a = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f101961a;

        public a(IBinder iBinder) {
            this.f101961a = iBinder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.f101960b.offer(this.f101961a);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onServiceConnected ");
            sb2.append(System.currentTimeMillis());
            Log.d("PPSSerivceConnection", sb2.toString());
            f101958c.execute(new a(iBinder));
        } catch (Throwable unused) {
            Log.w("PPSSerivceConnection", "onServiceConnected InterruptedException " + System.currentTimeMillis());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("PPSSerivceConnection", "onServiceDisconnected " + System.currentTimeMillis());
    }
}
