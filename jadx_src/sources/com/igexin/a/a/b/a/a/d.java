package com.igexin.a.a.b.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.Socket;

/* JADX INFO: loaded from: classes7.dex */
public class d extends Handler {
    public d(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i10 = e.f63144a[q.values()[message.what].ordinal()];
            if (i10 == 1) {
                f.a().g();
            } else if (i10 == 3) {
                f.a().a((Socket) message.obj);
            } else if (i10 == 4) {
                f.a().h();
            } else if (i10 == 5) {
                f.a().f();
            } else if (i10 == 6) {
                f.a().b();
            }
        } catch (Throwable unused) {
        }
    }
}
