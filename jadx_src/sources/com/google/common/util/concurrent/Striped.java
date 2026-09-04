package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.a
@o9.c
public abstract class Striped<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f59347a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f59348b = -1;

    public static class PaddedLock extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f59349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f59350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f59351d;

        PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f59352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f59353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f59354d;

        PaddedSemaphore(int i10) {
            super(i10, false);
        }
    }

    public static class b<L> extends d<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f59355d;

        private b(int i10, com.google.common.base.c0<L> c0Var) {
            super(i10);
            int i11 = 0;
            com.google.common.base.w.e(i10 <= 1073741824, "Stripes must be <= 2^30)");
            this.f59355d = new Object[this.f59359c + 1];
            while (true) {
                Object[] objArr = this.f59355d;
                if (i11 >= objArr.length) {
                    return;
                }
                objArr[i11] = c0Var.get();
                i11++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L j(int i10) {
            return (L) this.f59355d[i10];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int v() {
            return this.f59355d.length;
        }
    }

    @o9.d
    public static class c<L> extends d<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ConcurrentMap<Integer, L> f59356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.c0<L> f59357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f59358f;

        c(int i10, com.google.common.base.c0<L> c0Var) {
            super(i10);
            int i11 = this.f59359c;
            this.f59358f = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f59357e = c0Var;
            this.f59356d = new MapMaker().m().i();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L j(int i10) {
            if (this.f59358f != Integer.MAX_VALUE) {
                com.google.common.base.w.C(i10, v());
            }
            L l10 = this.f59356d.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10;
            }
            L l11 = this.f59357e.get();
            return (L) com.google.common.base.q.a(this.f59356d.putIfAbsent(Integer.valueOf(i10), l11), l11);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int v() {
            return this.f59358f;
        }
    }

    public static abstract class d<L> extends Striped<L> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59359c;

        d(int i10) {
            super();
            com.google.common.base.w.e(i10 > 0, "Stripes must be positive");
            this.f59359c = i10 > 1073741824 ? -1 : Striped.g(i10) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L i(Object obj) {
            return j(k(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        final int k(Object obj) {
            return Striped.w(obj.hashCode()) & this.f59359c;
        }
    }

    @o9.d
    public static class e<L> extends d<L> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<a<? extends L>> f59360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.c0<L> f59361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f59362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ReferenceQueue<L> f59363g;

        public static final class a<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f59364a;

            a(L l10, int i10, ReferenceQueue<L> referenceQueue) {
                super(l10, referenceQueue);
                this.f59364a = i10;
            }
        }

        e(int i10, com.google.common.base.c0<L> c0Var) {
            super(i10);
            this.f59363g = new ReferenceQueue<>();
            int i11 = this.f59359c;
            int i12 = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f59362f = i12;
            this.f59360d = new AtomicReferenceArray<>(i12);
            this.f59361e = c0Var;
        }

        private void x() {
            while (true) {
                Reference<? extends L> referencePoll = this.f59363g.poll();
                if (referencePoll == null) {
                    return;
                }
                a aVar = (a) referencePoll;
                r1.a(this.f59360d, aVar.f59364a, aVar, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L j(int i10) {
            if (this.f59362f != Integer.MAX_VALUE) {
                com.google.common.base.w.C(i10, v());
            }
            a<? extends L> aVar = this.f59360d.get(i10);
            L l10 = aVar == null ? null : aVar.get();
            if (l10 != null) {
                return l10;
            }
            L l11 = this.f59361e.get();
            a aVar2 = new a(l11, i10, this.f59363g);
            while (!r1.a(this.f59360d, i10, aVar, aVar2)) {
                aVar = this.f59360d.get(i10);
                L l12 = aVar == null ? null : aVar.get();
                if (l12 != null) {
                    return l12;
                }
            }
            x();
            return l11;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int v() {
            return this.f59362f;
        }
    }

    public static final class f extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Condition f59365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f59366b;

        f(Condition condition, h hVar) {
            this.f59365a = condition;
            this.f59366b = hVar;
        }

        @Override // com.google.common.util.concurrent.b0
        Condition a() {
            return this.f59365a;
        }
    }

    public static final class g extends h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lock f59367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f59368c;

        g(Lock lock, h hVar) {
            this.f59367b = lock;
            this.f59368c = hVar;
        }

        @Override // com.google.common.util.concurrent.h0
        Lock a() {
            return this.f59367b;
        }

        @Override // com.google.common.util.concurrent.h0, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new f(this.f59367b.newCondition(), this.f59368c);
        }
    }

    public static final class h implements ReadWriteLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReadWriteLock f59369b = new ReentrantReadWriteLock();

        h() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new g(this.f59369b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new g(this.f59369b.writeLock(), this);
        }
    }

    private Striped() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(int i10) {
        return 1 << com.google.common.math.f.p(i10, RoundingMode.CEILING);
    }

    static <L> Striped<L> h(int i10, com.google.common.base.c0<L> c0Var) {
        return new b(i10, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock l() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore m(int i10) {
        return new Semaphore(i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore n(int i10) {
        return new PaddedSemaphore(i10);
    }

    private static <L> Striped<L> o(int i10, com.google.common.base.c0<L> c0Var) {
        return i10 < 1024 ? new e(i10, c0Var) : new c(i10, c0Var);
    }

    public static Striped<Lock> p(int i10) {
        return o(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.p1
            @Override // com.google.common.base.c0
            public final Object get() {
                return Striped.l();
            }
        });
    }

    public static Striped<ReadWriteLock> q(int i10) {
        return o(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.n1
            @Override // com.google.common.base.c0
            public final Object get() {
                return new Striped.h();
            }
        });
    }

    public static Striped<Semaphore> r(int i10, final int i11) {
        return o(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.m1
            @Override // com.google.common.base.c0
            public final Object get() {
                return Striped.m(i11);
            }
        });
    }

    public static Striped<Lock> s(int i10) {
        return h(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.q1
            @Override // com.google.common.base.c0
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static Striped<ReadWriteLock> t(int i10) {
        return h(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.o1
            @Override // com.google.common.base.c0
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> u(int i10, final int i11) {
        return h(i10, new com.google.common.base.c0() { // from class: com.google.common.util.concurrent.l1
            @Override // com.google.common.base.c0
            public final Object get() {
                return Striped.n(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public Iterable<L> f(Iterable<? extends Object> iterable) {
        ArrayList arrayListR = Lists.r(iterable);
        if (arrayListR.isEmpty()) {
            return ImmutableList.B();
        }
        int[] iArr = new int[arrayListR.size()];
        for (int i10 = 0; i10 < arrayListR.size(); i10++) {
            iArr[i10] = k(arrayListR.get(i10));
        }
        Arrays.sort(iArr);
        int i11 = iArr[0];
        arrayListR.set(0, j(i11));
        for (int i12 = 1; i12 < arrayListR.size(); i12++) {
            int i13 = iArr[i12];
            if (i13 == i11) {
                arrayListR.set(i12, arrayListR.get(i12 - 1));
            } else {
                arrayListR.set(i12, j(i13));
                i11 = i13;
            }
        }
        return Collections.unmodifiableList(arrayListR);
    }

    public abstract L i(Object obj);

    public abstract L j(int i10);

    abstract int k(Object obj);

    public abstract int v();
}
