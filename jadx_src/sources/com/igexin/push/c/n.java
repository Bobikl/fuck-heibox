package com.igexin.push.c;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class n extends o implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static n f63391e;

    private n() {
        super(com.igexin.push.core.d.f63666ak, com.igexin.push.core.d.am);
        this.f63396d.a(false);
    }

    public static synchronized n a() {
        if (f63391e == null) {
            f63391e = new n();
        }
        return f63391e;
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
        return h.MOBILE;
    }

    @Override // com.igexin.push.c.o
    public r c() {
        return this;
    }
}
