package com.tencent.qimei.y;

/* JADX INFO: compiled from: X5Browser.java */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f101546a;

    public l(m mVar) {
        this.f101546a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101546a.c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
