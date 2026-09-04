package com.xiaomi.clientreport.data;

import com.vivo.push.PushClientConstants;
import com.xiaomi.push.cb;
import com.xiaomi.push.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public String clientInterfaceId;
    private String pkgName;
    public int production;
    public int reportType;
    private String sdkVersion;
    private String os = cb.a();
    private String miuiVersion = j.m517a();

    public String getPackageName() {
        return this.pkgName;
    }

    public void setAppPackageName(String str) {
        this.pkgName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.production);
            jSONObject.put("reportType", this.reportType);
            jSONObject.put("clientInterfaceId", this.clientInterfaceId);
            jSONObject.put("os", this.os);
            jSONObject.put("miuiVersion", this.miuiVersion);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.pkgName);
            jSONObject.put("sdkVersion", this.sdkVersion);
            return jSONObject;
        } catch (JSONException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}
