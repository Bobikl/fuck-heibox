package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class al extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f106818a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(ak akVar, Looper looper) {
        super(looper);
        this.f106818a = akVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ak.b bVar = (ak.b) message.obj;
        int i10 = message.what;
        if (i10 == 0) {
            bVar.a();
        } else if (i10 == 1) {
            bVar.mo279c();
        }
        super.handleMessage(message);
    }
}
