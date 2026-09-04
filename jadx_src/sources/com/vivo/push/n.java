package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PushClientThread.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends Handler {
    n(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof l) {
            l lVar = (l) obj;
            com.vivo.push.util.p.c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(lVar)));
            lVar.run();
        }
    }
}
