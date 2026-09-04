package org.aspectj.runtime.reflect;

import zj.r;

/* JADX INFO: compiled from: LockSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends l implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Class f137746m;

    i(Class cls) {
        super(8, "lock", cls);
        this.f137746m = cls;
    }

    i(String str) {
        super(str);
    }

    public Class i() {
        if (this.f137746m == null) {
            this.f137746m = u(3);
        }
        return this.f137746m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        if (this.f137746m == null) {
            this.f137746m = u(3);
        }
        return "lock(" + nVar.g(this.f137746m) + ")";
    }
}
