package io.reactivex.internal.queue;

import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jh.f;
import lh.n;

/* JADX INFO: loaded from: classes5.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements n<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer f123591g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f123592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicLong f123593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f123594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicLong f123595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f123596f;

    public SpscArrayQueue(int i10) {
        super(l.b(i10));
        this.f123592b = length() - 1;
        this.f123593c = new AtomicLong();
        this.f123595e = new AtomicLong();
        this.f123596f = Math.min(i10 / 4, f123591g.intValue());
    }

    int a(long j10) {
        return ((int) j10) & this.f123592b;
    }

    int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    E c(int i10) {
        return get(i10);
    }

    @Override // lh.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j10) {
        this.f123595e.lazySet(j10);
    }

    void e(int i10, E e10) {
        lazySet(i10, e10);
    }

    void f(long j10) {
        this.f123593c.lazySet(j10);
    }

    @Override // lh.o
    public boolean isEmpty() {
        return this.f123593c.get() == this.f123595e.get();
    }

    @Override // lh.o
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f123592b;
        long j10 = this.f123593c.get();
        int iB = b(j10, i10);
        if (j10 >= this.f123594d) {
            long j11 = ((long) this.f123596f) + j10;
            if (c(b(j11, i10)) == null) {
                this.f123594d = j11;
            } else if (c(iB) != null) {
                return false;
            }
        }
        e(iB, e10);
        f(j10 + 1);
        return true;
    }

    @Override // lh.o
    public boolean offer(E e10, E e11) {
        return offer(e10) && offer(e11);
    }

    @Override // lh.n, lh.o
    @f
    public E poll() {
        long j10 = this.f123595e.get();
        int iA = a(j10);
        E eC = c(iA);
        if (eC == null) {
            return null;
        }
        d(j10 + 1);
        e(iA, null);
        return eC;
    }
}
