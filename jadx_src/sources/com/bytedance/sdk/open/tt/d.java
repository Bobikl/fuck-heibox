package com.bytedance.sdk.open.tt;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class d implements j7.b {
    @Override // j7.b
    public boolean a(int i10, Bundle bundle, j7.a aVar) {
        if (bundle != null && aVar != null) {
            if (i10 == 5) {
                p7.c.a aVar2 = new p7.c.a(bundle);
                if (!aVar2.checkArgs()) {
                    return false;
                }
                aVar.a(aVar2);
                return true;
            }
            if (i10 == 6) {
                p7.c.b bVar = new p7.c.b(bundle);
                if (bVar.checkArgs()) {
                    aVar.c(bVar);
                    return true;
                }
            }
        }
        return false;
    }
}
