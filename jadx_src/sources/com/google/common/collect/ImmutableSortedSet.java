package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, j2<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient Comparator<? super E> f57415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    @o9.c
    @t9.b
    transient ImmutableSortedSet<E> f57416h;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f57417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f57418c;

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.f57417b = comparator;
            this.f57418c = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object a() {
            return new a(this.f57417b).b(this.f57418c).e();
        }
    }

    public static final class a<E> extends ImmutableSet.a<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Comparator<? super E> f57419g;

        public a(Comparator<? super E> comparator) {
            this.f57419g = (Comparator) com.google.common.base.w.E(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @s9.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> g(E e10) {
            super.g(e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @s9.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @s9.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<E> e() {
            ImmutableSortedSet<E> immutableSortedSetY = ImmutableSortedSet.Y(this.f57419g, this.f57269c, this.f57268b);
            this.f57269c = immutableSortedSetY.size();
            this.f57270d = true;
            return immutableSortedSetY;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSet.a
        @s9.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<E> p(ImmutableSet.a<E> aVar) {
            super.p(aVar);
            return this;
        }
    }

    ImmutableSortedSet(Comparator<? super E> comparator) {
        this.f57415g = comparator;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet A0(Comparable comparable) {
        return new RegularImmutableSortedSet(ImmutableList.D(comparable), Ordering.z());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet B0(Comparable comparable, Comparable comparable2) {
        return Y(Ordering.z(), 2, comparable, comparable2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet C0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return Y(Ordering.z(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet D0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return Y(Ordering.z(), 4, comparable, comparable2, comparable3, comparable4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet E0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return Y(Ordering.z(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet F0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return Y(Ordering.z(), length, comparableArr2);
    }

    public static <E> a<E> G0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    private void H0(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> J0() {
        return new a<>(Collections.reverseOrder());
    }

    static int T0(Comparator<?> comparator, Object obj, @CheckForNull Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> ImmutableSortedSet<E> Y(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return s0(comparator);
        }
        u1.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            a.a.a.a.d.p.d.c.d dVar = (Object) eArr[i12];
            if (comparator.compare(dVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = dVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new RegularImmutableSortedSet(ImmutableList.o(eArr, i11), comparator);
    }

    public static <E> ImmutableSortedSet<E> Z(Iterable<? extends E> iterable) {
        return b0(Ordering.z(), iterable);
    }

    public static <E> ImmutableSortedSet<E> a0(Collection<? extends E> collection) {
        return d0(Ordering.z(), collection);
    }

    public static <E> ImmutableSortedSet<E> b0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.w.E(comparator);
        if (k2.b(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.i()) {
                return immutableSortedSet;
            }
        }
        Object[] objArrP = l1.P(iterable);
        return Y(comparator, objArrP.length, objArrP);
    }

    public static <E> ImmutableSortedSet<E> d0(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return b0(comparator, collection);
    }

    public static <E> ImmutableSortedSet<E> h0(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).d(it).e();
    }

    public static <E> ImmutableSortedSet<E> i0(Iterator<? extends E> it) {
        return h0(Ordering.z(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet k0(Comparable[] comparableArr) {
        return Y(Ordering.z(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> ImmutableSortedSet<E> l0(SortedSet<E> sortedSet) {
        Comparator comparatorA = k2.a(sortedSet);
        ImmutableList immutableListV = ImmutableList.v(sortedSet);
        return immutableListV.isEmpty() ? s0(comparatorA) : new RegularImmutableSortedSet(immutableListV, comparatorA);
    }

    static <E> RegularImmutableSortedSet<E> s0(Comparator<? super E> comparator) {
        return Ordering.z().equals(comparator) ? (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.f57839j : new RegularImmutableSortedSet<>(ImmutableList.B(), comparator);
    }

    public static <E extends Comparable<?>> a<E> w0() {
        return new a<>(Ordering.z());
    }

    public static <E> ImmutableSortedSet<E> y0() {
        return RegularImmutableSortedSet.f57839j;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        com.google.common.base.w.E(e10);
        com.google.common.base.w.E(e11);
        com.google.common.base.w.d(this.f57415g.compare(e10, e11) <= 0);
        return O0(e10, z10, e11, z11);
    }

    abstract ImmutableSortedSet<E> O0(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e10, boolean z10) {
        return R0(com.google.common.base.w.E(e10), z10);
    }

    abstract ImmutableSortedSet<E> R0(E e10, boolean z10);

    int S0(Object obj, @CheckForNull Object obj2) {
        return T0(this.f57415g, obj, obj2);
    }

    @CheckForNull
    public E ceiling(E e10) {
        return (E) l1.v(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.j2
    public Comparator<? super E> comparator() {
        return this.f57415g;
    }

    public E first() {
        return iterator().next();
    }

    @CheckForNull
    public E floor(E e10) {
        return (E) Iterators.J(headSet(e10, true).descendingIterator(), null);
    }

    @CheckForNull
    @o9.c
    public E higher(E e10) {
        return (E) l1.v(tailSet(e10, false), null);
    }

    abstract int indexOf(@CheckForNull Object obj);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public abstract b3<E> iterator();

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    Object l() {
        return new SerializedForm(this.f57415g, toArray());
    }

    public E last() {
        return descendingIterator().next();
    }

    @CheckForNull
    @o9.c
    public E lower(E e10) {
        return (E) Iterators.J(headSet(e10, false).descendingIterator(), null);
    }

    @o9.c
    abstract ImmutableSortedSet<E> n0();

    @Override // java.util.NavigableSet
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    @o9.c
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    @o9.c
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: q0 */
    public abstract b3<E> descendingIterator();

    @Override // java.util.NavigableSet
    @o9.c
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f57416h;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetN0 = n0();
        this.f57416h = immutableSortedSetN0;
        immutableSortedSetN0.f57416h = this;
        return immutableSortedSetN0;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e10, boolean z10) {
        return v0(com.google.common.base.w.E(e10), z10);
    }

    abstract ImmutableSortedSet<E> v0(E e10, boolean z10);
}
