package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static String f37959c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static String[] f32a = {"203.107.1.1"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f37958b = {"203.107.1.97", "203.107.1.100", "httpdns-sc.aliyuncs.com"};

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    static final String[] f33c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f37960d = "80";
    static String PROTOCOL = "http://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f37957a = 15000;
    static Map<String, String> extra = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static List<IPProbeItem> f31a = null;

    static synchronized void a(List<IPProbeItem> list) {
        f31a = list;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    static synchronized boolean a(String[] strArr) {
        boolean z10;
        if (strArr == null) {
            z10 = false;
        } else if (strArr.length != 0) {
            f32a = strArr;
            i.d("serverIps:" + Arrays.toString(f32a));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    static synchronized void c(String str) {
        f37959c = str;
    }

    static synchronized void clearSdnsGlobalParams() {
        extra.clear();
    }

    static synchronized void setHTTPSRequestEnabled(boolean z10) {
        String str;
        try {
            if (z10) {
                PROTOCOL = "https://";
                str = "443";
            } else {
                PROTOCOL = "http://";
                str = "80";
            }
            f37960d = str;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static synchronized void setSdnsGlobalParams(Map<String, String> map) {
        extra.putAll(map);
    }

    static synchronized void setTimeoutInterval(int i10) {
        if (i10 > 0) {
            f37957a = i10;
        }
    }
}
