package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: InterTypeMethodDeclarationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends i implements zj.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Method f137643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zj.c<?>[] f137645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Type[] f137646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private zj.c<?> f137647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Type f137648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private zj.c<?>[] f137649l;

    public k(zj.c<?> cVar, String str, int i10, String str2, Method method) {
        super(cVar, str, i10);
        this.f137644g = 1;
        this.f137642e = str2;
        this.f137643f = method;
    }

    public k(zj.c<?> cVar, zj.c<?> cVar2, Method method, int i10) {
        super(cVar, cVar2, i10);
        this.f137644g = 0;
        this.f137642e = method.getName();
        this.f137643f = method;
    }

    @Override // zj.q
    public Type b() {
        Type genericReturnType = this.f137643f.getGenericReturnType();
        return genericReturnType instanceof Class ? zj.d.a((Class) genericReturnType) : genericReturnType;
    }

    @Override // zj.q
    public zj.c<?>[] c() {
        Class<?>[] parameterTypes = this.f137643f.getParameterTypes();
        int length = parameterTypes.length;
        int i10 = this.f137644g;
        zj.c<?>[] cVarArr = new zj.c[length - i10];
        while (i10 < parameterTypes.length) {
            cVarArr[i10 - this.f137644g] = zj.d.a(parameterTypes[i10]);
            i10++;
        }
        return cVarArr;
    }

    @Override // zj.q
    public zj.c<?>[] e() {
        Class<?>[] exceptionTypes = this.f137643f.getExceptionTypes();
        zj.c<?>[] cVarArr = new zj.c[exceptionTypes.length];
        for (int i10 = 0; i10 < exceptionTypes.length; i10++) {
            cVarArr[i10] = zj.d.a(exceptionTypes[i10]);
        }
        return cVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zj.q
    public Type[] f() {
        Type[] genericParameterTypes = this.f137643f.getGenericParameterTypes();
        int length = genericParameterTypes.length;
        int i10 = this.f137644g;
        zj.c[] cVarArr = new zj.c[length - i10];
        while (i10 < genericParameterTypes.length) {
            Type type = genericParameterTypes[i10];
            if (type instanceof Class) {
                cVarArr[i10 - this.f137644g] = zj.d.a((Class) type);
            } else {
                cVarArr[i10 - this.f137644g] = type;
            }
            i10++;
        }
        return cVarArr;
    }

    @Override // zj.q
    public String getName() {
        return this.f137642e;
    }

    @Override // zj.q
    public zj.c<?> getReturnType() {
        return zj.d.a(this.f137643f.getReturnType());
    }

    @Override // zj.q
    public TypeVariable<Method>[] getTypeParameters() {
        return this.f137643f.getTypeParameters();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(getReturnType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f137636b);
        stringBuffer.append(".");
        stringBuffer.append(getName());
        stringBuffer.append("(");
        zj.c<?>[] cVarArrC = c();
        for (int i10 = 0; i10 < cVarArrC.length - 1; i10++) {
            stringBuffer.append(cVarArrC[i10].toString());
            stringBuffer.append(", ");
        }
        if (cVarArrC.length > 0) {
            stringBuffer.append(cVarArrC[cVarArrC.length - 1].toString());
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
