package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.http.HttpResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        HttpResponse httpResponseA;
        if (!bVar.f42521b.f42524a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.c.d dVarA = com.efs.sdk.base.core.c.d.a();
        if (!bVar.f42521b.f42525b || com.efs.sdk.base.core.c.b.a().a(bVar.f42520a.f42513a, bVar.a())) {
            com.efs.sdk.base.core.f.f.a.f42551a.f42549c.b();
            com.efs.sdk.base.core.f.f.a.f42551a.f42549c.c();
            httpResponseA = dVarA.f42449b.a(bVar, false);
        } else {
            httpResponseA = new HttpResponse();
            httpResponseA.data = "flow_limit";
        }
        bVar.f42521b.f42526c = httpResponseA;
        b(bVar);
    }
}
