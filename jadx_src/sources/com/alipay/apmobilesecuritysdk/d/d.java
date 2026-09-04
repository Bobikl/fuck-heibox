package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static synchronized Map<String, String> a() {
        HashMap map;
        map = new HashMap();
        try {
            new com.alipay.apmobilesecuritysdk.c.b();
            map.put("AE16", "");
        } catch (Throwable unused) {
        }
        return map;
    }

    public static synchronized Map<String, String> a(Context context) {
        HashMap map;
        o4.e.b();
        o4.c.f();
        map = new HashMap();
        map.put("AE1", o4.e.d());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o4.e.e() ? "1" : "0");
        map.put("AE2", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(o4.e.c(context) ? "1" : "0");
        map.put("AE3", sb3.toString());
        map.put("AE4", o4.e.f());
        map.put("AE5", o4.e.g());
        map.put("AE6", o4.e.h());
        map.put("AE7", o4.e.i());
        map.put("AE8", o4.e.j());
        map.put("AE9", o4.e.k());
        map.put("AE10", o4.e.l());
        map.put("AE11", o4.e.m());
        map.put("AE12", o4.e.n());
        map.put("AE13", o4.e.o());
        map.put("AE14", o4.e.p());
        map.put("AE15", o4.e.q());
        map.put("AE21", o4.c.o());
        return map;
    }
}
