package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: compiled from: TypeVisitor.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Type> f59160a = Sets.u();

    q() {
    }

    public final void a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f59160a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            String strValueOf = String.valueOf(type);
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14);
                            sb2.append("Unknown type: ");
                            sb2.append(strValueOf);
                            throw new AssertionError(sb2.toString());
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th2) {
                    this.f59160a.remove(type);
                    throw th2;
                }
            }
        }
    }

    void b(Class<?> cls) {
    }

    void c(GenericArrayType genericArrayType) {
    }

    void d(ParameterizedType parameterizedType) {
    }

    void e(TypeVariable<?> typeVariable) {
    }

    void f(WildcardType wildcardType) {
    }
}
