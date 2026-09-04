package com.taobao.accs.net;

import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaoBaseService.ConnectInfo f98349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AccsConnectStateListener f98350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f98351c;

    n(m mVar, TaoBaseService.ConnectInfo connectInfo, AccsConnectStateListener accsConnectStateListener) {
        this.f98351c = mVar;
        this.f98349a = connectInfo;
        this.f98350b = accsConnectStateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ConnectInfo connectInfo = this.f98349a;
        if (connectInfo.connected) {
            this.f98350b.onConnected(connectInfo);
        } else {
            this.f98350b.onDisconnected(connectInfo);
        }
    }
}
