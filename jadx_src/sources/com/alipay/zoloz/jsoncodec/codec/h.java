package com.alipay.zoloz.jsoncodec.codec;

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
import org.json.alipay.zoloz.JSONObject;

/* JADX INFO: compiled from: MapCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements i, j {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        if (!obj.getClass().equals(JSONObject.class)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Map<Object, Object> mapC = c(type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String str = (String) itKeys.next();
            if (com.alipay.zoloz.jsoncodec.util.a.b((Class) type3)) {
                mapC.put(str, jSONObject.get(str));
            } else {
                mapC.put(str, e.b(jSONObject.get(str), type3));
            }
        }
        return mapC;
    }

    protected Map<Object, Object> c(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
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
        if (type instanceof ParameterizedType) {
            return c(((ParameterizedType) type).getRawType());
        }
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

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put((String) entry.getKey(), f.f(entry.getValue()));
        }
        return treeMap;
    }
}
