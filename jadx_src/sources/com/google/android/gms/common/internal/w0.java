package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x0 f52567b;

    /* synthetic */ w0(x0 x0Var, v0 v0Var) {
        this.f52567b = x0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f52567b.f52568f) {
                s0 s0Var = (s0) message.obj;
                u0 u0Var = (u0) this.f52567b.f52568f.get(s0Var);
                if (u0Var != null && u0Var.i()) {
                    if (u0Var.j()) {
                        u0Var.g("GmsClientSupervisor");
                    }
                    this.f52567b.f52568f.remove(s0Var);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f52567b.f52568f) {
            s0 s0Var2 = (s0) message.obj;
            u0 u0Var2 = (u0) this.f52567b.f52568f.get(s0Var2);
            if (u0Var2 != null && u0Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(s0Var2), new Exception());
                ComponentName componentNameB = u0Var2.b();
                if (componentNameB == null) {
                    componentNameB = s0Var2.b();
                }
                if (componentNameB == null) {
                    String strD = s0Var2.d();
                    p.l(strD);
                    componentNameB = new ComponentName(strD, "unknown");
                }
                u0Var2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
