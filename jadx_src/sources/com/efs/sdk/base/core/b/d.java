package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.controller.ControllerCenter;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {
    @Override // com.efs.sdk.base.core.b.e
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        if (bVar.f42522c == null) {
            return;
        }
        com.efs.sdk.base.core.util.b.a(new File(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()), com.efs.sdk.base.core.util.b.a(bVar)), bVar.f42522c);
        com.efs.sdk.base.core.f.f.a.f42551a.f42549c.b();
        com.efs.sdk.base.core.f.f.a.f42551a.f42549c.c();
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(File file) throws Throwable {
        com.efs.sdk.base.core.util.b.a(file, com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(String str) {
    }

    @Override // com.efs.sdk.base.core.b.e
    public final boolean a(File file, com.efs.sdk.base.core.d.b bVar) {
        if (!file.exists()) {
            return false;
        }
        bVar.f42523d = file;
        bVar.c();
        bVar.b(1);
        return true;
    }
}
