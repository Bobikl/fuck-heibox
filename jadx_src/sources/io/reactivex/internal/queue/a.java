package io.reactivex.internal.queue;

import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jh.f;
import lh.n;

/* JADX INFO: compiled from: SpscLinkedArrayQueue.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements n<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f123597j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f123598k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f123600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f123601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f123602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    AtomicReferenceArray<Object> f123603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f123604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AtomicReferenceArray<Object> f123605h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicLong f123599b = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicLong f123606i = new AtomicLong();

    public a(int i10) {
        int iB = l.b(Math.max(8, i10));
        int i11 = iB - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iB + 1);
        this.f123603f = atomicReferenceArray;
        this.f123602e = i11;
        a(iB);
        this.f123605h = atomicReferenceArray;
        this.f123604g = i11;
        this.f123601d = i11 - 1;
        t(0L);
    }

    private void a(int i10) {
        this.f123600c = Math.min(i10 / 4, f123597j);
    }

    private static int b(int i10) {
        return i10;
    }

    private static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    private long d() {
        return this.f123606i.get();
    }

    private long e() {
        return this.f123599b.get();
    }

    private long f() {
        return this.f123606i.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> i(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        r(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    private long k() {
        return this.f123599b.get();
    }

    private T m(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f123605h = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j10, i10));
    }

    private T n(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f123605h = atomicReferenceArray;
        int iC = c(j10, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        if (t10 != null) {
            r(atomicReferenceArray, iC, null);
            q(j10 + 1);
        }
        return t10;
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f123603f = atomicReferenceArray2;
        this.f123601d = (j11 + j10) - 1;
        r(atomicReferenceArray2, i10, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, i10, f123598k);
        t(j10 + 1);
    }

    private void q(long j10) {
        this.f123606i.lazySet(j10);
    }

    private static void r(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        r(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void t(long j10) {
        this.f123599b.lazySet(j10);
    }

    private boolean u(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        r(atomicReferenceArray, i10, t10);
        t(j10 + 1);
        return true;
    }

    @Override // lh.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // lh.o
    public boolean isEmpty() {
        return k() == f();
    }

    @Override // lh.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f123603f;
        long jE = e();
        int i10 = this.f123602e;
        int iC = c(jE, i10);
        if (jE < this.f123601d) {
            return u(atomicReferenceArray, t10, jE, iC);
        }
        long j10 = ((long) this.f123600c) + jE;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f123601d = j10 - 1;
            return u(atomicReferenceArray, t10, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i10)) == null) {
            return u(atomicReferenceArray, t10, jE, iC);
        }
        o(atomicReferenceArray, jE, iC, t10, i10);
        return true;
    }

    @Override // lh.o
    public boolean offer(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f123603f;
        long jK = k();
        int i10 = this.f123602e;
        long j10 = 2 + jK;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            int iC = c(jK, i10);
            r(atomicReferenceArray, iC + 1, t11);
            r(atomicReferenceArray, iC, t10);
            t(j10);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f123603f = atomicReferenceArray2;
        int iC2 = c(jK, i10);
        r(atomicReferenceArray2, iC2 + 1, t11);
        r(atomicReferenceArray2, iC2, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, iC2, f123598k);
        t(j10);
        return true;
    }

    public int p() {
        long jF = f();
        while (true) {
            long jK = k();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jK - jF2);
            }
            jF = jF2;
        }
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f123605h;
        long jD = d();
        int i10 = this.f123604g;
        T t10 = (T) g(atomicReferenceArray, c(jD, i10));
        return t10 == f123598k ? m(i(atomicReferenceArray, i10 + 1), jD, i10) : t10;
    }

    @Override // lh.n, lh.o
    @f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f123605h;
        long jD = d();
        int i10 = this.f123604g;
        int iC = c(jD, i10);
        T t10 = (T) g(atomicReferenceArray, iC);
        boolean z10 = t10 == f123598k;
        if (t10 == null || z10) {
            if (z10) {
                return n(i(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        r(atomicReferenceArray, iC, null);
        q(jD + 1);
        return t10;
    }
}
