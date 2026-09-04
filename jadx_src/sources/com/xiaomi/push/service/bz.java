package com.xiaomi.push.service;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ by f107982a;

    bz(by byVar) {
        this.f107982a = byVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator it = this.f107982a.f1068a.values().iterator();
            while (it.hasNext()) {
                ((by.a) it.next()).run();
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Sync job exception :" + e10.getMessage());
        }
        this.f107982a.f1069a = false;
    }
}
