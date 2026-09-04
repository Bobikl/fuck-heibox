package com.huawei.hms.ads.identifier;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f60343a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f60344b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f60345c = new LinkedBlockingQueue<>(1);

    public IBinder a() {
        if (this.f60344b) {
            throw new IllegalStateException();
        }
        this.f60344b = true;
        return this.f60345c.take();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.d("PPSSerivceConnection", "onServiceConnected");
        f60343a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Log.d("PPSSerivceConnection", "onServiceConnected " + System.currentTimeMillis());
                    a.this.f60345c.offer(iBinder);
                } catch (Throwable th2) {
                    Log.w("PPSSerivceConnection", "onServiceConnected  " + th2.getClass().getSimpleName());
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("PPSSerivceConnection", "onServiceDisconnected " + System.currentTimeMillis());
    }
}
