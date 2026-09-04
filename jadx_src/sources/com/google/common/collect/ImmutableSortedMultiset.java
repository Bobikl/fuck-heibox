package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements o2<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @t9.b
    transient ImmutableSortedMultiset<E> f57406e;

    public static final class SerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f57407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final E[] f57408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int[] f57409d;

        SerializedForm(o2<E> o2Var) {
            this.f57407b = o2Var.comparator();
            int size = o2Var.entrySet().size();
            this.f57408c = (E[]) new Object[size];
            this.f57409d = new int[size];
            int i10 = 0;
            for (s1.a<E> aVar : o2Var.entrySet()) {
                this.f57408c[i10] = aVar.a();
                this.f57409d[i10] = aVar.getCount();
                i10++;
            }
        }

        Object a() {
            int length = this.f57408c.length;
            a aVar = new a(this.f57407b);
            for (int i10 = 0; i10 < length; i10++) {
                aVar.k(this.f57408c[i10], this.f57409d[i10]);
            }
            return aVar.e();
        }
    }

    public static class a<E> extends ImmutableMultiset.b<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Comparator<? super E> f57410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @o9.d
        E[] f57411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int[] f57412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f57413h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f57414i;

        public a(Comparator<? super E> comparator) {
            super(true);
            this.f57410e = (Comparator) com.google.common.base.w.E(comparator);
            this.f57411f = (E[]) new Object[4];
            this.f57412g = new int[4];
        }

        private void u(boolean z10) {
            int i10 = this.f57413h;
            if (i10 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f57411f, i10);
            Arrays.sort(objArr, this.f57410e);
            int i11 = 1;
            for (int i12 = 1; i12 < objArr.length; i12++) {
                if (this.f57410e.compare((Object) objArr[i11 - 1], (Object) objArr[i12]) < 0) {
                    objArr[i11] = objArr[i12];
                    i11++;
                }
            }
            Arrays.fill(objArr, i11, this.f57413h, (Object) null);
            if (z10) {
                int i13 = i11 * 4;
                int i14 = this.f57413h;
                if (i13 > i14 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.math.f.t(i14, (i14 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i15 = 0; i15 < this.f57413h; i15++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i11, this.f57411f[i15], this.f57410e);
                int i16 = this.f57412g[i15];
                if (i16 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i16;
                } else {
                    iArr[iBinarySearch] = ~i16;
                }
            }
            this.f57411f = (E[]) objArr;
            this.f57412g = iArr;
            this.f57413h = i11;
        }

        private void v() {
            u(false);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f57413h;
                if (i10 >= i12) {
                    Arrays.fill(this.f57411f, i11, i12, (Object) null);
                    Arrays.fill(this.f57412g, i11, this.f57413h, 0);
                    this.f57413h = i11;
                    return;
                }
                int[] iArr = this.f57412g;
                int i13 = iArr[i10];
                if (i13 > 0) {
                    E[] eArr = this.f57411f;
                    eArr[i11] = eArr[i10];
                    iArr[i11] = i13;
                    i11++;
                }
                i10++;
            }
        }

        private void w() {
            int i10 = this.f57413h;
            E[] eArr = this.f57411f;
            if (i10 == eArr.length) {
                u(true);
            } else if (this.f57414i) {
                this.f57411f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f57414i = false;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<E> g(E e10) {
            return k(e10, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... eArr) {
            for (E e10 : eArr) {
                g(e10);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof s1) {
                for (s1.a<E> aVar : ((s1) iterable).entrySet()) {
                    k(aVar.a(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> k(E e10, int i10) {
            com.google.common.base.w.E(e10);
            n.b(i10, "occurrences");
            if (i10 == 0) {
                return this;
            }
            w();
            E[] eArr = this.f57411f;
            int i11 = this.f57413h;
            eArr[i11] = e10;
            this.f57412g[i11] = i10;
            this.f57413h = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> e() {
            v();
            int i10 = this.f57413h;
            if (i10 == 0) {
                return ImmutableSortedMultiset.h0(this.f57410e);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.Y(this.f57410e, i10, this.f57411f);
            long[] jArr = new long[this.f57413h + 1];
            int i11 = 0;
            while (i11 < this.f57413h) {
                int i12 = i11 + 1;
                jArr[i12] = jArr[i11] + ((long) this.f57412g[i11]);
                i11 = i12;
            }
            this.f57414i = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f57413h);
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @s9.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<E> m(E e10, int i10) {
            com.google.common.base.w.E(e10);
            n.b(i10, "count");
            w();
            E[] eArr = this.f57411f;
            int i11 = this.f57413h;
            eArr[i11] = e10;
            this.f57412g[i11] = ~i10;
            this.f57413h = i11 + 1;
            return this;
        }
    }

    ImmutableSortedMultiset() {
    }

    public static <E> ImmutableSortedMultiset<E> U(Iterable<? extends E> iterable) {
        return V(Ordering.z(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> V(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.i() ? a0(comparator, immutableSortedMultiset.entrySet().a()) : immutableSortedMultiset;
            }
        }
        return new a(comparator).c(iterable).e();
    }

    public static <E> ImmutableSortedMultiset<E> W(Comparator<? super E> comparator, Iterator<? extends E> it) {
        com.google.common.base.w.E(comparator);
        return new a(comparator).d(it).e();
    }

    public static <E> ImmutableSortedMultiset<E> X(Iterator<? extends E> it) {
        return W(Ordering.z(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset Y(Comparable[] comparableArr) {
        return V(Ordering.z(), Arrays.asList(comparableArr));
    }

    public static <E> ImmutableSortedMultiset<E> Z(o2<E> o2Var) {
        return a0(o2Var.comparator(), Lists.r(o2Var.entrySet()));
    }

    private static <E> ImmutableSortedMultiset<E> a0(Comparator<? super E> comparator, Collection<s1.a<E>> collection) {
        if (collection.isEmpty()) {
            return h0(comparator);
        }
        ImmutableList.a aVar = new ImmutableList.a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i10 = 0;
        for (s1.a<E> aVar2 : collection) {
            aVar.a(aVar2.a());
            int i11 = i10 + 1;
            jArr[i11] = jArr[i10] + ((long) aVar2.getCount());
            i10 = i11;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(aVar.e(), comparator), jArr, 0, collection.size());
    }

    static <E> ImmutableSortedMultiset<E> h0(Comparator<? super E> comparator) {
        return Ordering.z().equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.f57834k : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> a<E> k0() {
        return new a<>(Ordering.z());
    }

    public static <E> ImmutableSortedMultiset<E> l0() {
        return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.f57834k;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset n0(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.A0(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset q0(Comparable comparable, Comparable comparable2) {
        return V(Ordering.z(), Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset r0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return V(Ordering.z(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset s0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return V(Ordering.z(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset t0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return V(Ordering.z(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset u0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListU = Lists.u(comparableArr.length + 6);
        Collections.addAll(arrayListU, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListU, comparableArr);
        return V(Ordering.z(), arrayListU);
    }

    public static <E> a<E> v0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> w0() {
        return new a<>(Ordering.z().E());
    }

    @Override // com.google.common.collect.o2
    /* JADX INFO: renamed from: A0 */
    public abstract ImmutableSortedMultiset<E> F1(E e10, BoundType boundType);

    @Override // com.google.common.collect.o2
    /* JADX INFO: renamed from: b0 */
    public ImmutableSortedMultiset<E> e0() {
        ImmutableSortedMultiset<E> immutableSortedMultisetH0 = this.f57406e;
        if (immutableSortedMultisetH0 == null) {
            immutableSortedMultisetH0 = isEmpty() ? h0(Ordering.i(comparator()).E()) : new DescendingImmutableSortedMultiset<>(this);
            this.f57406e = immutableSortedMultisetH0;
        }
        return immutableSortedMultisetH0;
    }

    @Override // com.google.common.collect.o2, com.google.common.collect.j2
    public final Comparator<? super E> comparator() {
        return c().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: d0 */
    public abstract ImmutableSortedSet<E> c();

    @Override // com.google.common.collect.o2
    /* JADX INFO: renamed from: i0 */
    public abstract ImmutableSortedMultiset<E> m0(E e10, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    Object l() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.o2
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final s1.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o2
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final s1.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o2
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> j1(E e10, BoundType boundType, E e11, BoundType boundType2) {
        com.google.common.base.w.y(comparator().compare(e10, e11) <= 0, "Expected lowerBound <= upperBound but %s > %s", e10, e11);
        return F1(e10, boundType).m0(e11, boundType2);
    }
}
