package com.umeng.ut.a.a;

import android.content.Context;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.ut.b.a.a.d;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static String a(String str) {
        String appkey;
        Context contextM53a = com.umeng.ut.a.a.a().m53a();
        if (contextM53a == null) {
            return "";
        }
        try {
            appkey = UMUtils.getAppkey(contextM53a);
        } catch (Throwable unused) {
            appkey = "";
        }
        return d.d(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", "audid", com.umeng.ut.a.a.a().m54a(), a(str, "", appkey, contextM53a.getPackageName())));
    }

    private static String a(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("audid", str2);
        map.put("utdid", str);
        map.put("appkey", str3);
        map.put("appName", str4);
        return new JSONObject(d.a(map)).toString();
    }
}
