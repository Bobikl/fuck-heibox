package com.tencent.beacon.base.net;

/* JADX INFO: compiled from: BeaconNet.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.beacon.base.net.a.b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.base.net.a.f f98916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.base.net.a.b f98917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f98918c;

    c(d dVar, com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b bVar) {
        this.f98918c = dVar;
        this.f98916a = fVar;
        this.f98917b = bVar;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(a aVar) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("httpRequest: ");
            sb2.append(this.f98916a.h());
            sb2.append(" request success!");
            com.tencent.beacon.base.util.c.a("[BeaconNet]", sb2.toString(), new Object[0]);
            this.f98917b.a(aVar);
            this.f98918c.f();
        } catch (Exception e10) {
            a(new e(this.f98916a.h(), "453", 200, e10.getMessage(), e10));
        }
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(e eVar) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "httpRequest: " + eVar.toString(), new Object[0]);
        this.f98918c.a(eVar);
        this.f98917b.a(eVar);
        this.f98918c.f();
    }
}
