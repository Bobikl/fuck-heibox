package com.umeng.commonsdk.statistics.idtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: AbstractIdTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105340a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f105341b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f105342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.umeng.commonsdk.statistics.proto.a> f105343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.b f105344e;

    public a(String str) {
        this.f105342c = str;
    }

    private boolean g() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.f105344e;
        String strB = bVar == null ? null : bVar.b();
        int iH = bVar == null ? 0 : bVar.h();
        String strA = a(f());
        if (strA == null || strA.equals(strB)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(strA);
        bVar.a(System.currentTimeMillis());
        bVar.a(iH + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.f105342c);
        aVar.c(strA);
        aVar.b(strB);
        aVar.a(bVar.e());
        if (this.f105343d == null) {
            this.f105343d = new ArrayList(2);
        }
        this.f105343d.add(aVar);
        if (this.f105343d.size() > 10) {
            this.f105343d.remove(0);
        }
        this.f105344e = bVar;
        return true;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || "0".equals(strTrim) || "unknown".equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.f105344e = bVar;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.f105344e = cVar.c().get(this.f105342c);
        List<com.umeng.commonsdk.statistics.proto.a> listH = cVar.h();
        if (listH == null || listH.size() <= 0) {
            return;
        }
        if (this.f105343d == null) {
            this.f105343d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : listH) {
            if (this.f105342c.equals(aVar.f105406a)) {
                this.f105343d.add(aVar);
            }
        }
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f105343d = list;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.f105342c;
    }

    public boolean c() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.f105344e;
        return bVar == null || bVar.h() <= 100;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.f105344e;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.f105343d;
    }

    public abstract String f();
}
