package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107221a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f480a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gl f482a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f483a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f484a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bl f481a = bl.a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final gm f107222a = new gm();
    }

    private gf a(bl.a aVar) {
        if (aVar.f216a == 0) {
            Object obj = aVar.f217a;
            if (obj instanceof gf) {
                return (gf) obj;
            }
            return null;
        }
        gf gfVarM409a = m409a();
        gfVarM409a.a(ge.CHANNEL_STATS_COUNTER.a());
        gfVarM409a.c(aVar.f216a);
        gfVarM409a.c(aVar.f218a);
        return gfVarM409a;
    }

    private gg a(int i10) {
        ArrayList arrayList = new ArrayList();
        gg ggVar = new gg(this.f483a, arrayList);
        if (!bg.e(this.f482a.f477a)) {
            ggVar.a(i.i(this.f482a.f477a));
        }
        kr krVar = new kr(i10);
        kj kjVarA = new kp.a().a(krVar);
        try {
            ggVar.b(kjVarA);
        } catch (kd unused) {
        }
        LinkedList<bl.a> linkedListM188a = this.f481a.m188a();
        while (linkedListM188a.size() > 0) {
            try {
                gf gfVarA = a(linkedListM188a.getLast());
                if (gfVarA != null) {
                    gfVarA.b(kjVarA);
                }
                if (krVar.a_() > i10) {
                    break;
                }
                if (gfVarA != null) {
                    arrayList.add(gfVarA);
                }
                linkedListM188a.removeLast();
            } catch (kd | NoSuchElementException unused2) {
            }
        }
        return ggVar;
    }

    public static gl a() {
        gl glVar;
        gm gmVar = a.f107222a;
        synchronized (gmVar) {
            glVar = gmVar.f482a;
        }
        return glVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static gm m407a() {
        return a.f107222a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private void m408a() {
        if (!this.f484a || System.currentTimeMillis() - this.f480a <= this.f107221a) {
            return;
        }
        this.f484a = false;
        this.f480a = 0L;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    synchronized gf m409a() {
        gf gfVar;
        gfVar = new gf();
        gfVar.a(bg.m175a((Context) this.f482a.f477a));
        gfVar.f454a = (byte) 0;
        gfVar.f458b = 1;
        gfVar.d((int) (System.currentTimeMillis() / 1000));
        return gfVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    synchronized gg m410a() {
        gg ggVarA;
        ggVarA = null;
        if (b()) {
            int i10 = bb.c.b.f31017wb;
            if (!bg.e(this.f482a.f477a)) {
                i10 = 375;
            }
            ggVarA = a(i10);
        }
        return ggVarA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m411a(int i10) {
        if (i10 > 0) {
            int i11 = i10 * 1000;
            if (i11 > 604800000) {
                i11 = 604800000;
            }
            if (this.f107221a == i11 && this.f484a) {
                return;
            }
            this.f484a = true;
            this.f480a = System.currentTimeMillis();
            this.f107221a = i11;
            com.xiaomi.channel.commonutils.logger.b.c("enable dot duration = " + i11 + " start = " + this.f480a);
        }
    }

    synchronized void a(gf gfVar) {
        this.f481a.a(gfVar);
    }

    public synchronized void a(XMPushService xMPushService) {
        this.f482a = new gl(xMPushService);
        this.f483a = "";
        com.xiaomi.push.service.bw.a().a(new gn(this));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m412a() {
        return this.f484a;
    }

    boolean b() {
        m408a();
        return this.f484a && this.f481a.m187a() > 0;
    }
}
