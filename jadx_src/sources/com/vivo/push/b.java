package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.vivo.push.util.t;
import com.vivo.push.util.z;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: IPCManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106451a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, b> f106452b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f106455e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile IPCInvoke f106457g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f106460j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f106458h = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicInteger f106456f = new AtomicInteger(1);

    private b(Context context, String str) {
        this.f106454d = null;
        this.f106460j = null;
        this.f106455e = context;
        this.f106459i = str;
        this.f106460j = new Handler(Looper.getMainLooper(), new c(this));
        String strB = t.b(context);
        this.f106454d = strB;
        if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(this.f106459i)) {
            this.f106453c = z.a(context, this.f106454d) >= 1260;
            b();
            return;
        }
        com.vivo.push.util.p.c(this.f106455e, "init error : push pkgname is " + this.f106454d + " ; action is " + this.f106459i);
        this.f106453c = false;
    }

    public static b a(Context context, String str) {
        b bVar = f106452b.get(str);
        if (bVar == null) {
            synchronized (f106451a) {
                bVar = f106452b.get(str);
                if (bVar == null) {
                    bVar = new b(context, str);
                    f106452b.put(str, bVar);
                }
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        this.f106456f.set(i10);
    }

    private void b() {
        int i10 = this.f106456f.get();
        com.vivo.push.util.p.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i10)));
        if (i10 == 4 || i10 == 2 || i10 == 3 || i10 == 5 || !this.f106453c) {
            return;
        }
        a(2);
        if (c()) {
            d();
        } else {
            a(1);
            com.vivo.push.util.p.a("AidlManager", "bind core service fail");
        }
    }

    private boolean c() {
        Intent intent = new Intent(this.f106459i);
        intent.setPackage(this.f106454d);
        try {
            return this.f106455e.bindService(intent, this, 1);
        } catch (Exception e10) {
            com.vivo.push.util.p.a("AidlManager", "bind core error", e10);
            return false;
        }
    }

    private void d() {
        this.f106460j.removeMessages(1);
        this.f106460j.sendEmptyMessageDelayed(1, 3000L);
    }

    private void e() {
        this.f106460j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.f106455e.unbindService(this);
        } catch (Exception e10) {
            com.vivo.push.util.p.a("AidlManager", "On unBindServiceException:" + e10.getMessage());
        }
    }

    public final boolean a() {
        String strB = t.b(this.f106455e);
        this.f106454d = strB;
        if (TextUtils.isEmpty(strB)) {
            com.vivo.push.util.p.c(this.f106455e, "push pkgname is null");
            return false;
        }
        boolean z10 = z.a(this.f106455e, this.f106454d) >= 1260;
        this.f106453c = z10;
        return z10;
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f106456f.get() == 2) {
            synchronized (this.f106458h) {
                try {
                    this.f106458h.wait(2000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        try {
            int i10 = this.f106456f.get();
            if (i10 != 4) {
                com.vivo.push.util.p.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i10)));
                return false;
            }
            this.f106460j.removeMessages(2);
            this.f106460j.sendEmptyMessageDelayed(2, 30000L);
            this.f106457g.asyncCall(bundle, null);
            return true;
        } catch (Exception e11) {
            com.vivo.push.util.p.a("AidlManager", "invoke error ", e11);
            int i11 = this.f106456f.get();
            com.vivo.push.util.p.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i11)));
            if (i11 == 2) {
                e();
                a(1);
                return false;
            }
            if (i11 == 3) {
                a(1);
                return false;
            }
            if (i11 != 4) {
                return false;
            }
            a(1);
            f();
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.vivo.push.util.p.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e();
        this.f106457g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f106457g == null) {
            com.vivo.push.util.p.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            f();
            this.f106456f.set(1);
            return;
        }
        if (this.f106456f.get() == 2) {
            a(4);
        } else if (this.f106456f.get() != 4) {
            f();
        }
        synchronized (this.f106458h) {
            this.f106458h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f106457g = null;
        a(1);
    }
}
