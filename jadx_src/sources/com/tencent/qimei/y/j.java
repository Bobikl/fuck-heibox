package com.tencent.qimei.y;

/* JADX INFO: compiled from: X5Browser.java */
/* JADX INFO: loaded from: classes4.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f101543a;

    public j(m mVar) {
        this.f101543a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101543a.a();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
