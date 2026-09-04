package com.igexin.push.e;

import com.igexin.a.a.b.a.a.f;
import com.igexin.a.a.b.a.a.m;
import com.igexin.a.a.b.a.a.q;
import com.igexin.a.a.c.b;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.config.l;
import com.igexin.push.core.a.e;
import com.igexin.push.core.d;
import com.igexin.push.core.j;
import com.igexin.push.core.r;
import com.igexin.push.d.c.c;
import com.igexin.push.d.c.g;
import com.igexin.push.d.c.i;
import com.igexin.push.d.h;
import com.igexin.push.util.EncryptUtils;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63892a = "com.igexin.push.e.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63893b;

    private void b(boolean z10) {
        b.a(f63892a + "|call setActive, param active = " + z10 + "; this.active = " + this.f63893b, new Object[0]);
        boolean z11 = this.f63893b;
        if (z11 == z10) {
            if (!z11 || d.f63678l || d.D <= 1500) {
                return;
            }
            b.a(f63892a + "|start active again, online = false, reset delay", new Object[0]);
            d.D = 0L;
            d();
            return;
        }
        this.f63893b = z10;
        if (z10) {
            b.a(f63892a + "|active = true, start connect~~~~", new Object[0]);
            e();
            return;
        }
        b.a(f63892a + "|active = false, disconnect...", new Object[0]);
        a(true);
    }

    public int a(String str, c cVar) {
        return a(str, cVar, false);
    }

    public int a(String str, c cVar, boolean z10) {
        if (str == null || cVar == null) {
            return -1;
        }
        if (!d.f63678l && !(cVar instanceof g) && !(cVar instanceof i) && !(cVar instanceof com.igexin.push.d.c.d)) {
            b.a("networkLayer|sendData|not online|" + cVar.getClass().getName(), new Object[0]);
            return -3;
        }
        if (this.f63893b) {
            if (z10) {
                int i10 = l.f63427e;
                if (com.igexin.a.a.b.c.b().a(SDKUrlConfig.getCmAddress(), 3, com.igexin.push.core.c.a().h(), cVar, true, i10 > 0 ? i10 : 10, new h()) == null) {
                    return -2;
                }
            } else if (com.igexin.a.a.b.c.b().a(SDKUrlConfig.getCmAddress(), 3, com.igexin.push.core.c.a().h(), cVar, true) == null) {
                return -2;
            }
        }
        return 0;
    }

    public void a(q qVar) {
        com.igexin.a.a.b.c cVarB;
        Object aVar;
        if (qVar == q.TCP_IO_EXCEPTION) {
            cVarB = com.igexin.a.a.b.c.b();
            aVar = new com.igexin.push.d.b.b();
        } else {
            if (qVar != q.TCP_DISCONNECT_SUCCESS) {
                return;
            }
            cVarB = com.igexin.a.a.b.c.b();
            aVar = new com.igexin.push.d.b.a();
        }
        cVarB.a(aVar);
        com.igexin.a.a.b.c.b().c();
    }

    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        e.a().a(cVar);
    }

    public void a(boolean z10) {
        b.a(f63892a + "|call -> disconnect, reset delay = " + z10, new Object[0]);
        if (z10) {
            d.D = 0L;
        }
        f.a().c();
    }

    public boolean a() {
        return this.f63893b;
    }

    public void b() {
        boolean z10 = d.f63675i;
        boolean zA = com.igexin.push.util.a.a(System.currentTimeMillis());
        boolean zB = com.igexin.push.util.a.b();
        b.a(f63892a + "|start: isPushOn = " + z10 + " silentTime = " + zA + " isBlockEndTime = " + zB, new Object[0]);
        if (z10 && !zA && zB) {
            b(true);
        }
    }

    public void c() {
        b.a(f63892a + "|stop by user", new Object[0]);
        b(false);
        if (d.f63678l) {
            d.f63678l = false;
            r.a().b();
        }
    }

    public void d() {
        d.D = com.igexin.push.d.b.a().c().a();
        com.igexin.push.f.b.f.i().j();
    }

    public void e() {
        b.a(f63892a + "|call -> tryConnect and reset delay = 0", new Object[0]);
        a(true);
    }

    public void f() {
        com.igexin.push.c.i.a().d().c();
        com.igexin.push.c.a aVarD = com.igexin.push.c.i.a().d();
        com.igexin.push.core.h.a().a(j.NETWORK_ERROR);
        aVarD.i();
        if (h()) {
            b.a(f63892a + "|sdkOn = false or pushOn = false, disconect|user", new Object[0]);
        } else {
            b.a(f63892a + "|disconnect by network", new Object[0]);
        }
        com.igexin.a.a.b.c.b().a(m.class);
        a(false);
    }

    public void g() {
        com.igexin.push.d.a.b.f63801b = -1;
        if (d.f63674h) {
            b.a(f63892a + "|isAppidWrong = true", new Object[0]);
            com.igexin.a.a.c.a.f.a().a("isAppidWrong = true");
            return;
        }
        if (!EncryptUtils.isLoadSuccess()) {
            b.a(f63892a + "|so error ++++++++", new Object[0]);
            return;
        }
        if (d.ar) {
            d();
            return;
        }
        b.a(f63892a + "|initSuccess = false", new Object[0]);
    }

    public boolean h() {
        return !d.f63675i;
    }

    public void i() {
        com.igexin.push.core.h.a().a(j.NETWORK_SWITCH);
        boolean zH = com.igexin.push.util.a.h();
        b.a(f63892a + "|network changed, available = " + zH + ", last = " + d.f63673g, new Object[0]);
        com.igexin.push.d.b.a().b();
        if (!zH) {
            b.a(f63892a + "|network changed, available = false, do nothing", new Object[0]);
        } else if (!d.f63673g) {
            b.a(f63892a + "|network changed, try connect reset delay", new Object[0]);
            e();
        }
        if (zH) {
            com.igexin.push.c.i.a().c();
        }
        d.f63673g = zH;
    }
}
