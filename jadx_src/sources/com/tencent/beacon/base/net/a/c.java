package com.tencent.beacon.base.net.a;

import com.tencent.beacon.base.net.NetException;

/* JADX INFO: compiled from: HttpCall.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements b<com.tencent.beacon.base.net.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f98850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f98851b;

    c(d dVar, b bVar) {
        this.f98851b = dVar;
        this.f98850a = bVar;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.a aVar) throws NetException {
        b bVar = this.f98850a;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        b bVar = this.f98850a;
        if (bVar != null) {
            bVar.a(eVar);
        }
    }
}
