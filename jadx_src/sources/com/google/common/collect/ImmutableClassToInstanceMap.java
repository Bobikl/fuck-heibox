package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"B"})
@o9.c
@u
public final class ImmutableClassToInstanceMap<B> extends s0<Class<? extends B>, B> implements m<B>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ImmutableClassToInstanceMap<Object> f57264c = new ImmutableClassToInstanceMap<>(ImmutableMap.v());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<Class<? extends B>, B> f57265b;

    public static final class b<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap.b<Class<? extends B>, B> f57266a = ImmutableMap.b();

        private static <B, T extends B> T b(Class<T> cls, B b10) {
            return (T) com.google.common.primitives.h.f(cls).cast(b10);
        }

        public ImmutableClassToInstanceMap<B> a() {
            ImmutableMap<Class<? extends B>, B> immutableMapD = this.f57266a.d();
            return immutableMapD.isEmpty() ? ImmutableClassToInstanceMap.X0() : new ImmutableClassToInstanceMap<>(immutableMapD);
        }

        @s9.a
        public <T extends B> b<B> c(Class<T> cls, T t10) {
            this.f57266a.i(cls, t10);
            return this;
        }

        @s9.a
        public <T extends B> b<B> d(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f57266a.i((Class<? extends B>) key, (B) b(key, value));
            }
            return this;
        }
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.f57265b = immutableMap;
    }

    public static <B> b<B> V0() {
        return new b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> W0(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new b().d(map).a();
    }

    public static <B> ImmutableClassToInstanceMap<B> X0() {
        return (ImmutableClassToInstanceMap<B>) f57264c;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> Z0(Class<T> cls, T t10) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.w(cls, t10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0, com.google.common.collect.y0
    public Map<Class<? extends B>, B> H0() {
        return this.f57265b;
    }

    Object a1() {
        return isEmpty() ? X0() : this;
    }

    @Override // com.google.common.collect.m
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public <T extends B> T o(Class<T> cls, T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.m
    @CheckForNull
    public <T extends B> T s(Class<T> cls) {
        return this.f57265b.get(com.google.common.base.w.E(cls));
    }
}
