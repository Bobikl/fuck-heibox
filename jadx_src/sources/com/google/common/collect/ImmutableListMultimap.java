package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements o1<K, V> {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableListMultimap<V, K> f57286i;

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableListMultimap<K, V> a() {
            return (ImmutableListMultimap) super.a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(ImmutableMultimap.c<K, V> cVar) {
            super.b(cVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> d(Comparator<? super K> comparator) {
            super.d(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(Comparator<? super V> comparator) {
            super.e(comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k10, V v10) {
            super.f(k10, v10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(r1<? extends K, ? extends V> r1Var) {
            super.h(r1Var);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @o9.a
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(K k10, Iterable<? extends V> iterable) {
            super.j(k10, iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        @s9.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(K k10, V... vArr) {
            super.k(k10, vArr);
            return this;
        }
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i10) {
        super(immutableMap, i10);
    }

    public static <K, V> a<K, V> M() {
        return new a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> N(r1<? extends K, ? extends V> r1Var) {
        if (r1Var.isEmpty()) {
            return T();
        }
        if (r1Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) r1Var;
            if (!immutableListMultimap.x()) {
                return immutableListMultimap;
            }
        }
        return P(r1Var.e().entrySet(), null);
    }

    @o9.a
    public static <K, V> ImmutableListMultimap<K, V> O(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().i(iterable).a();
    }

    static <K, V> ImmutableListMultimap<K, V> P(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return T();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListV = comparator == null ? ImmutableList.v(value) : ImmutableList.W(comparator, value);
            if (!immutableListV.isEmpty()) {
                bVar.i(key, immutableListV);
                size += immutableListV.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.d(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> S() {
        a aVarM = M();
        b3 it = i().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarM.f(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapA = aVarM.a();
        immutableListMultimapA.f57286i = this;
        return immutableListMultimapA;
    }

    public static <K, V> ImmutableListMultimap<K, V> T() {
        return EmptyImmutableListMultimap.f57197j;
    }

    public static <K, V> ImmutableListMultimap<K, V> V(K k10, V v10) {
        a aVarM = M();
        aVarM.f(k10, v10);
        return aVarM.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> W(K k10, V v10, K k11, V v11) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        return aVarM.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> X(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        return aVarM.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> Y(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        aVarM.f(k13, v13);
        return aVarM.a();
    }

    public static <K, V> ImmutableListMultimap<K, V> Z(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarM = M();
        aVarM.f(k10, v10);
        aVarM.f(k11, v11);
        aVarM.f(k12, v12);
        aVarM.f(k13, v13);
        aVarM.f(k14, v14);
        return aVarM.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    private void a0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(i10);
            throw new InvalidObjectException(sb2.toString());
        }
        ImmutableMap.b bVarB = ImmutableMap.b();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Invalid value count ");
                sb3.append(i13);
                throw new InvalidObjectException(sb3.toString());
            }
            ImmutableList.a aVarQ = ImmutableList.q();
            for (int i14 = 0; i14 < i13; i14++) {
                aVarQ.a(objectInputStream.readObject());
            }
            bVarB.i(object, aVarQ.e());
            i11 += i13;
        }
        try {
            ImmutableMultimap.d.f57334a.b(this, bVarB.d());
            ImmutableMultimap.d.f57335b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @o9.c
    private void d0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g2.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ImmutableList<V> v(K k10) {
        ImmutableList<V> immutableList = (ImmutableList) this.f57318g.get(k10);
        return immutableList == null ? ImmutableList.B() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public ImmutableListMultimap<V, K> w() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.f57286i;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapS = S();
        this.f57286i = immutableListMultimapS;
        return immutableListMultimapS;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ImmutableList<V> a(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ImmutableList<V> b(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
