package com.vivo.push.d;

import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: compiled from: OnMessageReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnvarnishedMessage f106556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f106557b;

    q(p pVar, UnvarnishedMessage unvarnishedMessage) {
        this.f106557b = pVar;
        this.f106556a = unvarnishedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f106557b;
        ((z) pVar).f106569b.onTransmissionMessage(((com.vivo.push.l) pVar).f106610a, this.f106556a);
    }
}
