package com.taobao.accs.data;

import com.taobao.accs.ut.monitor.TrafficsMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TrafficsMonitor.a f98259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f98260b;

    e(d dVar, TrafficsMonitor.a aVar) {
        this.f98260b = dVar;
        this.f98259a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f98260b.f98245c;
        if (trafficsMonitor != null) {
            trafficsMonitor.a(this.f98259a);
        }
    }
}
