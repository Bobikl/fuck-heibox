package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.zoloz.JSONObject;

/* JADX INFO: compiled from: JavaBeanCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements i, j {
    private static Object c(Field field, Object obj) throws Exception {
        if (field == null || obj == null || "this$0".equals(field.getName())) {
            return null;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        field.setAccessible(zIsAccessible);
        return f.f(obj2);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return true;
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        if (!obj.getClass().equals(JSONObject.class)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (jSONObject.has(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, e.b(jSONObject.get(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (!superclass.equals(Object.class)) {
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object objC = c(field, obj);
                    if (objC != null) {
                        treeMap.put(field.getName(), objC);
                    }
                }
            }
            superclass = superclass.getSuperclass();
            declaredFields = superclass.getDeclaredFields();
        }
        return treeMap;
    }
}
