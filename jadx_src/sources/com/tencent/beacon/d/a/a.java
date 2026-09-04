package com.tencent.beacon.d.a;

import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;

/* JADX INFO: compiled from: LifecycleCallbacks.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f98958a;

    a(c cVar) {
        this.f98958a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVarL = e.l();
        f fVarE = f.e();
        this.f98958a.f98967g.put("A19", eVarL.q());
        this.f98958a.f98967g.put("A85", com.tencent.beacon.a.c.b.f98782d ? "Y" : "N");
        this.f98958a.f98967g.put("A20", fVarE.j());
        this.f98958a.f98967g.put("A69", fVarE.k());
        this.f98958a.f98968h.b(this.f98958a.f98967g);
    }
}
