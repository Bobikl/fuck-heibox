package com.alibaba.fastjson;

import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public class TypeReference<T> {
    protected final Type type;
    static ConcurrentMap<Type, Type> classTypeCache = new ConcurrentHashMap(16, 0.75f, 1);
    public static final Type LIST_STRING = new TypeReference<List<String>>() { // from class: com.alibaba.fastjson.TypeReference.1
    }.getType();

    protected TypeReference() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type type2 = classTypeCache.get(type);
        if (type2 == null) {
            classTypeCache.putIfAbsent(type, type);
            type2 = classTypeCache.get(type);
        }
        this.type = type2;
    }

    protected TypeReference(Type... typeArr) {
        Class<?> cls = getClass();
        ParameterizedType parameterizedType = (ParameterizedType) ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0];
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int i10 = 0;
        for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
            if ((actualTypeArguments[i11] instanceof TypeVariable) && i10 < typeArr.length) {
                actualTypeArguments[i11] = typeArr[i10];
                i10++;
            }
            Type type = actualTypeArguments[i11];
            if (type instanceof GenericArrayType) {
                actualTypeArguments[i11] = TypeUtils.checkPrimitiveArray((GenericArrayType) type);
            }
        }
        ParameterizedTypeImpl parameterizedTypeImpl = new ParameterizedTypeImpl(actualTypeArguments, cls, rawType);
        Type type2 = classTypeCache.get(parameterizedTypeImpl);
        if (type2 == null) {
            classTypeCache.putIfAbsent(parameterizedTypeImpl, parameterizedTypeImpl);
            type2 = classTypeCache.get(parameterizedTypeImpl);
        }
        this.type = type2;
    }

    public Type getType() {
        return this.type;
    }
}
