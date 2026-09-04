package com.alipay.zoloz.jsoncodec.codec;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.zoloz.JSONArray;

/* JADX INFO: compiled from: SetDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public class k implements i {
    @Override // com.alipay.zoloz.jsoncodec.codec.i, com.alipay.zoloz.jsoncodec.codec.j
    public boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.zoloz.jsoncodec.codec.i
    public Object b(Object obj, Type type) throws Exception {
        if (!obj.getClass().equals(JSONArray.class)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(e.b(jSONArray.get(i10), type2));
        }
        return hashSet;
    }
}
