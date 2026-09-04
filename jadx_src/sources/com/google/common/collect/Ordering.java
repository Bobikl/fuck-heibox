package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class Ordering<T> implements Comparator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f57768b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f57769c = -1;

    @o9.d
    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f57770b;

        IncomparableValueException(Object obj) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Cannot compare value: ");
            sb2.append(strValueOf);
            super(sb2.toString());
            this.f57770b = obj;
        }
    }

    @o9.d
    public static class a extends Ordering<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicInteger f57771d = new AtomicInteger(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ConcurrentMap<Object, Integer> f57772e = z1.l(new MapMaker()).i();

        a() {
        }

        private Integer H(Object obj) {
            Integer num = this.f57772e.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.f57771d.getAndIncrement());
            Integer numPutIfAbsent = this.f57772e.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        int I(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int I = I(obj);
            int I2 = I(obj2);
            if (I != I2) {
                return I < I2 ? -1 : 1;
            }
            int iCompareTo = H(obj).compareTo(H(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Ordering<Object> f57773a = new a();

        private b() {
        }
    }

    protected Ordering() {
    }

    @o9.b(serializable = true)
    public static Ordering<Object> G() {
        return UsingToStringOrdering.f58039d;
    }

    @o9.b(serializable = true)
    public static Ordering<Object> a() {
        return AllEqualOrdering.f57074d;
    }

    public static Ordering<Object> b() {
        return b.f57773a;
    }

    @o9.b(serializable = true)
    public static <T> Ordering<T> d(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    @o9.b(serializable = true)
    public static <T> Ordering<T> f(T t10, T... tArr) {
        return g(Lists.c(t10, tArr));
    }

    @o9.b(serializable = true)
    public static <T> Ordering<T> g(List<T> list) {
        return new ExplicitOrdering(list);
    }

    @o9.b(serializable = true)
    @Deprecated
    public static <T> Ordering<T> h(Ordering<T> ordering) {
        return (Ordering) com.google.common.base.w.E(ordering);
    }

    @o9.b(serializable = true)
    public static <T> Ordering<T> i(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @o9.b(serializable = true)
    public static <C extends Comparable> Ordering<C> z() {
        return NaturalOrdering.f57763f;
    }

    @o9.b(serializable = true)
    public <S extends T> Ordering<S> A() {
        return new NullsFirstOrdering(this);
    }

    @o9.b(serializable = true)
    public <S extends T> Ordering<S> B() {
        return new NullsLastOrdering(this);
    }

    <T2 extends T> Ordering<Map.Entry<T2, ?>> C() {
        return (Ordering<Map.Entry<T2, ?>>) D(Maps.R());
    }

    @o9.b(serializable = true)
    public <F> Ordering<F> D(com.google.common.base.n<F, ? extends T> nVar) {
        return new ByFunctionOrdering(nVar, this);
    }

    @o9.b(serializable = true)
    public <S extends T> Ordering<S> E() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> F(Iterable<E> iterable) {
        Object[] objArrP = l1.P(iterable);
        Arrays.sort(objArrP, this);
        return Lists.r(Arrays.asList(objArrP));
    }

    @Deprecated
    public int c(List<? extends T> list, @x1 T t10) {
        return Collections.binarySearch(list, t10, this);
    }

    @Override // java.util.Comparator
    @s9.a
    public abstract int compare(@x1 T t10, @x1 T t11);

    @o9.b(serializable = true)
    public <U extends T> Ordering<U> e(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) com.google.common.base.w.E(comparator));
    }

    public <E extends T> List<E> j(Iterable<E> iterable, int i10) {
        return E().o(iterable, i10);
    }

    public <E extends T> List<E> k(Iterator<E> it, int i10) {
        return E().p(it, i10);
    }

    public <E extends T> ImmutableList<E> l(Iterable<E> iterable) {
        return ImmutableList.W(this, iterable);
    }

    public boolean m(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean n(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> o(Iterable<E> iterable, int i10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i10) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i10) {
                    array = Arrays.copyOf(array, i10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return p(iterable.iterator(), i10);
    }

    public <E extends T> List<E> p(Iterator<E> it, int i10) {
        com.google.common.base.w.E(it);
        n.b(i10, "k");
        if (i10 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i10 < 1073741823) {
            v2 v2VarD = v2.d(i10, this);
            v2VarD.g(it);
            return v2VarD.j();
        }
        ArrayList arrayListS = Lists.s(it);
        Collections.sort(arrayListS, this);
        if (arrayListS.size() > i10) {
            arrayListS.subList(i10, arrayListS.size()).clear();
        }
        arrayListS.trimToSize();
        return Collections.unmodifiableList(arrayListS);
    }

    @o9.b(serializable = true)
    public <S extends T> Ordering<Iterable<S>> q() {
        return new LexicographicalOrdering(this);
    }

    @x1
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) u(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public <E extends T> E s(@x1 E e10, @x1 E e11) {
        return compare(e10, e11) >= 0 ? e10 : e11;
    }

    @x1
    public <E extends T> E t(@x1 E e10, @x1 E e11, @x1 E e12, E... eArr) {
        E e13 = (E) s(s(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) s(e13, e14);
        }
        return e13;
    }

    @x1
    public <E extends T> E u(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) s(next, it.next());
        }
        return next;
    }

    @x1
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public <E extends T> E w(@x1 E e10, @x1 E e11) {
        return compare(e10, e11) <= 0 ? e10 : e11;
    }

    @x1
    public <E extends T> E x(@x1 E e10, @x1 E e11, @x1 E e12, E... eArr) {
        E e13 = (E) w(w(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) w(e13, e14);
        }
        return e13;
    }

    @x1
    public <E extends T> E y(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) w(next, it.next());
        }
        return next;
    }
}
