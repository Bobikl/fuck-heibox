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

/* JADX INFO: compiled from: CoolpadDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ab implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f104392a = "Coolpad";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104393b = "com.coolpad.deviceidsupport";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f104394c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f104395d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CountDownLatch f104397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f104398g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104396e = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ServiceConnection f104399h = new ServiceConnection() { // from class: com.umeng.analytics.pro.ab.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                a unused = ab.f104395d = a.AbstractBinderC1034a.a(iBinder);
                ab.this.f104396e = ab.f104395d.b(ab.this.f104398g.getPackageName());
                Log.d(ab.f104392a, "onServiceConnected: oaid = " + ab.this.f104396e);
            } catch (RemoteException | NullPointerException e10) {
                Log.e(ab.f104392a, "onServiceConnected failed e=" + e10.getMessage());
            }
            ab.this.f104397f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(ab.f104392a, "onServiceDisconnected");
            a unused = ab.f104395d = null;
        }
    };

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(f104393b, f104394c));
            if (context.bindService(intent, this.f104399h, 1)) {
                return;
            }
            Log.e(f104392a, "bindService return false");
        } catch (Throwable th2) {
            Log.e(f104392a, "bindService failed. e=" + th2.getMessage());
            this.f104397f.countDown();
        }
    }

    private void c(Context context) {
        try {
            Log.d(f104392a, "call unbindService.");
            context.unbindService(this.f104399h);
        } catch (Throwable th2) {
            Log.e(f104392a, "unbindService failed. e=" + th2.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        this.f104398g = context.getApplicationContext();
        this.f104397f = new CountDownLatch(1);
        try {
            b(context);
            if (!this.f104397f.await(500L, TimeUnit.MILLISECONDS)) {
                Log.e(f104392a, "getOAID time-out");
            }
            return this.f104396e;
        } catch (InterruptedException e10) {
            Log.e(f104392a, "getOAID interrupted. e=" + e10.getMessage());
            return null;
        } finally {
            c(context);
        }
    }
}
