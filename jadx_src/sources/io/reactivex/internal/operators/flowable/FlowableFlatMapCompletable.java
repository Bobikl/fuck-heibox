package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f120159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f120160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120161f;

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.o<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120162b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f120164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f120165e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f120168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120169i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f120163c = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f120166f = new io.reactivex.disposables.a();

        public final class InnerConsumer extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerConsumer() {
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.d
            public void onComplete() {
                FlatMapCompletableMainSubscriber.this.c(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                FlatMapCompletableMainSubscriber.this.d(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        FlatMapCompletableMainSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10, int i10) {
            this.f120162b = dVar;
            this.f120164d = oVar;
            this.f120165e = z10;
            this.f120167g = i10;
            lazySet(1);
        }

        void c(FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer) {
            this.f120166f.b(innerConsumer);
            onComplete();
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120169i = true;
            this.f120168h.cancel();
            this.f120166f.dispose();
        }

        @Override // lh.o
        public void clear() {
        }

        void d(FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer, Throwable th2) {
            this.f120166f.b(innerConsumer);
            onError(th2);
        }

        @Override // lh.o
        public boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f120167g != Integer.MAX_VALUE) {
                    this.f120168h.request(1L);
                }
            } else {
                Throwable thC = this.f120163c.c();
                if (thC != null) {
                    this.f120162b.onError(thC);
                } else {
                    this.f120162b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120163c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120165e) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f120162b.onError(this.f120163c.c());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f120162b.onError(this.f120163c.c());
            } else if (this.f120167g != Integer.MAX_VALUE) {
                this.f120168h.request(1L);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f120164d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (this.f120169i || !this.f120166f.c(innerConsumer)) {
                    return;
                }
                gVar.d(innerConsumer);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120168h.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120168h, eVar)) {
                this.f120168h = eVar;
                this.f120162b.onSubscribe(this);
                int i10 = this.f120167g;
                if (i10 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i10);
                }
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            return null;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public FlowableFlatMapCompletable(io.reactivex.j<T> jVar, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10, int i10) {
        super(jVar);
        this.f120159d = oVar;
        this.f120161f = z10;
        this.f120160e = i10;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new FlatMapCompletableMainSubscriber(dVar, this.f120159d, this.f120161f, this.f120160e));
    }
}
