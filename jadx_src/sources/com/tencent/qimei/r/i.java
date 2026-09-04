package com.tencent.qimei.r;

/* JADX INFO: compiled from: QimeiQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f101396a;

    public i(j jVar) {
        this.f101396a = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.qimei.u.a(this.f101396a.f101405i).I();
    }
}
