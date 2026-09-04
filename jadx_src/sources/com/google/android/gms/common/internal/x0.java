package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class x0 extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    private final HashMap f52568f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f52569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f52570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w0 f52571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.stats.b f52572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f52573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f52574l;

    x0(Context context, Looper looper) {
        w0 w0Var = new w0(this, null);
        this.f52571i = w0Var;
        this.f52569g = context.getApplicationContext();
        this.f52570h = new com.google.android.gms.internal.common.p(looper, w0Var);
        this.f52572j = com.google.android.gms.common.stats.b.b();
        this.f52573k = 5000L;
        this.f52574l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.f
    protected final void i(s0 s0Var, ServiceConnection serviceConnection, String str) {
        p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f52568f) {
            u0 u0Var = (u0) this.f52568f.get(s0Var);
            if (u0Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + s0Var.toString());
            }
            if (!u0Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + s0Var.toString());
            }
            u0Var.f(serviceConnection, str);
            if (u0Var.i()) {
                this.f52570h.sendMessageDelayed(this.f52570h.obtainMessage(0, s0Var), this.f52573k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    protected final boolean k(s0 s0Var, ServiceConnection serviceConnection, String str, @androidx.annotation.p0 Executor executor) {
        boolean zJ;
        p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f52568f) {
            u0 u0Var = (u0) this.f52568f.get(s0Var);
            if (u0Var == null) {
                u0Var = new u0(this, s0Var);
                u0Var.d(serviceConnection, serviceConnection, str);
                u0Var.e(str, executor);
                this.f52568f.put(s0Var, u0Var);
            } else {
                this.f52570h.removeMessages(0, s0Var);
                if (u0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + s0Var.toString());
                }
                u0Var.d(serviceConnection, serviceConnection, str);
                int iA = u0Var.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(u0Var.b(), u0Var.c());
                } else if (iA == 2) {
                    u0Var.e(str, executor);
                }
            }
            zJ = u0Var.j();
        }
        return zJ;
    }

    final void q(Looper looper) {
        synchronized (this.f52568f) {
            this.f52570h = new com.google.android.gms.internal.common.p(looper, this.f52571i);
        }
    }
}
