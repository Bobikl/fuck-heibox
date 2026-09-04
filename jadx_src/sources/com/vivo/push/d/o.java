package com.vivo.push.d;

/* JADX INFO: compiled from: OnLogReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.n f106554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f106555b;

    o(n nVar, com.vivo.push.b.n nVar2) {
        this.f106555b = nVar;
        this.f106554a = nVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f106555b;
        ((z) nVar).f106569b.onLog(((com.vivo.push.l) nVar).f106610a, this.f106554a.d(), this.f106554a.e(), this.f106554a.f());
    }
}
