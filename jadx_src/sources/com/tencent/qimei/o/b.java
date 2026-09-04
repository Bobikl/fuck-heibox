package com.tencent.qimei.o;

import com.tencent.qimei.d.e;

/* JADX INFO: compiled from: MultiAppKeyDeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f101293b;

    public b(d dVar, e eVar) {
        this.f101293b = dVar;
        this.f101292a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f101293b.f101298c) {
            if (!this.f101293b.f101299d) {
                com.tencent.qimei.d.d.l().f101230d = 10L;
                this.f101292a.a(4);
                this.f101293b.f101299d = true;
            }
        }
    }
}
