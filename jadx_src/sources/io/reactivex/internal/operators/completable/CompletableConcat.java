package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcat extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.c<? extends io.reactivex.g> f119692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f119693c;

    public static final class CompletableConcatSubscriber extends AtomicInteger implements io.reactivex.o<io.reactivex.g>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 9032184911934499404L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f119695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f119696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ConcatInnerObserver f119697e = new ConcatInnerObserver(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicBoolean f119698f = new AtomicBoolean();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f119699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119700h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        lh.o<io.reactivex.g> f119701i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.e f119702j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f119703k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile boolean f119704l;

        public static final class ConcatInnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d {
            private static final long serialVersionUID = -5454794857847146511L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final CompletableConcatSubscriber f119705b;

            ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.f119705b = completableConcatSubscriber;
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f119705b.b();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f119705b.c(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        CompletableConcatSubscriber(io.reactivex.d dVar, int i10) {
            this.f119694b = dVar;
            this.f119695c = i10;
            this.f119696d = i10 - (i10 >> 2);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.f119704l) {
                    boolean z10 = this.f119703k;
                    try {
                        io.reactivex.g gVarPoll = this.f119701i.poll();
                        boolean z11 = gVarPoll == null;
                        if (z10 && z11) {
                            if (this.f119698f.compareAndSet(false, true)) {
                                this.f119694b.onComplete();
                                return;
                            }
                            return;
                        } else if (!z11) {
                            this.f119704l = true;
                            gVarPoll.d(this.f119697e);
                            f();
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        c(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void b() {
            this.f119704l = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f119698f.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119702j.cancel();
                this.f119694b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.g gVar) {
            if (this.f119699g != 0 || this.f119701i.offer(gVar)) {
                a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119702j.cancel();
            DisposableHelper.dispose(this.f119697e);
        }

        void f() {
            if (this.f119699g != 1) {
                int i10 = this.f119700h + 1;
                if (i10 != this.f119696d) {
                    this.f119700h = i10;
                } else {
                    this.f119700h = 0;
                    this.f119702j.request(i10);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f119697e.get());
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f119703k = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f119698f.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f119697e);
                this.f119694b.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f119702j, eVar)) {
                this.f119702j = eVar;
                int i10 = this.f119695c;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (eVar instanceof lh.l) {
                    lh.l lVar = (lh.l) eVar;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f119699g = iRequestFusion;
                        this.f119701i = lVar;
                        this.f119703k = true;
                        this.f119694b.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f119699g = iRequestFusion;
                        this.f119701i = lVar;
                        this.f119694b.onSubscribe(this);
                        eVar.request(j10);
                        return;
                    }
                }
                if (this.f119695c == Integer.MAX_VALUE) {
                    this.f119701i = new io.reactivex.internal.queue.a(io.reactivex.j.Y());
                } else {
                    this.f119701i = new SpscArrayQueue(this.f119695c);
                }
                this.f119694b.onSubscribe(this);
                eVar.request(j10);
            }
        }
    }

    public CompletableConcat(org.reactivestreams.c<? extends io.reactivex.g> cVar, int i10) {
        this.f119692b = cVar;
        this.f119693c = i10;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        this.f119692b.g(new CompletableConcatSubscriber(dVar, this.f119693c));
    }
}
