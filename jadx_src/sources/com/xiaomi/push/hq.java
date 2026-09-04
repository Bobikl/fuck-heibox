package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class hq extends hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f107276a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Map<String, String> f549a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107277a = new a("get");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f107278b = new a("set");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f107279c = new a("result");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f107280d = new a("error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f107281e = new a("command");

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f550a;

        private a(String str) {
            this.f550a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f107277a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = f107278b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = f107280d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = f107279c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f107281e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f550a;
        }
    }

    public hq() {
        this.f107276a = a.f107277a;
        this.f549a = new HashMap();
    }

    public hq(Bundle bundle) {
        super(bundle);
        this.f107276a = a.f107277a;
        this.f549a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f107276a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.hs
    public Bundle a() {
        Bundle bundleA = super.a();
        a aVar = this.f107276a;
        if (aVar != null) {
            bundleA.putString("ext_iq_type", aVar.toString());
        }
        return bundleA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public a m455a() {
        return this.f107276a;
    }

    @Override // com.xiaomi.push.hs
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo456a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<iq ");
        if (j() != null) {
            sb2.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb2.append("to=\"");
            sb2.append(id.a(l()));
            sb2.append("\" ");
        }
        if (m() != null) {
            sb2.append("from=\"");
            sb2.append(id.a(m()));
            sb2.append("\" ");
        }
        if (k() != null) {
            sb2.append("chid=\"");
            sb2.append(id.a(k()));
            sb2.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f549a.entrySet()) {
            sb2.append(id.a(entry.getKey()));
            sb2.append("=\"");
            sb2.append(id.a(entry.getValue()));
            sb2.append("\" ");
        }
        if (this.f107276a == null) {
            sb2.append("type=\"get\">");
        } else {
            sb2.append("type=\"");
            sb2.append(m455a());
            sb2.append("\">");
        }
        String strB = b();
        if (strB != null) {
            sb2.append(strB);
        }
        sb2.append(o());
        hw hwVarM457a = m457a();
        if (hwVarM457a != null) {
            sb2.append(hwVarM457a.m460a());
        }
        sb2.append("</iq>");
        return sb2.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.f107276a = a.f107277a;
        } else {
            this.f107276a = aVar;
        }
    }

    public synchronized void a(Map<String, String> map) {
        this.f549a.putAll(map);
    }

    public String b() {
        return null;
    }
}
