package com.igexin.push.f.b;

import com.igexin.push.core.h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f64025a;

    public b() {
        super(h.a().b());
        this.f63235n = true;
    }

    public static b i() {
        if (f64025a == null) {
            f64025a = new b();
        }
        return f64025a;
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483642;
    }

    @Override // com.igexin.a.a.d.e
    public void c() {
        super.c();
        if (this.f63232j) {
            return;
        }
        j();
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
    }

    @Override // com.igexin.push.f.b.g
    protected void d_() {
        com.igexin.push.core.a.e.a().k();
        com.igexin.push.core.d.F = System.currentTimeMillis();
        if (com.igexin.push.core.d.f63678l) {
            com.igexin.a.a.c.b.a("heartbeatReq", new Object[0]);
            com.igexin.push.core.c.a().j().b();
        } else {
            com.igexin.a.a.c.b.a("HeartBeatTimerTask doTaskMethod isOnline = false, refresh wait time !!!!!!", new Object[0]);
            j();
        }
    }

    public void j() {
        a(h.a().b(), TimeUnit.MILLISECONDS);
    }

    public void k() {
    }
}
