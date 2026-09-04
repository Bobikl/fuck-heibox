package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SamsungDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ag implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f104408a = "DeviceIdService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104409b = "com.samsung.android.deviceidservice";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f104410c = "com.samsung.android.deviceidservice.DeviceIdService";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f104412e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f104411d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ServiceConnection f104413f = new ServiceConnection() { // from class: com.umeng.analytics.pro.ag.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                ag.this.f104411d = b.a.a(iBinder).a();
                Log.d(ag.f104408a, "onServiceConnected");
            } catch (RemoteException | NullPointerException e10) {
                Log.e(ag.f104408a, "onServiceConnected failed e=" + e10.getMessage());
            }
            ag.this.f104412e.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ag.f104408a, "onServiceDisconnected");
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(f104409b, f104410c);
            if (context.bindService(intent, this.f104413f, 1)) {
            } else {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e10) {
            Log.e(f104408a, "bindService failed. e=" + e10.getMessage());
            this.f104412e.countDown();
        }
    }

    private void c(Context context) {
        try {
            context.unbindService(this.f104413f);
        } catch (Error | Exception e10) {
            Log.e(f104408a, "unbindService failed. e=" + e10.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        this.f104412e = new CountDownLatch(1);
        try {
            b(context);
            if (!this.f104412e.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(f104408a, "getOAID time-out");
            }
            return this.f104411d;
        } catch (InterruptedException e10) {
            Log.e(f104408a, "getOAID interrupted. e=" + e10.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
