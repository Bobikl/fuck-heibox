package com.igexin.push.core.a;

/* JADX INFO: loaded from: classes.dex */
public class s extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63498a = com.igexin.push.config.k.f63422a + "_RegisterFailResultAction";

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) {
        if ((obj instanceof com.igexin.push.d.c.p) && ((com.igexin.push.d.c.p) obj).f63887a == 1) {
            com.igexin.a.a.c.b.a(f63498a + "|Register failed because of the wrong appid", new Object[0]);
            com.igexin.a.a.c.a.f.a().a("Register failed because of the wrong appid = " + com.igexin.push.core.d.f63655a);
            com.igexin.push.core.d.f63674h = true;
            com.igexin.push.core.c.a().i().c();
        }
        return true;
    }
}
