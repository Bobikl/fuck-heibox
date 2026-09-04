package com.alipay.deviceid.module.x;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: MapCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ai implements aj, ak {
    private static Map<Object, Object> a(Type type) {
        while (type != Properties.class) {
            if (type == Hashtable.class) {
                return new Hashtable();
            }
            if (type == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (type == SortedMap.class || type == TreeMap.class) {
                return new TreeMap();
            }
            if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (type == Map.class || type == HashMap.class) {
                return new HashMap();
            }
            if (type == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (!(type instanceof ParameterizedType)) {
                Class cls = (Class) type;
                if (cls.isInterface()) {
                    throw new IllegalArgumentException("unsupport type " + type);
                }
                try {
                    return (Map) cls.newInstance();
                } catch (Exception e10) {
                    throw new IllegalArgumentException("unsupport type " + type, e10);
                }
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return new Properties();
    }

    @Override // com.alipay.deviceid.module.x.ak
    public final Object a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put((String) entry.getKey(), ag.b(entry.getValue()));
        }
        return treeMap;
    }

    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(z.class)) {
            return null;
        }
        z zVar = (z) obj;
        Map<Object, Object> mapA = a(type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator itA = zVar.a();
        while (itA.hasNext()) {
            String str = (String) itA.next();
            if (an.a((Class<?>) type3)) {
                mapA.put(str, zVar.a(str));
            } else {
                mapA.put(str, af.a(zVar.a(str), type3));
            }
        }
        return mapA;
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
