package com.xiaomi.push;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106933a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f258a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f106935c;

    public cy() {
        this(0, 0L, 0L, null);
    }

    public cy(int i10, long j10, long j11, Exception exc) {
        this.f106933a = i10;
        this.f258a = j10;
        this.f106935c = j11;
        this.f106934b = System.currentTimeMillis();
        if (exc != null) {
            this.f259a = exc.getClass().getSimpleName();
        }
    }

    public int a() {
        return this.f106933a;
    }

    public cy a(JSONObject jSONObject) {
        this.f258a = jSONObject.getLong("cost");
        this.f106935c = jSONObject.getLong(UiKitSpanObj.TYPE_SIZE);
        this.f106934b = jSONObject.getLong("ts");
        this.f106933a = jSONObject.getInt("wt");
        this.f259a = jSONObject.optString("expt");
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public JSONObject m229a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f258a);
        jSONObject.put(UiKitSpanObj.TYPE_SIZE, this.f106935c);
        jSONObject.put("ts", this.f106934b);
        jSONObject.put("wt", this.f106933a);
        jSONObject.put("expt", this.f259a);
        return jSONObject;
    }
}
