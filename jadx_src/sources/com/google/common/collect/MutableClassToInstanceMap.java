package com.google.common.collect;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class MutableClassToInstanceMap<B> extends s0<Class<? extends B>, B> implements m<B>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<? extends B>, B> f57759b;

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<? extends B>, B> f57760b;

        SerializedForm(Map<Class<? extends B>, B> map) {
            this.f57760b = map;
        }

        Object a() {
            return MutableClassToInstanceMap.a1(this.f57760b);
        }
    }

    public class a extends t0<Class<? extends B>, B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f57761b;

        a(Map.Entry entry) {
            this.f57761b = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.t0, com.google.common.collect.y0
        public Map.Entry<Class<? extends B>, B> H0() {
            return this.f57761b;
        }

        @Override // com.google.common.collect.t0, java.util.Map.Entry
        public B setValue(B b10) {
            return (B) super.setValue(MutableClassToInstanceMap.W0(getKey(), b10));
        }
    }

    public class b extends a1<Map.Entry<Class<? extends B>, B>> {

        public class a extends w2<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            a(b bVar, Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.w2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> a(Map.Entry<Class<? extends B>, B> entry) {
                return MutableClassToInstanceMap.X0(entry);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
        public Set<Map.Entry<Class<? extends B>, B>> H0() {
            return MutableClassToInstanceMap.this.H0().entrySet();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, H0().iterator());
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return U0();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) V0(tArr);
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        this.f57759b = (Map) com.google.common.base.w.E(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s9.a
    @CheckForNull
    public static <B, T extends B> T W0(Class<T> cls, @CheckForNull B b10) {
        return (T) com.google.common.primitives.h.f(cls).cast(b10);
    }

    static <B> Map.Entry<Class<? extends B>, B> X0(Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> Z0() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    public static <B> MutableClassToInstanceMap<B> a1(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    private Object c1() {
        return new SerializedForm(H0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0, com.google.common.collect.y0
    public Map<Class<? extends B>, B> H0() {
        return this.f57759b;
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public B put(Class<? extends B> cls, B b10) {
        return (B) super.put(cls, W0(cls, b10));
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m
    @s9.a
    @CheckForNull
    public <T extends B> T o(Class<T> cls, T t10) {
        return (T) W0(cls, put(cls, t10));
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            W0((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    @Override // com.google.common.collect.m
    @CheckForNull
    public <T extends B> T s(Class<T> cls) {
        return (T) W0(cls, get(cls));
    }
}
