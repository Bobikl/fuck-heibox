package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f98490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f98491d;

    h(AccsDataListener accsDataListener, String str, boolean z10, boolean z11) {
        this.f98488a = accsDataListener;
        this.f98489b = str;
        this.f98490c = z10;
        this.f98491d = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98488a.onConnected(new TaoBaseService.ConnectInfo(this.f98489b, this.f98490c, this.f98491d));
    }
}
