package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.tools.ant.util.h1;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f29866t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String[] f29859m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile Context f29847a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile boolean f29848b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile NetworkStatusHelper.NetworkStatus f29849c = NetworkStatusHelper.NetworkStatus.NONE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile String f29850d = "unknown";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile String f29851e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile String f29852f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile String f29853g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static volatile String f29854h = "unknown";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static volatile String f29855i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static volatile Pair<String, Integer> f29856j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static volatile boolean f29857k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static volatile List<InetAddress> f29858l = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile boolean f29860n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile boolean f29861o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static ConnectivityManager f29862p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static TelephonyManager f29863q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static WifiManager f29864r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static SubscriptionManager f29865s = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static BroadcastReceiver f29867u = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor$2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.NetworkStatusMonitor", "receiver:" + intent.getAction(), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new d(this));
        }
    };

    b() {
    }

    private static NetworkStatusHelper.NetworkStatus a(int i10, String str) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                return (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) ? NetworkStatusHelper.NetworkStatus.G3 : NetworkStatusHelper.NetworkStatus.NONE;
        }
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains("uniwap")) {
                return "uniwap";
            }
            if (lowerCase.contains("3gwap")) {
                return "3gwap";
            }
            if (lowerCase.contains("ctwap")) {
                return "ctwap";
            }
            if (lowerCase.contains("cmnet")) {
                return "cmnet";
            }
            if (lowerCase.contains("uninet")) {
                return "uninet";
            }
            if (lowerCase.contains("3gnet")) {
                return "3gnet";
            }
            if (lowerCase.contains("ctnet")) {
                return "ctnet";
            }
        }
        return "unknown";
    }

    static void a() {
        if (f29860n || f29847a == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            f29847a.registerReceiver(f29867u, intentFilter);
        } catch (Exception unused) {
            ALog.e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
        }
        d();
        f29860n = true;
    }

    private static void a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f29849c = networkStatus;
        f29850d = str;
        f29851e = "";
        f29852f = "";
        f29853g = "";
        f29856j = null;
        f29854h = "";
        f29855i = "";
    }

    static void b() {
        if (f29847a != null) {
            f29847a.unregisterReceiver(f29867u);
        }
    }

    private static boolean b(String str) {
        return f29847a.checkSelfPermission(str) == 0;
    }

    static void c() {
        if (Build.VERSION.SDK_INT < 24 || f29861o) {
            return;
        }
        NetworkInfo networkInfoE = e();
        f29848b = networkInfoE != null && networkInfoE.isConnected();
        f29862p.registerDefaultNetworkCallback(new c());
        f29861o = true;
    }

    static void d() {
        NetworkInfo networkInfoE;
        boolean z10;
        WifiInfo wifiInfoI;
        ALog.d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f29849c;
        String str = f29851e;
        String str2 = f29852f;
        try {
            try {
                networkInfoE = e();
                z10 = false;
            } catch (Exception e10) {
                ALog.e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e10, new Object[0]);
                a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfoE = null;
                z10 = true;
            }
            if (!z10) {
                if (networkInfoE == null || !networkInfoE.isConnected()) {
                    a(NetworkStatusHelper.NetworkStatus.NO, "no network");
                    ALog.i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
                } else {
                    ALog.i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfoE.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfoE.isAvailable()), "info.getType", Integer.valueOf(networkInfoE.getType()));
                    if (networkInfoE.getType() == 0) {
                        String subtypeName = networkInfoE.getSubtypeName();
                        String strReplace = TextUtils.isEmpty(subtypeName) ? "" : subtypeName.replace(" ", "");
                        a(a(networkInfoE.getSubtype(), strReplace), strReplace);
                        f29851e = a(networkInfoE.getExtraInfo());
                        h();
                    } else if (networkInfoE.getType() == 1) {
                        a(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        if (AwcnConfig.isWifiInfoEnable() && (wifiInfoI = i()) != null && b("android.permission.ACCESS_FINE_LOCATION")) {
                            f29853g = wifiInfoI.getBSSID();
                            f29852f = wifiInfoI.getSSID();
                        }
                        f29854h = "wifi";
                        f29855i = "wifi";
                        f29856j = j();
                    } else {
                        a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    f29857k = networkInfoE.isRoaming();
                    anet.channel.util.c.e();
                }
            }
            if (f29849c == networkStatus && f29851e.equalsIgnoreCase(str) && f29852f.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f29849c);
        } catch (Exception e11) {
            ALog.e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e11, new Object[0]);
        }
    }

    static NetworkInfo e() {
        if (f29862p == null) {
            f29862p = (ConnectivityManager) f29847a.getSystemService("connectivity");
        }
        return f29862p.getActiveNetworkInfo();
    }

    static String f() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            for (String str : f29859m) {
                String str2 = (String) method.invoke(null, str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static int g() {
        if (f29862p == null || Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        return f29862p.getRestrictBackgroundStatus();
    }

    private static void h() {
        try {
            if (AwcnConfig.isCarrierInfoEnable() && b("android.permission.READ_PHONE_STATE")) {
                if (f29863q == null) {
                    f29863q = (TelephonyManager) f29847a.getSystemService(g0.a.f118921e);
                }
                f29855i = f29863q.getSimOperator();
                if (f29865s == null) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(f29847a);
                    f29865s = subscriptionManagerFrom;
                    f29866t = subscriptionManagerFrom.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                Method method = f29866t;
                if (method != null) {
                    f29854h = ((SubscriptionInfo) method.invoke(f29865s, new Object[0])).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static WifiInfo i() {
        try {
            if (f29864r == null) {
                f29864r = (WifiManager) f29847a.getSystemService("wifi");
            }
            return f29864r.getConnectionInfo();
        } catch (Throwable th2) {
            ALog.e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th2, new Object[0]);
            return null;
        }
    }

    private static Pair<String, Integer> j() {
        try {
            String property = System.getProperty(h1.f136786c);
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty(h1.f136787d))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
