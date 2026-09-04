package v4;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements i, j {
    @Override // v4.j
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // v4.i
    public final Object a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // v4.i, v4.j
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
