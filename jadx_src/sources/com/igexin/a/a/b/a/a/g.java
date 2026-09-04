package com.igexin.a.a.b.a.a;

import android.os.Message;
import java.net.Socket;

/* JADX INFO: loaded from: classes7.dex */
public class g implements com.igexin.a.a.b.a.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f63160a;

    g(f fVar) {
        this.f63160a = fVar;
    }

    @Override // com.igexin.a.a.b.a.a.a.a
    public void a(com.igexin.a.a.b.d dVar) {
        this.f63160a.f63157m.sendEmptyMessage(q.INTERRUPT_SUCCESS.ordinal());
    }

    @Override // com.igexin.a.a.b.a.a.a.d
    public void a(Exception exc) {
        com.igexin.a.a.c.b.a("GS-M|c ex = " + exc.toString(), new Object[0]);
        this.f63160a.i();
    }

    @Override // com.igexin.a.a.b.a.a.a.d
    public void a(String str) {
        this.f63160a.f63157m.sendEmptyMessage(q.TCP_CREATE_SUCCESS.ordinal());
    }

    @Override // com.igexin.a.a.b.a.a.a.d
    public void a(Socket socket) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = socket;
        messageObtain.what = q.TCP_CONNECT_SUCCESS.ordinal();
        this.f63160a.f63157m.sendMessage(messageObtain);
    }
}
