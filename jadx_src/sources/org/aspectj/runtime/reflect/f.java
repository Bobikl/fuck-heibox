package org.aspectj.runtime.reflect;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: FieldSignatureImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends j implements zj.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Class f137733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Field f137734n;

    f(int i10, String str, Class cls, Class cls2) {
        super(i10, str, cls);
        this.f137733m = cls2;
    }

    f(String str) {
        super(str);
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    @Override // zj.l
    public Class g() {
        if (this.f137733m == null) {
            this.f137733m = u(3);
        }
        return this.f137733m;
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public /* bridge */ /* synthetic */ int getModifiers() {
        return super.getModifiers();
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // zj.l
    public Field h() {
        if (this.f137734n == null) {
            try {
                this.f137734n = a().getDeclaredField(getName());
            } catch (Exception unused) {
            }
        }
        return this.f137734n;
    }

    @Override // org.aspectj.runtime.reflect.l, org.aspectj.lang.f
    public /* bridge */ /* synthetic */ String k() {
        return super.k();
    }

    @Override // org.aspectj.runtime.reflect.l
    protected String q(n nVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(nVar.e(getModifiers()));
        if (nVar.f137769b) {
            stringBuffer.append(nVar.g(g()));
        }
        if (nVar.f137769b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(nVar.f(a(), k()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    @Override // org.aspectj.runtime.reflect.l
    public /* bridge */ /* synthetic */ void z(ClassLoader classLoader) {
        super.z(classLoader);
    }
}
