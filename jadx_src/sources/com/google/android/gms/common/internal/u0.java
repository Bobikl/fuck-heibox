package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements ServiceConnection, y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52557b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52558c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private IBinder f52560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s0 f52561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ComponentName f52562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ x0 f52563h;

    public u0(x0 x0Var, s0 s0Var) {
        this.f52563h = x0Var;
        this.f52561f = s0Var;
    }

    public final int a() {
        return this.f52558c;
    }

    public final ComponentName b() {
        return this.f52562g;
    }

    @androidx.annotation.p0
    public final IBinder c() {
        return this.f52560e;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f52557b.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, @androidx.annotation.p0 Executor executor) {
        this.f52558c = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (z8.v.r()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            x0 x0Var = this.f52563h;
            boolean zE = x0Var.f52572j.e(x0Var.f52569g, str, this.f52561f.c(x0Var.f52569g), this, this.f52561f.a(), executor);
            this.f52559d = zE;
            if (zE) {
                this.f52563h.f52570h.sendMessageDelayed(this.f52563h.f52570h.obtainMessage(1, this.f52561f), this.f52563h.f52574l);
            } else {
                this.f52558c = 2;
                try {
                    x0 x0Var2 = this.f52563h;
                    x0Var2.f52572j.c(x0Var2.f52569g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f52557b.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f52563h.f52570h.removeMessages(1, this.f52561f);
        x0 x0Var = this.f52563h;
        x0Var.f52572j.c(x0Var.f52569g, this);
        this.f52559d = false;
        this.f52558c = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f52557b.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f52557b.isEmpty();
    }

    public final boolean j() {
        return this.f52559d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f52563h.f52568f) {
            this.f52563h.f52570h.removeMessages(1, this.f52561f);
            this.f52560e = iBinder;
            this.f52562g = componentName;
            Iterator it = this.f52557b.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f52558c = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f52563h.f52568f) {
            this.f52563h.f52570h.removeMessages(1, this.f52561f);
            this.f52560e = null;
            this.f52562g = componentName;
            Iterator it = this.f52557b.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f52558c = 2;
        }
    }
}
