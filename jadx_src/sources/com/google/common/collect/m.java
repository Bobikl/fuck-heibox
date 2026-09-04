package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ClassToInstanceMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@s9.f("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@u
public interface m<B> extends Map<Class<? extends B>, B> {
    @s9.a
    @CheckForNull
    <T extends B> T o(Class<T> cls, T t10);

    @CheckForNull
    <T extends B> T s(Class<T> cls);
}
