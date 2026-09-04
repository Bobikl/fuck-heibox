package com.igexin.push.core.a;

/* JADX INFO: loaded from: classes.dex */
public class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63494a = "com.igexin.push.core.a.l";

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) {
        if (obj instanceof com.igexin.push.d.c.h) {
            com.igexin.push.d.c.h hVar = (com.igexin.push.d.c.h) obj;
            boolean z10 = hVar.f63855a == 0;
            StringBuilder sb2 = new StringBuilder();
            String str = f63494a;
            sb2.append(str);
            sb2.append("|KeyNego result = ");
            sb2.append((int) hVar.f63855a);
            com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
            if (z10) {
                com.igexin.a.a.c.b.a(str + "|KeyNego success and login", new Object[0]);
                com.igexin.push.core.m.a().c();
            }
        }
        return true;
    }
}
