package com.igexin.push.config;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SDKUrlConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f63405b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f63406c = "HZ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile String f63408e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f63404a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String[] f63407d = {"socket://sdk.open.talk.igexin.com:5224", "socket://sdk.open.talk.getui.net:5224", "socket://sdk.open.talk.gepush.com:5224"};
    public static String[] XFR_ADDRESS_BAK = {"socket://43.231.145.10:5224"};
    public static String[] BI_ADDRESS_IPS = {"https://sdk-open-phone.getui.com/api.php"};
    public static String[] CONFIG_ADDRESS_IPS = {"https://c-hzgt2.getui.com/api.php"};
    public static String[] STATE_ADDRESS_IPS = {"https://s-gt.getui.com/api.php"};

    public static String getBiUploadServiceUrl() {
        return BI_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getCmAddress() {
        return f63408e == null ? f63407d[0] : f63408e;
    }

    public static String getConfigServiceUrl() {
        return CONFIG_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static List<String> getDefaultXfrList() {
        String[] xfrAddress = getXfrAddress();
        ArrayList arrayList = new ArrayList();
        for (String str : xfrAddress) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String[] getIdcConfigUrl() {
        return f63405b;
    }

    public static String getLocation() {
        return f63406c;
    }

    public static String getStatServiceUrl() {
        return STATE_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String[] getXfrAddress() {
        String[] strArr;
        synchronized (f63404a) {
            strArr = f63407d;
        }
        return strArr;
    }

    public static boolean hasMultipleXfr() {
        return getDefaultXfrList().size() > 1;
    }

    public static void setCmAddress(String str) {
        com.igexin.a.a.c.b.a("set cm address : " + str, new Object[0]);
        f63408e = str;
    }

    public static void setIdcConfigUrl(String[] strArr) {
        f63405b = strArr;
    }

    public static void setLocation(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.igexin.push.core.d.f63668b = str;
        f63406c = str;
    }

    public static void setXfrAddressIps(String[] strArr) {
        synchronized (f63404a) {
            f63407d = strArr;
        }
    }
}
