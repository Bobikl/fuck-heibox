package com.efs.sdk.net.b;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static long a(Map<String, Long> map, String str, String str2) {
        if (!map.containsKey(str) || !map.containsKey(str2)) {
            return 0L;
        }
        return map.get(str2).longValue() - map.get(str).longValue();
    }
}
