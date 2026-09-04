package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: InterTypeConstructorDeclarationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends i implements zj.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f137634e;

    public h(zj.c<?> cVar, String str, int i10, Method method) {
        super(cVar, str, i10);
        this.f137634e = method;
    }

    @Override // zj.n
    public zj.c<?>[] c() {
        Class<?>[] parameterTypes = this.f137634e.getParameterTypes();
        zj.c<?>[] cVarArr = new zj.c[parameterTypes.length - 1];
        for (int i10 = 1; i10 < parameterTypes.length; i10++) {
            cVarArr[i10 - 1] = zj.d.a(parameterTypes[i10]);
        }
        return cVarArr;
    }

    @Override // zj.n
    public zj.c<?>[] e() {
        Class<?>[] exceptionTypes = this.f137634e.getExceptionTypes();
        zj.c<?>[] cVarArr = new zj.c[exceptionTypes.length];
        for (int i10 = 0; i10 < exceptionTypes.length; i10++) {
            cVarArr[i10] = zj.d.a(exceptionTypes[i10]);
        }
        return cVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zj.n
    public Type[] f() {
        Type[] genericParameterTypes = this.f137634e.getGenericParameterTypes();
        zj.c[] cVarArr = new zj.c[genericParameterTypes.length - 1];
        for (int i10 = 1; i10 < genericParameterTypes.length; i10++) {
            Type type = genericParameterTypes[i10];
            if (type instanceof Class) {
                cVarArr[i10 - 1] = zj.d.a((Class) type);
            } else {
                cVarArr[i10 - 1] = type;
            }
        }
        return cVarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(this.f137636b);
        stringBuffer.append(".new");
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
