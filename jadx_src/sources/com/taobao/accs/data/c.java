package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f98242a;

    c(a aVar) {
        this.f98242a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f98242a) {
            if (this.f98242a.f98238f == 0) {
                ALog.e("AssembleMessage", l5.a.f130839h0, Constants.KEY_DATA_ID, this.f98242a.f98234b);
                this.f98242a.f98238f = 1;
                this.f98242a.f98240h.clear();
                AppMonitor.getInstance().commitStat(new AssembleMonitor(this.f98242a.f98234b, String.valueOf(this.f98242a.f98238f)));
            }
        }
    }
}
