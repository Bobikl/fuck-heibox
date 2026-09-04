package com.vivo.push.d;

/* JADX INFO: compiled from: OnUnBindAppReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f106537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f106538b;

    ae(ad adVar, com.vivo.push.b.i iVar) {
        this.f106538b = adVar;
        this.f106537a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f106538b;
        ((z) adVar).f106569b.onUnBind(((com.vivo.push.l) adVar).f106610a, this.f106537a.h(), this.f106537a.d());
    }
}
