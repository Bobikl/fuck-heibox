package com.huawei.hms.support.gentyref;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes7.dex */
public final class GenericTypeReflector {
    private GenericTypeReflector() {
    }

    public static Class<?> getType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            return typeVariable.getBounds().length == 0 ? Object.class : getType(typeVariable.getBounds()[0]);
        }
        throw new IllegalArgumentException("not supported: " + type.getClass());
    }
}
