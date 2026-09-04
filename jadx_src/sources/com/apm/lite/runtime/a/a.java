package com.apm.lite.runtime.a;

import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.k.s;

/* JADX INFO: loaded from: classes6.dex */
public class a extends c {
    a(Context context, b bVar, d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    @Override // com.apm.lite.runtime.a.c
    public com.apm.lite.d.a b(com.apm.lite.d.a aVar) {
        com.apm.lite.d.a aVarB = super.b(aVar);
        com.apm.lite.d.c cVarA = com.apm.lite.d.c.a(this.f40157b);
        com.apm.lite.d.c.c(cVarA);
        com.apm.lite.d.c.h(cVarA);
        cVarA.m();
        cVarA.o();
        cVarA.q();
        aVarB.c(cVarA);
        aVarB.j("process_name", com.apm.lite.k.a.m(this.f40157b));
        s.a(aVarB, cVarA, this.f40156a);
        return aVarB;
    }

    @Override // com.apm.lite.runtime.a.c
    protected boolean d() {
        return true;
    }
}
