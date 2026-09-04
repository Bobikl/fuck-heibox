package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f29664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f29665b;

    m(l lVar, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f29665b = lVar;
        this.f29664a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            NetworkStatusHelper.NetworkStatus networkStatus = this.f29664a;
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NO && networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                this.f29665b.f29663a.a(NetworkStatusHelper.getUniqueId(networkStatus));
            }
        } catch (Throwable th2) {
            ALog.e("anet.MTUDetector", "MTU detecet fail.", null, th2, new Object[0]);
        }
    }
}
