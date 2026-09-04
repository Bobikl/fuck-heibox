package com.igexin.push.d;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.audio.q0;
import com.igexin.push.config.l;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f63809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f63810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f63811i;

    private b() {
        this.f63803a = l.f63442t;
        this.f63804b = l.f63444v;
        this.f63811i = new f();
        this.f63810h = com.igexin.push.util.a.c() ? d.WIFI : d.MOBILE;
    }

    public static b a() {
        return e.f63891a;
    }

    private void a(int i10) {
        if (com.igexin.push.core.d.f63671e == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.igexin.sdk.action.polling");
            Bundle bundle = new Bundle();
            bundle.putInt("code", i10);
            intent.putExtras(bundle);
            intent.setPackage(com.igexin.push.core.d.f63671e.getPackageName());
            com.igexin.push.core.d.f63671e.sendBroadcast(intent, com.igexin.push.core.d.az);
        } catch (Throwable unused) {
        }
    }

    private void h() {
        com.igexin.a.a.c.b.a("ConnectModelCoordinator|reset current model = normal", new Object[0]);
        i iVar = this.f63811i;
        if (iVar != null && !(iVar instanceof f)) {
            this.f63811i = new f();
        }
        com.igexin.push.f.b.d.i().k();
        this.f63808f = 0;
        this.f63806d = 0;
        this.f63805c = false;
        com.igexin.push.core.b.i.a().b(this.f63805c);
    }

    private void i() {
        a(0);
    }

    private void j() {
        a(1);
    }

    public void a(boolean z10) {
        this.f63805c = z10;
        com.igexin.a.a.c.b.a("ConnectModelCoordinator|init, current is polling model = " + z10, new Object[0]);
        if (z10) {
            com.igexin.push.f.b.d.i().j();
        }
    }

    public synchronized void b() {
        d dVar = com.igexin.push.util.a.c() ? d.WIFI : d.MOBILE;
        if (dVar != this.f63810h) {
            com.igexin.a.a.c.b.a("ConnectModelCoordinator|net type changed " + this.f63810h + "->" + dVar, new Object[0]);
            h();
            this.f63810h = dVar;
        }
    }

    public i c() {
        return this.f63811i;
    }

    public synchronized void d() {
        if (this.f63805c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f63807e;
        if (jCurrentTimeMillis > q0.f44202v && jCurrentTimeMillis < 200000) {
            this.f63806d++;
            com.igexin.a.a.c.b.a("ConnectModelCoordinator|read len = -1, interval = " + jCurrentTimeMillis + ", disconnect =" + this.f63806d, new Object[0]);
            if (this.f63806d >= this.f63803a) {
                com.igexin.a.a.c.b.a("ConnectModelCoordinator|enter polling mode ####", new Object[0]);
                i();
                this.f63805c = true;
                this.f63811i = new g();
                com.igexin.push.f.b.d.i().j();
                com.igexin.push.core.b.i.a().b(this.f63805c);
            }
        }
    }

    public synchronized void e() {
        if (this.f63805c) {
            if (System.currentTimeMillis() - this.f63809g >= 120000) {
                this.f63808f++;
                com.igexin.a.a.c.b.a("ConnectModelCoordinator|polling mode, cur hearbeat =" + this.f63808f, new Object[0]);
                if (this.f63808f >= this.f63804b) {
                    com.igexin.a.a.c.b.a("ConnectModelCoordinator|enter normal mode ####", new Object[0]);
                    j();
                    com.igexin.push.core.d.D = 0L;
                    h();
                }
            }
            this.f63809g = System.currentTimeMillis();
        }
    }

    public void f() {
        this.f63807e = System.currentTimeMillis();
        if (this.f63805c) {
            this.f63811i = new g();
            com.igexin.push.f.b.d.i().j();
            this.f63808f = 0;
        }
    }

    public void g() {
        i iVar;
        if (!this.f63805c || (iVar = this.f63811i) == null || (iVar instanceof f)) {
            return;
        }
        this.f63811i = new f();
    }
}
