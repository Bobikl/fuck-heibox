package com.igexin.push.core.a;

import android.text.TextUtils;
import com.igexin.push.config.SDKUrlConfig;

/* JADX INFO: loaded from: classes.dex */
public class m extends a {
    private void b() throws Throwable {
        com.igexin.a.a.c.a.f.a().a("Login successed with cid = " + com.igexin.push.core.d.f63685s);
        com.igexin.push.d.b.a().f();
        com.igexin.a.a.c.b.a("loginRsp|" + com.igexin.push.core.d.f63685s + "|success", new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isCidBroadcasted|");
        sb2.append(com.igexin.push.core.d.f63679m);
        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        if (!com.igexin.push.core.d.f63679m) {
            com.igexin.push.core.r.a().c();
            com.igexin.push.core.d.f63679m = true;
        }
        com.igexin.push.core.d.f63678l = true;
        com.igexin.push.core.r.a().b();
        e.a().c();
        if (TextUtils.isEmpty(com.igexin.push.core.d.f63691y)) {
            e.a().d();
        }
        com.igexin.push.util.d.f();
        a();
        d();
        com.igexin.push.core.b.i.a().b();
        e();
        f();
    }

    private void c() {
        com.igexin.a.a.c.b.a("loginRsp|" + com.igexin.push.core.d.f63685s + "|failed", new Object[0]);
        com.igexin.a.a.c.a.f.a().a("Login " + com.igexin.push.core.d.f63685s + " failed");
        com.igexin.a.a.c.b.a("LoginResultAction login failed, clear session or cid", new Object[0]);
        com.igexin.push.core.b.i.a().c();
        com.igexin.push.core.m.a().c();
    }

    private void d() {
        try {
            if ((System.currentTimeMillis() - com.igexin.push.core.d.J) - 86400000 > 0) {
                com.igexin.a.a.c.b.a("LoginResultAction, over 24h, start get sdk cfg", new Object[0]);
                com.igexin.a.a.b.c.b().a(new com.igexin.push.f.a.c(new com.igexin.push.core.c.b(SDKUrlConfig.getConfigServiceUrl())), false, true);
            }
        } catch (Exception unused) {
        }
    }

    private void e() {
        if (com.igexin.push.core.d.f63685s.equals(com.igexin.push.core.d.f63686t)) {
            return;
        }
        com.igexin.push.core.d.f63686t = com.igexin.push.core.d.f63685s;
    }

    private void f() {
        if (com.igexin.assist.sdk.a.i(com.igexin.push.core.d.f63671e)) {
            com.igexin.a.a.b.c.b().a(new n(this), false, true);
        }
    }

    public void a() {
        boolean z10 = (System.currentTimeMillis() - com.igexin.push.core.d.G) - 86400000 > 0;
        boolean z11 = !com.igexin.a.b.a.a(com.igexin.push.core.d.A, com.igexin.push.core.d.f63692z);
        boolean zEquals = true ^ com.igexin.push.core.d.f63685s.equals(com.igexin.push.core.d.f63686t);
        com.igexin.a.a.c.b.a("LoginResultAction|isOverOneDay = " + z10 + ", isDeviceTokenDiff = " + z11 + ", isCidDiff = " + zEquals, new Object[0]);
        if (z10 || z11 || zEquals) {
            e.a().e();
        }
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) throws Throwable {
        if (!(obj instanceof com.igexin.push.d.c.k)) {
            return true;
        }
        com.igexin.push.core.d.D = 0L;
        if (com.igexin.push.core.d.f63678l) {
            return true;
        }
        com.igexin.push.c.i.a().d().h();
        if (((com.igexin.push.d.c.k) obj).f63864a) {
            b();
            return true;
        }
        c();
        return true;
    }
}
