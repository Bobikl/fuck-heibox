package com.tencent.beacon.a.b;

/* JADX INFO: compiled from: BeaconAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f98760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f98761b;

    h(i iVar, Runnable runnable) {
        this.f98761b = iVar;
        this.f98760a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f98760a.run();
        } catch (Throwable th2) {
            if (i.f98764e.addAndGet(1) < 100) {
                g.e().a("599", "[task] run occur error!", th2);
            }
            com.tencent.beacon.base.util.e.a(th2.getMessage());
            com.tencent.beacon.base.util.c.a(th2);
        }
    }
}
