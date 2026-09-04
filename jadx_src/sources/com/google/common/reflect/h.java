package com.google.common.reflect;

import com.google.common.base.w;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.a1;
import com.google.common.collect.s0;
import com.google.common.collect.t0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public final class h<B> extends s0<TypeToken<? extends B>, B> implements o<B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<TypeToken<? extends B>, B> f59141b = Maps.Y();

    /* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
    public static final class a<K, V> extends t0<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map.Entry<K, V> f59142b;

        /* JADX INFO: renamed from: com.google.common.reflect.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MutableTypeToInstanceMap.java */
        public class C0483a extends a1<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Set f59143b;

            C0483a(Set set) {
                this.f59143b = set;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.a1, com.google.common.collect.h0
            /* JADX INFO: renamed from: X0 */
            public Set<Map.Entry<K, V>> H0() {
                return this.f59143b;
            }

            @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a.R0(super.iterator());
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

        private a(Map.Entry<K, V> entry) {
            this.f59142b = (Map.Entry) w.E(entry);
        }

        public static /* synthetic */ a O0(Map.Entry entry) {
            return new a(entry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> R0(Iterator<Map.Entry<K, V>> it) {
            return Iterators.c0(it, new com.google.common.base.n() { // from class: com.google.common.reflect.g
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return h.a.O0((Map.Entry) obj);
                }
            });
        }

        static <K, V> Set<Map.Entry<K, V>> S0(Set<Map.Entry<K, V>> set) {
            return new C0483a(set);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.t0, com.google.common.collect.y0
        public Map.Entry<K, V> H0() {
            return this.f59142b;
        }

        @Override // com.google.common.collect.t0, java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException();
        }
    }

    @CheckForNull
    private <T extends B> T W0(TypeToken<T> typeToken) {
        return this.f59141b.get(typeToken);
    }

    @CheckForNull
    private <T extends B> T X0(TypeToken<T> typeToken, T t10) {
        return this.f59141b.put(typeToken, t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0, com.google.common.collect.y0
    public Map<TypeToken<? extends B>, B> H0() {
        return this.f59141b;
    }

    @Override // com.google.common.reflect.o
    @CheckForNull
    public <T extends B> T Q(TypeToken<T> typeToken) {
        return (T) W0(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public B put(TypeToken<? extends B> typeToken, B b10) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return a.S0(super.entrySet());
    }

    @Override // com.google.common.reflect.o
    @s9.a
    @CheckForNull
    public <T extends B> T o(Class<T> cls, T t10) {
        return (T) X0(TypeToken.of((Class) cls), t10);
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.o
    @CheckForNull
    public <T extends B> T s(Class<T> cls) {
        return (T) W0(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.reflect.o
    @s9.a
    @CheckForNull
    public <T extends B> T w0(TypeToken<T> typeToken, T t10) {
        return (T) X0(typeToken.rejectTypeVariables(), t10);
    }
}
