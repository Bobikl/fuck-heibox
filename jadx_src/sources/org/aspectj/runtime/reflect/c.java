package org.aspectj.runtime.reflect;

/* JADX INFO: compiled from: CodeSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends j implements zj.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Class[] f137721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String[] f137722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Class[] f137723o;

    c(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, str, cls);
        this.f137721m = clsArr;
        this.f137722n = strArr;
        this.f137723o = clsArr2;
    }

    c(String str) {
        super(str);
    }

    @Override // zj.f
    public Class[] c() {
        if (this.f137721m == null) {
            this.f137721m = v(3);
        }
        return this.f137721m;
    }

    @Override // zj.f
    public Class[] e() {
        if (this.f137723o == null) {
            this.f137723o = v(5);
        }
        return this.f137723o;
    }

    @Override // zj.f
    public String[] getParameterNames() {
        if (this.f137722n == null) {
            this.f137722n = t(4);
        }
        return this.f137722n;
    }
}
