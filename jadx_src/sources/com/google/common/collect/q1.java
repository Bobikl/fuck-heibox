package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MinMaxPriorityQueue.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b
@u
public final class q1<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f58139h = 1431655765;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58140i = -1431655766;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f58141j = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q1<E>.c f58142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1<E>.c f58143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @o9.d
    final int f58144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f58145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58147g;

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    @o9.a
    public static final class b<B> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f58148d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparator<B> f58149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f58150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f58151c;

        private b(Comparator<B> comparator) {
            this.f58150b = -1;
            this.f58151c = Integer.MAX_VALUE;
            this.f58149a = (Comparator) com.google.common.base.w.E(comparator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> g() {
            return Ordering.i(this.f58149a);
        }

        public <T extends B> q1<T> c() {
            return d(Collections.emptySet());
        }

        public <T extends B> q1<T> d(Iterable<? extends T> iterable) {
            q1<T> q1Var = new q1<>(this, q1.v(this.f58150b, this.f58151c, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                q1Var.offer(it.next());
            }
            return q1Var;
        }

        @s9.a
        public b<B> e(int i10) {
            com.google.common.base.w.d(i10 >= 0);
            this.f58150b = i10;
            return this;
        }

        @s9.a
        public b<B> f(int i10) {
            com.google.common.base.w.d(i10 > 0);
            this.f58151c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Ordering<E> f58152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        q1<E>.c f58153b;

        c(Ordering<E> ordering) {
            this.f58152a = ordering;
        }

        private int k(int i10) {
            return m(m(i10));
        }

        private int l(int i10) {
            return (i10 * 2) + 1;
        }

        private int m(int i10) {
            return (i10 - 1) / 2;
        }

        private int n(int i10) {
            return (i10 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q(int i10) {
            if (l(i10) < q1.this.f58146f && d(i10, l(i10)) > 0) {
                return false;
            }
            if (n(i10) < q1.this.f58146f && d(i10, n(i10)) > 0) {
                return false;
            }
            if (i10 <= 0 || d(i10, m(i10)) <= 0) {
                return i10 <= 2 || d(k(i10), i10) <= 0;
            }
            return false;
        }

        void b(int i10, E e10) {
            c cVar;
            int iF = f(i10, e10);
            if (iF == i10) {
                iF = i10;
                cVar = this;
            } else {
                cVar = this.f58153b;
            }
            cVar.c(iF, e10);
        }

        @s9.a
        int c(int i10, E e10) {
            while (i10 > 2) {
                int iK = k(i10);
                Object objM = q1.this.m(iK);
                if (this.f58152a.compare((E) objM, e10) <= 0) {
                    break;
                }
                q1.this.f58145e[i10] = objM;
                i10 = iK;
            }
            q1.this.f58145e[i10] = e10;
            return i10;
        }

        int d(int i10, int i11) {
            return this.f58152a.compare((E) q1.this.m(i10), (E) q1.this.m(i11));
        }

        int e(int i10, E e10) {
            int i11 = i(i10);
            if (i11 <= 0 || this.f58152a.compare((E) q1.this.m(i11), e10) >= 0) {
                return f(i10, e10);
            }
            q1.this.f58145e[i10] = q1.this.m(i11);
            q1.this.f58145e[i11] = e10;
            return i11;
        }

        int f(int i10, E e10) {
            int iN;
            if (i10 == 0) {
                q1.this.f58145e[0] = e10;
                return 0;
            }
            int iM = m(i10);
            Object objM = q1.this.m(iM);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= q1.this.f58146f) {
                Object objM2 = q1.this.m(iN);
                if (this.f58152a.compare((E) objM2, (E) objM) < 0) {
                    iM = iN;
                    objM = objM2;
                }
            }
            if (this.f58152a.compare((E) objM, e10) >= 0) {
                q1.this.f58145e[i10] = e10;
                return i10;
            }
            q1.this.f58145e[i10] = objM;
            q1.this.f58145e[iM] = e10;
            return iM;
        }

        int g(int i10) {
            while (true) {
                int iJ = j(i10);
                if (iJ <= 0) {
                    return i10;
                }
                q1.this.f58145e[i10] = q1.this.m(iJ);
                i10 = iJ;
            }
        }

        int h(int i10, int i11) {
            if (i10 >= q1.this.f58146f) {
                return -1;
            }
            com.google.common.base.w.g0(i10 > 0);
            int iMin = Math.min(i10, q1.this.f58146f - i11) + i11;
            for (int i12 = i10 + 1; i12 < iMin; i12++) {
                if (d(i12, i10) < 0) {
                    i10 = i12;
                }
            }
            return i10;
        }

        int i(int i10) {
            return h(l(i10), 2);
        }

        int j(int i10) {
            int iL = l(i10);
            if (iL < 0) {
                return -1;
            }
            return h(l(iL), 4);
        }

        int o(E e10) {
            int iN;
            int iM = m(q1.this.f58146f);
            if (iM != 0 && (iN = n(m(iM))) != iM && l(iN) >= q1.this.f58146f) {
                Object objM = q1.this.m(iN);
                if (this.f58152a.compare((E) objM, e10) < 0) {
                    q1.this.f58145e[iN] = e10;
                    q1.this.f58145e[q1.this.f58146f] = objM;
                    return iN;
                }
            }
            return q1.this.f58146f;
        }

        @CheckForNull
        d<E> p(int i10, int i11, E e10) {
            int iE = e(i11, e10);
            if (iE == i11) {
                return null;
            }
            Object objM = iE < i10 ? q1.this.m(i10) : q1.this.m(m(i10));
            if (this.f58153b.c(iE, e10) < i10) {
                return new d<>(e10, objM);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    public static class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final E f58155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final E f58156b;

        d(E e10, E e11) {
            this.f58155a = e10;
            this.f58156b = e11;
        }
    }

    /* JADX INFO: compiled from: MinMaxPriorityQueue.java */
    public class e implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f58157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f58158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f58159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        private Queue<E> f58160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        private List<E> f58161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        private E f58162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f58163h;

        private e() {
            this.f58157b = -1;
            this.f58158c = -1;
            this.f58159d = q1.this.f58147g;
        }

        private void a() {
            if (q1.this.f58147g != this.f58159d) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean b(Iterable<E> iterable, E e10) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e10) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void c(int i10) {
            if (this.f58158c < i10) {
                if (this.f58161f != null) {
                    while (i10 < q1.this.size() && b(this.f58161f, q1.this.m(i10))) {
                        i10++;
                    }
                }
                this.f58158c = i10;
            }
        }

        private boolean d(Object obj) {
            for (int i10 = 0; i10 < q1.this.f58146f; i10++) {
                if (q1.this.f58145e[i10] == obj) {
                    q1.this.D(i10);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            c(this.f58157b + 1);
            if (this.f58158c < q1.this.size()) {
                return true;
            }
            Queue<E> queue = this.f58160e;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            c(this.f58157b + 1);
            if (this.f58158c < q1.this.size()) {
                int i10 = this.f58158c;
                this.f58157b = i10;
                this.f58163h = true;
                return (E) q1.this.m(i10);
            }
            if (this.f58160e != null) {
                this.f58157b = q1.this.size();
                E ePoll = this.f58160e.poll();
                this.f58162g = ePoll;
                if (ePoll != null) {
                    this.f58163h = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            n.e(this.f58163h);
            a();
            this.f58163h = false;
            this.f58159d++;
            if (this.f58157b >= q1.this.size()) {
                E e10 = this.f58162g;
                Objects.requireNonNull(e10);
                com.google.common.base.w.g0(d(e10));
                this.f58162g = null;
                return;
            }
            d<E> dVarD = q1.this.D(this.f58157b);
            if (dVarD != null) {
                if (this.f58160e == null || this.f58161f == null) {
                    this.f58160e = new ArrayDeque();
                    this.f58161f = new ArrayList(3);
                }
                if (!b(this.f58161f, dVarD.f58155a)) {
                    this.f58160e.add(dVarD.f58155a);
                }
                if (!b(this.f58160e, dVarD.f58156b)) {
                    this.f58161f.add(dVarD.f58156b);
                }
            }
            this.f58157b--;
            this.f58158c--;
        }
    }

    private q1(b<? super E> bVar, int i10) {
        Ordering orderingG = bVar.g();
        q1<E>.c cVar = new c(orderingG);
        this.f58142b = cVar;
        q1<E>.c cVar2 = new c(orderingG.E());
        this.f58143c = cVar2;
        cVar.f58153b = cVar2;
        cVar2.f58153b = cVar;
        this.f58144d = ((b) bVar).f58151c;
        this.f58145e = new Object[i10];
    }

    public static <B> b<B> A(Comparator<B> comparator) {
        return new b<>(comparator);
    }

    private E B(int i10) {
        E eM = m(i10);
        D(i10);
        return eM;
    }

    private int g() {
        int length = this.f58145e.length;
        return h(length < 64 ? (length + 1) * 2 : com.google.common.math.f.d(length / 2, 3), this.f58144d);
    }

    private static int h(int i10, int i11) {
        return Math.min(i10 - 1, i11) + 1;
    }

    public static <E extends Comparable<E>> q1<E> j() {
        return new b(Ordering.z()).c();
    }

    public static <E extends Comparable<E>> q1<E> l(Iterable<? extends E> iterable) {
        return new b(Ordering.z()).d(iterable);
    }

    public static b<Comparable> o(int i10) {
        return new b(Ordering.z()).e(i10);
    }

    @CheckForNull
    private d<E> q(int i10, E e10) {
        q1<E>.c cVarU = u(i10);
        int iG = cVarU.g(i10);
        int iC = cVarU.c(iG, e10);
        if (iC == iG) {
            return cVarU.p(i10, iG, e10);
        }
        if (iC < i10) {
            return new d<>(e10, m(i10));
        }
        return null;
    }

    private int s() {
        int i10 = this.f58146f;
        if (i10 != 1) {
            return (i10 == 2 || this.f58143c.d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void t() {
        if (this.f58146f > this.f58145e.length) {
            Object[] objArr = new Object[g()];
            Object[] objArr2 = this.f58145e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f58145e = objArr;
        }
    }

    private q1<E>.c u(int i10) {
        return w(i10) ? this.f58142b : this.f58143c;
    }

    @o9.d
    static int v(int i10, int i11, Iterable<?> iterable) {
        if (i10 == -1) {
            i10 = 11;
        }
        if (iterable instanceof Collection) {
            i10 = Math.max(i10, ((Collection) iterable).size());
        }
        return h(i10, i11);
    }

    @o9.d
    static boolean w(int i10) {
        int i11 = ~(~(i10 + 1));
        com.google.common.base.w.h0(i11 > 0, "negative index");
        return (f58139h & i11) > (i11 & f58140i);
    }

    public static b<Comparable> y(int i10) {
        return new b(Ordering.z()).f(i10);
    }

    @s9.a
    @CheckForNull
    @o9.d
    d<E> D(int i10) {
        com.google.common.base.w.d0(i10, this.f58146f);
        this.f58147g++;
        int i11 = this.f58146f - 1;
        this.f58146f = i11;
        if (i11 == i10) {
            this.f58145e[i11] = null;
            return null;
        }
        E eM = m(i11);
        int iO = u(this.f58146f).o(eM);
        if (iO == i10) {
            this.f58145e[this.f58146f] = null;
            return null;
        }
        E eM2 = m(this.f58146f);
        this.f58145e[this.f58146f] = null;
        d<E> dVarQ = q(i10, eM2);
        if (iO < i10) {
            return dVarQ == null ? new d<>(eM, eM2) : new d<>(eM, dVarQ.f58156b);
        }
        return dVarQ;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @s9.a
    public boolean add(E e10) {
        offer(e10);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @s9.a
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            offer(it.next());
            z10 = true;
        }
        return z10;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i10 = 0; i10 < this.f58146f; i10++) {
            this.f58145e[i10] = null;
        }
        this.f58146f = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f58142b.f58152a;
    }

    @o9.d
    int i() {
        return this.f58145e.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new e();
    }

    E m(int i10) {
        E e10 = (E) this.f58145e[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.Queue
    @s9.a
    public boolean offer(E e10) {
        com.google.common.base.w.E(e10);
        this.f58147g++;
        int i10 = this.f58146f;
        this.f58146f = i10 + 1;
        t();
        u(i10).b(i10, e10);
        return this.f58146f <= this.f58144d || pollLast() != e10;
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return m(0);
    }

    @CheckForNull
    public E peekFirst() {
        return peek();
    }

    @CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return m(s());
    }

    @Override // java.util.Queue
    @s9.a
    @CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return B(0);
    }

    @s9.a
    @CheckForNull
    public E pollFirst() {
        return poll();
    }

    @s9.a
    @CheckForNull
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return B(s());
    }

    @s9.a
    public E removeFirst() {
        return remove();
    }

    @s9.a
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return B(s());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f58146f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i10 = this.f58146f;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f58145e, 0, objArr, 0, i10);
        return objArr;
    }

    @o9.d
    boolean x() {
        for (int i10 = 1; i10 < this.f58146f; i10++) {
            if (!u(i10).q(i10)) {
                return false;
            }
        }
        return true;
    }
}
