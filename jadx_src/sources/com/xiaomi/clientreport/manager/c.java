package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.PerfClientReport;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PerfClientReport f106720a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ a f96a;

    c(a aVar, PerfClientReport perfClientReport) {
        this.f96a = aVar;
        this.f106720a = perfClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96a.b(this.f106720a);
    }
}
