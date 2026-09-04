package com.tencent.beacon.d;

import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FragmentTime.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Long> f98957a = new HashMap();

    public static void a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f98957a.put(str, Long.valueOf(jCurrentTimeMillis));
        com.tencent.beacon.base.util.c.a("[page] onPageIn cost time: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static void b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, Long> map = f98957a;
        if (map == null) {
            com.tencent.beacon.base.util.c.e("[page] please call 'onPageIn' first!", new Object[0]);
            return;
        }
        Long l10 = map.get(str);
        if (l10 == null) {
            com.tencent.beacon.base.util.c.e("[page] please call 'onPageIn' first!", new Object[0]);
            return;
        }
        ((StatModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STAT)).a(str, jCurrentTimeMillis - l10.longValue(), jCurrentTimeMillis);
        f98957a.remove(str);
        com.tencent.beacon.base.util.c.a("[page] onPageOut cost time: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
