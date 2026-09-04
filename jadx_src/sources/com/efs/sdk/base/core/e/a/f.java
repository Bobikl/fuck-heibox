package com.efs.sdk.base.core.e.a;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        Double d10;
        com.efs.sdk.base.core.config.a.c cVarA = com.efs.sdk.base.core.config.a.c.a();
        String str = bVar.f42520a.f42513a;
        com.efs.sdk.base.core.config.a.b bVar2 = cVarA.f42493d;
        if (com.efs.sdk.base.core.config.a.c.f42490a.nextDouble() * 100.0d <= ((!bVar2.f42487e.containsKey(str) || (d10 = bVar2.f42487e.get(str)) == null) ? 100.0d : d10.doubleValue())) {
            b(bVar);
        }
    }
}
