package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.exoplayer2.text.ttml.d;
import com.google.android.material.timepicker.TimeModel;
import g0.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.util.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111lI1l {
    private static final int l111l11111I1l = -1;
    private static final int l111l11111Il = -101;
    private Context l1111l111111Il;
    private Object l111l11111lIl = null;

    public l111l1111lI1l() {
        this.l1111l111111Il = null;
        try {
            this.l1111l111111Il = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        } catch (Exception unused) {
        }
    }

    private static String l1111l111111Il(int i10) {
        if (i10 == -101) {
            return "wifi";
        }
        switch (i10) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(i10));
        }
    }

    public static String l111l1111l1Il() {
        try {
            String property = System.getProperty(h1.f136786c);
            String property2 = System.getProperty(h1.f136787d);
            if (TextUtils.isEmpty(property2)) {
                property2 = "-1";
            }
            if (TextUtils.isEmpty(property)) {
                return "";
            }
            return property + ":" + property2;
        } catch (Exception unused) {
            return "";
        }
    }

    private void l111l1111lI1l() {
        Object objL1111l111111Il;
        try {
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context == null || (objL1111l111111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context, "getSystemService", new Class[]{String.class}, new Object[]{"wifi"})) == null || this.l111l11111lIl != null) {
                return;
            }
            this.l111l11111lIl = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(objL1111l111111Il, "getConnectionInfo");
        } catch (Exception unused) {
        }
    }

    private String l111l1111lIl() {
        int networkType;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.l1111l111111Il.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    networkType = -101;
                } else {
                    networkType = type == 0 ? ((TelephonyManager) this.l1111l111111Il.getSystemService(a.f118921e)).getNetworkType() : 0;
                }
            } else {
                networkType = -1;
            }
        } catch (Exception unused) {
        }
        if (networkType == -101) {
            return "wifi";
        }
        switch (networkType) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(networkType));
        }
    }

    public static Map<String, Long> l111l1111llIl() {
        HashMap map = new HashMap(5);
        map.put("mr", Long.valueOf(TrafficStats.getMobileRxBytes()));
        map.put("mt", Long.valueOf(TrafficStats.getMobileTxBytes()));
        map.put("tr", Long.valueOf(TrafficStats.getTotalRxBytes()));
        map.put(d.f49795n, Long.valueOf(TrafficStats.getTotalTxBytes()));
        return map;
    }

    public final String l1111l111111Il() {
        String str;
        try {
            if (!com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111lIl("android.permission.ACCESS_WIFI_STATE")) {
                return "";
            }
            l111l1111lI1l();
            Object obj = this.l111l11111lIl;
            return (obj == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getSSID")) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111I1l() {
        String ipAddress;
        try {
            l111l1111lI1l();
            Object obj = this.l111l11111lIl;
            return (obj == null || (ipAddress = Formatter.formatIpAddress(((Integer) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getIpAddress")).intValue())) == null) ? "" : ipAddress;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111Il() {
        String strL111l1111lIl;
        try {
            return (this.l1111l111111Il == null || (strL111l1111lIl = l111l1111lIl()) == null) ? "" : strL111l1111lIl;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111lIl() {
        String str;
        try {
            if (!com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111lIl("android.permission.ACCESS_WIFI_STATE")) {
                return "";
            }
            l111l1111lI1l();
            Object obj = this.l111l11111lIl;
            return (obj == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getBSSID")) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }
}
