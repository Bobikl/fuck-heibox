package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: ConstructorSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends c implements zj.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Constructor f137724p;

    d(int i10, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, "<init>", cls, clsArr, strArr, clsArr2);
    }

    d(String str) {
        super(str);
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public String getName() {
        return "<init>";
    }

    @Override // zj.g
    public Constructor l() {
        if (this.f137724p == null) {
            try {
                this.f137724p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f137724p;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        stringBuffer.append(nVar.f(a(), k()));
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }
}
