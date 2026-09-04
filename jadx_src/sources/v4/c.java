package v4;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements i, j {
    @Override // v4.j
    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // v4.i
    public final Object a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // v4.i, v4.j
    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
