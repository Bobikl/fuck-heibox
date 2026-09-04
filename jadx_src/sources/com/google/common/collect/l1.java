package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Iterables.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class l1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class a<T> implements com.google.common.base.n<Iterable<? extends T>, Iterator<? extends T>> {
        a() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class b<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58094c;

        b(Iterable iterable) {
            this.f58094c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.r(this.f58094c);
        }

        @Override // com.google.common.collect.f0
        public String toString() {
            return String.valueOf(this.f58094c.toString()).concat(" (cycled)");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class c<T> extends f0<List<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58096d;

        c(Iterable iterable, int i10) {
            this.f58095c = iterable;
            this.f58096d = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.Q(this.f58095c.iterator(), this.f58096d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class d<T> extends f0<List<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58098d;

        d(Iterable iterable, int i10) {
            this.f58097c = iterable;
            this.f58098d = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.P(this.f58097c.iterator(), this.f58098d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class e<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f58100d;

        e(Iterable iterable, com.google.common.base.x xVar) {
            this.f58099c = iterable;
            this.f58100d = xVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.x(this.f58099c.iterator(), this.f58100d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class f<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f58102d;

        f(Iterable iterable, com.google.common.base.n nVar) {
            this.f58101c = iterable;
            this.f58102d = nVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.c0(this.f58101c.iterator(), this.f58102d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class g<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58104d;

        /* JADX INFO: compiled from: Iterables.java */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f58105b = true;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f58106c;

            a(g gVar, Iterator it) {
                this.f58106c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f58106c.hasNext();
            }

            @Override // java.util.Iterator
            @x1
            public T next() {
                T t10 = (T) this.f58106c.next();
                this.f58105b = false;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                n.e(!this.f58105b);
                this.f58106c.remove();
            }
        }

        g(Iterable iterable, int i10) {
            this.f58103c = iterable;
            this.f58104d = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f58103c;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f58104d), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            Iterators.b(it, this.f58104d);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class h<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58108d;

        h(Iterable iterable, int i10) {
            this.f58107c = iterable;
            this.f58108d = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.N(this.f58107c.iterator(), this.f58108d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class i<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58109c;

        i(Iterable iterable) {
            this.f58109c = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f58109c;
            return iterable instanceof Queue ? new s((Queue) iterable) : Iterators.p(iterable.iterator());
        }

        @Override // com.google.common.collect.f0
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.java */
    public class j<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f58110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Comparator f58111d;

        j(Iterable iterable, Comparator comparator) {
            this.f58110c = iterable;
            this.f58111d = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.O(l1.U(this.f58110c, l1.S()), this.f58111d);
        }
    }

    /* JADX INFO: compiled from: Iterables.java */
    public static final class k<T> extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterable<? extends T> f58112c;

        private k(Iterable<? extends T> iterable) {
            this.f58112c = iterable;
        }

        /* synthetic */ k(Iterable iterable, b bVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.f0(this.f58112c.iterator());
        }

        @Override // com.google.common.collect.f0
        public String toString() {
            return this.f58112c.toString();
        }
    }

    private l1() {
    }

    @x1
    public static <T> T A(Iterable<? extends T> iterable, @x1 T t10) {
        return (T) Iterators.L(iterable.iterator(), t10);
    }

    public static <T> int B(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return Iterators.M(iterable.iterator(), xVar);
    }

    public static boolean C(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> D(Iterable<T> iterable, int i10) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.e(i10 >= 0, "limit is negative");
        return new h(iterable, i10);
    }

    @o9.a
    public static <T> Iterable<T> E(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.w.F(iterable, "iterables");
        com.google.common.base.w.F(comparator, "comparator");
        return new k(new j(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> F(Iterable<T> iterable, int i10) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.d(i10 > 0);
        return new d(iterable, i10);
    }

    public static <T> Iterable<List<T>> G(Iterable<T> iterable, int i10) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.d(i10 > 0);
        return new c(iterable, i10);
    }

    @s9.a
    public static boolean H(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) com.google.common.base.w.E(collection)) : Iterators.V(iterable.iterator(), collection);
    }

    @CheckForNull
    static <T> T I(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(xVar);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @s9.a
    public static <T> boolean J(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? K((List) iterable, (com.google.common.base.x) com.google.common.base.w.E(xVar)) : Iterators.W(iterable.iterator(), xVar);
    }

    private static <T> boolean K(List<T> list, com.google.common.base.x<? super T> xVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!xVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        O(list, xVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        O(list, xVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    @s9.a
    public static boolean L(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) com.google.common.base.w.E(collection)) : Iterators.X(iterable.iterator(), collection);
    }

    public static int M(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : Iterators.Z(iterable.iterator());
    }

    public static <T> Iterable<T> N(Iterable<T> iterable, int i10) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.e(i10 >= 0, "number to skip cannot be negative");
        return new g(iterable, i10);
    }

    private static <T> void O(List<T> list, com.google.common.base.x<? super T> xVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (xVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] P(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    @o9.c
    public static <T> T[] Q(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) R(iterable, u1.i(cls, 0));
    }

    static <T> T[] R(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) d(iterable).toArray(tArr);
    }

    static <T> com.google.common.base.n<Iterable<? extends T>, Iterator<? extends T>> S() {
        return new a();
    }

    public static String T(Iterable<?> iterable) {
        return Iterators.b0(iterable.iterator());
    }

    public static <F, T> Iterable<T> U(Iterable<F> iterable, com.google.common.base.n<? super F, ? extends T> nVar) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.E(nVar);
        return new f(iterable, nVar);
    }

    public static <T> Optional<T> V(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return Iterators.d0(iterable.iterator(), xVar);
    }

    @Deprecated
    public static <E> Iterable<E> W(ImmutableCollection<E> immutableCollection) {
        return (Iterable) com.google.common.base.w.E(immutableCollection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> X(Iterable<? extends T> iterable) {
        com.google.common.base.w.E(iterable);
        return ((iterable instanceof k) || (iterable instanceof ImmutableCollection)) ? iterable : new k(iterable, null);
    }

    @s9.a
    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.a(collection, ((Iterable) com.google.common.base.w.E(iterable)).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return Iterators.c(iterable.iterator(), xVar);
    }

    public static <T> boolean c(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return Iterators.d(iterable.iterator(), xVar);
    }

    private static <E> Collection<E> d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.s(iterable.iterator());
    }

    public static <T> Iterable<T> e(Iterable<? extends Iterable<? extends T>> iterable) {
        return f0.h(iterable);
    }

    public static <T> Iterable<T> f(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return f0.i(iterable, iterable2);
    }

    public static <T> Iterable<T> g(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return f0.j(iterable, iterable2, iterable3);
    }

    public static <T> Iterable<T> h(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return f0.l(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> i(Iterable<? extends T>... iterableArr) {
        return f0.m(iterableArr);
    }

    public static <T> Iterable<T> j(Iterable<T> iterable) {
        com.google.common.base.w.E(iterable);
        return new i(iterable);
    }

    public static boolean k(Iterable<? extends Object> iterable, @CheckForNull Object obj) {
        return iterable instanceof Collection ? o.j((Collection) iterable, obj) : Iterators.q(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> l(Iterable<T> iterable) {
        com.google.common.base.w.E(iterable);
        return new b(iterable);
    }

    @SafeVarargs
    public static <T> Iterable<T> m(T... tArr) {
        return l(Lists.t(tArr));
    }

    public static boolean n(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.t(iterable.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> o(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.E(xVar);
        return new e(iterable, xVar);
    }

    @o9.c
    public static <T> Iterable<T> p(Iterable<?> iterable, Class<T> cls) {
        com.google.common.base.w.E(iterable);
        com.google.common.base.w.E(cls);
        return o(iterable, Predicates.o(cls));
    }

    @x1
    public static <T> T q(Iterable<T> iterable, com.google.common.base.x<? super T> xVar) {
        return (T) Iterators.z(iterable.iterator(), xVar);
    }

    @CheckForNull
    public static <T> T r(Iterable<? extends T> iterable, com.google.common.base.x<? super T> xVar, @CheckForNull T t10) {
        return (T) Iterators.A(iterable.iterator(), xVar, t10);
    }

    public static int s(Iterable<?> iterable, @CheckForNull Object obj) {
        if (iterable instanceof s1) {
            return ((s1) iterable).E1(obj);
        }
        return iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : Iterators.E(iterable.iterator(), obj);
    }

    @x1
    public static <T> T t(Iterable<T> iterable, int i10) {
        com.google.common.base.w.E(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) Iterators.F(iterable.iterator(), i10);
    }

    @x1
    public static <T> T u(Iterable<? extends T> iterable, int i10, @x1 T t10) {
        com.google.common.base.w.E(iterable);
        Iterators.g(i10);
        if (iterable instanceof List) {
            List listF = Lists.f(iterable);
            return i10 < listF.size() ? (T) listF.get(i10) : t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.b(it, i10);
        return (T) Iterators.J(it, t10);
    }

    @x1
    public static <T> T v(Iterable<? extends T> iterable, @x1 T t10) {
        return (T) Iterators.J(iterable.iterator(), t10);
    }

    @x1
    public static <T> T w(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.H(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) y(list);
    }

    @x1
    public static <T> T x(Iterable<? extends T> iterable, @x1 T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) y(Lists.f(iterable));
            }
        }
        return (T) Iterators.I(iterable.iterator(), t10);
    }

    @x1
    private static <T> T y(List<T> list) {
        return list.get(list.size() - 1);
    }

    @x1
    public static <T> T z(Iterable<T> iterable) {
        return (T) Iterators.K(iterable.iterator());
    }
}
