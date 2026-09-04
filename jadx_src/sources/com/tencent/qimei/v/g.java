package com.tencent.qimei.v;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: StrategyDataCache.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f101456a = new ConcurrentHashMap();

    public static String a(String str) {
        return f101456a.get(str);
    }

    public static void a(String str, String str2) {
        f101456a.put(str, str2);
    }
}
