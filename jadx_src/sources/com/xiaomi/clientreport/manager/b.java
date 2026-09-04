package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.EventClientReport;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventClientReport f106719a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ a f95a;

    b(a aVar, EventClientReport eventClientReport) {
        this.f95a = aVar;
        this.f106719a = eventClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95a.b(this.f106719a);
    }
}
