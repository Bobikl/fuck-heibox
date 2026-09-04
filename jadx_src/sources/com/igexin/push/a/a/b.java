package com.igexin.push.a.a;

import com.igexin.push.core.a.e;
import com.igexin.push.core.w;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.igexin.push.f.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63314a = "com.igexin.push.a.a.b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63315b = 0;

    @Override // com.igexin.push.f.b.c
    public void a() {
        com.igexin.a.a.c.b.a("start cron-keep task", new Object[0]);
        e.a().i();
        w.a().c();
        w.a().d();
        w.a().g();
        e.a().g();
        e.a().j();
    }

    @Override // com.igexin.push.f.b.c
    public void a(long j10) {
        this.f63315b = j10;
    }

    @Override // com.igexin.push.f.b.c
    public boolean b() {
        return System.currentTimeMillis() - this.f63315b > 3600000;
    }
}
