package com.vivo.push;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: IPCManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f106507a;

    c(b bVar) {
        this.f106507a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message == null) {
            com.vivo.push.util.p.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i10 = message.what;
        if (i10 == 1) {
            com.vivo.push.util.p.a("AidlManager", "In connect, bind core service time out");
            if (this.f106507a.f106456f.get() == 2) {
                this.f106507a.a(1);
            }
        } else if (i10 != 2) {
            com.vivo.push.util.p.b("AidlManager", "unknow msg what [" + message.what + "]");
        } else {
            if (this.f106507a.f106456f.get() == 4) {
                this.f106507a.f();
            }
            this.f106507a.a(1);
        }
        return true;
    }
}
