package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f98334a;

    j(i iVar) {
        this.f98334a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyCenter.getInstance().saveData();
    }
}
