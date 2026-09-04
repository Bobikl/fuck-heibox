package v4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements i {
    @Override // v4.i
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            hashSet.add(e.a(aVar.a(i10), type2));
        }
        return hashSet;
    }

    @Override // v4.i, v4.j
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
