package com.tencent.qimei.y;

/* JADX INFO: compiled from: JsLock.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101530a = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f101531b = new Object();

    public void a() {
        synchronized (this.f101531b) {
            this.f101531b.notify();
        }
    }

    public void b() {
        try {
            synchronized (this.f101531b) {
                this.f101531b.wait(30000L);
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }
}
