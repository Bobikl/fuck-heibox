package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f57382d = 1073741824;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f57383e = 0.7d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57384f = 751619276;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient ImmutableList<E> f57385c;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f57386b;

        SerializedForm(Object[] objArr) {
            this.f57386b = objArr;
        }

        Object a() {
            return ImmutableSet.y(this.f57386b);
        }
    }

    public static class a<E> extends ImmutableCollection.a<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        @o9.d
        Object[] f57387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f57388f;

        public a() {
            super(4);
        }

        a(int i10) {
            super(i10);
            this.f57387e = new Object[ImmutableSet.t(i10)];
        }

        private void n(E e10) {
            Objects.requireNonNull(this.f57387e);
            int length = this.f57387e.length - 1;
            int iHashCode = e10.hashCode();
            int iC = i1.c(iHashCode);
            while (true) {
                int i10 = iC & length;
                Object[] objArr = this.f57387e;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f57388f += iHashCode;
                    super.g(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iC = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.a
        @s9.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> g(E e10) {
            com.google.common.base.w.E(e10);
            if (this.f57387e != null && ImmutableSet.t(this.f57269c) <= this.f57387e.length) {
                n(e10);
                return this;
            }
            this.f57387e = null;
            super.g(e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            if (this.f57387e != null) {
                for (E e10 : eArr) {
                    g(e10);
                }
            } else {
                super.b(eArr);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            com.google.common.base.w.E(iterable);
            if (this.f57387e != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            com.google.common.base.w.E(it);
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<E> e() {
            ImmutableSet<E> immutableSetU;
            int i10 = this.f57269c;
            if (i10 == 0) {
                return ImmutableSet.D();
            }
            if (i10 == 1) {
                Object obj = this.f57268b[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.E(obj);
            }
            if (this.f57387e == null || ImmutableSet.t(i10) != this.f57387e.length) {
                immutableSetU = ImmutableSet.u(this.f57269c, this.f57268b);
                this.f57269c = immutableSetU.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.L(this.f57269c, this.f57268b.length) ? Arrays.copyOf(this.f57268b, this.f57269c) : this.f57268b;
                int i11 = this.f57388f;
                Object[] objArr = this.f57387e;
                immutableSetU = new RegularImmutableSet<>(objArrCopyOf, i11, objArr, objArr.length - 1, this.f57269c);
            }
            this.f57270d = true;
            this.f57387e = null;
            return immutableSetU;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @s9.a
        a<E> p(a<E> aVar) {
            if (this.f57387e != null) {
                for (int i10 = 0; i10 < aVar.f57269c; i10++) {
                    Object obj = aVar.f57268b[i10];
                    Objects.requireNonNull(obj);
                    g(obj);
                }
            } else {
                h(aVar.f57268b, aVar.f57269c);
            }
            return this;
        }
    }

    ImmutableSet() {
    }

    public static <E> ImmutableSet<E> D() {
        return RegularImmutableSet.f57827m;
    }

    public static <E> ImmutableSet<E> E(E e10) {
        return new SingletonImmutableSet(e10);
    }

    public static <E> ImmutableSet<E> F(E e10, E e11) {
        return u(2, e10, e11);
    }

    public static <E> ImmutableSet<E> G(E e10, E e11, E e12) {
        return u(3, e10, e11, e12);
    }

    public static <E> ImmutableSet<E> H(E e10, E e11, E e12, E e13) {
        return u(4, e10, e11, e12, e13);
    }

    public static <E> ImmutableSet<E> I(E e10, E e11, E e12, E e13, E e14) {
        return u(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> J(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        com.google.common.base.w.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return u(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean L(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> a<E> q() {
        return new a<>();
    }

    @o9.a
    public static <E> a<E> s(int i10) {
        n.b(i10, "expectedSize");
        return new a<>(i10);
    }

    @o9.d
    static int t(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= f57384f) {
            com.google.common.base.w.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * f57383e < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> u(int i10, Object... objArr) {
        if (i10 == 0) {
            return D();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return E(obj);
        }
        int iT = t(i10);
        Object[] objArr2 = new Object[iT];
        int i11 = iT - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = u1.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iC = i1.c(iHashCode);
            while (true) {
                int i15 = iC & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (t(i13) < iT / 2) {
            return u(i13, objArr);
        }
        if (L(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(objArr, i12, objArr2, i11, i13);
    }

    public static <E> ImmutableSet<E> v(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? w((Collection) iterable) : x(iterable.iterator());
    }

    public static <E> ImmutableSet<E> w(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.i()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    public static <E> ImmutableSet<E> x(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return D();
        }
        E next = it.next();
        return !it.hasNext() ? E(next) : new a().g(next).d(it).e();
    }

    public static <E> ImmutableSet<E> y(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? u(eArr.length, (Object[]) eArr.clone()) : E(eArr[0]);
        }
        return D();
    }

    ImmutableList<E> A() {
        return ImmutableList.m(toArray());
    }

    boolean B() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> a() {
        ImmutableList<E> immutableList = this.f57385c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListA = A();
        this.f57385c = immutableListA;
        return immutableListA;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && B() && ((ImmutableSet) obj).B() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.k(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public abstract b3<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    Object l() {
        return new SerializedForm(toArray());
    }
}
