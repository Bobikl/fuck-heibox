package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anet.channel.util.g;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkStatusHelper {
    private static final String TAG = "awcn.NetworkStatusHelper";
    static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: Taobao */
    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    /* JADX INFO: compiled from: Taobao */
    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;

        public String getType() {
            if (this == G2) {
                return d4.d.f108135c;
            }
            if (this == G3) {
                return d4.d.f108136d;
            }
            if (this == G4) {
                return d4.d.f108137e;
            }
            return this == G5 ? "5G" : toString();
        }

        public boolean isMobile() {
            return this == G2 || this == G3 || this == G4 || this == G5;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static String getApn() {
        return b.f29851e;
    }

    public static String getCarrier() {
        return b.f29854h;
    }

    public static String getDnsServerAddress() {
        return !b.f29858l.isEmpty() ? b.f29858l.get(0).getHostAddress() : b.f();
    }

    public static String getNetworkSubType() {
        return b.f29850d;
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = b.f29849c;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return WebviewFragment.A4;
        }
        if (networkStatus.isMobile() && b.f29851e.contains("wap")) {
            return "wap";
        }
        return (!networkStatus.isMobile() || g.a() == null) ? "" : "auth";
    }

    public static int getRestrictBackgroundStatus() {
        return b.g();
    }

    public static String getSimOp() {
        return b.f29855i;
    }

    public static NetworkStatus getStatus() {
        return b.f29849c;
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String strMd5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            return "WIFI$" + (TextUtils.isEmpty(strMd5ToHex) ? "" : strMd5ToHex);
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + getApn();
    }

    public static String getWifiBSSID() {
        return b.f29853g;
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (b.f29849c != NetworkStatus.WIFI) {
            return null;
        }
        return b.f29856j;
    }

    public static String getWifiSSID() {
        return b.f29852f;
    }

    public static boolean isConnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (b.f29848b) {
                return true;
            }
        } else if (b.f29849c != NetworkStatus.NO) {
            return true;
        }
        try {
            NetworkInfo networkInfoE = b.e();
            return networkInfoE != null && networkInfoE.isConnected();
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = b.f29849c;
        String str = b.f29851e;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return true;
        }
        if (networkStatus.isMobile()) {
            return str.contains("wap") || g.a() != null;
        }
        return false;
    }

    public static boolean isRoaming() {
        return b.f29857k;
    }

    static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new a(networkStatus));
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("\nNetwork detail*******************************\n");
            sb2.append("Status: ");
            sb2.append(status.getType());
            sb2.append('\n');
            sb2.append("Subtype: ");
            sb2.append(getNetworkSubType());
            sb2.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb2.append("Apn: ");
                    sb2.append(getApn());
                    sb2.append('\n');
                    sb2.append("Carrier: ");
                    sb2.append(getCarrier());
                    sb2.append('\n');
                } else {
                    sb2.append("BSSID: ");
                    sb2.append(getWifiBSSID());
                    sb2.append('\n');
                    sb2.append("SSID: ");
                    sb2.append(getWifiSSID());
                    sb2.append('\n');
                }
            }
            if (isProxy()) {
                sb2.append("Proxy: ");
                sb2.append(getProxyType());
                sb2.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb2.append("ProxyHost: ");
                    sb2.append((String) wifiProxy.first);
                    sb2.append('\n');
                    sb2.append("ProxyPort: ");
                    sb2.append(wifiProxy.second);
                    sb2.append('\n');
                }
            }
            sb2.append("*********************************************");
            ALog.i(TAG, sb2.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    public static synchronized void startListener(Context context) {
        try {
            if (context == null) {
                throw new NullPointerException("context is null");
            }
            b.f29847a = context;
            b.a();
            b.c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void stopListener(Context context) {
        b.b();
    }
}
