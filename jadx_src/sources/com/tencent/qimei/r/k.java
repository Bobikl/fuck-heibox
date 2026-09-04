package com.tencent.qimei.r;

import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;

/* JADX INFO: compiled from: QimeiSDKInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAsyncQimeiListener f101410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f101411b;

    public k(n nVar, IAsyncQimeiListener iAsyncQimeiListener) {
        this.f101411b = nVar;
        this.f101410a = iAsyncQimeiListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        Qimei qimei = this.f101411b.getQimei();
        if (qimei == null || qimei.isEmpty()) {
            this.f101411b.a(this.f101410a);
        } else {
            this.f101410a.onQimeiDispatch(qimei);
        }
    }
}
