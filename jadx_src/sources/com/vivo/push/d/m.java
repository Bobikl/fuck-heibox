package com.vivo.push.d;

/* JADX INFO: compiled from: OnListTagReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.m f106552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f106553b;

    m(l lVar, com.vivo.push.b.m mVar) {
        this.f106553b = lVar;
        this.f106552a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f106553b;
        ((z) lVar).f106569b.onListTags(((com.vivo.push.l) lVar).f106610a, this.f106552a.h(), this.f106552a.d(), this.f106552a.g());
    }
}
