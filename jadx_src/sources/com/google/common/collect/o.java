package com.google.common.collect;

import com.google.common.base.Predicates;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class o {

    /* JADX INFO: compiled from: Collections2.java */
    public static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection<E> f58114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.x<? super E> f58115c;

        a(Collection<E> collection, com.google.common.base.x<? super E> xVar) {
            this.f58114b = collection;
            this.f58115c = xVar;
        }

        a<E> a(com.google.common.base.x<? super E> xVar) {
            return new a<>(this.f58114b, Predicates.d(this.f58115c, xVar));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@x1 E e10) {
            com.google.common.base.w.d(this.f58115c.apply(e10));
            return this.f58114b.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.w.d(this.f58115c.apply(it.next()));
            }
            return this.f58114b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l1.J(this.f58114b, this.f58115c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (o.j(this.f58114b, obj)) {
                return this.f58115c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return o.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !l1.c(this.f58114b, this.f58115c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.x(this.f58114b.iterator(), this.f58115c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            return contains(obj) && this.f58114b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f58114b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f58115c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f58114b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f58115c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f58114b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f58115c.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.s(iterator()).toArray(tArr);
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    public static final class b<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableList<E> f58116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Comparator<? super E> f58117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f58118d;

        b(Iterable<E> iterable, Comparator<? super E> comparator) {
            ImmutableList<E> immutableListW = ImmutableList.W(comparator, iterable);
            this.f58116b = immutableListW;
            this.f58117c = comparator;
            this.f58118d = a(immutableListW, comparator);
        }

        private static <E> int a(List<E> list, Comparator<? super E> comparator) {
            int i10 = 1;
            int iU = 1;
            int i11 = 1;
            while (i10 < list.size()) {
                if (comparator.compare(list.get(i10 - 1), list.get(i10)) < 0) {
                    iU = com.google.common.math.f.u(iU, com.google.common.math.f.a(i10, i11));
                    i11 = 0;
                    if (iU == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
                i10++;
                i11++;
            }
            return com.google.common.math.f.u(iU, com.google.common.math.f.a(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return o.e(this.f58116b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.f58116b, this.f58117c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f58118d;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String strValueOf = String.valueOf(this.f58116b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 30);
            sb2.append("orderedPermutationCollection(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    public static final class c<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        List<E> f58119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Comparator<? super E> f58120e;

        c(List<E> list, Comparator<? super E> comparator) {
            this.f58119d = Lists.r(list);
            this.f58120e = comparator;
        }

        void d() {
            int iF = f();
            if (iF == -1) {
                this.f58119d = null;
                return;
            }
            Objects.requireNonNull(this.f58119d);
            Collections.swap(this.f58119d, iF, g(iF));
            Collections.reverse(this.f58119d.subList(iF + 1, this.f58119d.size()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            List<E> list = this.f58119d;
            if (list == null) {
                return b();
            }
            ImmutableList immutableListV = ImmutableList.v(list);
            d();
            return immutableListV;
        }

        int f() {
            Objects.requireNonNull(this.f58119d);
            for (int size = this.f58119d.size() - 2; size >= 0; size--) {
                if (this.f58120e.compare(this.f58119d.get(size), this.f58119d.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int g(int i10) {
            Objects.requireNonNull(this.f58119d);
            E e10 = this.f58119d.get(i10);
            for (int size = this.f58119d.size() - 1; size > i10; size--) {
                if (this.f58120e.compare(e10, this.f58119d.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    public static final class d<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableList<E> f58121b;

        d(ImmutableList<E> immutableList) {
            this.f58121b = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return o.e(this.f58121b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.f58121b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return com.google.common.math.f.h(this.f58121b.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String strValueOf = String.valueOf(this.f58121b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14);
            sb2.append("permutations(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    public static class e<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<E> f58122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int[] f58123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int[] f58124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f58125g;

        e(List<E> list) {
            this.f58122d = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f58123e = iArr;
            int[] iArr2 = new int[size];
            this.f58124f = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f58125g = Integer.MAX_VALUE;
        }

        void d() {
            int size = this.f58122d.size() - 1;
            this.f58125g = size;
            if (size == -1) {
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f58123e;
                int i11 = this.f58125g;
                int i12 = iArr[i11];
                int i13 = this.f58124f[i11] + i12;
                if (i13 < 0) {
                    f();
                } else if (i13 != i11 + 1) {
                    Collections.swap(this.f58122d, (i11 - i12) + i10, (i11 - i13) + i10);
                    this.f58123e[this.f58125g] = i13;
                    return;
                } else {
                    if (i11 == 0) {
                        return;
                    }
                    i10++;
                    f();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<E> a() {
            if (this.f58125g <= 0) {
                return b();
            }
            ImmutableList immutableListV = ImmutableList.v(this.f58122d);
            d();
            return immutableListV;
        }

        void f() {
            int[] iArr = this.f58124f;
            int i10 = this.f58125g;
            iArr[i10] = -iArr[i10];
            this.f58125g = i10 - 1;
        }
    }

    /* JADX INFO: compiled from: Collections2.java */
    public static class f<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection<F> f58126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.n<? super F, ? extends T> f58127c;

        f(Collection<F> collection, com.google.common.base.n<? super F, ? extends T> nVar) {
            this.f58126b = (Collection) com.google.common.base.w.E(collection);
            this.f58127c = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f58126b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f58126b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.c0(this.f58126b.iterator(), this.f58127c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f58126b.size();
        }
    }

    private o() {
    }

    static boolean b(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <E> v1<E> c(Collection<E> collection) {
        v1<E> v1Var = new v1<>();
        for (E e10 : collection) {
            v1Var.v(e10, v1Var.g(e10) + 1);
        }
        return v1Var;
    }

    public static <E> Collection<E> d(Collection<E> collection, com.google.common.base.x<? super E> xVar) {
        return collection instanceof a ? ((a) collection).a(xVar) : new a((Collection) com.google.common.base.w.E(collection), (com.google.common.base.x) com.google.common.base.w.E(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        v1 v1VarC = c(list);
        v1 v1VarC2 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (v1VarC.l(i10) != v1VarC2.g(v1VarC.j(i10))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder f(int i10) {
        n.b(i10, UiKitSpanObj.TYPE_SIZE);
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
    }

    @o9.a
    public static <E extends Comparable<? super E>> Collection<List<E>> g(Iterable<E> iterable) {
        return h(iterable, Ordering.z());
    }

    @o9.a
    public static <E> Collection<List<E>> h(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }

    @o9.a
    public static <E> Collection<List<E>> i(Collection<E> collection) {
        return new d(ImmutableList.v(collection));
    }

    static boolean j(Collection<?> collection, @CheckForNull Object obj) {
        com.google.common.base.w.E(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean k(Collection<?> collection, @CheckForNull Object obj) {
        com.google.common.base.w.E(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static String l(Collection<?> collection) {
        StringBuilder sbF = f(collection.size());
        sbF.append('[');
        boolean z10 = true;
        for (Object obj : collection) {
            if (!z10) {
                sbF.append(", ");
            }
            z10 = false;
            if (obj == collection) {
                sbF.append("(this Collection)");
            } else {
                sbF.append(obj);
            }
        }
        sbF.append(']');
        return sbF.toString();
    }

    public static <F, T> Collection<T> m(Collection<F> collection, com.google.common.base.n<? super F, T> nVar) {
        return new f(collection, nVar);
    }
}
