package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f101642e = "LXOP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f101644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f101645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f101646d;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                p.this.f101644b = n.a.a(iBinder);
                p pVar = p.this;
                b bVar = pVar.f101646d;
                if (bVar != null) {
                    bVar.a(pVar);
                }
                p.this.b("Service onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p pVar = p.this;
            pVar.f101644b = null;
            pVar.b("Service onServiceDisconnected");
        }
    }

    public interface b {
        void a(p pVar);
    }

    public p(Context context, b bVar) {
        this.f101643a = null;
        this.f101646d = null;
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f101643a = context;
        this.f101646d = bVar;
        this.f101645c = new a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f101643a.bindService(intent, this.f101645c, 1)) {
            b("bindService Successful!");
            return;
        }
        b bVar2 = this.f101646d;
        if (bVar2 != null) {
            bVar2.a(this);
        }
        b("bindService Failed!!!");
    }

    public String a() {
        if (this.f101643a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            n nVar = this.f101644b;
            if (nVar != null) {
                return nVar.b();
            }
            return null;
        } catch (Exception e10) {
            a("getOAID error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        c.b(f101642e + " " + str);
    }

    public final void b(String str) {
        c.a(f101642e + " " + str);
    }

    public boolean b() {
        try {
            if (this.f101644b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.f101644b.c();
        } catch (Exception unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public String c() {
        Context context = this.f101643a;
        if (context == null) {
            b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        b("liufeng, getAAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            b("input package is null!");
            return null;
        }
        try {
            n nVar = this.f101644b;
            if (nVar != null) {
                return nVar.b(packageName);
            }
            return null;
        } catch (Exception unused) {
            a("getAAID error, RemoteException!");
            return null;
        }
    }

    public void d() {
        try {
            this.f101643a.unbindService(this.f101645c);
            b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.f101644b = null;
    }
}
