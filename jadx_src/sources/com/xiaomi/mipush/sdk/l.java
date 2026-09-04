package com.xiaomi.mipush.sdk;

import com.xiaomi.push.is;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<e, a> f106792a = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f106793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f106794b;

        public a(String str, String str2) {
            this.f106793a = str;
            this.f106794b = str2;
        }
    }

    static {
        a(e.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(e.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static au a(e eVar) {
        int i10 = m.f106795a[eVar.ordinal()];
        if (i10 == 1) {
            return au.UPLOAD_HUAWEI_TOKEN;
        }
        if (i10 == 2) {
            return au.UPLOAD_FCM_TOKEN;
        }
        if (i10 == 3) {
            return au.UPLOAD_COS_TOKEN;
        }
        if (i10 != 4) {
            return null;
        }
        return au.UPLOAD_FTOS_TOKEN;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static a m137a(e eVar) {
        return f106792a.get(eVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static is m138a(e eVar) {
        return is.AggregatePushSwitch;
    }

    private static void a(e eVar, a aVar) {
        if (aVar != null) {
            f106792a.put(eVar, aVar);
        }
    }
}
