package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f101612e = "SDI";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f101613f = "SI";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f101614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f101615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f101616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f101617d;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                j0.this.f101617d = i0.a.a(iBinder);
                j0 j0Var = j0.this;
                b bVar = j0Var.f101614a;
                if (bVar != null) {
                    bVar.a(j0Var);
                }
                c.c(j0.f101613f + " Service onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j0.this.f101617d = null;
            c.c(j0.f101613f + " Service onServiceDisconnected");
        }
    }

    public interface b {
        void a(j0 j0Var);
    }

    public j0(Context context, b bVar) {
        this.f101614a = null;
        this.f101616c = null;
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f101616c = context;
        this.f101614a = bVar;
        this.f101615b = new a();
    }

    public String a() {
        Context context = this.f101616c;
        if (context == null) {
            c.c(f101613f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
        String packageName = context.getPackageName();
        c.a(f101613f + "apackage：" + packageName);
        if (packageName == null || packageName.equals("")) {
            c.c(f101613f + " input package is null!");
            return null;
        }
        try {
            i0 i0Var = this.f101617d;
            if (i0Var == null) {
                return null;
            }
            String strA = i0Var.a(packageName);
            c.a(f101613f + " getAAID Package: " + packageName);
            return strA;
        } catch (Exception unused) {
            c.c(f101613f + " geta error, RemoteException!");
            return null;
        }
    }

    public String b() {
        if (this.f101616c == null) {
            c.c(f101613f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
        try {
            i0 i0Var = this.f101617d;
            if (i0Var == null) {
                return null;
            }
            String strA = i0Var.a();
            c.c(f101612e + " geto call");
            return strA;
        } catch (Exception e10) {
            c.c(f101613f + " geto error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public void c() {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f101616c.bindService(intent, this.f101615b, 1)) {
            c.c(f101613f + " bindService Successful!");
            return;
        }
        this.f101614a.a(this);
        c.c(f101613f + " bindService Failed!");
    }

    public boolean d() {
        try {
            if (this.f101617d == null) {
                c.c(f101613f + " Device not support opendeviceid");
                return false;
            }
            c.c(f101613f + " Device support opendeviceid");
            return true;
        } catch (Exception unused) {
            c.c(f101613f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.f101616c.unbindService(this.f101615b);
            c.c(f101613f + " unBind Service successful");
        } catch (IllegalArgumentException unused) {
            c.c(f101613f + " unBind Service exception");
        }
        this.f101617d = null;
    }
}
