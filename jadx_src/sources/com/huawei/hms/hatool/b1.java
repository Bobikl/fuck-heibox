package com.huawei.hms.hatool;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60901f;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f60896a);
        jSONObject.put("eventtime", this.f60899d);
        jSONObject.put(androidx.core.app.o0.I0, this.f60897b);
        jSONObject.put("event_session_name", this.f60900e);
        jSONObject.put("first_session_event", this.f60901f);
        if (TextUtils.isEmpty(this.f60898c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f60898c));
        return jSONObject;
    }

    public void a(String str) {
        this.f60898c = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f60897b = jSONObject.optString(androidx.core.app.o0.I0);
        this.f60898c = n.a(jSONObject.optString("properties"), o0.d().a());
        this.f60896a = jSONObject.optString("type");
        this.f60899d = jSONObject.optString("eventtime");
        this.f60900e = jSONObject.optString("event_session_name");
        this.f60901f = jSONObject.optString("first_session_event");
    }

    public String b() {
        return this.f60899d;
    }

    public void b(String str) {
        this.f60897b = str;
    }

    public String c() {
        return this.f60896a;
    }

    public void c(String str) {
        this.f60899d = str;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObjectA = a();
        jSONObjectA.put("properties", n.b(this.f60898c, o0.d().a()));
        return jSONObjectA;
    }

    public void d(String str) {
        this.f60896a = str;
    }

    public void e(String str) {
        this.f60901f = str;
    }

    public void f(String str) {
        this.f60900e = str;
    }
}
