package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ILogEncryptAction f42529b;

    public d() {
        if (ControllerCenter.getGlobalEnvStruct().getLogEncryptAction() == null) {
            this.f42529b = new com.efs.sdk.base.core.e.b();
        } else {
            this.f42529b = ControllerCenter.getGlobalEnvStruct().getLogEncryptAction();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        boolean z10;
        com.efs.sdk.base.core.d.a aVar = bVar.f42520a;
        if (!(1 != aVar.f42517e) && !"wa".equals(aVar.f42513a) && !Constants.LOG_TYPE_STARTPERF.equals(bVar.f42520a.f42513a)) {
            com.efs.sdk.base.core.d.a aVar2 = bVar.f42520a;
            z10 = (1 == aVar2.f42514b && !bVar.f42521b.f42524a) || 1 == aVar2.f42515c;
        }
        if (z10) {
            b(bVar);
            return;
        }
        byte[] bArrEncrypt = this.f42529b.encrypt(ControllerCenter.getGlobalEnvStruct().getSecret(), bVar.f42522c);
        if (bArrEncrypt != null) {
            bVar.a(bArrEncrypt);
            bVar.a(this.f42529b.getDeVal());
        }
        b(bVar);
    }
}
