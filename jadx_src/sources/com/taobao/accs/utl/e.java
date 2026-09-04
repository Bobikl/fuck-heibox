package com.taobao.accs.utl;

import android.content.Intent;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NetPerformanceMonitor f98473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f98475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f98477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ byte[] f98478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Intent f98479g;

    e(NetPerformanceMonitor netPerformanceMonitor, String str, String str2, AccsDataListener accsDataListener, int i10, byte[] bArr, Intent intent) {
        this.f98473a = netPerformanceMonitor;
        this.f98474b = str;
        this.f98475c = str2;
        this.f98476d = accsDataListener;
        this.f98477e = i10;
        this.f98478f = bArr;
        this.f98479g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        NetPerformanceMonitor netPerformanceMonitor = this.f98473a;
        if (netPerformanceMonitor != null) {
            netPerformanceMonitor.real_to_bz_date = System.currentTimeMillis();
        }
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98474b)) {
            ALog.e(a.TAG, "onResponse start dataId:" + this.f98475c + " serviceId:" + this.f98474b, new Object[0]);
        }
        this.f98476d.onResponse(this.f98474b, this.f98475c, this.f98477e, this.f98478f, a.c(this.f98479g));
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98474b)) {
            ALog.e(a.TAG, "onResponse end dataId:" + this.f98475c, new Object[0]);
        }
        AppMonitor.getInstance().commitStat(this.f98473a);
    }
}
