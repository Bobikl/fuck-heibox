package com.igexin.push.c;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class s extends o implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static s f63403e;

    private s() {
        super(com.igexin.push.core.d.f63667al, com.igexin.push.core.d.an);
        this.f63396d.a(true);
    }

    public static synchronized s a() {
        if (f63403e == null) {
            f63403e = new s();
        }
        return f63403e;
    }

    @Override // com.igexin.push.c.r
    public void a(g gVar, j jVar) {
        k kVarA;
        if (jVar == null || TextUtils.isEmpty(jVar.a()) || (kVarA = a(jVar.a())) == null) {
            return;
        }
        b(jVar);
        kVarA.d();
        l();
        if (gVar == g.SUCCESS) {
            k();
        }
    }

    @Override // com.igexin.push.c.r
    public void a(j jVar) {
    }

    @Override // com.igexin.push.c.o
    public h b() {
        return h.WIFI;
    }

    @Override // com.igexin.push.c.o
    public r c() {
        return this;
    }
}
