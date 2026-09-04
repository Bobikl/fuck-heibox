package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60875a = q0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f60877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f60882h;

    public a0(String str, JSONObject jSONObject, String str2, String str3, long j10) {
        this.f60876b = str;
        this.f60877c = jSONObject;
        this.f60878d = str2;
        this.f60879e = str3;
        this.f60880f = String.valueOf(j10);
        if (z.i(str2, "oper")) {
            p0 p0VarA = y.a().a(str2, j10);
            this.f60881g = p0VarA.a();
            this.f60882h = Boolean.valueOf(p0VarA.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        v.c("hmsSdk", "Begin to run EventRecordTask...");
        int iH = q0.h();
        int iK = a1.k(this.f60878d, this.f60879e);
        if (c0.a(this.f60875a, "stat_v2_1", iH * 1048576)) {
            v.c("hmsSdk", "stat sp file reach max limited size, discard new event");
            e.a().a("", "alltype");
            return;
        }
        b1 b1Var = new b1();
        b1Var.b(this.f60876b);
        b1Var.a(this.f60877c.toString());
        b1Var.d(this.f60879e);
        b1Var.c(this.f60880f);
        b1Var.f(this.f60881g);
        Boolean bool = this.f60882h;
        b1Var.e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject jSONObjectD = b1Var.d();
            String strA = n1.a(this.f60878d, this.f60879e);
            String strA2 = d.a(this.f60875a, "stat_v2_1", strA, "");
            try {
                jSONArray = !TextUtils.isEmpty(strA2) ? new JSONArray(strA2) : new JSONArray();
            } catch (JSONException unused) {
                v.d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObjectD);
            d.b(this.f60875a, "stat_v2_1", strA, jSONArray.toString());
            if (jSONArray.toString().length() > iK * 1024) {
                e.a().a(this.f60878d, this.f60879e);
            }
        } catch (JSONException unused2) {
            v.e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
