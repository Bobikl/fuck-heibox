package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends io.reactivex.a implements lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f120171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.g> f120172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f120173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120174e;

    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8443155186132538303L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f120175b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.g> f120177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f120178e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.e f120181h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120182i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicThrowable f120176c = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.disposables.a f120179f = new io.reactivex.disposables.a();

        public final class InnerObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
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
                FlatMapCompletableMainSubscriber.this.a(this);
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                FlatMapCompletableMainSubscriber.this.b(this, th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        FlatMapCompletableMainSubscriber(io.reactivex.d dVar, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10, int i10) {
            this.f120175b = dVar;
            this.f120177d = oVar;
            this.f120178e = z10;
            this.f120180g = i10;
            lazySet(1);
        }

        void a(FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver) {
            this.f120179f.b(innerObserver);
            onComplete();
        }

        void b(FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver, Throwable th2) {
            this.f120179f.b(innerObserver);
            onError(th2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f120182i = true;
            this.f120181h.cancel();
            this.f120179f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f120179f.isDisposed();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f120180g != Integer.MAX_VALUE) {
                    this.f120181h.request(1L);
                }
            } else {
                Throwable thC = this.f120176c.c();
                if (thC != null) {
                    this.f120175b.onError(thC);
                } else {
                    this.f120175b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120176c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f120178e) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f120175b.onError(this.f120176c.c());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f120175b.onError(this.f120176c.c());
            } else if (this.f120180g != Integer.MAX_VALUE) {
                this.f120181h.request(1L);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            try {
                io.reactivex.g gVar = (io.reactivex.g) io.reactivex.internal.functions.a.g(this.f120177d.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f120182i || !this.f120179f.c(innerObserver)) {
                    return;
                }
                gVar.d(innerObserver);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120181h.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120181h, eVar)) {
                this.f120181h = eVar;
                this.f120175b.onSubscribe(this);
                int i10 = this.f120180g;
                if (i10 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i10);
                }
            }
        }
    }

    public FlowableFlatMapCompletableCompletable(io.reactivex.j<T> jVar, kh.o<? super T, ? extends io.reactivex.g> oVar, boolean z10, int i10) {
        this.f120171b = jVar;
        this.f120172c = oVar;
        this.f120174e = z10;
        this.f120173d = i10;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f120171b.j6(new FlatMapCompletableMainSubscriber(dVar, this.f120172c, this.f120174e, this.f120173d));
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableFlatMapCompletable(this.f120171b, this.f120172c, this.f120174e, this.f120173d));
    }
}
