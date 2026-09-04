package com.taobao.accs.internal;

import android.content.Intent;
import android.os.Process;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.j;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceImpl.AnonymousClass1 f98294a;

    e(ServiceImpl.AnonymousClass1 anonymousClass1) {
        this.f98294a = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (ServiceImpl.this.f98283c == null || !UtilityImpl.e(ServiceImpl.this.f98283c)) {
                Process.killProcess(Process.myPid());
            } else {
                Intent intent = new Intent();
                intent.setAction("org.agoo.android.intent.action.PING_V4");
                intent.setClassName(ServiceImpl.this.f98283c.getPackageName(), j.channelService);
                ServiceImpl.this.f98283c.startService(intent);
                UTMini.getInstance().commitEvent(66001, "probeServiceEnabled", UtilityImpl.j(ServiceImpl.this.f98283c));
                ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
            }
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
        } catch (Throwable th2) {
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao error........e=" + th2, new Object[0]);
        }
    }
}
