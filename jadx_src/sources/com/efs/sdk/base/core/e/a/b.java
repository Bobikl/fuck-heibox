package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.controller.ControllerCenter;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        com.efs.sdk.base.core.b.e eVarA;
        byte[] bArr;
        if (bVar.f42521b.f42524a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.b.a aVar = com.efs.sdk.base.core.b.a.b.f42431a;
        if ("wa".equals(bVar.f42520a.f42513a) || com.efs.sdk.base.core.b.c.a().f42433a) {
            com.efs.sdk.base.core.d.a aVar2 = bVar.f42520a;
            if ((aVar2.f42515c == 0 && ((bArr = bVar.f42522c) == null || bArr.length == 0)) || (eVarA = aVar.f42429c.a(aVar2.f42514b)) == null) {
                return;
            }
            eVarA.a(bVar);
            return;
        }
        if (!aVar.f42427a) {
            com.efs.sdk.base.core.f.f fVar = com.efs.sdk.base.core.f.f.a.f42551a;
            int i10 = com.efs.sdk.base.core.config.a.c.a().f42493d.f42483a;
            if (fVar.f42548b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                fVar.f42548b.send(fVar.a("disk_limit", i10));
            }
        }
        aVar.f42427a = true;
    }
}
