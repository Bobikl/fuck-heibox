package com.tencent.qmsp.sdk.g.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f102022e = "SDI";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f102023f = "SI";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1007b f102024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceConnection f102025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f102026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.tencent.qmsp.sdk.g.h.a f102027d;

    public class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                b.this.f102027d = com.tencent.qmsp.sdk.g.h.a.AbstractBinderC1005a.a(iBinder);
                b bVar = b.this;
                InterfaceC1007b interfaceC1007b = bVar.f102024a;
                if (interfaceC1007b != null) {
                    interfaceC1007b.a(bVar);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b.f102023f);
                sb2.append(" Service onServiceConnected");
                com.tencent.qmsp.sdk.base.c.c(sb2.toString());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f102027d = null;
            com.tencent.qmsp.sdk.base.c.c(b.f102023f + " Service onServiceDisconnected");
        }
    }

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.h.b$b, reason: collision with other inner class name */
    public interface InterfaceC1007b {
        void a(b bVar);
    }

    public b(Context context, InterfaceC1007b interfaceC1007b) {
        this.f102024a = null;
        this.f102026c = null;
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f102026c = context;
        this.f102024a = interfaceC1007b;
        this.f102025b = new a();
    }

    public String a() {
        StringBuilder sb2;
        String str;
        Context context = this.f102026c;
        if (context == null) {
            com.tencent.qmsp.sdk.base.c.c(f102023f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
        String packageName = context.getPackageName();
        com.tencent.qmsp.sdk.base.c.a(f102023f + "apackage：" + packageName);
        if (packageName == null || packageName.equals("")) {
            sb2 = new StringBuilder();
            sb2.append(f102023f);
            str = " input package is null!";
        } else {
            try {
                com.tencent.qmsp.sdk.g.h.a aVar = this.f102027d;
                if (aVar == null) {
                    return null;
                }
                String strA = aVar.a(packageName);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f102023f);
                sb3.append(" getAAID Package: ");
                sb3.append(packageName);
                com.tencent.qmsp.sdk.base.c.a(sb3.toString());
                return strA;
            } catch (Exception unused) {
                sb2 = new StringBuilder();
                sb2.append(f102023f);
                str = " geta error, RemoteException!";
            }
        }
        sb2.append(str);
        com.tencent.qmsp.sdk.base.c.c(sb2.toString());
        return null;
    }

    public String b() {
        if (this.f102026c == null) {
            com.tencent.qmsp.sdk.base.c.c(f102023f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
        try {
            com.tencent.qmsp.sdk.g.h.a aVar = this.f102027d;
            if (aVar == null) {
                return null;
            }
            String strA = aVar.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f102022e);
            sb2.append(" geto call");
            com.tencent.qmsp.sdk.base.c.c(sb2.toString());
            return strA;
        } catch (Exception e10) {
            com.tencent.qmsp.sdk.base.c.c(f102023f + " geto error, RemoteException!");
            e10.printStackTrace();
            return null;
        }
    }

    public void c() {
        StringBuilder sb2;
        String str;
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f102026c.bindService(intent, this.f102025b, 1)) {
            sb2 = new StringBuilder();
            sb2.append(f102023f);
            str = " bindService Successful!";
        } else {
            this.f102024a.a(this);
            sb2 = new StringBuilder();
            sb2.append(f102023f);
            str = " bindService Failed!";
        }
        sb2.append(str);
        com.tencent.qmsp.sdk.base.c.c(sb2.toString());
    }

    public boolean d() {
        try {
            if (this.f102027d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f102023f);
                sb2.append(" Device not support opendeviceid");
                com.tencent.qmsp.sdk.base.c.c(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f102023f);
            sb3.append(" Device support opendeviceid");
            com.tencent.qmsp.sdk.base.c.c(sb3.toString());
            return true;
        } catch (Exception unused) {
            com.tencent.qmsp.sdk.base.c.c(f102023f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.f102026c.unbindService(this.f102025b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f102023f);
            sb2.append(" unBind Service successful");
            com.tencent.qmsp.sdk.base.c.c(sb2.toString());
        } catch (IllegalArgumentException unused) {
            com.tencent.qmsp.sdk.base.c.c(f102023f + " unBind Service exception");
        }
        this.f102027d = null;
    }
}
