package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final RegularImmutableSortedSet<Comparable> f57839j = new RegularImmutableSortedSet<>(ImmutableList.B(), Ordering.z());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @o9.d
    final transient ImmutableList<E> f57840i;

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f57840i = immutableList;
    }

    private int X0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f57840i, obj, Z0());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> O0(E e10, boolean z10, E e11, boolean z11) {
        return R0(e10, z10).v0(e11, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> R0(E e10, boolean z10) {
        return U0(W0(e10, z10), size());
    }

    RegularImmutableSortedSet<E> U0(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 < i11 ? new RegularImmutableSortedSet<>(this.f57840i.subList(i10, i11), this.f57415g) : ImmutableSortedSet.s0(this.f57415g);
    }

    int V0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f57840i, com.google.common.base.w.E(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    int W0(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f57840i, com.google.common.base.w.E(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    Comparator<Object> Z0() {
        return this.f57415g;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> a() {
        return this.f57840i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int b(Object[] objArr, int i10) {
        return this.f57840i.b(objArr, i10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e10) {
        int iW0 = W0(e10, true);
        if (iW0 == size()) {
            return null;
        }
        return this.f57840i.get(iW0);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return X0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof s1) {
            collection = ((s1) collection).c();
        }
        if (!k2.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        b3<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iS0 = S0(next2, next);
                if (iS0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iS0 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iS0 > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    Object[] e() {
        return this.f57840i.e();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!k2.b(this.f57415g, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            b3<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || S0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f57840i.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E e10) {
        int iV0 = V0(e10, true) - 1;
        if (iV0 == -1) {
            return null;
        }
        return this.f57840i.get(iV0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int g() {
        return this.f57840i.g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int h() {
        return this.f57840i.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E e10) {
        int iW0 = W0(e10, false);
        if (iW0 == size()) {
            return null;
        }
        return this.f57840i.get(iW0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return this.f57840i.i();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f57840i, obj, Z0());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return this.f57840i.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f57840i.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E e10) {
        int iV0 = V0(e10, false) - 1;
        if (iV0 == -1) {
            return null;
        }
        return this.f57840i.get(iV0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> n0() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f57415g);
        return isEmpty() ? ImmutableSortedSet.s0(comparatorReverseOrder) : new RegularImmutableSortedSet(this.f57840i.U(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b3<E> descendingIterator() {
        return this.f57840i.U().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f57840i.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet<E> v0(E e10, boolean z10) {
        return U0(0, V0(e10, z10));
    }
}
