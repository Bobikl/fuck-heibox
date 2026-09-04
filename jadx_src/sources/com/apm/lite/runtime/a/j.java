package com.apm.lite.runtime.a;

import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.k.s;

/* JADX INFO: loaded from: classes6.dex */
public class j extends c {
    j(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
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
        }
        return aVarA;
    }

    @Override // com.apm.lite.runtime.a.c
    protected boolean d() {
        return false;
    }

    @Override // com.apm.lite.runtime.a.c
    public int e() {
        return com.apm.lite.nativecrash.b.a();
    }

    @Override // com.apm.lite.runtime.a.c
    protected boolean j() {
        return false;
    }

    @Override // com.apm.lite.runtime.a.c
    protected void n(com.apm.lite.d.a aVar) {
    }
}
