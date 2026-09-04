package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class y0 extends t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f61064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f61065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f61066h;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f61066h);
        jSONObject.put("_emui_ver", this.f61047a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f61064f);
        jSONObject.put("_mnc", this.f61065g);
        jSONObject.put("_package_name", this.f61048b);
        jSONObject.put("_app_ver", this.f61049c);
        jSONObject.put("_lib_ver", "2.2.0.314");
        jSONObject.put("_channel", this.f61050d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f61051e);
        return jSONObject;
    }

    public void f(String str) {
        this.f61064f = str;
    }

    public void g(String str) {
        this.f61065g = str;
    }

    public void h(String str) {
        this.f61066h = str;
    }
}
