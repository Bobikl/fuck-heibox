package cn.fly.verify;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class ap {
    public static void a() {
        if (as.d(ax.g()) && as.b(ax.g()) && fz.d.l().equalsIgnoreCase(as.b("4F50706F")) && Build.VERSION.SDK_INT <= 28 && ai.a().h() == 0 && !aq.i()) {
            try {
                a(ax.g().getApplicationContext());
                f.a().b("[FlyVerify] ==>%s", "oppo reconnect");
            } catch (Exception e10) {
                f.a().c(e10);
            }
        }
    }

    public static void a(Context context) {
        WifiManager wifiManager;
        if (context == null || (wifiManager = (WifiManager) fz.d.a("wifi")) == null) {
            return;
        }
        int networkId = wifiManager.getConnectionInfo().getNetworkId();
        wifiManager.disableNetwork(networkId);
        wifiManager.disconnect();
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e10) {
            f.a().b("[FlyVerify] ==>%s", "reconnect wifi interrupted " + e10.getMessage());
        }
        wifiManager.enableNetwork(networkId, true);
        wifiManager.reconnect();
    }
}
