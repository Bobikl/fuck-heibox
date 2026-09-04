package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends ConnectivityManager.NetworkCallback {
    c() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        b.f29848b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        b.f29858l = new ArrayList(linkProperties.getDnsServers());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        ALog.i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        b.f29848b = false;
    }
}
