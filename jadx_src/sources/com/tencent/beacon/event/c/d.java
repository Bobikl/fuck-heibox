package com.tencent.beacon.event.c;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.m;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.pack.EventRecordV2;
import com.tencent.beacon.pack.RequestPackageV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: EventUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static int a(EventType eventType) {
        int i10 = c.f99071a[eventType.ordinal()];
        if (i10 == 3 || i10 == 4) {
            return 1;
        }
        if (i10 != 5) {
            return i10 != 6 ? 0 : 3;
        }
        return 2;
    }

    public static m a(List<EventBean> list, boolean z10) {
        return m.a().a(RequestType.EVENT).a(z10 ? 2 : 1).a(com.tencent.beacon.base.net.c.b.a(true), bb.c.k.A3).a(com.tencent.beacon.a.c.c.d().f()).a("version", "v2").a(a(list)).a();
    }

    public static RequestPackageV2 a(EventBean eventBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventBean);
        return a(arrayList);
    }

    public static RequestPackageV2 a(List<EventBean> list) {
        RequestPackageV2 requestPackageV2 = new RequestPackageV2();
        requestPackageV2.appVersion = com.tencent.beacon.a.c.b.a();
        requestPackageV2.common = a();
        ArrayList<EventRecordV2> arrayList = new ArrayList<>();
        Iterator<EventBean> it = list.iterator();
        while (it.hasNext()) {
            EventRecordV2 eventRecordV2B = b(it.next());
            if (eventRecordV2B != null) {
                arrayList.add(eventRecordV2B);
            }
        }
        requestPackageV2.events = arrayList;
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        requestPackageV2.mainAppKey = cVarD.f();
        requestPackageV2.model = com.tencent.beacon.a.c.f.e().h();
        requestPackageV2.osVersion = com.tencent.beacon.a.c.e.l().s();
        requestPackageV2.packageName = com.tencent.beacon.a.c.b.b();
        requestPackageV2.platformId = cVarD.h();
        requestPackageV2.sdkId = cVarD.i();
        requestPackageV2.sdkVersion = cVarD.j();
        requestPackageV2.reserved = "";
        return requestPackageV2;
    }

    public static String a(String str) {
        if (str != null && str.trim().length() != 0) {
            if (g(str.trim())) {
                String strTrim = str.trim();
                return strTrim.length() > 16 ? strTrim.substring(0, 16) : strTrim;
            }
            com.tencent.beacon.base.util.c.e("[core] channelID should be Numeric! channelID:" + str, new Object[0]);
        }
        return "unknown";
    }

    private static Map<String, String> a() {
        HashMap map = new HashMap();
        com.tencent.beacon.a.c.e eVarL = com.tencent.beacon.a.c.e.l();
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        map.put("A31", "" + eVarL.p());
        map.put("A67", com.tencent.beacon.a.c.b.c(cVarD.c()));
        map.put("A76", com.tencent.beacon.a.c.b.d());
        map.put("A89", eVarL.a(cVarD.c()));
        map.put("A52", String.valueOf(eVarL.y()));
        map.put("A58", eVarL.m() ? "Y" : "N");
        map.put("A12", eVarL.n());
        map.put("A17", eVarL.u());
        com.tencent.beacon.a.c.f fVarE = com.tencent.beacon.a.c.f.e();
        map.put("A10", fVarE.h());
        map.put("A2", "" + fVarE.b());
        map.put("A4", fVarE.d());
        map.put("A6", fVarE.f());
        map.put("A7", fVarE.a());
        map.put("A20", fVarE.j());
        map.put("A69", fVarE.k());
        map.put("A9", Build.BRAND);
        map.put("A158", eVarL.d());
        return map;
    }

    public static boolean a(int i10) {
        return i10 != 0;
    }

    private static EventRecordV2 b(EventBean eventBean) {
        if (eventBean == null) {
            return null;
        }
        EventRecordV2 eventRecordV2 = new EventRecordV2();
        eventRecordV2.appKey = eventBean.getAppKey();
        eventRecordV2.apn = eventBean.getApn() != null ? eventBean.getApn() : "";
        eventRecordV2.srcIp = eventBean.getSrcIp() != null ? eventBean.getSrcIp() : "";
        eventRecordV2.eventCode = eventBean.getEventCode();
        eventRecordV2.valueType = eventBean.getValueType();
        eventRecordV2.mapValue = eventBean.getEventValue();
        eventRecordV2.byteValue = eventBean.getByteValue();
        eventRecordV2.eventTime = eventBean.getEventTime();
        eventRecordV2.eventResult = eventBean.getEventResult();
        eventRecordV2.eventType = eventBean.getEventType();
        eventRecordV2.reserved = eventBean.getReserved();
        return eventRecordV2;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            if (com.tencent.beacon.base.util.e.f98952a.get()) {
                com.tencent.beacon.a.b.g.e().a("101", "eventCode == null");
                com.tencent.beacon.base.util.e.a("eventCode == null");
            }
            return "";
        }
        String strTrim = str.replace('|', '_').trim();
        if (!g(strTrim)) {
            String str2 = str + " is not ASCII";
            com.tencent.beacon.a.b.g.e().a("101", str2);
            com.tencent.beacon.base.util.e.a(str2);
            return "";
        }
        if (strTrim.length() <= 128) {
            return strTrim;
        }
        String str3 = str + " length > 128.";
        com.tencent.beacon.a.b.g.e().a("101", str3);
        com.tencent.beacon.base.util.e.a(str3);
        return strTrim.substring(0, 128);
    }

    public static String c(String str) {
        return (str == null || str.length() == 0) ? "" : str;
    }

    public static String d(String str) {
        if (str == null || str.length() == 0) {
            return "DefaultPageID";
        }
        return str.length() > 50 ? str.substring(0, 50) : str;
    }

    public static String e(String str) {
        if (str == null || str.length() == 0) {
            return "10000";
        }
        String strTrim = str.replace('|', '_').trim();
        if (g(strTrim)) {
            if (strTrim.length() < 5) {
                com.tencent.beacon.base.util.c.e("[core] userID length should < 5!", new Object[0]);
            }
            return strTrim.length() > 128 ? strTrim.substring(0, 128) : strTrim;
        }
        com.tencent.beacon.base.util.c.e("[core] userID should be ASCII code in 32-126! userID:" + str, new Object[0]);
        return "10000";
    }

    public static BeaconModule f(String str) throws Exception {
        return (BeaconModule) Class.forName(str).newInstance();
    }

    private static boolean g(String str) {
        int length = str.length();
        boolean z10 = true;
        while (true) {
            length--;
            if (length < 0) {
                return z10;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < ' ' || cCharAt >= 127) {
                z10 = false;
            }
        }
    }
}
