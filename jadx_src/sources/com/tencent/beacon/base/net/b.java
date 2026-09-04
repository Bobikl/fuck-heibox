package com.tencent.beacon.base.net;

import com.max.xiaoheihe.module.account.mine.l;
import com.tencent.beacon.base.net.a.m;

/* JADX INFO: compiled from: BeaconNet.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.beacon.base.net.a.b<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f98908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.base.net.a.b f98910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f98911d;

    b(d dVar, m mVar, boolean z10, com.tencent.beacon.base.net.a.b bVar) {
        this.f98911d = dVar;
        this.f98908a = mVar;
        this.f98909b = z10;
        this.f98910c = bVar;
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(e eVar) {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "jceRequest: " + eVar.toString(), new Object[0]);
        this.f98911d.a(eVar);
        this.f98910c.a(eVar);
        this.f98911d.f();
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            a(new e(this.f98908a.g().name(), this.f98909b ? "402" : "452", 200, "raw response == null", null));
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("jceRequest: ");
            sb2.append(this.f98908a.g());
            sb2.append(" request success!");
            com.tencent.beacon.base.util.c.a("[BeaconNet]", sb2.toString(), new Object[0]);
            this.f98910c.a(bArr);
            this.f98911d.f();
        } catch (Exception e10) {
            a(new e(this.f98908a.g().name(), this.f98909b ? l.f79081d : "453", 200, e10.getMessage(), e10));
        }
    }
}
