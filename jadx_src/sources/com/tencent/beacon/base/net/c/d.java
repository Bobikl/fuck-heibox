package com.tencent.beacon.base.net.c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.p0;
import androidx.annotation.z0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.RequestPackage;
import com.umeng.socialize.common.SocializeConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NetUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, String> f98924a;

    public static RequestPackage a(int i10, byte[] bArr, Map<String, String> map, String str) {
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        com.tencent.beacon.a.c.e eVarL = com.tencent.beacon.a.c.e.l();
        RequestPackage requestPackage = new RequestPackage();
        requestPackage.model = f.e().h();
        requestPackage.osVersion = eVarL.s();
        requestPackage.platformId = cVarD.h();
        requestPackage.appkey = str;
        requestPackage.appVersion = com.tencent.beacon.a.c.b.a();
        requestPackage.sdkId = cVarD.i();
        requestPackage.sdkVersion = cVarD.j();
        requestPackage.cmd = i10;
        requestPackage.encryType = (byte) 3;
        requestPackage.zipType = (byte) 2;
        requestPackage.sBuffer = bArr;
        requestPackage.reserved = b(map);
        return requestPackage;
    }

    public static synchronized Map<String, String> a() {
        if (f98924a == null) {
            HashMap map = new HashMap(4);
            f98924a = map;
            map.put("wup_version", SocializeConstants.PROTOCOL_VERSON);
            f98924a.put("TYPE_COMPRESS", String.valueOf(2));
            f98924a.put("encr_type", "rsapost");
            g gVarB = g.b();
            if (gVarB != null) {
                f98924a.put("bea_key", gVarB.d());
            }
        }
        return f98924a;
    }

    @p0
    public static Map<String, String> a(String str, Map<String, String> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        int i10 = 0;
        int length = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            int length2 = strValueOf.trim().length();
            if (length2 <= 0 || !a(strValueOf)) {
                i10 = 0;
                com.tencent.beacon.base.util.c.e("[core] '%s' should be ASCII code in 32-126!", strValueOf);
                com.tencent.beacon.a.b.g.e().a("102", "[event] eventName: " + str + ", key: " + strValueOf + " should be ASCII code in 32-126!");
            } else {
                String strTrim = strValueOf.trim();
                if (length2 > 64) {
                    strTrim = strTrim.substring(i10, 64);
                    String str2 = "[event] eventName: " + str + ", key: " + strTrim + " should be less than 64!";
                    com.tencent.beacon.a.b.g.e().a("102", str2);
                    com.tencent.beacon.base.util.e.a(str2);
                }
                String strReplace = strTrim.replace("|", "%7C").replace("&", "%26").replace(ContainerUtils.KEY_VALUE_DELIMITER, "%3D");
                String strTrim2 = String.valueOf(entry.getValue()).trim();
                if (strTrim2.length() > 10240) {
                    String str3 = "[event] eventName: " + str + ", key: " + strReplace + "'s value > 10K.";
                    com.tencent.beacon.a.b.g.e().a("103", str3);
                    com.tencent.beacon.base.util.e.a(str3);
                    strTrim2 = strTrim2.substring(0, 10240);
                }
                String strReplace2 = strTrim2.replace('\n', ' ').replace('\r', ' ').replace("|", "%7C").replace("&", "%26").replace(ContainerUtils.KEY_VALUE_DELIMITER, "%3D");
                map2.put(strReplace, strReplace2);
                length += strReplace.length() + strReplace2.length();
                i10 = 0;
            }
        }
        if (length <= 46080) {
            return map2;
        }
        String str4 = "[event] eventName: " + str + " params > 45K";
        com.tencent.beacon.a.b.g.e().a("104", str4);
        com.tencent.beacon.base.util.e.a(str4);
        return null;
    }

    public static void a(long j10, long j11, String str) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "fixBeaconInfo, serverTime: " + j11 + ",ip: " + str, new Object[0]);
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        cVarD.b(str);
        cVarD.a(j11 - ((j10 + new Date().getTime()) / 2));
    }

    private static void a(String str, String str2) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "update strategy sid: %s, max_time: %s", str, str2);
        g.b().a(str, str2);
    }

    public static boolean a(String str) {
        int length = str.length();
        boolean z10 = true;
        while (true) {
            length--;
            if (length < 0) {
                return z10;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < ' ' || cCharAt >= 127) {
                z10 = false;
            }
        }
    }

    public static boolean a(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        if (map.containsKey("encrypt-status")) {
            com.tencent.beacon.base.util.c.a("[BeaconNet]", "parse response header fail! cause by svr encrypt error!", new Object[0]);
            return false;
        }
        if (!map.containsKey("session_id") || !map.containsKey("max_time")) {
            return true;
        }
        List<String> list = map.get("session_id");
        List<String> list2 = map.get("max_time");
        String str = list != null ? list.get(0) : null;
        String str2 = list2 != null ? list2.get(0) : null;
        if (str == null || str2 == null) {
            return true;
        }
        a(str, str2);
        return true;
    }

    @z0("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.tencent.beacon.a.c.c.d().c().getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.trim().length() <= 0 || !a(key)) {
                com.tencent.beacon.base.util.c.e("[core] '%s' should be ASCII code in 32-126!", key);
            } else {
                String strTrim = key.trim();
                sb2.append("&");
                sb2.append(strTrim.replace("|", "%7C").replace("&", "%26").replace(ContainerUtils.KEY_VALUE_DELIMITER, "%3D"));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                String value = entry.getValue();
                if (value != null) {
                    sb2.append(value.trim().replace('\n', ' ').replace('\r', ' ').replace("|", "%7C").replace("&", "%26").replace(ContainerUtils.KEY_VALUE_DELIMITER, "%3D"));
                }
            }
        }
        return sb2.length() > 0 ? sb2.substring(1) : "";
    }

    public static String c() {
        NetworkInfo networkInfoB = b();
        if (networkInfoB == null) {
            return "unknown";
        }
        if (networkInfoB.getType() == 1) {
            return "wifi";
        }
        String extraInfo = networkInfoB.getExtraInfo();
        if (extraInfo != null && extraInfo.length() > 64) {
            extraInfo = extraInfo.substring(0, 64);
        }
        return "" + extraInfo;
    }

    public static void c(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey("encrypt-status")) {
                com.tencent.beacon.base.util.c.a("[BeaconNet]", "parse response header fail! cause by svr encrypt error!", new Object[0]);
            }
            if (map.containsKey("session_id") && map.containsKey("max_time")) {
                a(map.get("session_id"), map.get("max_time"));
            }
        }
    }

    public static boolean d() {
        NetworkInfo networkInfoB = b();
        return networkInfoB != null && networkInfoB.isConnected();
    }
}
