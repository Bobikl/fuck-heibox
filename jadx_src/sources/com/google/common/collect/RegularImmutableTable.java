package com.google.common.collect;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<u2.a<R, C, V>> {
        private CellSet() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public u2.a<R, C, V> get(int i10) {
            return RegularImmutableTable.this.F(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof u2.a)) {
                return false;
            }
            u2.a aVar = (u2.a) obj;
            Object objY = RegularImmutableTable.this.Y(aVar.b(), aVar.a());
            return objY != null && objY.equals(aVar.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    public final class Values extends ImmutableList<V> {
        private Values() {
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) RegularImmutableTable.this.G(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    RegularImmutableTable() {
    }

    static <R, C, V> RegularImmutableTable<R, C, V> B(Iterable<u2.a<R, C, V>> iterable) {
        return D(iterable, null, null);
    }

    static <R, C, V> RegularImmutableTable<R, C, V> C(List<u2.a<R, C, V>> list, @CheckForNull final Comparator<? super R> comparator, @CheckForNull final Comparator<? super C> comparator2) {
        com.google.common.base.w.E(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: com.google.common.collect.d2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return RegularImmutableTable.H(comparator, comparator2, (u2.a) obj, (u2.a) obj2);
                }
            });
        }
        return D(list, comparator, comparator2);
    }

    private static <R, C, V> RegularImmutableTable<R, C, V> D(Iterable<u2.a<R, C, V>> iterable, @CheckForNull Comparator<? super R> comparator, @CheckForNull Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList immutableListU = ImmutableList.u(iterable);
        for (u2.a<R, C, V> aVar : iterable) {
            linkedHashSet.add(aVar.b());
            linkedHashSet2.add(aVar.a());
        }
        return E(immutableListU, comparator == null ? ImmutableSet.w(linkedHashSet) : ImmutableSet.w(ImmutableList.W(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.w(linkedHashSet2) : ImmutableSet.w(ImmutableList.W(comparator2, linkedHashSet2)));
    }

    static <R, C, V> RegularImmutableTable<R, C, V> E(ImmutableList<u2.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int H(Comparator comparator, Comparator comparator2, u2.a aVar, u2.a aVar2) {
        int iCompare = comparator == null ? 0 : comparator.compare(aVar.b(), aVar2.b());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.a(), aVar2.a());
    }

    final void A(R r10, C c10, @CheckForNull V v10, V v11) {
        com.google.common.base.w.A(v10 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r10, c10, v11, v10);
    }

    abstract u2.a<R, C, V> F(int i10);

    abstract V G(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.i
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<u2.a<R, C, V>> b() {
        return isEmpty() ? ImmutableSet.D() : new CellSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.i
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection<V> c() {
        return isEmpty() ? ImmutableList.B() : new Values();
    }
}
