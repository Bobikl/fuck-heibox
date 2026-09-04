package com.alipay.deviceid.module.x;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;

/* JADX INFO: compiled from: JavaBeanCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ah implements aj, ak {
    @Override // com.alipay.deviceid.module.x.ak
    public final Object a(Object obj) throws IllegalAccessException {
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (!superclass.equals(Object.class)) {
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object objB = null;
                    if (field != null && !"this$0".equals(field.getName())) {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            field.setAccessible(zIsAccessible);
                            objB = ag.b(obj2);
                        }
                    }
                    if (objB != null) {
                        treeMap.put(field.getName(), objB);
                    }
                }
            }
            superclass = superclass.getSuperclass();
            declaredFields = superclass.getDeclaredFields();
        }
        return treeMap;
    }

    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(z.class)) {
            return null;
        }
        z zVar = (z) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (zVar.f38382a.containsKey(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, af.a(zVar.a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return true;
    }
}
