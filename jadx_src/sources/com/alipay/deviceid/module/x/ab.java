package com.alipay.deviceid.module.x;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: ArrayCodec.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ab implements aj, ak {
    @Override // com.alipay.deviceid.module.x.ak
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(ag.b(obj2));
        }
        return arrayList;
    }

    @Override // com.alipay.deviceid.module.x.aj
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(y.class)) {
            return null;
        }
        y yVar = (y) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int size = yVar.f38380a.size();
        Object objNewInstance = Array.newInstance(componentType, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, af.a(yVar.a(i10), componentType));
        }
        return objNewInstance;
    }

    @Override // com.alipay.deviceid.module.x.aj, com.alipay.deviceid.module.x.ak
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
