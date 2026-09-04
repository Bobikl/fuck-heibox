package com.taobao.accs.utl;

import android.content.Intent;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NetPerformanceMonitor f98480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f98482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f98484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Intent f98485f;

    f(NetPerformanceMonitor netPerformanceMonitor, String str, String str2, AccsDataListener accsDataListener, int i10, Intent intent) {
        this.f98480a = netPerformanceMonitor;
        this.f98481b = str;
        this.f98482c = str2;
        this.f98483d = accsDataListener;
        this.f98484e = i10;
        this.f98485f = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        NetPerformanceMonitor netPerformanceMonitor = this.f98480a;
        if (netPerformanceMonitor != null) {
            netPerformanceMonitor.real_to_bz_date = System.currentTimeMillis();
        }
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98481b)) {
            ALog.e(a.TAG, "onSendData start dataId:" + this.f98482c + " serviceId:" + this.f98481b, new Object[0]);
        }
        this.f98483d.onSendData(this.f98481b, this.f98482c, this.f98484e, a.c(this.f98485f));
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98481b)) {
            ALog.e(a.TAG, "onSendData end dataId:" + this.f98482c, new Object[0]);
        }
        AppMonitor.getInstance().commitStat(this.f98480a);
    }
}
