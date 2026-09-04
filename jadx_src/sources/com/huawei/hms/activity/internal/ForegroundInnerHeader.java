package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ForegroundInnerHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60277c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f60275a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f60276b = JsonUtil.getStringValue(jSONObject, "action");
            this.f60277c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e10) {
            HMSLog.e("ForegroundInnerHeader", "fromJson failed: " + e10.getMessage());
        }
    }

    public String getAction() {
        return this.f60276b;
    }

    public int getApkVersion() {
        return this.f60275a;
    }

    public String getResponseCallbackKey() {
        return this.f60277c;
    }

    public void setAction(String str) {
        this.f60276b = str;
    }

    public void setApkVersion(int i10) {
        this.f60275a = i10;
    }

    public void setResponseCallbackKey(String str) {
        this.f60277c = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f60275a);
            jSONObject.put("action", this.f60276b);
            jSONObject.put("responseCallbackKey", this.f60277c);
        } catch (JSONException e10) {
            HMSLog.e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f60275a + ", action:" + this.f60276b + ", responseCallbackKey:" + this.f60277c;
    }
}
