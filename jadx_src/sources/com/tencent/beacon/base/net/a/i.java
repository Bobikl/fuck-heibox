package com.tencent.beacon.base.net.a;

/* JADX INFO: compiled from: JceCall.java */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f98872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f98873b;

    i(k kVar, b bVar) {
        this.f98873b = kVar;
        this.f98872a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98873b.b(this.f98872a);
    }
}
