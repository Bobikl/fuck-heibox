package v4;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements i, j {
    @Override // v4.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.b(obj2));
        }
        return arrayList;
    }

    @Override // v4.i
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iA = aVar.a();
        Object objNewInstance = Array.newInstance(componentType, iA);
        for (int i10 = 0; i10 < iA; i10++) {
            Array.set(objNewInstance, i10, e.a(aVar.a(i10), componentType));
        }
        return objNewInstance;
    }

    @Override // v4.i, v4.j
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
