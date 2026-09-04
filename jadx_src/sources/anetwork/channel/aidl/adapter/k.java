package anetwork.channel.aidl.adapter;

import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements Runnable {
    k() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (i.f30110c) {
            i.f30110c = false;
            ALog.e("anet.RemoteGetter", "binding service timeout. reset status!", null, new Object[0]);
        }
    }
}
