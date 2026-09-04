package com.igexin.push.core;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class u extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f63782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f63783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(t tVar, Looper looper, r rVar) {
        super(looper);
        this.f63783b = tVar;
        this.f63782a = rVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        try {
            int i10 = message.what;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    r rVar = this.f63783b.f63780a;
                    if (message.arg1 != 0) {
                        z10 = false;
                    }
                    rVar.a(z10);
                }
            } else if (this.f63783b.f63780a.a((IBinder) message.obj)) {
                removeMessages(2);
                removeMessages(1);
                this.f63783b.f63780a.f();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
