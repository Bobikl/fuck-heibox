package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.n.e(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration f57429b;

        a(Enumeration enumeration) {
            this.f57429b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57429b.hasMoreElements();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            return (T) this.f57429b.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements Enumeration<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f57430a;

        b(Iterator it) {
            this.f57430a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f57430a.hasNext();
        }

        @Override // java.util.Enumeration
        @x1
        public T nextElement() {
            return (T) this.f57430a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f57431b;

        c(Iterator it) {
            this.f57431b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57431b.hasNext();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            return (T) this.f57431b.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<T> f57432b = Iterators.w();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f57433c;

        d(Iterable iterable) {
            this.f57433c = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57432b.hasNext() || this.f57433c.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            if (!this.f57432b.hasNext()) {
                Iterator<T> it = this.f57433c.iterator();
                this.f57432b = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f57432b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f57432b.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class e<I> extends b3<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57434b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator[] f57435c;

        e(Iterator[] itArr) {
            this.f57435c = itArr;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f57435c[this.f57434b];
            Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = this.f57435c;
            int i10 = this.f57434b;
            itArr[i10] = null;
            this.f57434b = i10 + 1;
            return it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57434b < this.f57435c.length;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class f<T> extends b3<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f57436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f57437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f57438d;

        f(Iterator it, int i10, boolean z10) {
            this.f57436b = it;
            this.f57437c = i10;
            this.f57438d = z10;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f57437c];
            int i10 = 0;
            while (i10 < this.f57437c && this.f57436b.hasNext()) {
                objArr[i10] = this.f57436b.next();
                i10++;
            }
            for (int i11 = i10; i11 < this.f57437c; i11++) {
                objArr[i11] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f57438d || i10 == this.f57437c) ? listUnmodifiableList : listUnmodifiableList.subList(0, i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57436b.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class g<T> extends AbstractIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f57439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f57440e;

        g(Iterator it, com.google.common.base.x xVar) {
            this.f57439d = it;
            this.f57440e = xVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected T a() {
            while (this.f57439d.hasNext()) {
                T t10 = (T) this.f57439d.next();
                if (this.f57440e.apply(t10)) {
                    return t10;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    public class h<F, T> extends w2<F, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f57441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Iterator it, com.google.common.base.n nVar) {
            super(it);
            this.f57441c = nVar;
        }

        @Override // com.google.common.collect.w2
        @x1
        T a(@x1 F f10) {
            return (T) this.f57441c.apply(f10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f57442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f57443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f57444d;

        i(int i10, Iterator it) {
            this.f57443c = i10;
            this.f57444d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57442b < this.f57443c && this.f57444d.hasNext();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f57442b++;
            return (T) this.f57444d.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f57444d.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class j<T> extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f57445b;

        j(Iterator it) {
            this.f57445b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57445b.hasNext();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            T t10 = (T) this.f57445b.next();
            this.f57445b.remove();
            return t10;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class k<T> extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f57446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f57447c;

        k(Object obj) {
            this.f57447c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f57446b;
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            if (this.f57446b) {
                throw new NoSuchElementException();
            }
            this.f57446b = true;
            return (T) this.f57447c;
        }
    }

    public static final class l<T> extends com.google.common.collect.a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final c3<Object> f57448f = new l(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final T[] f57449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f57450e;

        l(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f57449d = tArr;
            this.f57450e = i10;
        }

        @Override // com.google.common.collect.a
        @x1
        protected T a(int i10) {
            return this.f57449d[this.f57450e + i10];
        }
    }

    public static class m<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private Iterator<? extends T> f57451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<? extends T> f57452c = Iterators.u();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> f57453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        private Deque<Iterator<? extends Iterator<? extends T>>> f57454e;

        m(Iterator<? extends Iterator<? extends T>> it) {
            this.f57453d = (Iterator) com.google.common.base.w.E(it);
        }

        @CheckForNull
        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f57453d;
                if (it != null && it.hasNext()) {
                    return this.f57453d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f57454e;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f57453d = this.f57454e.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) com.google.common.base.w.E(this.f57452c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f57453d = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f57452c = next;
                if (next instanceof m) {
                    m mVar = (m) next;
                    this.f57452c = mVar.f57452c;
                    if (this.f57454e == null) {
                        this.f57454e = new ArrayDeque();
                    }
                    this.f57454e.addFirst(this.f57453d);
                    if (mVar.f57454e != null) {
                        while (!mVar.f57454e.isEmpty()) {
                            this.f57454e.addFirst(mVar.f57454e.removeLast());
                        }
                    }
                    this.f57453d = mVar.f57453d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f57452c;
            this.f57451b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f57451b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f57451b = null;
        }
    }

    public static class n<T> extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<y1<T>> f57455b;

        public n(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f57455b = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.m1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Iterators.n.b(comparator, (y1) obj, (y1) obj2);
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f57455b.add(Iterators.T(it));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int b(Comparator comparator, y1 y1Var, y1 y1Var2) {
            return comparator.compare(y1Var.peek(), y1Var2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f57455b.isEmpty();
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            y1<T> y1VarRemove = this.f57455b.remove();
            T next = y1VarRemove.next();
            if (y1VarRemove.hasNext()) {
                this.f57455b.add(y1VarRemove);
            }
            return next;
        }
    }

    public static class o<E> implements y1<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<? extends E> f57456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f57457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private E f57458d;

        public o(Iterator<? extends E> it) {
            this.f57456b = (Iterator) com.google.common.base.w.E(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57457c || this.f57456b.hasNext();
        }

        @Override // com.google.common.collect.y1, java.util.Iterator
        @x1
        public E next() {
            if (!this.f57457c) {
                return this.f57456b.next();
            }
            E e10 = (E) t1.a(this.f57458d);
            this.f57457c = false;
            this.f57458d = null;
            return e10;
        }

        @Override // com.google.common.collect.y1
        @x1
        public E peek() {
            if (!this.f57457c) {
                this.f57458d = this.f57456b.next();
                this.f57457c = true;
            }
            return (E) t1.a(this.f57458d);
        }

        @Override // com.google.common.collect.y1, java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(!this.f57457c, "Can't remove after you've peeked at next");
            this.f57456b.remove();
        }
    }

    private Iterators() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T A(Iterator<? extends T> it, com.google.common.base.x<? super T> xVar, @CheckForNull T t10) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return next;
            }
        }
        return t10;
    }

    @SafeVarargs
    public static <T> b3<T> B(T... tArr) {
        return C(tArr, 0, tArr.length, 0);
    }

    static <T> c3<T> C(T[] tArr, int i10, int i11, int i12) {
        com.google.common.base.w.d(i11 >= 0);
        com.google.common.base.w.f0(i10, i10 + i11, tArr.length);
        com.google.common.base.w.d0(i12, i11);
        return i11 == 0 ? v() : new l(tArr, i10, i11, i12);
    }

    public static <T> b3<T> D(Enumeration<T> enumeration) {
        com.google.common.base.w.E(enumeration);
        return new a(enumeration);
    }

    public static int E(Iterator<?> it, @CheckForNull Object obj) {
        int i10 = 0;
        while (q(it, obj)) {
            i10++;
        }
        return i10;
    }

    @x1
    public static <T> T F(Iterator<T> it, int i10) {
        g(i10);
        int iB = b(it, i10);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb2 = new StringBuilder(91);
        sb2.append("position (");
        sb2.append(i10);
        sb2.append(") must be less than the number of elements that remained (");
        sb2.append(iB);
        sb2.append(")");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @x1
    public static <T> T G(Iterator<? extends T> it, int i10, @x1 T t10) {
        g(i10);
        b(it, i10);
        return (T) J(it, t10);
    }

    @x1
    public static <T> T H(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @x1
    public static <T> T I(Iterator<? extends T> it, @x1 T t10) {
        return it.hasNext() ? (T) H(it) : t10;
    }

    @x1
    public static <T> T J(Iterator<? extends T> it, @x1 T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    @x1
    public static <T> T K(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append(kotlin.text.y.f128597f);
        throw new IllegalArgumentException(sb2.toString());
    }

    @x1
    public static <T> T L(Iterator<? extends T> it, @x1 T t10) {
        return it.hasNext() ? (T) K(it) : t10;
    }

    public static <T> int M(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.F(xVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (xVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Iterator<T> N(Iterator<T> it, int i10) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.e(i10 >= 0, "limit is negative");
        return new i(i10, it);
    }

    @o9.a
    public static <T> b3<T> O(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.w.F(iterable, "iterators");
        com.google.common.base.w.F(comparator, "comparator");
        return new n(iterable, comparator);
    }

    public static <T> b3<List<T>> P(Iterator<T> it, int i10) {
        return R(it, i10, true);
    }

    public static <T> b3<List<T>> Q(Iterator<T> it, int i10) {
        return R(it, i10, false);
    }

    private static <T> b3<List<T>> R(Iterator<T> it, int i10, boolean z10) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.d(i10 > 0);
        return new f(it, i10, z10);
    }

    @Deprecated
    public static <T> y1<T> S(y1<T> y1Var) {
        return (y1) com.google.common.base.w.E(y1Var);
    }

    public static <T> y1<T> T(Iterator<? extends T> it) {
        return it instanceof o ? (o) it : new o(it);
    }

    @CheckForNull
    static <T> T U(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @s9.a
    public static boolean V(Iterator<?> it, Collection<?> collection) {
        com.google.common.base.w.E(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @s9.a
    public static <T> boolean W(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(xVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (xVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @s9.a
    public static boolean X(Iterator<?> it, Collection<?> collection) {
        com.google.common.base.w.E(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> b3<T> Y(@x1 T t10) {
        return new k(t10);
    }

    public static int Z(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return Ints.x(j10);
    }

    @s9.a
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        com.google.common.base.w.E(collection);
        com.google.common.base.w.E(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    @o9.c
    public static <T> T[] a0(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) l1.Q(Lists.s(it), cls);
    }

    @s9.a
    public static int b(Iterator<?> it, int i10) {
        com.google.common.base.w.E(it);
        int i11 = 0;
        com.google.common.base.w.e(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static String b0(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <T> boolean c(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(xVar);
        while (it.hasNext()) {
            if (!xVar.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <F, T> Iterator<T> c0(Iterator<F> it, com.google.common.base.n<? super F, ? extends T> nVar) {
        com.google.common.base.w.E(nVar);
        return new h(it, nVar);
    }

    public static <T> boolean d(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        return M(it, xVar) != -1;
    }

    public static <T> Optional<T> d0(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return Optional.f(next);
            }
        }
        return Optional.a();
    }

    public static <T> Enumeration<T> e(Iterator<T> it) {
        com.google.common.base.w.E(it);
        return new b(it);
    }

    @Deprecated
    public static <T> b3<T> e0(b3<T> b3Var) {
        return (b3) com.google.common.base.w.E(b3Var);
    }

    static <T> ListIterator<T> f(Iterator<T> it) {
        return (ListIterator) it;
    }

    public static <T> b3<T> f0(Iterator<? extends T> it) {
        com.google.common.base.w.E(it);
        return it instanceof b3 ? (b3) it : new c(it);
    }

    static void g(int i10) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("position (");
        sb2.append(i10);
        sb2.append(") must not be negative");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    static void h(Iterator<?> it) {
        com.google.common.base.w.E(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> i(Iterator<? extends Iterator<? extends T>> it) {
        return new m(it);
    }

    public static <T> Iterator<T> j(Iterator<? extends T> it, Iterator<? extends T> it2) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(it2);
        return i(o(it, it2));
    }

    public static <T> Iterator<T> k(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(it2);
        com.google.common.base.w.E(it3);
        return i(o(it, it2, it3));
    }

    public static <T> Iterator<T> l(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(it2);
        com.google.common.base.w.E(it3);
        com.google.common.base.w.E(it4);
        return i(o(it, it2, it3, it4));
    }

    public static <T> Iterator<T> m(Iterator<? extends T>... itArr) {
        return n((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    static <T> Iterator<T> n(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) com.google.common.base.w.E(itArr)) {
            com.google.common.base.w.E(it);
        }
        return i(o(itArr));
    }

    private static <I extends Iterator<?>> Iterator<I> o(I... iArr) {
        return new e(iArr);
    }

    public static <T> Iterator<T> p(Iterator<T> it) {
        com.google.common.base.w.E(it);
        return new j(it);
    }

    public static boolean q(Iterator<?> it, @CheckForNull Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> r(Iterable<T> iterable) {
        com.google.common.base.w.E(iterable);
        return new d(iterable);
    }

    @SafeVarargs
    public static <T> Iterator<T> s(T... tArr) {
        return r(Lists.t(tArr));
    }

    public static boolean t(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.s.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> b3<T> u() {
        return v();
    }

    static <T> c3<T> v() {
        return (c3<T>) l.f57448f;
    }

    static <T> Iterator<T> w() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> b3<T> x(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(xVar);
        return new g(it, xVar);
    }

    @o9.c
    public static <T> b3<T> y(Iterator<?> it, Class<T> cls) {
        return x(it, Predicates.o(cls));
    }

    @x1
    public static <T> T z(Iterator<T> it, com.google.common.base.x<? super T> xVar) {
        com.google.common.base.w.E(it);
        com.google.common.base.w.E(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
}
