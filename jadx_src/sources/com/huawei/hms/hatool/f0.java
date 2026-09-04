package com.huawei.hms.hatool;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f0 extends k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60920g = "";

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "3");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f60974d);
        jSONObject.put("appid", this.f60971a);
        jSONObject.put("hmac", this.f60920g);
        jSONObject.put("chifer", this.f60976f);
        jSONObject.put("timestamp", this.f60972b);
        jSONObject.put("servicetag", this.f60973c);
        jSONObject.put("requestid", this.f60975e);
        return jSONObject;
    }

    public void g(String str) {
        this.f60920g = str;
    }
}
