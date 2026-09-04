package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f98494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f98495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f98496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f98497f;

    i(AccsDataListener accsDataListener, String str, boolean z10, boolean z11, int i10, String str2) {
        this.f98492a = accsDataListener;
        this.f98493b = str;
        this.f98494c = z10;
        this.f98495d = z11;
        this.f98496e = i10;
        this.f98497f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98492a.onDisconnected(new TaoBaseService.ConnectInfo(this.f98493b, this.f98494c, this.f98495d, this.f98496e, this.f98497f));
    }
}
