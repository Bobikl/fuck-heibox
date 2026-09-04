package org.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import zj.t;

/* JADX INFO: compiled from: MethodSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends c implements t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Method f137747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Class f137748q;

    k(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f137748q = cls2;
    }

    k(String str) {
        super(str);
    }

    private Method E(Class cls, String str, Class[] clsArr, Set set) {
        if (cls == null) {
            return null;
        }
        if (!set.contains(cls)) {
            set.add(cls);
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method methodE = E(cls.getSuperclass(), str, clsArr, set);
        if (methodE != null) {
            return methodE;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null) {
            for (Class<?> cls2 : interfaces) {
                Method methodE2 = E(cls2, str, clsArr, set);
                if (methodE2 != null) {
                    return methodE2;
                }
            }
        }
        return null;
    }

    @Override // zj.t
    public Method getMethod() {
        if (this.f137747p == null) {
            Class clsA = a();
            try {
                this.f137747p = clsA.getDeclaredMethod(getName(), c());
            } catch (NoSuchMethodException unused) {
                HashSet hashSet = new HashSet();
                hashSet.add(clsA);
                this.f137747p = E(clsA, getName(), c(), hashSet);
            }
        }
        return this.f137747p;
    }

    @Override // zj.t
    public Class getReturnType() {
        if (this.f137748q == null) {
            this.f137748q = u(6);
        }
        return this.f137748q;
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        if (nVar.f137769b) {
            stringBuffer.append(nVar.g(getReturnType()));
        }
        if (nVar.f137769b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), k()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        nVar.a(stringBuffer, c());
        nVar.b(stringBuffer, e());
        return stringBuffer.toString();
    }
}
