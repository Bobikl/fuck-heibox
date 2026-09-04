package com.tencent.qimei.o;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.tencent.qimei.d.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MultiAppKeyDeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingPermission"})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, d> f101296a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101298c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101299d = false;

    public d(String str) {
        this.f101297b = str;
    }

    public static synchronized d a(String str) {
        d dVar;
        Map<String, d> map = f101296a;
        dVar = map.get(str);
        if (dVar == null) {
            dVar = new d(str);
            map.put(str, dVar);
        }
        return dVar;
    }

    public String a() {
        String strD = com.tencent.qimei.v.d.a(this.f101297b).d();
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        if (com.tencent.qimei.v.d.a(this.f101297b).u()) {
            return com.tencent.qimei.d.d.l().c();
        }
        com.tencent.qimei.n.a.a("[DeviceInfo] current collect androidId be refused! isAndroidId: %s", Boolean.FALSE);
        return "";
    }

    public void a(e eVar) {
        com.tencent.qimei.c.a.a().a(new a(this, eVar));
    }

    public String b() {
        return !com.tencent.qimei.v.d.a(this.f101297b).r() ? "" : com.tencent.qimei.d.d.l().d();
    }

    public final void b(e eVar) {
        this.f101299d = false;
        com.tencent.qimei.c.a.a().a(10000L, new b(this, eVar));
        com.tencent.qimei.d.d.l().a(new c(this, eVar));
    }

    public String c() {
        String strK = com.tencent.qimei.v.d.a(this.f101297b).k();
        if (TextUtils.isEmpty(strK)) {
            return !com.tencent.qimei.v.d.a(this.f101297b).i() ? "" : com.tencent.qimei.d.d.l().e();
        }
        return strK;
    }

    public String d() {
        String strE = com.tencent.qimei.v.d.a(this.f101297b).e();
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        if (com.tencent.qimei.v.d.a(this.f101297b).A()) {
            return com.tencent.qimei.d.d.l().j();
        }
        com.tencent.qimei.n.a.a("[DeviceInfo] current collect imei be refused! isCollect Imei: %s", Boolean.FALSE);
        return "";
    }

    public String e() {
        String strA = com.tencent.qimei.v.d.a(this.f101297b).a();
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (com.tencent.qimei.v.d.a(this.f101297b).B()) {
            return com.tencent.qimei.d.d.l().k();
        }
        com.tencent.qimei.n.a.a("[DeviceInfo] current collect imei be refused! isCollectImei: %s", Boolean.FALSE);
        return "";
    }

    public String f() {
        String strM = com.tencent.qimei.v.d.a(this.f101297b).m();
        if (!TextUtils.isEmpty(strM)) {
            return strM;
        }
        if (com.tencent.qimei.v.d.a(this.f101297b).o()) {
            return com.tencent.qimei.d.d.l().o();
        }
        com.tencent.qimei.n.a.a("[DeviceInfo] current collect mac be refused! isCollectMAC: %s", Boolean.FALSE);
        return "";
    }

    public String g() {
        String strN = com.tencent.qimei.v.d.a(this.f101297b).n();
        if (TextUtils.isEmpty(strN)) {
            return !com.tencent.qimei.v.d.a(this.f101297b).l() ? "" : com.tencent.qimei.d.d.l().t();
        }
        return strN;
    }

    public String h() {
        String strW = com.tencent.qimei.v.d.a(this.f101297b).w();
        if (TextUtils.isEmpty(strW)) {
            return !com.tencent.qimei.v.d.a(this.f101297b).g() ? "" : com.tencent.qimei.d.d.l().x();
        }
        return strW;
    }
}
