package com.igexin.push.core.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f63720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f63722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f63723d;

    i(String str, CountDownLatch countDownLatch) {
        this.f63721b = str;
        this.f63722c = countDownLatch;
    }

    h a() {
        return this.f63720a;
    }

    boolean a(Context context, Intent intent) {
        if (context == null) {
            return false;
        }
        if (this.f63720a != null) {
            return true;
        }
        try {
            boolean zBindService = context.bindService(intent, this, 1);
            this.f63722c.await(2000L, TimeUnit.MILLISECONDS);
            this.f63720a = h.a(this.f63723d, this.f63721b);
            return zBindService;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f63723d = iBinder;
            this.f63722c.countDown();
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f63720a = null;
        this.f63723d = null;
    }
}
