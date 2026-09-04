package com.tencent.beacon.base.net.a;

/* JADX INFO: compiled from: JceCall.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f98870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f98871b;

    h(k kVar, b bVar) {
        this.f98871b = kVar;
        this.f98870a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98871b.b(this.f98870a);
    }
}
