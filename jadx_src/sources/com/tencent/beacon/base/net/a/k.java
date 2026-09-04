package com.tencent.beacon.base.net.a;

import java.util.Date;

/* JADX INFO: compiled from: JceCall.java */
/* JADX INFO: loaded from: classes4.dex */
public class k implements a<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f98876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f98877b;

    public k(m mVar) {
        this.f98876a = mVar;
    }

    public void a(b<byte[]> bVar) {
        com.tencent.beacon.a.b.a.a().a(new h(this, bVar));
    }

    public void a(b<byte[]> bVar, com.tencent.beacon.a.b.a aVar) {
        aVar.a(new i(this, bVar));
    }

    public void b(b<byte[]> bVar) {
        this.f98877b = new Date().getTime();
        com.tencent.beacon.base.net.d.c().a(this.f98876a, new j(this, bVar));
    }
}
