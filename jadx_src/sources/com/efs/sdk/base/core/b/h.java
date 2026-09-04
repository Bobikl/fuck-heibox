package com.efs.sdk.base.core.b;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements f {
    @Override // com.efs.sdk.base.core.b.f
    public final boolean a(File file) {
        com.efs.sdk.base.core.d.b bVarB = com.efs.sdk.base.core.util.b.b(file.getName());
        if (bVarB != null) {
            return ("wa".equals(bVarB.f42520a.f42513a) || com.efs.sdk.base.core.c.b.a().a(bVarB.f42520a.f42513a, file.length())) ? false : true;
        }
        a unused = a.b.f42431a;
        a.b(file);
        return true;
    }
}
