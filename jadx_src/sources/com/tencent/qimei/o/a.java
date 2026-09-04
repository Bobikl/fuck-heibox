package com.tencent.qimei.o;

import com.tencent.qimei.d.e;

/* JADX INFO: compiled from: MultiAppKeyDeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f101291b;

    public a(d dVar, e eVar) {
        this.f101291b = dVar;
        this.f101290a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.qimei.v.d.a(this.f101291b.f101297b).g()) {
            this.f101291b.b(this.f101290a);
        } else {
            this.f101290a.a(2);
        }
    }
}
