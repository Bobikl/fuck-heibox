package com.tencent.qimei.r;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TokenHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, r> f101433a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101435c = new Object();

    public r(String str) {
        this.f101434b = str;
    }

    public static synchronized r a(String str) {
        r rVar;
        Map<String, r> map = f101433a;
        rVar = map.get(str);
        if (rVar == null) {
            rVar = new r(str);
            map.put(str, rVar);
        }
        return rVar;
    }

    public String a() {
        String strE = e();
        if (strE.isEmpty()) {
            return b();
        }
        if (c()) {
            return b(strE);
        }
        return d() ? b() : strE;
    }

    public final String b() {
        String strA = e.a().a(com.tencent.qimei.l.a.a(), this.f101434b, p.m(this.f101434b), "");
        d(strA);
        return strA;
    }

    public final String b(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject(str);
            e.a aVar = e.a.KEY_ENCRYPT_KEY;
            String strOptString = jSONObject.optString(aVar.a());
            e.a aVar2 = e.a.KEY_PARAMS;
            String strOptString2 = jSONObject.optString(aVar2.a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(aVar.a(), strOptString);
            jSONObject2.put(aVar2.a(), strOptString2);
            string = jSONObject2.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            string = "";
        }
        String strA = e.a().a(com.tencent.qimei.l.a.a(), this.f101434b, p.m(this.f101434b), string);
        d(strA);
        return strA;
    }

    public final void c(String str) {
        if (com.tencent.qimei.d.a.g()) {
            synchronized (this.f101435c) {
                com.tencent.qimei.k.f.b(this.f101434b).b("tn", str);
                com.tencent.qimei.k.f.b(this.f101434b).a("t_s_t", System.currentTimeMillis());
            }
        }
    }

    public boolean c() {
        long jC = com.tencent.qimei.k.f.b(this.f101434b).c("t_s_t");
        return 0 != jC && com.tencent.qimei.d.a.b() > jC;
    }

    public final void d(String str) {
        com.tencent.qimei.c.a.a().a(new q(this, str));
    }

    public boolean d() {
        return com.tencent.qimei.l.c.a(com.tencent.qimei.k.f.b(this.f101434b).c("t_s_t"));
    }

    public final String e() {
        String strD;
        synchronized (this.f101435c) {
            strD = com.tencent.qimei.k.f.b(this.f101434b).d("tn");
        }
        return strD;
    }
}
