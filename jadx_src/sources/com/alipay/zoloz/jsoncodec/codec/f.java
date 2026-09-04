package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.alipay.zoloz.JSONArray;
import org.json.alipay.zoloz.JSONObject;

/* JADX INFO: compiled from: JSONSerializer.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<j> f39776a;

    static {
        ArrayList arrayList = new ArrayList();
        f39776a = arrayList;
        arrayList.add(new l());
        f39776a.add(new d());
        f39776a.add(new c());
        f39776a.add(new h());
        f39776a.add(new b());
        f39776a.add(new a());
        f39776a.add(new g());
    }

    private static void a(Object obj, List<Object> list) {
        int length = Array.getLength(obj);
        Class<?> componentType = obj.getClass().getComponentType();
        for (int i10 = 0; i10 < length; i10++) {
            if (componentType.equals(Integer.TYPE)) {
                list.add(Integer.valueOf(Array.getInt(obj, i10)));
            } else if (componentType.equals(Long.TYPE)) {
                list.add(Long.valueOf(Array.getLong(obj, i10)));
            } else if (componentType.equals(Double.TYPE)) {
                list.add(Double.valueOf(Array.getDouble(obj, i10)));
            } else if (componentType.equals(Boolean.TYPE)) {
                list.add(Boolean.valueOf(Array.getBoolean(obj, i10)));
            } else if (componentType.equals(Short.TYPE)) {
                list.add(Short.valueOf(Array.getShort(obj, i10)));
            } else if (componentType.equals(Byte.TYPE)) {
                list.add(Byte.valueOf(Array.getByte(obj, i10)));
            } else if (componentType.equals(Float.TYPE)) {
                list.add(Float.valueOf(Array.getFloat(obj, i10)));
            } else {
                list.add(Array.get(obj, i10));
            }
        }
    }

    private static Map<String, Object> b(Field field, Object obj) throws Exception {
        if (field == null || obj == null) {
            return null;
        }
        HashMap map = new HashMap();
        String name = field.getName();
        if ("this$0".equals(name)) {
            return null;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        if (Collection.class.isAssignableFrom(obj2.getClass())) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Collection) obj2) {
                if (com.alipay.zoloz.jsoncodec.util.a.b(obj3.getClass())) {
                    arrayList.add(obj3);
                } else {
                    arrayList.add(d(obj3));
                }
            }
            map.put(name, arrayList);
        } else if (obj2.getClass().isArray()) {
            ArrayList arrayList2 = new ArrayList();
            if (com.alipay.zoloz.jsoncodec.util.a.b(obj2.getClass().getComponentType())) {
                a(obj2, arrayList2);
                map.put(name, arrayList2);
            }
        } else if (Date.class.isAssignableFrom(obj2.getClass())) {
            map.put(name, Long.valueOf(((Date) obj2).getTime()));
        } else if (com.alipay.zoloz.jsoncodec.util.a.b(obj2.getClass())) {
            map.put(name, obj2);
        } else {
            map.put(name, d(obj2));
        }
        field.setAccessible(zIsAccessible);
        return map;
    }

    private static List<Object> c(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (com.alipay.zoloz.jsoncodec.util.a.b(obj2.getClass())) {
                arrayList.add(obj2);
            } else {
                arrayList.add(d(obj2));
            }
        }
        return arrayList;
    }

    private static TreeMap<String, Object> d(Object obj) throws Exception {
        Map<String, Object> mapB;
        Class<?> superclass = obj.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        TreeMap<String, Object> treeMap = new TreeMap<>();
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (com.alipay.zoloz.jsoncodec.util.a.b(value.getClass())) {
                    treeMap.put(str, value);
                } else if (value.getClass().isArray()) {
                    ArrayList arrayList = new ArrayList();
                    if (com.alipay.zoloz.jsoncodec.util.a.b(value.getClass().getComponentType())) {
                        a(value, arrayList);
                    } else {
                        int length = Array.getLength(value);
                        for (int i10 = 0; i10 < length; i10++) {
                            TreeMap<String, Object> treeMapD = d(Array.get(value, i10));
                            if (treeMapD != null && treeMapD.size() > 0) {
                                arrayList.add(treeMapD);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        treeMap.put((String) entry.getKey(), arrayList);
                    }
                } else if (value instanceof Collection) {
                    treeMap.put((String) entry.getKey(), c(value));
                } else {
                    TreeMap<String, Object> treeMapD2 = d(entry.getValue());
                    if (treeMapD2 != null && treeMapD2.size() > 0) {
                        treeMap.put((String) entry.getKey(), treeMapD2);
                    }
                }
            }
        } else {
            while (!superclass.equals(Object.class)) {
                if (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field != null && (mapB = b(field, obj)) != null && mapB.size() > 0) {
                            treeMap.putAll(mapB);
                        }
                    }
                }
                superclass = superclass.getSuperclass();
                declaredFields = superclass.getDeclaredFields();
            }
        }
        return treeMap;
    }

    public static String e(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        Object objF = f(obj);
        if (com.alipay.zoloz.jsoncodec.util.a.b(objF.getClass())) {
            return JSONObject.quote(objF.toString());
        }
        if (Collection.class.isAssignableFrom(objF.getClass())) {
            return new JSONArray((Collection) objF).toString();
        }
        if (Map.class.isAssignableFrom(objF.getClass())) {
            return new JSONObject((Map) objF).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objF.getClass());
    }

    public static Object f(Object obj) throws Exception {
        Object objSerialize;
        if (obj == null) {
            return null;
        }
        for (j jVar : f39776a) {
            if (jVar.a(obj.getClass()) && (objSerialize = jVar.serialize(obj)) != null) {
                return objSerialize;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
