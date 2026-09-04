package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@g
public final class Enums {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @o9.c
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f56599a = new WeakHashMap();

    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class<T> f56600d;

        StringConverter(Class<T> cls) {
            this.f56600d = (Class) w.E(cls);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof StringConverter) {
                return this.f56600d.equals(((StringConverter) obj).f56600d);
            }
            return false;
        }

        public int hashCode() {
            return this.f56600d.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(T t10) {
            return t10.name();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T i(String str) {
            return (T) Enum.valueOf(this.f56600d, str);
        }

        public String toString() {
            String name = this.f56600d.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 29);
            sb2.append("Enums.stringConverter(");
            sb2.append(name);
            sb2.append(".class)");
            return sb2.toString();
        }
    }

    private Enums() {
    }

    @o9.c
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> mapD;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = f56599a;
        synchronized (map) {
            mapD = map.get(cls);
            if (mapD == null) {
                mapD = d(cls);
            }
        }
        return mapD;
    }

    @o9.c
    public static Field b(Enum<?> r10) {
        try {
            return r10.getDeclaringClass().getDeclaredField(r10.name());
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static <T extends Enum<T>> Optional<T> c(Class<T> cls, String str) {
        w.E(cls);
        w.E(str);
        return v.e(cls, str);
    }

    @o9.c
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> cls) {
        HashMap map = new HashMap();
        for (Enum r10 : EnumSet.allOf(cls)) {
            map.put(r10.name(), new WeakReference(r10));
        }
        f56599a.put(cls, map);
        return map;
    }

    public static <T extends Enum<T>> Converter<String, T> e(Class<T> cls) {
        return new StringConverter(cls);
    }
}
