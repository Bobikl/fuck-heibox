package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDebounce<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends org.reactivestreams.c<U>> f120074d;

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 6725975399620862591L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<U>> f120076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f120077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f120078e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f120079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f120080g;

        public static final class a<T, U> extends io.reactivex.subscribers.b<U> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final DebounceSubscriber<T, U> f120081c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final long f120082d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final T f120083e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            boolean f120084f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final AtomicBoolean f120085g = new AtomicBoolean();

            a(DebounceSubscriber<T, U> debounceSubscriber, long j10, T t10) {
                this.f120081c = debounceSubscriber;
                this.f120082d = j10;
                this.f120083e = t10;
            }

            void d() {
                if (this.f120085g.compareAndSet(false, true)) {
                    this.f120081c.a(this.f120082d, this.f120083e);
                }
            }

            @Override // org.reactivestreams.d
            public void onComplete() {
                if (this.f120084f) {
                    return;
                }
                this.f120084f = true;
                d();
            }

            @Override // org.reactivestreams.d
            public void onError(Throwable th2) {
                if (this.f120084f) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f120084f = true;
                    this.f120081c.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public void onNext(U u10) {
                if (this.f120084f) {
                    return;
                }
                this.f120084f = true;
                a();
                d();
            }
        }

        DebounceSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
            this.f120075b = dVar;
            this.f120076c = oVar;
        }

        void a(long j10, T t10) {
            if (j10 == this.f120079f) {
                if (get() != 0) {
                    this.f120075b.onNext(t10);
                    io.reactivex.internal.util.b.e(this, 1L);
                } else {
                    cancel();
                    this.f120075b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120077d.cancel();
            DisposableHelper.dispose(this.f120078e);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120080g) {
                return;
            }
            this.f120080g = true;
            io.reactivex.disposables.b bVar = this.f120078e.get();
            if (DisposableHelper.isDisposed(bVar)) {
                return;
            }
            ((a) bVar).d();
            DisposableHelper.dispose(this.f120078e);
            this.f120075b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f120078e);
            this.f120075b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120080g) {
                return;
            }
            long j10 = this.f120079f + 1;
            this.f120079f = j10;
            io.reactivex.disposables.b bVar = this.f120078e.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120076c.apply(t10), "The publisher supplied is null");
                a aVar = new a(this, j10, t10);
                if (androidx.compose.animation.core.s0.a(this.f120078e, bVar, aVar)) {
                    cVar.g(aVar);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                cancel();
                this.f120075b.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120077d, eVar)) {
                this.f120077d = eVar;
                this.f120075b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }
    }

    public FlowableDebounce(io.reactivex.j<T> jVar, kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
        super(jVar);
        this.f120074d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new DebounceSubscriber(new io.reactivex.subscribers.e(dVar), this.f120074d));
    }
}
