package com.huawei.hms.hatool;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class l extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60977b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60978c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60979d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60980e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f60981f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60982g;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f61046a);
        jSONObject.put("oaid", this.f60982g);
        jSONObject.put("uuid", this.f60981f);
        jSONObject.put("upid", this.f60980e);
        jSONObject.put("imei", this.f60977b);
        jSONObject.put("sn", this.f60978c);
        jSONObject.put("udid", this.f60979d);
        return jSONObject;
    }

    public void b(String str) {
        this.f60977b = str;
    }

    public void c(String str) {
        this.f60982g = str;
    }

    public void d(String str) {
        this.f60978c = str;
    }

    public void e(String str) {
        this.f60979d = str;
    }

    public void f(String str) {
        this.f60980e = str;
    }

    public void g(String str) {
        this.f60981f = str;
    }
}
