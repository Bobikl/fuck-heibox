package com.alipay.zoloz.jsoncodec.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: ClassUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: com.alipay.zoloz.jsoncodec.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassUtil.java */
    public static final class C0305a implements ParameterizedType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f39777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type[] f39778c;

        C0305a(Type type, Type[] typeArr) {
            this.f39777b = type;
            this.f39778c = typeArr;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            ArrayList arrayList = new ArrayList();
            for (Type type : this.f39778c) {
                arrayList.add(type);
            }
            return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f39777b;
        }
    }

    public static Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a(((ParameterizedType) type).getRawType());
        }
        throw new IllegalArgumentException("TODO");
    }

    public static boolean b(Class<?> cls) {
        return cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }

    public static ParameterizedType c(Type type, Type... typeArr) {
        return new C0305a(type, typeArr);
    }
}
