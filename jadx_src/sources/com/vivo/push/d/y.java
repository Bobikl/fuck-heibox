package com.vivo.push.d;

/* JADX INFO: compiled from: OnPublishReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.r f106567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f106568b;

    y(x xVar, com.vivo.push.b.r rVar) {
        this.f106568b = xVar;
        this.f106567a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f106568b;
        ((z) xVar).f106569b.onPublish(((com.vivo.push.l) xVar).f106610a, this.f106567a.h(), this.f106567a.g());
    }
}
