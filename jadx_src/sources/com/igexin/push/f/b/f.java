package com.igexin.push.f.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.push.core.b.i;
import com.igexin.push.core.m;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f64029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f64030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f64031c;

    private f() {
        super(1200000L);
        this.f63235n = true;
        this.f64030b = System.currentTimeMillis();
        this.f64031c = SystemClock.elapsedRealtime();
    }

    public static synchronized f i() {
        if (f64029a == null) {
            f64029a = new f();
        }
        return f64029a;
    }

    public void a(long j10) {
        this.f64031c = j10;
    }

    public void b(long j10) {
        com.igexin.a.a.c.b.a("RTTask|refreshDelayTime, delay = " + j10, new Object[0]);
        a(j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483641;
    }

    @Override // com.igexin.a.a.d.e
    public void c() {
        super.c();
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
    }

    @Override // com.igexin.push.f.b.g
    protected void d_() {
        long j10;
        com.igexin.push.core.a.e.a().k();
        boolean zA = com.igexin.push.util.a.a(System.currentTimeMillis());
        boolean zB = com.igexin.push.util.a.b();
        com.igexin.push.core.d.f63673g = com.igexin.push.util.a.h();
        com.igexin.a.a.c.b.a("RTTask|networkAvailable = " + com.igexin.push.core.d.f63673g + ",sdkOnline = " + com.igexin.push.core.d.f63678l + ", pushOn =" + com.igexin.push.core.d.f63675i + ", isSilentTime= " + zA + ", blockEndTime= " + zB, new Object[0]);
        if (!com.igexin.push.core.d.f63673g || !com.igexin.push.core.d.f63675i || com.igexin.push.core.d.f63678l || zA || !zB) {
            com.igexin.a.a.c.b.a("RTTask reconnect timer task stop, connect interval= 20min #######", new Object[0]);
            j10 = 1200000;
        } else {
            if (!com.igexin.push.util.a.i() && TextUtils.isEmpty(com.igexin.push.core.d.f63685s)) {
                com.igexin.push.core.d.E = 900000L;
                a(900000L, TimeUnit.MILLISECONDS);
                com.igexin.a.a.c.b.a("RTTask|date is error, set connect interval = 15min", new Object[0]);
                return;
            }
            com.igexin.a.a.c.b.a("RTTask reconnect timer task isOnline = false, try login...", new Object[0]);
            if (System.currentTimeMillis() - this.f64030b < 2500) {
                com.igexin.push.core.d.f63681o++;
            }
            if (com.igexin.push.core.d.f63681o > 30 && Math.abs(SystemClock.elapsedRealtime() - this.f64031c) < 72000.0d) {
                i.a().d();
            }
            this.f64030b = System.currentTimeMillis();
            m.a().b();
            j10 = 1800000;
        }
        com.igexin.push.core.d.E = j10;
        a(j10, TimeUnit.MILLISECONDS);
    }

    public void j() {
        b(com.igexin.push.core.d.D);
    }
}
