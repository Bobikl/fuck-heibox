package com.apm.lite.runtime.a;

import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.k.s;

/* JADX INFO: loaded from: classes6.dex */
public class i extends c {
    i(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.lite.runtime.a.c
    public com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar) {
        com.apm.lite.d.a aVarA = super.a(i10, aVar);
        if (i10 == 0) {
            com.apm.lite.d.c cVarA = com.apm.lite.d.c.a(this.f40157b);
            cVarA.m();
            aVarA.c(cVarA);
            s.a(aVarA, cVarA, this.f40156a);
        } else if (i10 == 1) {
            com.apm.lite.d.c cVarH = aVarA.H();
            cVarH.o();
            cVarH.q();
        } else if (i10 == 2) {
            com.apm.lite.d.c.c(aVarA.H());
            try {
                aVarA.H().s().put("launch_did", com.apm.lite.g.a.a(this.f40157b));
            } catch (Throwable unused) {
            }
        } else if (i10 == 5) {
            com.apm.lite.d.c.h(aVarA.H());
        }
        return aVarA;
    }
}
