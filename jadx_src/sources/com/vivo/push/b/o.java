package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: compiled from: OnMessageReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected UnvarnishedMessage f106486a;

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("msg_v1", this.f106486a.unpackToJson());
    }

    public final String d() {
        UnvarnishedMessage unvarnishedMessage = this.f106486a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        String strA = aVar.a("msg_v1");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(strA);
        this.f106486a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(f());
    }

    public final UnvarnishedMessage e() {
        return this.f106486a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnMessageCommand";
    }
}
