package org.aspectj.runtime.reflect;

/* JADX INFO: compiled from: CatchClauseSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends l implements zj.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Class f137719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f137720n;

    b(Class cls, Class cls2, String str) {
        super(0, "catch", cls);
        this.f137719m = cls2;
        this.f137720n = str;
    }

    b(String str) {
        super(str);
    }

    @Override // zj.e
    public String b() {
        if (this.f137720n == null) {
            this.f137720n = s(4);
        }
        return this.f137720n;
    }

    @Override // zj.e
    public Class i() {
        if (this.f137719m == null) {
            this.f137719m = u(3);
        }
        return this.f137719m;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        return "catch(" + nVar.g(i()) + ")";
    }
}
