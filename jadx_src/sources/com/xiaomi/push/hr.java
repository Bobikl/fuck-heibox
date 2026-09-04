package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class hr extends hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f107282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107283b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f107285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f107286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f107287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f107288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f107289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f107290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f107291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f107292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f107293l;

    public hr() {
        this.f107283b = null;
        this.f107284c = null;
        this.f107282a = false;
        this.f107290i = "";
        this.f107291j = "";
        this.f107292k = "";
        this.f107293l = "";
        this.f551b = false;
    }

    public hr(Bundle bundle) {
        super(bundle);
        this.f107283b = null;
        this.f107284c = null;
        this.f107282a = false;
        this.f107290i = "";
        this.f107291j = "";
        this.f107292k = "";
        this.f107293l = "";
        this.f551b = false;
        this.f107283b = bundle.getString("ext_msg_type");
        this.f107285d = bundle.getString("ext_msg_lang");
        this.f107284c = bundle.getString("ext_msg_thread");
        this.f107286e = bundle.getString("ext_msg_sub");
        this.f107287f = bundle.getString("ext_msg_body");
        this.f107288g = bundle.getString("ext_body_encode");
        this.f107289h = bundle.getString("ext_msg_appid");
        this.f107282a = bundle.getBoolean("ext_msg_trans", false);
        this.f551b = bundle.getBoolean("ext_msg_encrypt", false);
        this.f107290i = bundle.getString("ext_msg_seq");
        this.f107291j = bundle.getString("ext_msg_mseq");
        this.f107292k = bundle.getString("ext_msg_fseq");
        this.f107293l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.hs
    public Bundle a() {
        Bundle bundleA = super.a();
        if (!TextUtils.isEmpty(this.f107283b)) {
            bundleA.putString("ext_msg_type", this.f107283b);
        }
        String str = this.f107285d;
        if (str != null) {
            bundleA.putString("ext_msg_lang", str);
        }
        String str2 = this.f107286e;
        if (str2 != null) {
            bundleA.putString("ext_msg_sub", str2);
        }
        String str3 = this.f107287f;
        if (str3 != null) {
            bundleA.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f107288g)) {
            bundleA.putString("ext_body_encode", this.f107288g);
        }
        String str4 = this.f107284c;
        if (str4 != null) {
            bundleA.putString("ext_msg_thread", str4);
        }
        String str5 = this.f107289h;
        if (str5 != null) {
            bundleA.putString("ext_msg_appid", str5);
        }
        if (this.f107282a) {
            bundleA.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f107290i)) {
            bundleA.putString("ext_msg_seq", this.f107290i);
        }
        if (!TextUtils.isEmpty(this.f107291j)) {
            bundleA.putString("ext_msg_mseq", this.f107291j);
        }
        if (!TextUtils.isEmpty(this.f107292k)) {
            bundleA.putString("ext_msg_fseq", this.f107292k);
        }
        if (this.f551b) {
            bundleA.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f107293l)) {
            bundleA.putString("ext_msg_status", this.f107293l);
        }
        return bundleA;
    }

    @Override // com.xiaomi.push.hs
    /* JADX INFO: renamed from: a */
    public String mo456a() {
        hw hwVarM457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<message");
        if (p() != null) {
            sb2.append(" xmlns=\"");
            sb2.append(p());
            sb2.append("\"");
        }
        if (this.f107285d != null) {
            sb2.append(" xml:lang=\"");
            sb2.append(h());
            sb2.append("\"");
        }
        if (j() != null) {
            sb2.append(" id=\"");
            sb2.append(j());
            sb2.append("\"");
        }
        if (l() != null) {
            sb2.append(" to=\"");
            sb2.append(id.a(l()));
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(d())) {
            sb2.append(" seq=\"");
            sb2.append(d());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb2.append(" mseq=\"");
            sb2.append(e());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb2.append(" fseq=\"");
            sb2.append(f());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb2.append(" status=\"");
            sb2.append(g());
            sb2.append("\"");
        }
        if (m() != null) {
            sb2.append(" from=\"");
            sb2.append(id.a(m()));
            sb2.append("\"");
        }
        if (k() != null) {
            sb2.append(" chid=\"");
            sb2.append(id.a(k()));
            sb2.append("\"");
        }
        if (this.f107282a) {
            sb2.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f107289h)) {
            sb2.append(" appid=\"");
            sb2.append(c());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(this.f107283b)) {
            sb2.append(" type=\"");
            sb2.append(this.f107283b);
            sb2.append("\"");
        }
        if (this.f551b) {
            sb2.append(" s=\"1\"");
        }
        sb2.append(">");
        if (this.f107286e != null) {
            sb2.append("<subject>");
            sb2.append(id.a(this.f107286e));
            sb2.append("</subject>");
        }
        if (this.f107287f != null) {
            sb2.append("<body");
            if (!TextUtils.isEmpty(this.f107288g)) {
                sb2.append(" encode=\"");
                sb2.append(this.f107288g);
                sb2.append("\"");
            }
            sb2.append(">");
            sb2.append(id.a(this.f107287f));
            sb2.append("</body>");
        }
        if (this.f107284c != null) {
            sb2.append("<thread>");
            sb2.append(this.f107284c);
            sb2.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f107283b) && (hwVarM457a = m457a()) != null) {
            sb2.append(hwVarM457a.m460a());
        }
        sb2.append(o());
        sb2.append("</message>");
        return sb2.toString();
    }

    public void a(String str) {
        this.f107289h = str;
    }

    public void a(String str, String str2) {
        this.f107287f = str;
        this.f107288g = str2;
    }

    public void a(boolean z10) {
        this.f107282a = z10;
    }

    public String b() {
        return this.f107283b;
    }

    public void b(String str) {
        this.f107290i = str;
    }

    public void b(boolean z10) {
        this.f551b = z10;
    }

    public String c() {
        return this.f107289h;
    }

    public void c(String str) {
        this.f107291j = str;
    }

    public String d() {
        return this.f107290i;
    }

    public void d(String str) {
        this.f107292k = str;
    }

    public String e() {
        return this.f107291j;
    }

    public void e(String str) {
        this.f107293l = str;
    }

    @Override // com.xiaomi.push.hs
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hr hrVar = (hr) obj;
        if (!super.equals(hrVar)) {
            return false;
        }
        String str = this.f107287f;
        if (str == null ? hrVar.f107287f != null : !str.equals(hrVar.f107287f)) {
            return false;
        }
        String str2 = this.f107285d;
        if (str2 == null ? hrVar.f107285d != null : !str2.equals(hrVar.f107285d)) {
            return false;
        }
        String str3 = this.f107286e;
        if (str3 == null ? hrVar.f107286e != null : !str3.equals(hrVar.f107286e)) {
            return false;
        }
        String str4 = this.f107284c;
        if (str4 == null ? hrVar.f107284c == null : str4.equals(hrVar.f107284c)) {
            return this.f107283b == hrVar.f107283b;
        }
        return false;
    }

    public String f() {
        return this.f107292k;
    }

    public void f(String str) {
        this.f107283b = str;
    }

    public String g() {
        return this.f107293l;
    }

    public void g(String str) {
        this.f107286e = str;
    }

    public String h() {
        return this.f107285d;
    }

    public void h(String str) {
        this.f107287f = str;
    }

    @Override // com.xiaomi.push.hs
    public int hashCode() {
        String str = this.f107283b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f107287f;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f107284c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f107285d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f107286e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void i(String str) {
        this.f107284c = str;
    }

    public void j(String str) {
        this.f107285d = str;
    }
}
