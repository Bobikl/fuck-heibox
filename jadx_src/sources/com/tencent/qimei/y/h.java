package com.tencent.qimei.y;

/* JADX INFO: compiled from: SysBrowser.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f101540a;

    public h(i iVar) {
        this.f101540a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101540a.b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
