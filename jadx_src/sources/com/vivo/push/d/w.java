package com.vivo.push.d;

import com.vivo.push.model.UPSNotificationMessage;

/* JADX INFO: compiled from: OnNotificationClickTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f106565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f106566b;

    w(u uVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f106566b = uVar;
        this.f106565a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f106566b;
        ((z) uVar).f106569b.onNotificationMessageClicked(((com.vivo.push.l) uVar).f106610a, this.f106565a);
    }
}
