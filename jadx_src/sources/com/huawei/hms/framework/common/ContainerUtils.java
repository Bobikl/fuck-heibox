package com.huawei.hms.framework.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[RETURN] */
    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        boolean z10;
        if (map == map2) {
            return true;
        }
        if (map != null && map2 != null && map.size() == map2.size()) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (map2.get(entry.getKey()) != entry.getValue()) {
                    z10 = true;
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (K k10 : list) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append("&");
            }
            sb2.append(k10.toString());
            i10 = i11;
        }
        return sb2.toString();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append("&");
            }
            sb2.append(entry.getKey().toString());
            sb2.append(KEY_VALUE_DELIMITER);
            sb2.append(entry.getValue().toString());
            i10 = i11;
        }
        return sb2.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (K k10 : set) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append("&");
            }
            sb2.append(k10.toString());
            i10 = i11;
        }
        return sb2.toString();
    }
}
