package com.taobao.accs.data;

import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Intent f98268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f98269d;

    i(g gVar, String str, String str2, Intent intent) {
        this.f98269d = gVar;
        this.f98266a = str;
        this.f98267b = str2;
        this.f98268c = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (g.f98262a == null || !g.f98262a.contains(this.f98266a)) {
            return;
        }
        ALog.e("MsgDistribute", "routing msg time out, try election", Constants.KEY_DATA_ID, this.f98266a, Constants.KEY_SERVICE_ID, this.f98267b);
        g.f98262a.remove(this.f98266a);
        com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", l5.a.f130839h0, "pkg:" + this.f98268c.getPackage());
    }
}
