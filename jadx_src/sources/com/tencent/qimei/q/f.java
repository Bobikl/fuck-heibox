package com.tencent.qimei.q;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f101307a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f101308b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101309c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f101310d = "";

    public static f a() {
        return f101307a;
    }

    public String a(String str, String str2) {
        if (str.isEmpty()) {
            return com.tencent.qimei.f.a.a() + str2;
        }
        return str + str2;
    }

    public String a(Map<String, Object> map, String str, String str2, String str3) {
        String strB;
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject, str2);
            a(jSONObject, str3);
            a(map, jSONObject);
            try {
                String string = jSONObject.toString();
                if (com.tencent.qimei.l.b.a()) {
                    com.tencent.qimei.n.a.b("SDK_INIT ｜ 上报", "(appKey: %s)raw content: 上报类型: %s, 参数: %s", str2, str, string);
                }
                strB = com.tencent.qimei.b.a.b(string, "dZdcQik9lkNsvFYx");
            } catch (Exception e10) {
                e10.printStackTrace();
                strB = "";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(g.REPORT_TYPE.a(), str);
            jSONObject2.put(g.REPORT_DATA.a(), strB);
            return jSONObject2.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public final void a(Map<String, Object> map, JSONObject jSONObject) throws JSONException {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void a(JSONObject jSONObject, String str) throws JSONException {
        com.tencent.qimei.d.d dVarL = com.tencent.qimei.d.d.l();
        jSONObject.put(g.REPORT_DATA_IP.a(), dVarL.m());
        jSONObject.put(g.REPORT_DATA_NET_TYPE.a(), dVarL.u());
        jSONObject.put(g.REPORT_ANDROID_ID.a(), str);
    }

    public final void b(JSONObject jSONObject, String str) throws JSONException {
        if (this.f101308b == -1) {
            this.f101308b = com.tencent.qimei.d.d.l().A();
        }
        com.tencent.qimei.u.a aVar = new com.tencent.qimei.u.a(str);
        if (TextUtils.isEmpty(this.f101309c)) {
            this.f101309c = aVar.J();
        }
        if (TextUtils.isEmpty(this.f101310d)) {
            this.f101310d = aVar.D();
        }
        String sdkVersion = com.tencent.qimei.u.d.b().getSdkVersion();
        jSONObject.put(g.REPORT_PLATFORM_ID.a(), this.f101308b);
        jSONObject.put(g.REPORT_DATA_Q16.a(), this.f101309c);
        jSONObject.put(g.REPORT_DATA_Q36.a(), this.f101310d);
        jSONObject.put(g.REPORT_APPKEY.a(), str);
        jSONObject.put(g.REPORT_SDKVERSION.a(), sdkVersion);
    }
}
