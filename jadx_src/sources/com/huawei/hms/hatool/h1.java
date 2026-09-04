package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class h1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b1> f60943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f60944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t0 f60945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o1 f60946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60947e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60948f;

    public h1(String str) {
        this.f60948f = str;
    }

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        String str;
        List<b1> list = this.f60943a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f60944b == null || this.f60945c == null || this.f60946d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f60944b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectA = this.f60946d.a();
            jSONObjectA.put("properties", this.f60945c.a());
            try {
                jSONObjectA.put("events_global_properties", new JSONObject(this.f60947e));
            } catch (JSONException unused) {
                jSONObjectA.put("events_global_properties", this.f60947e);
            }
            jSONObject2.put("events_common", jSONObjectA);
            JSONArray jSONArray = new JSONArray();
            Iterator<b1> it = this.f60943a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA2 = it.next().a();
                if (jSONObjectA2 != null) {
                    jSONArray.put(jSONObjectA2);
                } else {
                    v.e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put(com.umeng.analytics.pro.d.ar, jSONArray);
            try {
                String strA = n.a(k1.a(jSONObject2.toString().getBytes("UTF-8")), this.f60948f);
                if (TextUtils.isEmpty(strA)) {
                    v.e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put(androidx.core.app.o0.I0, strA);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        v.e("hmsSdk", str);
        return null;
    }

    public void a(k0 k0Var) {
        this.f60944b = k0Var;
    }

    public void a(l lVar) {
        this.f60946d = lVar;
    }

    public void a(t0 t0Var) {
        this.f60945c = t0Var;
    }

    public void a(String str) {
        if (str != null) {
            this.f60947e = str;
        }
    }

    public void a(List<b1> list) {
        this.f60943a = list;
    }
}
