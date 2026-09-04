package com.tencent.beacon.a.b;

/* JADX INFO: compiled from: AbstractAttaReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f98754a;

    d(e eVar) {
        this.f98754a = eVar;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.a aVar) {
        if (aVar != null) {
            com.tencent.beacon.base.util.c.a("AttaReport", "oversea net ret: " + aVar.toString(), new Object[0]);
        }
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
    }
}
