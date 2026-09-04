package com.igexin.push.f.b;

import com.igexin.push.config.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f64026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f64027b;

    public d() {
        super(604800000L);
        this.f64026a = l.f63443u;
        this.f64027b = new AtomicBoolean(false);
        this.f63235n = true;
    }

    private void a(long j10) {
        a(j10, TimeUnit.MILLISECONDS);
    }

    public static d i() {
        return e.f64028a;
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return 20160629;
    }

    @Override // com.igexin.push.f.b.g
    protected void d_() {
        a(this.f64026a, TimeUnit.MILLISECONDS);
        boolean zA = com.igexin.push.util.a.a(System.currentTimeMillis());
        if (!com.igexin.push.core.d.f63678l && com.igexin.push.core.d.f63673g && com.igexin.push.core.d.f63675i && !zA && com.igexin.push.util.a.b()) {
            com.igexin.a.a.c.b.a("PollingTimerTask|run = true", new Object[0]);
            com.igexin.push.d.b.a().g();
            com.igexin.push.core.d.D = 100L;
            f.i().j();
        }
    }

    public void j() {
        if (!this.f64027b.get()) {
            com.igexin.a.a.b.c.b().a(this, false, true);
            this.f64027b.set(true);
        }
        a(this.f64026a);
    }

    public void k() {
        a(604800000L, TimeUnit.MILLISECONDS);
    }
}
