package com.tencent.qmsp.sdk.g.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f101972e = "LXOP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f101973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.tencent.qmsp.sdk.g.c.a f101974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ServiceConnection f101975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f101976d;

    public class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                c.this.f101974b = com.tencent.qmsp.sdk.g.c.a.AbstractBinderC1000a.a(iBinder);
                c cVar = c.this;
                b bVar = cVar.f101976d;
                if (bVar != null) {
                    bVar.a(cVar);
                }
                c.this.b("Service onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c cVar = c.this;
            cVar.f101974b = null;
            cVar.b("Service onServiceDisconnected");
        }
    }

    public interface b {
        void a(c cVar);
    }

    public c(Context context, b bVar) {
        String str;
        this.f101973a = null;
        this.f101976d = null;
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f101973a = context;
        this.f101976d = bVar;
        this.f101975c = new a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f101973a.bindService(intent, this.f101975c, 1)) {
            str = "bindService Successful!";
        } else {
            b bVar2 = this.f101976d;
            if (bVar2 != null) {
                bVar2.a(this);
            }
            str = "bindService Failed!!!";
        }
        b(str);
    }

    private void a(String str) {
        com.tencent.qmsp.sdk.base.c.b(f101972e + " " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        com.tencent.qmsp.sdk.base.c.a(f101972e + " " + str);
    }

    public String a() {
        if (this.f101973a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.tencent.qmsp.sdk.g.c.a aVar = this.f101974b;
            if (aVar != null) {
                return aVar.g();
            }
            return null;
        } catch (Exception e10) {
            a("getOAID error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public boolean b() {
        try {
            if (this.f101974b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.f101974b.c();
        } catch (Exception unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public String c() {
        Context context = this.f101973a;
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
            com.tencent.qmsp.sdk.g.c.a aVar = this.f101974b;
            if (aVar != null) {
                return aVar.b(packageName);
            }
            return null;
        } catch (Exception unused) {
            a("getAAID error, RemoteException!");
            return null;
        }
    }

    public void d() {
        try {
            this.f101973a.unbindService(this.f101975c);
            b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.f101974b = null;
    }
}
