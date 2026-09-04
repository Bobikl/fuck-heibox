package com.tencent.beacon.a.a;

/* JADX INFO: compiled from: BeaconBus.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f98731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f98732b;

    a(b bVar, c cVar) {
        this.f98732b = bVar;
        this.f98731a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98732b.b(this.f98731a);
    }
}
