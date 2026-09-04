package com.taobao.accs.data;

import com.taobao.accs.ut.monitor.TrafficsMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f98261a;

    f(d dVar) {
        this.f98261a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f98261a.f98245c;
        if (trafficsMonitor != null) {
            trafficsMonitor.a();
        }
    }
}
