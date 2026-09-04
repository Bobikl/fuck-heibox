package com.alibaba.sdk.android.httpdns;

import android.text.Html;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37953b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f30b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37954c;
    private String hostName;
    private String[] ips;

    e(com.alibaba.sdk.android.httpdns.b.e eVar) {
        this.hostName = eVar.host;
        this.f37954c = com.alibaba.sdk.android.httpdns.b.c.a(eVar.f37908n);
        this.f37953b = -1000L;
        ArrayList<com.alibaba.sdk.android.httpdns.b.g> arrayList = eVar.f20a;
        if (arrayList != null && arrayList.size() > 0) {
            int size = eVar.f20a.size();
            this.ips = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.ips[i10] = eVar.f20a.get(i10).f37911o;
            }
        }
        if (com.alibaba.sdk.android.httpdns.net64.a.a().m29a()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<com.alibaba.sdk.android.httpdns.b.g> arrayList3 = eVar.f21b;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i11 = 0; i11 < eVar.f21b.size(); i11++) {
                    arrayList2.add(eVar.f21b.get(i11).f37911o);
                }
            }
            com.alibaba.sdk.android.httpdns.net64.a.a().a(this.hostName, arrayList2);
        }
        this.f37952a = eVar.f37904a;
        this.f30b = eVar.f37905b;
    }

    e(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(str);
        this.hostName = jSONObject.getString("host");
        try {
            if (jSONObject.has("ips")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("ips");
                int length = jSONArray2.length();
                this.ips = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.ips[i10] = jSONArray2.getString(i10);
                }
            }
            if (com.alibaba.sdk.android.httpdns.net64.a.a().m29a() && jSONObject.has("ipsv6") && (jSONArray = jSONObject.getJSONArray("ipsv6")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(jSONArray.getString(i11));
                }
                com.alibaba.sdk.android.httpdns.net64.a.a().a(this.hostName, arrayList);
            }
            if (jSONObject.has("extra")) {
                this.f37952a = jSONObject.getString("extra");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f37953b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.f37954c = System.currentTimeMillis() / 1000;
    }

    e(String str, String[] strArr, long j10, long j11, String str2, String str3) {
        this.hostName = str;
        this.ips = strArr;
        this.f37953b = j10;
        this.f37954c = j11;
        this.f37952a = str2;
        this.f30b = str3;
    }

    long a() {
        return this.f37953b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    com.alibaba.sdk.android.httpdns.b.e m22a() {
        List<String> listA;
        com.alibaba.sdk.android.httpdns.b.e eVar = new com.alibaba.sdk.android.httpdns.b.e();
        eVar.host = this.hostName;
        eVar.f37908n = String.valueOf(this.f37954c);
        eVar.f37907m = com.alibaba.sdk.android.httpdns.b.b.i();
        String[] strArr = this.ips;
        if (strArr != null && strArr.length > 0) {
            eVar.f20a = new ArrayList<>();
            for (String str : this.ips) {
                com.alibaba.sdk.android.httpdns.b.g gVar = new com.alibaba.sdk.android.httpdns.b.g();
                gVar.f37911o = str;
                gVar.f37912p = String.valueOf(this.f37953b);
                eVar.f20a.add(gVar);
            }
        }
        if (com.alibaba.sdk.android.httpdns.net64.a.a().m29a() && (listA = com.alibaba.sdk.android.httpdns.net64.a.a().a(this.hostName)) != null && listA.size() > 0) {
            eVar.f21b = new ArrayList<>();
            for (String str2 : listA) {
                com.alibaba.sdk.android.httpdns.b.g gVar2 = new com.alibaba.sdk.android.httpdns.b.g();
                gVar2.f37911o = str2;
                gVar2.f37912p = String.valueOf(this.f37953b);
                eVar.f21b.add(gVar2);
            }
        }
        eVar.f37904a = this.f37952a;
        eVar.f37905b = this.f30b;
        return eVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    String m23a() {
        return this.f37952a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    Map<String, String> m24a() {
        HashMap map = new HashMap();
        if (this.f37952a != null) {
            try {
                JSONObject jSONObject = new JSONObject(Html.fromHtml(Html.fromHtml(this.f37952a).toString()).toString());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next) == null ? null : jSONObject.get(next).toString());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return map;
    }

    long b() {
        return this.f37954c;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    boolean m25b() {
        return b() + a() < System.currentTimeMillis() / 1000 || c();
    }

    boolean c() {
        return a() == -1000;
    }

    String getCacheKey() {
        return this.f30b;
    }

    String[] getIps() {
        return this.ips;
    }

    void setCacheKey(String str) {
        this.f30b = str;
    }

    public String toString() {
        String str = "host: " + this.hostName + " ip cnt: " + this.ips.length + " ttl: " + this.f37953b;
        for (int i10 = 0; i10 < this.ips.length; i10++) {
            str = str + "\n ip: " + this.ips[i10];
        }
        return str;
    }
}
