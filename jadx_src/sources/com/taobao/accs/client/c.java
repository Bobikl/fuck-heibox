package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ GlobalClientInfo f98200a;

    c(GlobalClientInfo globalClientInfo) {
        this.f98200a = globalClientInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalClientInfo.f98173c = UtilityImpl.m(GlobalClientInfo.f98171a);
    }
}
