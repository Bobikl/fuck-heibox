package com.tencent.qimei.v;

/* JADX INFO: compiled from: StrategyProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f101458b;

    public h(String str, b bVar) {
        this.f101457a = str;
        this.f101458b = bVar;
    }

    @Override // com.tencent.qimei.v.b
    public boolean A() {
        return this.f101458b.A() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_IMEI.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean B() {
        return this.f101458b.B() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_IMSI.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean C() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_QIMEI36.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String a() {
        return this.f101458b.a();
    }

    @Override // com.tencent.qimei.v.b
    public boolean b() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_USERID.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public int c() {
        return com.tencent.qimei.w.a.b.KEY_DATA_QIMEI_JS_TIME.a(this.f101457a).intValue();
    }

    @Override // com.tencent.qimei.v.b
    public String d() {
        return this.f101458b.d();
    }

    @Override // com.tencent.qimei.v.b
    public String e() {
        return this.f101458b.e();
    }

    @Override // com.tencent.qimei.v.b
    public String f() {
        return com.tencent.qimei.w.a.d.KEY_DATA_PEAK_TIME.a(this.f101457a);
    }

    @Override // com.tencent.qimei.v.b
    public boolean g() {
        return this.f101458b.g() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_OAID.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean h() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_QIMEI.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean i() {
        return this.f101458b.i();
    }

    @Override // com.tencent.qimei.v.b
    public boolean j() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_FORCE_UPDATE_QIMEI.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String k() {
        return this.f101458b.k();
    }

    @Override // com.tencent.qimei.v.b
    public boolean l() {
        return this.f101458b.l() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_CID.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String m() {
        return this.f101458b.m();
    }

    @Override // com.tencent.qimei.v.b
    public String n() {
        return this.f101458b.n();
    }

    @Override // com.tencent.qimei.v.b
    public boolean o() {
        return this.f101458b.o() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_MAC.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String p() {
        return com.tencent.qimei.w.a.d.KEY_DATA_VERSION.a(this.f101457a);
    }

    @Override // com.tencent.qimei.v.b
    public int q() {
        return com.tencent.qimei.w.a.b.KEY_DATA_QIMEI_ARDT.a(this.f101457a).intValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean r() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_BEACON_ID.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String s() {
        return com.tencent.qimei.w.a.d.KEY_DATA_QIMEI_REQUEST_URL.a(this.f101457a);
    }

    @Override // com.tencent.qimei.v.b
    public boolean t() {
        return this.f101458b.t() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_AUDIT.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean u() {
        return this.f101458b.u() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_ANDROID_ID.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public boolean v() {
        return this.f101458b.v() & com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_PROCESS_INFO.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public String w() {
        return this.f101458b.w();
    }

    @Override // com.tencent.qimei.v.b
    public boolean x() {
        return com.tencent.qimei.w.a.EnumC0982a.KEY_DATA_ENABLE_REPORT.a(this.f101457a).booleanValue();
    }

    @Override // com.tencent.qimei.v.b
    public int y() {
        return com.tencent.qimei.w.a.b.KEY_DATA_QIMEI_REPORT_RATE.a(this.f101457a).intValue();
    }

    @Override // com.tencent.qimei.v.b
    public String z() {
        return this.f101458b.z();
    }
}
