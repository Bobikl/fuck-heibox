package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.zoloz.JSONArray;

/* JADX INFO: compiled from: ArrayCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements i, j {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return cls.isArray();
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        if (!obj.getClass().equals(JSONArray.class)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int length = jSONArray.length();
        Object objNewInstance = Array.newInstance(componentType, length);
        for (int i10 = 0; i10 < length; i10++) {
            Array.set(objNewInstance, i10, e.b(jSONArray.get(i10), componentType));
        }
        return objNewInstance;
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.j
    public Object serialize(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.f(obj2));
        }
        return arrayList;
    }
}
