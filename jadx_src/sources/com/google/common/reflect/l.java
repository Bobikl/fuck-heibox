package com.google.common.reflect;

import com.google.common.base.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: TypeCapture.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public abstract class l<T> {
    l() {
    }

    final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        w.u(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
