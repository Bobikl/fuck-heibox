package com.igexin.push.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class m extends com.igexin.push.f.b.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static m f63389c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63390e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63388b = "DT_" + m.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f63387a = new AtomicBoolean(false);

    private m() {
        super(10L);
        this.f63235n = true;
    }

    public static synchronized m c_() {
        if (f63389c == null) {
            f63389c = new m();
        }
        return f63389c;
    }

    public void a(long j10) {
        a(j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return 20150607;
    }

    @Override // com.igexin.push.f.b.g
    protected void d_() {
        long j10 = f.f63358a;
        a(j10, TimeUnit.MILLISECONDS);
        if (this.f63390e) {
            com.igexin.a.a.c.b.a(f63388b + "|detect task already stop", new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = f63388b;
        sb2.append(str);
        sb2.append("|");
        sb2.append(j10 / 1000);
        sb2.append("s passed, do task method, start redect ~~~~");
        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        boolean zH = com.igexin.push.util.a.h();
        com.igexin.push.core.d.f63673g = zH;
        if (zH) {
            i.a().c();
            return;
        }
        com.igexin.a.a.c.b.a(str + "|" + (j10 / 1000) + "s passed, network is unavailable, stop ###", new Object[0]);
    }

    public void h() {
        this.f63235n = false;
        this.f63390e = true;
        p();
    }
}
