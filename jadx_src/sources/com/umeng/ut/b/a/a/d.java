package com.umeng.ut.b.a.a;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f106440a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 = (i10 * 31) + c10;
        }
        return i10;
    }

    public static Map<String, String> a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.umeng.ut.b.a.a.d.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public static String d(String str) {
        return (str == null || "".equals(str)) ? str : f106440a.matcher(str).replaceAll("");
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() <= 0;
    }
}
