package anet.channel;

import android.content.Intent;
import anet.channel.util.ALog;
import java.util.Iterator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f29600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AccsSessionManager f29601b;

    a(AccsSessionManager accsSessionManager, Intent intent) {
        this.f29601b = accsSessionManager;
        this.f29600a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = AccsSessionManager.f29489c.iterator();
        while (it.hasNext()) {
            try {
                ((ISessionListener) it.next()).onConnectionChanged(this.f29600a);
            } catch (Exception e10) {
                ALog.e("awcn.AccsSessionManager", "notifyListener exception.", null, e10, new Object[0]);
            }
        }
    }
}
