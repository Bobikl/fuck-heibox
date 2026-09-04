package com.alipay.deviceid.module.x;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: DeviceInfoManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f38339b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f38340a = null;

    public static d a() {
        if (f38339b == null) {
            synchronized (d.class) {
                if (f38339b == null) {
                    f38339b = new d();
                }
            }
        }
        return f38339b;
    }

    public final String a(Context context) {
        String string;
        b(context);
        Map<String, String> map = this.f38340a;
        if (map == null) {
            string = null;
        } else {
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
            string = stringBuffer.toString();
        }
        return h.a(string);
    }

    public final void b(Context context) {
        TreeMap treeMap = new TreeMap();
        this.f38340a = treeMap;
        HashMap map = new HashMap();
        map.put("AC4", bx.b(context));
        treeMap.putAll(map);
        Map<String, String> map2 = this.f38340a;
        l.a();
        HashMap map3 = new HashMap();
        map3.put("AE1", l.b());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.c() ? "1" : "0");
        map3.put("AE2", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(l.a(context) ? "1" : "0");
        map3.put("AE3", sb3.toString());
        map3.put("AE4", l.d());
        map3.put("AE5", l.e());
        map3.put("AE6", l.f());
        map3.put("AE7", l.g());
        map3.put("AE8", l.h());
        map3.put("AE9", l.i());
        map3.put("AE10", l.j());
        map3.put("AE11", l.k());
        map3.put("AE12", l.l());
        map3.put("AE13", l.m());
        map3.put("AE14", l.n());
        map3.put("AE15", l.a("ro.kernel.qemu", "0"));
        map2.putAll(map3);
        Map<String, String> map4 = this.f38340a;
        k kVarA = k.a();
        HashMap map5 = new HashMap();
        bv bvVarA = bu.a(context);
        String strA = k.a(context);
        String strB = k.b(context);
        String strK = k.k(context);
        String strM = k.m(context);
        boolean z10 = true;
        if (bvVarA != null && e.a(e.c(bvVarA.f38327a), strA) && e.a(e.c(bvVarA.f38328b), strB) && e.a(e.c(bvVarA.f38329c), strK) && e.a(e.c(bvVarA.f38331e), strM)) {
            z10 = false;
        }
        if (bvVarA != null) {
            if (e.a(strA)) {
                strA = e.c(bvVarA.f38327a);
            }
            if (e.a(strB)) {
                strB = e.c(bvVarA.f38328b);
            }
            if (e.a(strK)) {
                strK = e.c(bvVarA.f38329c);
            }
            if (e.a(strM)) {
                strM = e.c(bvVarA.f38331e);
            }
        }
        if (z10) {
            bu.a(context, new bv(strA, strB, strK, "", strM));
        }
        map5.put("AD1", strA);
        map5.put("AD2", strB);
        map5.put("AD3", k.f(context));
        map5.put("AD5", k.h(context));
        map5.put("AD6", k.i(context));
        map5.put("AD7", k.j(context));
        map5.put("AD8", strK);
        map5.put("AD9", k.l(context));
        map5.put("AD10", strM);
        map5.put("AD11", k.e());
        map5.put("AD12", kVarA.f());
        map5.put("AD13", k.g());
        map5.put("AD14", k.h());
        map5.put("AD15", k.i());
        map5.put("AD16", k.j());
        map5.put("AD20", k.k());
        map5.put("AD23", k.l());
        map5.put("AD24", e.f(k.g(context)));
        map5.put("AD26", k.e(context));
        map5.put("AD27", k.q());
        map5.put("AD28", k.s());
        map5.put("AD29", k.u());
        map5.put("AD30", k.r());
        map5.put("AD31", k.t());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(k.o() - (k.o() % 1000));
        map5.put("AD32", sb4.toString());
        map5.put("AD34", k.q(context));
        map5.put("AD37", k.n());
        map5.put("AD38", k.m());
        map5.put("AD39", k.c(context));
        map4.putAll(map5);
        Map<String, String> map6 = this.f38340a;
        HashMap map7 = new HashMap();
        map7.put("AA1", context.getPackageName());
        j.a();
        map7.put("AA2", j.a(context));
        map7.put("AA3", "APPSecuritySDK-YD");
        map7.put("AA4", "6.0.6.20201030");
        map6.putAll(map7);
    }
}
