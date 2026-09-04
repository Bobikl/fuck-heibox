package com.tencent.beacon.a.b;

/* JADX INFO: compiled from: AbstractAttaReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f98746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f98747d;

    b(e eVar, String str, String str2, Throwable th2) {
        this.f98747d = eVar;
        this.f98744a = str;
        this.f98745b = str2;
        this.f98746c = th2;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.a aVar) {
        com.tencent.beacon.base.util.c.a("AttaReport", "net ret: " + aVar.toString(), new Object[0]);
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        this.f98747d.b(this.f98744a, this.f98745b, this.f98746c);
    }
}
