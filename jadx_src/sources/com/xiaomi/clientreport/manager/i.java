package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bz;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f106726a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ bz f98a;

    i(a aVar, bz bzVar) {
        this.f106726a = aVar;
        this.f98a = bzVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98a.run();
    }
}
