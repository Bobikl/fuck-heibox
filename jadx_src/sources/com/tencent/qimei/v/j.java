package com.tencent.qimei.v;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: StrategyQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101461a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f101463c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicBoolean f101462b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f101464d = null;

    public j(f fVar, String str) {
        this.f101463c = fVar;
        this.f101461a = str;
    }

    public final String a(String str, String str2) {
        return com.tencent.qimei.a.a.c(com.tencent.qimei.g.b.KEY_DATA.a(str).b(this.f101461a), str2);
    }

    public void a() {
        k kVar = this.f101464d;
        if (kVar != null) {
            kVar.c();
        }
    }

    public void a(k kVar) {
        this.f101464d = kVar;
    }

    public final void a(String str) {
        com.tencent.qimei.k.f.b(str).a("s_s_t", System.currentTimeMillis());
    }

    public final void a(String str, int i10, String str2) {
        d();
    }

    public void a(String str, boolean z10) {
        try {
            g.a(this.f101461a, str);
            h();
            if (z10) {
                com.tencent.qimei.k.f.b(this.f101461a).a("s_d", str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(com.tencent.qimei.w.a.a().b());
                sb2.append(" | save strategy: ");
                sb2.append(str);
                com.tencent.qimei.n.a.d(sb2.toString(), new Object[0]);
                a(this.f101461a);
            }
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            com.tencent.qimei.n.a.b("[strategy] error to common strategy!", new Object[0]);
        }
    }

    public final void b(String str, String str2) {
        try {
            String strB = com.tencent.qimei.g.b.KEY_CODE.a(str).b(this.f101461a);
            if (strB.equals("0")) {
                a(a(str, str2), true);
                this.f101463c.a(true);
                d();
            } else {
                if (strB.equals("304")) {
                    a(this.f101461a);
                }
                d();
            }
        } catch (Throwable th2) {
            com.tencent.qimei.n.a.a(th2);
            com.tencent.qimei.n.a.b("[strategy] error to response Success!", new Object[0]);
        }
    }

    public boolean b() {
        return this.f101462b.get();
    }

    public void c() {
        try {
            try {
                String strA = com.tencent.qimei.k.f.b(this.f101461a).a("s_d");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(com.tencent.qimei.w.a.a().b());
                sb2.append(" | load strategy: ");
                sb2.append(strA);
                com.tencent.qimei.n.a.d(sb2.toString(), new Object[0]);
                if (strA != null) {
                    a(strA, false);
                } else {
                    com.tencent.qimei.n.a.a("[strategy] local strategy is null!", new Object[0]);
                }
            } catch (Exception e10) {
                com.tencent.qimei.n.a.a(e10);
            }
        } finally {
            e();
        }
    }

    public final void d() {
        f();
        a();
        this.f101462b.set(false);
    }

    public final void e() {
        com.tencent.qimei.n.a.a("local strategyQuery finish!", new Object[0]);
    }

    public final void f() {
        long jConvert = TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS);
        com.tencent.qimei.c.a.a().a(jConvert, this);
        com.tencent.qimei.n.a.a("[strategy] next time: %d", Long.valueOf(jConvert));
    }

    public final void g() {
        com.tencent.qimei.w.a aVarA = com.tencent.qimei.w.a.a();
        String strA = com.tencent.qimei.l.a.a();
        com.tencent.qimei.e.b.b(aVarA.a(d.a(this.f101461a).z()), aVarA.a(strA, this.f101461a), new i(this, strA));
    }

    public final void h() {
        String str = this.f101461a;
        d.a(this.f101461a, new h(str, d.a(str)));
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f101462b.set(true);
        g();
    }
}
