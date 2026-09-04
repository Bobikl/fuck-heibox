package com.xiaomi.clientreport.manager;

import com.xiaomi.push.by;

/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f106725a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ by f97a;

    h(a aVar, by byVar) {
        this.f106725a = aVar;
        this.f97a = byVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f97a.run();
    }
}
