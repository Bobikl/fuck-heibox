package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98487b;

    g(AccsDataListener accsDataListener, boolean z10) {
        this.f98486a = accsDataListener;
        this.f98487b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98486a.onAntiBrush(this.f98487b, null);
    }
}
