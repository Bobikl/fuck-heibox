package com.google.common.reflect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TypeToInstanceMap.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.f("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@d
public interface o<B> extends Map<TypeToken<? extends B>, B> {
    @CheckForNull
    <T extends B> T Q(TypeToken<T> typeToken);

    @s9.a
    @CheckForNull
    <T extends B> T o(Class<T> cls, T t10);

    @CheckForNull
    <T extends B> T s(Class<T> cls);

    @s9.a
    @CheckForNull
    <T extends B> T w0(TypeToken<T> typeToken, T t10);
}
