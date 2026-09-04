package anet.channel.status;

import anet.channel.util.ALog;
import com.google.android.gms.common.internal.s;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f29846a;

    a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f29846a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            for (NetworkStatusHelper.INetworkStatusChangeListener iNetworkStatusChangeListener : NetworkStatusHelper.listeners) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                iNetworkStatusChangeListener.onNetworkStatusChanged(this.f29846a);
                if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                    ALog.e("awcn.NetworkStatusHelper", "call back cost too much time", null, s.a.f52543a, iNetworkStatusChangeListener);
                }
            }
        } catch (Exception unused) {
        }
    }
}
