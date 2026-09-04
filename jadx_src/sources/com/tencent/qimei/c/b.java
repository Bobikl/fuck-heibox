package com.tencent.qimei.c;

import com.tencent.qimei.l.e;

/* JADX INFO: compiled from: BeaconAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f101210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f101211b;

    public b(c cVar, Runnable runnable) {
        this.f101211b = cVar;
        this.f101210a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101210a.run();
        } catch (Throwable th2) {
            e.a(th2.getMessage());
            com.tencent.qimei.n.a.a(th2);
        }
    }
}
