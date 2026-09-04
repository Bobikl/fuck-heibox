package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FluentIterable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class f0<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Optional<Iterable<E>> f58073b;

    /* JADX INFO: compiled from: FluentIterable.java */
    public class a extends f0<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f58074c = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f58074c.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FluentIterable.java */
    public class b<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58075c;

        b(Iterable iterable) {
            this.f58075c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.i(Iterators.c0(this.f58075c.iterator(), l1.S()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FluentIterable.java */
    public class c<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable[] f58076c;

        /* JADX INFO: compiled from: FluentIterable.java */
        public class a extends com.google.common.collect.a<Iterator<? extends T>> {
            a(int i10) {
                super(i10);
            }

            @Override // com.google.common.collect.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i10) {
                return c.this.f58076c[i10].iterator();
            }
        }

        c(Iterable[] iterableArr) {
            this.f58076c = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.i(new a(this.f58076c.length));
        }
    }

    /* JADX INFO: compiled from: FluentIterable.java */
    public static class d<E> implements com.google.common.base.n<Iterable<E>, f0<E>> {
        private d() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0<E> apply(Iterable<E> iterable) {
            return f0.y(iterable);
        }
    }

    protected f0() {
        this.f58073b = Optional.a();
    }

    f0(Iterable<E> iterable) {
        this.f58073b = Optional.f(iterable);
    }

    @o9.a
    public static <E> f0<E> A(E[] eArr) {
        return y(Arrays.asList(eArr));
    }

    private Iterable<E> B() {
        return this.f58073b.i(this);
    }

    @o9.a
    public static <E> f0<E> H() {
        return y(Collections.emptyList());
    }

    @o9.a
    public static <E> f0<E> I(@x1 E e10, E... eArr) {
        return y(Lists.c(e10, eArr));
    }

    @o9.a
    public static <T> f0<T> h(Iterable<? extends Iterable<? extends T>> iterable) {
        com.google.common.base.w.E(iterable);
        return new b(iterable);
    }

    @o9.a
    public static <T> f0<T> i(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return o(iterable, iterable2);
    }

    @o9.a
    public static <T> f0<T> j(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return o(iterable, iterable2, iterable3);
    }

    @o9.a
    public static <T> f0<T> l(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return o(iterable, iterable2, iterable3, iterable4);
    }

    @o9.a
    public static <T> f0<T> m(Iterable<? extends T>... iterableArr) {
        return o((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    private static <T> f0<T> o(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            com.google.common.base.w.E(iterable);
        }
        return new c(iterableArr);
    }

    @Deprecated
    @s9.l(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    public static <E> f0<E> x(f0<E> f0Var) {
        return (f0) com.google.common.base.w.E(f0Var);
    }

    public static <E> f0<E> y(Iterable<E> iterable) {
        return iterable instanceof f0 ? (f0) iterable : new a(iterable, iterable);
    }

    public final <K> ImmutableListMultimap<K, E> D(com.google.common.base.n<? super E, K> nVar) {
        return Multimaps.r(B(), nVar);
    }

    @o9.a
    public final String E(com.google.common.base.p pVar) {
        return pVar.k(this);
    }

    public final Optional<E> F() {
        E next;
        Iterable<E> iterableB = B();
        if (iterableB instanceof List) {
            List list = (List) iterableB;
            return list.isEmpty() ? Optional.a() : Optional.f(list.get(list.size() - 1));
        }
        Iterator<E> it = iterableB.iterator();
        if (!it.hasNext()) {
            return Optional.a();
        }
        if (iterableB instanceof SortedSet) {
            return Optional.f(((SortedSet) iterableB).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.f(next);
    }

    public final f0<E> G(int i10) {
        return y(l1.D(B(), i10));
    }

    public final f0<E> J(int i10) {
        return y(l1.N(B(), i10));
    }

    @o9.c
    public final E[] L(Class<E> cls) {
        return (E[]) l1.Q(B(), cls);
    }

    public final ImmutableList<E> N() {
        return ImmutableList.u(B());
    }

    public final <V> ImmutableMap<E, V> Q(com.google.common.base.n<? super E, V> nVar) {
        return Maps.u0(B(), nVar);
    }

    public final ImmutableMultiset<E> R() {
        return ImmutableMultiset.s(B());
    }

    public final ImmutableSet<E> S() {
        return ImmutableSet.v(B());
    }

    public final ImmutableList<E> T(Comparator<? super E> comparator) {
        return Ordering.i(comparator).l(B());
    }

    public final ImmutableSortedSet<E> U(Comparator<? super E> comparator) {
        return ImmutableSortedSet.b0(comparator, B());
    }

    public final <T> f0<T> V(com.google.common.base.n<? super E, T> nVar) {
        return y(l1.U(B(), nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> f0<T> W(com.google.common.base.n<? super E, ? extends Iterable<? extends T>> nVar) {
        return h(V(nVar));
    }

    public final <K> ImmutableMap<K, E> X(com.google.common.base.n<? super E, K> nVar) {
        return Maps.E0(B(), nVar);
    }

    public final boolean a(com.google.common.base.x<? super E> xVar) {
        return l1.b(B(), xVar);
    }

    public final boolean b(com.google.common.base.x<? super E> xVar) {
        return l1.c(B(), xVar);
    }

    public final boolean contains(@CheckForNull Object obj) {
        return l1.k(B(), obj);
    }

    @o9.a
    public final f0<E> e(Iterable<? extends E> iterable) {
        return i(B(), iterable);
    }

    @o9.a
    public final f0<E> g(E... eArr) {
        return i(B(), Arrays.asList(eArr));
    }

    @x1
    public final E get(int i10) {
        return (E) l1.t(B(), i10);
    }

    public final boolean isEmpty() {
        return !B().iterator().hasNext();
    }

    @s9.a
    public final <C extends Collection<? super E>> C q(C c10) {
        com.google.common.base.w.E(c10);
        Iterable<E> iterableB = B();
        if (iterableB instanceof Collection) {
            c10.addAll((Collection) iterableB);
        } else {
            Iterator<E> it = iterableB.iterator();
            while (it.hasNext()) {
                c10.add(it.next());
            }
        }
        return c10;
    }

    public final f0<E> s() {
        return y(l1.l(B()));
    }

    public final int size() {
        return l1.M(B());
    }

    public final f0<E> t(com.google.common.base.x<? super E> xVar) {
        return y(l1.o(B(), xVar));
    }

    public String toString() {
        return l1.T(B());
    }

    @o9.c
    public final <T> f0<T> u(Class<T> cls) {
        return y(l1.p(B(), cls));
    }

    public final Optional<E> v() {
        Iterator<E> it = B().iterator();
        return it.hasNext() ? Optional.f(it.next()) : Optional.a();
    }

    public final Optional<E> w(com.google.common.base.x<? super E> xVar) {
        return l1.V(B(), xVar);
    }
}
