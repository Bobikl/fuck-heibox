package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.a f120468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final BackpressureOverflowStrategy f120469f;

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3240706908776709697L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f120471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final BackpressureOverflowStrategy f120472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f120473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f120474f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Deque<T> f120475g = new ArrayDeque();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f120476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120477i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f120478j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f120479k;

        OnBackpressureBufferStrategySubscriber(org.reactivestreams.d<? super T> dVar, kh.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy, long j10) {
            this.f120470b = dVar;
            this.f120471c = aVar;
            this.f120472d = backpressureOverflowStrategy;
            this.f120473e = j10;
        }

        void a(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        void b() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f120475g;
            org.reactivestreams.d<? super T> dVar = this.f120470b;
            int iAddAndGet = 1;
            do {
                long j10 = this.f120474f.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f120477i) {
                        a(deque);
                        return;
                    }
                    boolean z10 = this.f120478j;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z11 = tPoll == null;
                    if (z10) {
                        Throwable th2 = this.f120479k;
                        if (th2 != null) {
                            a(deque);
                            dVar.onError(th2);
                            return;
                        } else if (z11) {
                            dVar.onComplete();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(tPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f120477i) {
                        a(deque);
                        return;
                    }
                    boolean z12 = this.f120478j;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z12) {
                        Throwable th3 = this.f120479k;
                        if (th3 != null) {
                            a(deque);
                            dVar.onError(th3);
                            return;
                        } else if (zIsEmpty) {
                            dVar.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.b.e(this.f120474f, j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120477i = true;
            this.f120476h.cancel();
            if (getAndIncrement() == 0) {
                a(this.f120475g);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120478j = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120478j) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120479k = th2;
            this.f120478j = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            boolean z10;
            boolean z11;
            if (this.f120478j) {
                return;
            }
            Deque<T> deque = this.f120475g;
            synchronized (deque) {
                z10 = false;
                z11 = true;
                if (deque.size() == this.f120473e) {
                    int i10 = a.f120480a[this.f120472d.ordinal()];
                    if (i10 == 1) {
                        deque.pollLast();
                        deque.offer(t10);
                    } else if (i10 == 2) {
                        deque.poll();
                        deque.offer(t10);
                    }
                    z11 = false;
                    z10 = true;
                } else {
                    deque.offer(t10);
                    z11 = false;
                }
            }
            if (!z10) {
                if (!z11) {
                    b();
                    return;
                } else {
                    this.f120476h.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            kh.a aVar = this.f120471c;
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f120476h.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120476h, eVar)) {
                this.f120476h = eVar;
                this.f120470b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120474f, j10);
                b();
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f120480a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f120480a = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120480a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(io.reactivex.j<T> jVar, long j10, kh.a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(jVar);
        this.f120467d = j10;
        this.f120468e = aVar;
        this.f120469f = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new OnBackpressureBufferStrategySubscriber(dVar, this.f120468e, this.f120469f, this.f120467d));
    }
}
