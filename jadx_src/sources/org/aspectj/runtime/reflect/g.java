package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: InitializerSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends c implements zj.m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Constructor f137735p;

    /* JADX WARN: Illegal instructions before constructor call */
    g(int i10, Class cls) {
        String str = Modifier.isStatic(i10) ? "<clinit>" : "<init>";
        Class[] clsArr = l.f137752k;
        super(i10, str, cls, clsArr, l.f137751j, clsArr);
    }

    g(String str) {
        super(str);
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public String getName() {
        return Modifier.isStatic(getModifiers()) ? "<clinit>" : "<init>";
    }

    @Override // zj.m
    public Constructor j() {
        if (this.f137735p == null) {
            try {
                this.f137735p = a().getDeclaredConstructor(c());
            } catch (Exception unused) {
            }
        }
        return this.f137735p;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        stringBuffer.append(nVar.f(a(), k()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }
}
