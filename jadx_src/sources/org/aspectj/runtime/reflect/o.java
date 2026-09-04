package org.aspectj.runtime.reflect;

import zj.c0;

/* JADX INFO: compiled from: UnlockSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends l implements c0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Class f137777m;

    o(Class cls) {
        super(8, "unlock", cls);
        this.f137777m = cls;
    }

    o(String str) {
        super(str);
    }

    public Class i() {
        if (this.f137777m == null) {
            this.f137777m = u(3);
        }
        return this.f137777m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        if (this.f137777m == null) {
            this.f137777m = u(3);
        }
        return "unlock(" + nVar.g(this.f137777m) + ")";
    }
}
