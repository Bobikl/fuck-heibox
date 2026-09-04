package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.meituan.robust.Constants;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105555b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105554a = "_$unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f105556c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f105557d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f105558e = a.f105553j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f105559f = null;

    public b(Context context) {
        this.f105555b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String a() {
        return this.f105554a;
    }

    public void a(long j10) {
        this.f105556c = j10;
    }

    public void a(String str) {
        this.f105554a = str;
    }

    public void a(Map<String, Object> map) {
        this.f105559f = map;
    }

    public long b() {
        return this.f105556c;
    }

    public Map<String, Object> c() {
        return this.f105559f;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f105554a);
            jSONObject.put("pn", this.f105555b);
            jSONObject.put("ds", this.f105557d);
            jSONObject.put("ts", this.f105556c);
            Map<String, Object> map = this.f105559f;
            if (map != null && map.size() > 0) {
                for (String str : this.f105559f.keySet()) {
                    jSONObject.put(str, this.f105559f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f105558e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        sb2.append("id:" + this.f105554a + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append("pn:" + this.f105555b + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append("ts:" + this.f105556c + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        Map<String, Object> map = this.f105559f;
        if (map != null && map.size() > 0) {
            for (String str : this.f105559f.keySet()) {
                Object obj = this.f105559f.get(str);
                sb2.append(obj == null ? str + ": null," : str + ": " + obj.toString() + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        sb2.append("ds:" + this.f105557d + "]");
        return sb2.toString();
    }
}
