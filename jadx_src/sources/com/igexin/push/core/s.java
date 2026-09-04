package com.igexin.push.core;

import android.os.IBinder;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class s implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f63778a;

    s(r rVar) {
        this.f63778a = rVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        com.igexin.a.a.c.b.a("MsgServerSender|remote iservice binderDied and reconnect !!!", new Object[0]);
        Message.obtain(this.f63778a.f63774c.a(), 2, 0, 0).sendToTarget();
    }
}
