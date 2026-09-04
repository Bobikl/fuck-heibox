package com.igexin.push.core.a;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.igexin.push.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f63484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63485b = true;

    g(e eVar) {
        this.f63484a = eVar;
    }

    @Override // com.igexin.push.f.b
    protected void a() {
        if (com.igexin.push.config.l.J) {
            Object obj = new Object();
            com.igexin.push.core.d.a.a().a(com.igexin.push.core.d.f63671e, new h(this, obj));
            synchronized (obj) {
                if (this.f63485b) {
                    try {
                        obj.wait(800L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        try {
            com.igexin.push.core.bean.a aVar = new com.igexin.push.core.bean.a();
            long j10 = aVar.f63588n;
            String strA = com.igexin.push.core.bean.a.a(aVar);
            com.igexin.a.a.c.b.a("addphoneinfo| " + strA, new Object[0]);
            com.igexin.push.core.b.e.a().a(new com.igexin.push.core.bean.h(j10, strA, (byte) 5, j10));
            com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
            bVar.b();
            bVar.f63819a = (int) j10;
            bVar.f63822d = "17258000";
            bVar.f63823e = strA;
            bVar.f63825g = com.igexin.push.core.d.f63685s;
            com.igexin.push.core.c.a().i().a("C-" + com.igexin.push.core.d.f63685s, bVar);
            if (com.igexin.a.b.a.a(com.igexin.push.core.d.A, com.igexin.push.core.d.f63692z)) {
                return;
            }
            com.igexin.push.core.b.i.a().d(com.igexin.push.core.d.f63692z);
        } catch (Throwable unused2) {
        }
    }
}
