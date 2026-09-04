package com.apm.lite.k;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f40076a;

    public static Float a(Map<? super String, Float> map) {
        float fFloatValue = 0.0f;
        for (Float f10 : map.values()) {
            if (f10 != null) {
                fFloatValue += f10.floatValue();
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static Long b(Map<? super String, Long> map, String str, Long l10) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l11 = map.get(str);
        if (l11 != null) {
            l10 = Long.valueOf(l11.longValue() + l10.longValue());
        }
        map.put(str, l10);
        return l10;
    }

    public static boolean c(int i10) {
        return false;
    }

    public static int d(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 16;
        }
        if (i10 == 3) {
            return 32;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 128;
        }
        return 64;
    }
}
