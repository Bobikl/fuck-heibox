package com.tencent.beacon.base.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.tencent.beacon.base.net.a.k;
import com.tencent.beacon.base.net.a.m;
import com.tencent.beacon.base.net.adapter.g;
import java.io.Closeable;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BeaconNet.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements f, com.tencent.beacon.base.net.c.e.a, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d f98929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.tencent.beacon.base.net.adapter.a> f98930b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f98931c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f98932d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.tencent.beacon.base.net.b.a f98933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.tencent.beacon.base.net.b.b f98934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.beacon.base.net.adapter.a f98935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f98936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.tencent.beacon.base.net.adapter.a f98937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.tencent.beacon.base.net.adapter.a f98938j;

    private d() {
    }

    public static synchronized d c() {
        if (f98929a == null) {
            f98929a = new d();
        }
        return f98929a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "current net connected num: %d", Integer.valueOf(this.f98932d.decrementAndGet()));
    }

    private void g() {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "current net connected num: %d", Integer.valueOf(this.f98932d.incrementAndGet()));
    }

    public com.tencent.beacon.base.net.a.d a(com.tencent.beacon.base.net.a.f fVar) {
        return new com.tencent.beacon.base.net.a.d(fVar);
    }

    public k a(m mVar) {
        return new k(mVar);
    }

    @n0
    public com.tencent.beacon.base.net.adapter.a a(@p0 com.tencent.beacon.base.net.adapter.a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("skip adapter: ");
        sb2.append(aVar == null ? "" : aVar.getClass().getSimpleName());
        com.tencent.beacon.base.util.c.a("[BeaconNet]", sb2.toString(), new Object[0]);
        int iIndexOf = this.f98930b.indexOf(aVar) + 1;
        return this.f98930b.get(iIndexOf < this.f98930b.size() ? iIndexOf : 0);
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void a() {
        this.f98931c.set(false);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network recovery. open BeaconNet.", new Object[0]);
    }

    public void a(Context context, com.tencent.beacon.base.net.adapter.a aVar) {
        this.f98936h = context;
        if (aVar == null) {
            aVar = new com.tencent.beacon.base.net.adapter.c();
        }
        com.tencent.beacon.base.net.adapter.a aVarA = g.a();
        this.f98937i = aVarA;
        this.f98938j = aVar;
        this.f98930b.add(aVarA);
        this.f98930b.add(aVar);
        this.f98933e = com.tencent.beacon.base.net.b.a.a();
        this.f98934f = com.tencent.beacon.base.net.b.b.a();
        com.tencent.beacon.base.net.c.e.a(context, this);
    }

    public void a(com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b<a> bVar) {
        if (this.f98931c.get()) {
            bVar.a(new e(fVar.h(), null, 0, "BeaconNet close."));
        } else {
            g();
            this.f98938j.request(fVar, new c(this, fVar, bVar));
        }
    }

    public void a(m mVar, com.tencent.beacon.base.net.a.b<byte[]> bVar) {
        if (this.f98931c.get()) {
            bVar.a(new e(mVar.g().name(), null, 0, "BeaconNet close."));
            return;
        }
        com.tencent.beacon.base.net.adapter.a aVarA = a(this.f98935g);
        boolean z10 = aVarA == this.f98937i;
        g();
        if (mVar.g() == RequestType.EVENT) {
            aVarA = this.f98937i;
        }
        aVarA.request(mVar, new b(this, mVar, z10, bVar));
    }

    public void a(@n0 e eVar) {
        if (eVar.f98939a.equals("atta") || TextUtils.isEmpty(eVar.f98940b)) {
            return;
        }
        com.tencent.beacon.a.b.g.e().a(eVar.f98940b, eVar.toString(), eVar.f98943e);
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void b() {
        this.f98931c.set(true);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network can't use. close BeaconNet.", new Object[0]);
    }

    public void b(com.tencent.beacon.base.net.adapter.a aVar) {
        this.f98935g = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f98931c.set(true);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network can't use. close BeaconNet.", new Object[0]);
    }

    public boolean d() {
        return this.f98932d.get() >= 5;
    }

    public void e() {
        this.f98931c.set(false);
    }
}
