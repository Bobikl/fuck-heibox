package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.json.alipay.zoloz.JSONArray;

/* JADX INFO: compiled from: CollectionCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements i, j {
    private static Collection<Object> c(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        if (!obj.getClass().equals(JSONArray.class)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        Collection<Object> collectionC = c(com.alipay.zoloz.jsoncodec.util.a.a(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            collectionC.add(e.b(jSONArray.get(i10), type2));
        }
        return collectionC;
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(f.f(it.next()));
        }
        return arrayList;
    }
}
