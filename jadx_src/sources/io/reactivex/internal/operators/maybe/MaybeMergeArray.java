package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMergeArray<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T>[] f121523c;

    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements a<T> {
        private static final long serialVersionUID = -4025173261791142821L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f121524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f121525c = new AtomicInteger();

        ClqSimpleQueue() {
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public void h() {
            poll();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public int j() {
            return this.f121524b;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public int l() {
            return this.f121525c.get();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, lh.o
        public boolean offer(T t10) {
            this.f121525c.getAndIncrement();
            return super.offer(t10);
        }

        @Override // lh.o
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.a, lh.o
        @jh.f
        public T poll() {
            T t10 = (T) super.poll();
            if (t10 != null) {
                this.f121524b++;
            }
            return t10;
        }
    }

    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements io.reactivex.t<T> {
        private static final long serialVersionUID = -660395290758764731L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121526b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final a<Object> f121529e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f121531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f121532h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f121533i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f121534j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f121527c = new io.reactivex.disposables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f121528d = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicThrowable f121530f = new AtomicThrowable();

        MergeMaybeObserver(org.reactivestreams.d<? super T> dVar, int i10, a<Object> aVar) {
            this.f121526b = dVar;
            this.f121531g = i10;
            this.f121529e = aVar;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f121533i) {
                c();
            } else {
                d();
            }
        }

        void c() {
            org.reactivestreams.d<? super T> dVar = this.f121526b;
            a<Object> aVar = this.f121529e;
            int iAddAndGet = 1;
            while (!this.f121532h) {
                Throwable th2 = this.f121530f.get();
                if (th2 != null) {
                    aVar.clear();
                    dVar.onError(th2);
                    return;
                }
                boolean z10 = aVar.l() == this.f121531g;
                if (!aVar.isEmpty()) {
                    dVar.onNext(null);
                }
                if (z10) {
                    dVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.clear();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f121532h) {
                return;
            }
            this.f121532h = true;
            this.f121527c.dispose();
            if (getAndIncrement() == 0) {
                this.f121529e.clear();
            }
        }

        @Override // lh.o
        public void clear() {
            this.f121529e.clear();
        }

        void d() {
            org.reactivestreams.d<? super T> dVar = this.f121526b;
            a<Object> aVar = this.f121529e;
            long j10 = this.f121534j;
            int iAddAndGet = 1;
            do {
                long j11 = this.f121528d.get();
                while (j10 != j11) {
                    if (this.f121532h) {
                        aVar.clear();
                        return;
                    }
                    if (this.f121530f.get() != null) {
                        aVar.clear();
                        dVar.onError(this.f121530f.c());
                        return;
                    } else {
                        if (aVar.j() == this.f121531g) {
                            dVar.onComplete();
                            return;
                        }
                        Object objPoll = aVar.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != NotificationLite.COMPLETE) {
                            dVar.onNext(objPoll);
                            j10++;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f121530f.get() != null) {
                        aVar.clear();
                        dVar.onError(this.f121530f.c());
                        return;
                    } else {
                        while (aVar.peek() == NotificationLite.COMPLETE) {
                            aVar.h();
                        }
                        if (aVar.j() == this.f121531g) {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                this.f121534j = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        boolean f() {
            return this.f121532h;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f121529e.isEmpty();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121529e.offer(NotificationLite.COMPLETE);
            b();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            if (!this.f121530f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121527c.dispose();
            this.f121529e.offer(NotificationLite.COMPLETE);
            b();
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121527c.c(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121529e.offer(t10);
            b();
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T t10;
            do {
                t10 = (T) this.f121529e.poll();
            } while (t10 == NotificationLite.COMPLETE);
            return t10;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f121528d, j10);
                b();
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f121533i = true;
            return 2;
        }
    }

    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements a<T> {
        private static final long serialVersionUID = -7969063454040569579L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f121535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f121536c;

        MpscFillOnceSimpleQueue(int i10) {
            super(i10);
            this.f121535b = new AtomicInteger();
        }

        @Override // lh.o
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public void h() {
            int i10 = this.f121536c;
            lazySet(i10, null);
            this.f121536c = i10 + 1;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f121536c == l();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public int j() {
            return this.f121536c;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public int l() {
            return this.f121535b.get();
        }

        @Override // lh.o
        public boolean offer(T t10) {
            io.reactivex.internal.functions.a.g(t10, "value is null");
            int andIncrement = this.f121535b.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t10);
            return true;
        }

        @Override // lh.o
        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a
        public T peek() {
            int i10 = this.f121536c;
            if (i10 == length()) {
                return null;
            }
            return get(i10);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.a, java.util.Queue, lh.o
        @jh.f
        public T poll() {
            int i10 = this.f121536c;
            if (i10 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f121535b;
            do {
                T t10 = get(i10);
                if (t10 != null) {
                    this.f121536c = i10 + 1;
                    lazySet(i10, null);
                    return t10;
                }
            } while (atomicInteger.get() != i10);
            return null;
        }
    }

    public interface a<T> extends lh.o<T> {
        void h();

        int j();

        int l();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.a, lh.o
        @jh.f
        T poll();
    }

    public MaybeMergeArray(io.reactivex.w<? extends T>[] wVarArr) {
        this.f121523c = wVarArr;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.w[] wVarArr = this.f121523c;
        int length = wVarArr.length;
        MergeMaybeObserver mergeMaybeObserver = new MergeMaybeObserver(dVar, length, length <= io.reactivex.j.Y() ? new MpscFillOnceSimpleQueue(length) : new ClqSimpleQueue());
        dVar.onSubscribe(mergeMaybeObserver);
        AtomicThrowable atomicThrowable = mergeMaybeObserver.f121530f;
        for (io.reactivex.w wVar : wVarArr) {
            if (mergeMaybeObserver.f() || atomicThrowable.get() != null) {
                return;
            }
            wVar.f(mergeMaybeObserver);
        }
    }
}
