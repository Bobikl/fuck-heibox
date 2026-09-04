package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* JADX INFO: compiled from: OnNotifyArrivedReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InsideNotificationItem f106492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106493b;

    public q() {
        super(4);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        String strB = com.vivo.push.util.q.b(this.f106492a);
        this.f106493b = strB;
        aVar.a("notification_v1", strB);
    }

    public final InsideNotificationItem d() {
        return this.f106492a;
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        String strA = aVar.a("notification_v1");
        this.f106493b = strA;
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        InsideNotificationItem insideNotificationItemA = com.vivo.push.util.q.a(this.f106493b);
        this.f106492a = insideNotificationItemA;
        if (insideNotificationItemA != null) {
            insideNotificationItemA.setMsgId(f());
        }
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.f106493b)) {
            return this.f106493b;
        }
        InsideNotificationItem insideNotificationItem = this.f106492a;
        if (insideNotificationItem == null) {
            return null;
        }
        return com.vivo.push.util.q.b(insideNotificationItem);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }
}
