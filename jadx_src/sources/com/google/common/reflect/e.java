package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.s0;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ImmutableTypeToInstanceMap.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public final class e<B> extends s0<TypeToken<? extends B>, B> implements o<B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<TypeToken<? extends B>, B> f59135b;

    /* JADX INFO: compiled from: ImmutableTypeToInstanceMap.java */
    public static final class b<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap.b<TypeToken<? extends B>, B> f59136a;

        private b() {
            this.f59136a = ImmutableMap.b();
        }

        public e<B> a() {
            return new e<>(this.f59136a.d());
        }

        @s9.a
        public <T extends B> b<B> b(TypeToken<T> typeToken, T t10) {
            this.f59136a.i(typeToken.rejectTypeVariables(), t10);
            return this;
        }

        @s9.a
        public <T extends B> b<B> c(Class<T> cls, T t10) {
            this.f59136a.i(TypeToken.of((Class) cls), t10);
            return this;
        }
    }

    private e(ImmutableMap<TypeToken<? extends B>, B> immutableMap) {
        this.f59135b = immutableMap;
    }

    public static <B> b<B> V0() {
        return new b<>();
    }

    public static <B> e<B> W0() {
        return new e<>(ImmutableMap.v());
    }

    @CheckForNull
    private <T extends B> T Z0(TypeToken<T> typeToken) {
        return this.f59135b.get(typeToken);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0, com.google.common.collect.y0
    public Map<TypeToken<? extends B>, B> H0() {
        return this.f59135b;
    }

    @Override // com.google.common.reflect.o
    @CheckForNull
    public <T extends B> T Q(TypeToken<T> typeToken) {
        return (T) Z0(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public B put(TypeToken<? extends B> typeToken, B b10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.o
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public <T extends B> T o(Class<T> cls, T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.o
    @CheckForNull
    public <T extends B> T s(Class<T> cls) {
        return (T) Z0(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.reflect.o
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public <T extends B> T w0(TypeToken<T> typeToken, T t10) {
        throw new UnsupportedOperationException();
    }
}
