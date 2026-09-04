package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f38170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f38171b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = (String) arrayList.get(i10);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            if (i10 != 0) {
                str3 = "&";
            }
            sb2.append(str3);
            sb2.append(str);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(str2);
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        if (f38170a == null) {
            c(context, map);
        }
        f38170a.putAll(d.a());
        return f38170a;
    }

    public static synchronized void a() {
        f38170a = null;
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        TreeMap treeMap;
        a(context, map);
        treeMap = new TreeMap();
        for (String str : f38171b) {
            if (f38170a.containsKey(str)) {
                treeMap.put(str, f38170a.get(str));
            }
        }
        return d6.b.a(a(treeMap));
    }

    public static synchronized void c(Context context, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        f38170a = treeMap;
        treeMap.putAll(b.a(context, map));
        f38170a.putAll(d.a(context));
        f38170a.putAll(c.a(context));
        f38170a.putAll(a.a(context, map));
    }
}
