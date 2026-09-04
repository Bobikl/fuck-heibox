package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class AbstractMapBasedMultiset<E> extends d<E> implements Serializable {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient v1<E> f57066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient long f57067e;

    public class a extends AbstractMapBasedMultiset<E>.c<E> {
        a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        @x1
        E b(int i10) {
            return AbstractMapBasedMultiset.this.f57066d.j(i10);
        }
    }

    public class b extends AbstractMapBasedMultiset<E>.c<s1.a<E>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultiset.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public s1.a<E> b(int i10) {
            return AbstractMapBasedMultiset.this.f57066d.h(i10);
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57071c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57072d;

        c() {
            this.f57070b = AbstractMapBasedMultiset.this.f57066d.f();
            this.f57072d = AbstractMapBasedMultiset.this.f57066d.f58198d;
        }

        private void a() {
            if (AbstractMapBasedMultiset.this.f57066d.f58198d != this.f57072d) {
                throw new ConcurrentModificationException();
            }
        }

        @x1
        abstract T b(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f57070b >= 0;
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tB = b(this.f57070b);
            int i10 = this.f57070b;
            this.f57071c = i10;
            this.f57070b = AbstractMapBasedMultiset.this.f57066d.t(i10);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            n.e(this.f57071c != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.f57067e -= (long) abstractMapBasedMultiset.f57066d.y(this.f57071c);
            this.f57070b = AbstractMapBasedMultiset.this.f57066d.u(this.f57070b, this.f57071c);
            this.f57071c = -1;
            this.f57072d = AbstractMapBasedMultiset.this.f57066d.f58198d;
        }
    }

    AbstractMapBasedMultiset(int i10) {
        this.f57066d = j(i10);
    }

    @o9.c
    private void l(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = g2.h(objectInputStream);
        this.f57066d = j(3);
        g2.g(this, objectInputStream, iH);
    }

    @o9.c
    private void m(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g2.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.s1
    public final int E1(@CheckForNull Object obj) {
        return this.f57066d.g(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public final int I0(@x1 E e10, int i10) {
        n.b(i10, "count");
        v1<E> v1Var = this.f57066d;
        int iW = i10 == 0 ? v1Var.w(e10) : v1Var.v(e10, i10);
        this.f57067e += (long) (i10 - iW);
        return iW;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public final int c0(@x1 E e10, int i10) {
        if (i10 == 0) {
            return E1(e10);
        }
        com.google.common.base.w.k(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iN = this.f57066d.n(e10);
        if (iN == -1) {
            this.f57066d.v(e10, i10);
            this.f57067e += (long) i10;
            return 0;
        }
        int iL = this.f57066d.l(iN);
        long j10 = i10;
        long j11 = ((long) iL) + j10;
        com.google.common.base.w.p(j11 <= 2147483647L, "too many occurrences: %s", j11);
        this.f57066d.C(iN, (int) j11);
        this.f57067e += j10;
        return iL;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f57066d.a();
        this.f57067e = 0L;
    }

    @Override // com.google.common.collect.d
    final int e() {
        return this.f57066d.D();
    }

    @Override // com.google.common.collect.d
    final Iterator<E> g() {
        return new a();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public final boolean g0(@x1 E e10, int i10, int i11) {
        n.b(i10, "oldCount");
        n.b(i11, "newCount");
        int iN = this.f57066d.n(e10);
        if (iN == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                this.f57066d.v(e10, i11);
                this.f57067e += (long) i11;
            }
            return true;
        }
        if (this.f57066d.l(iN) != i10) {
            return false;
        }
        if (i11 == 0) {
            this.f57066d.y(iN);
            this.f57067e -= (long) i10;
        } else {
            this.f57066d.C(iN, i11);
            this.f57067e += (long) (i11 - i10);
        }
        return true;
    }

    @Override // com.google.common.collect.d
    final Iterator<s1.a<E>> h() {
        return new b();
    }

    void i(s1<? super E> s1Var) {
        com.google.common.base.w.E(s1Var);
        int iF = this.f57066d.f();
        while (iF >= 0) {
            s1Var.c0(this.f57066d.j(iF), this.f57066d.l(iF));
            iF = this.f57066d.t(iF);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
    public final Iterator<E> iterator() {
        return Multisets.n(this);
    }

    abstract v1<E> j(int i10);

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public final int n1(@CheckForNull Object obj, int i10) {
        if (i10 == 0) {
            return E1(obj);
        }
        com.google.common.base.w.k(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iN = this.f57066d.n(obj);
        if (iN == -1) {
            return 0;
        }
        int iL = this.f57066d.l(iN);
        if (iL > i10) {
            this.f57066d.C(iN, iL - i10);
        } else {
            this.f57066d.y(iN);
            i10 = iL;
        }
        this.f57067e -= (long) i10;
        return iL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public final int size() {
        return Ints.x(this.f57067e);
    }
}
