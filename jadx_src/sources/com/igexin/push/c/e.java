package com.igexin.push.c;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f63357b;

    public e a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        try {
            this.f63356a = jSONObject.getString("address");
            this.f63357b = jSONObject.getLong("outdateTime");
        } catch (Exception unused) {
        }
        return this;
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("address", this.f63356a);
            jSONObject.put("outdateTime", this.f63357b);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "ServerAddress{address='" + this.f63356a + "', outdateTime=" + this.f63357b + '}';
    }
}
