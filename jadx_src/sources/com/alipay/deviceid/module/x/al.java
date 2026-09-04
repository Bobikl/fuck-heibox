package com.alipay.deviceid.module.x;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: SetDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class al implements aj {
    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(y.class)) {
            return null;
        }
        y yVar = (y) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i10 = 0; i10 < yVar.f38380a.size(); i10++) {
            hashSet.add(af.a(yVar.a(i10), type2));
        }
        return hashSet;
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
