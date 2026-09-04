package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c3<Object> f57279c = new b(RegularImmutableList.f57797f, 0);

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableList<E> f57280d;

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f57280d = immutableList;
        }

        private int Z(int i10) {
            return (size() - 1) - i10;
        }

        private int a0(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> U() {
            return this.f57280d;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public ImmutableList<E> subList(int i10, int i11) {
            com.google.common.base.w.f0(i10, i11, size());
            return this.f57280d.subList(a0(i11), a0(i10)).U();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57280d.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            com.google.common.base.w.C(i10, size());
            return this.f57280d.get(Z(i10));
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return this.f57280d.i();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iLastIndexOf = this.f57280d.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return Z(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iIndexOf = this.f57280d.indexOf(obj);
            if (iIndexOf >= 0) {
                return Z(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57280d.size();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f57281b;

        SerializedForm(Object[] objArr) {
            this.f57281b = objArr;
        }

        Object a() {
            return ImmutableList.x(this.f57281b);
        }
    }

    public class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f57282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final transient int f57283e;

        SubList(int i10, int i11) {
            this.f57282d = i10;
            this.f57283e = i11;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: X */
        public ImmutableList<E> subList(int i10, int i11) {
            com.google.common.base.w.f0(i10, i11, this.f57283e);
            ImmutableList immutableList = ImmutableList.this;
            int i12 = this.f57282d;
            return immutableList.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.ImmutableCollection
        @CheckForNull
        Object[] e() {
            return ImmutableList.this.e();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int g() {
            return ImmutableList.this.h() + this.f57282d + this.f57283e;
        }

        @Override // java.util.List
        public E get(int i10) {
            com.google.common.base.w.C(i10, this.f57283e);
            return ImmutableList.this.get(i10 + this.f57282d);
        }

        @Override // com.google.common.collect.ImmutableCollection
        int h() {
            return ImmutableList.this.h() + this.f57282d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57283e;
        }
    }

    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection.a
        @s9.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a<E> g(E e10) {
            super.g(e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableList<E> e() {
            this.f57270d = true;
            return ImmutableList.o(this.f57268b, this.f57269c);
        }

        @s9.a
        a<E> o(a<E> aVar) {
            h(aVar.f57268b, aVar.f57269c);
            return this;
        }
    }

    public static class b<E> extends com.google.common.collect.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImmutableList<E> f57285d;

        b(ImmutableList<E> immutableList, int i10) {
            super(immutableList.size(), i10);
            this.f57285d = immutableList;
        }

        @Override // com.google.common.collect.a
        protected E a(int i10) {
            return this.f57285d.get(i10);
        }
    }

    ImmutableList() {
    }

    public static <E> ImmutableList<E> B() {
        return (ImmutableList<E>) RegularImmutableList.f57797f;
    }

    public static <E> ImmutableList<E> D(E e10) {
        return t(e10);
    }

    public static <E> ImmutableList<E> E(E e10, E e11) {
        return t(e10, e11);
    }

    public static <E> ImmutableList<E> F(E e10, E e11, E e12) {
        return t(e10, e11, e12);
    }

    public static <E> ImmutableList<E> G(E e10, E e11, E e12, E e13) {
        return t(e10, e11, e12, e13);
    }

    public static <E> ImmutableList<E> H(E e10, E e11, E e12, E e13, E e14) {
        return t(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableList<E> I(E e10, E e11, E e12, E e13, E e14, E e15) {
        return t(e10, e11, e12, e13, e14, e15);
    }

    public static <E> ImmutableList<E> J(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return t(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> ImmutableList<E> L(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return t(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> ImmutableList<E> N(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return t(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> ImmutableList<E> Q(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return t(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> ImmutableList<E> R(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20) {
        return t(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> S(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        com.google.common.base.w.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return t(objArr);
    }

    private void T(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> V(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) l1.R(iterable, new Comparable[0]);
        u1.b(comparableArr);
        Arrays.sort(comparableArr);
        return m(comparableArr);
    }

    public static <E> ImmutableList<E> W(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.w.E(comparator);
        Object[] objArrP = l1.P(iterable);
        u1.b(objArrP);
        Arrays.sort(objArrP, comparator);
        return m(objArrP);
    }

    static <E> ImmutableList<E> m(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static <E> ImmutableList<E> o(Object[] objArr, int i10) {
        return i10 == 0 ? B() : new RegularImmutableList(objArr, i10);
    }

    public static <E> a<E> q() {
        return new a<>();
    }

    @o9.a
    public static <E> a<E> s(int i10) {
        n.b(i10, "expectedSize");
        return new a<>(i10);
    }

    private static <E> ImmutableList<E> t(Object... objArr) {
        return m(u1.b(objArr));
    }

    public static <E> ImmutableList<E> u(Iterable<? extends E> iterable) {
        com.google.common.base.w.E(iterable);
        return iterable instanceof Collection ? v((Collection) iterable) : w(iterable.iterator());
    }

    public static <E> ImmutableList<E> v(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return t(collection.toArray());
        }
        ImmutableList<E> immutableListA = ((ImmutableCollection) collection).a();
        return immutableListA.i() ? m(immutableListA.toArray()) : immutableListA;
    }

    public static <E> ImmutableList<E> w(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return B();
        }
        E next = it.next();
        return !it.hasNext() ? D(next) : new a().a(next).d(it).e();
    }

    public static <E> ImmutableList<E> x(E[] eArr) {
        return eArr.length == 0 ? B() : t((Object[]) eArr.clone());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c3<E> listIterator(int i10) {
        com.google.common.base.w.d0(i10, size());
        return isEmpty() ? (c3<E>) f57279c : new b(this, i10);
    }

    public ImmutableList<E> U() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: X */
    public ImmutableList<E> subList(int i10, int i11) {
        com.google.common.base.w.f0(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? B() : Y(i10, i11);
    }

    ImmutableList<E> Y(int i10, int i11) {
        return new SubList(i10, i11 - i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    @s9.l(replacement = "this")
    public final ImmutableList<E> a() {
        return this;
    }

    @Override // java.util.List
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return Lists.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.l(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b3<E> iterator() {
        return listIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object l() {
        return new SerializedForm(toArray());
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.n(this, obj);
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c3<E> listIterator() {
        return listIterator(0);
    }
}
