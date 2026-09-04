package com.google.common.escape;

import com.google.common.base.w;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: ArrayBasedEscaperMap.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[][] f58247b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[][] f58248a;

    private b(char[][] cArr) {
        this.f58248a = cArr;
    }

    public static b a(Map<Character, String> map) {
        return new b(b(map));
    }

    @o9.d
    static char[][] b(Map<Character, String> map) {
        w.E(map);
        if (map.isEmpty()) {
            return f58247b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }

    char[][] c() {
        return this.f58248a;
    }
}
