package com.tencent.beacon.e;

/* JADX INFO: compiled from: StrategyHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f99018a;

    e(g gVar) {
        this.f99018a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f99018a.f99024c != null) {
            g gVar = this.f99018a;
            gVar.a(gVar.f99024c);
        }
    }
}
