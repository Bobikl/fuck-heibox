package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDebounceTimed<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120088f;

    public static final class DebounceEmitter<T> extends AtomicReference<io.reactivex.disposables.b> implements Runnable, io.reactivex.disposables.b {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f120089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final DebounceTimedSubscriber<T> f120091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f120092e = new AtomicBoolean();

        DebounceEmitter(T t10, long j10, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.f120089b = t10;
            this.f120090c = j10;
            this.f120091d = debounceTimedSubscriber;
        }

        void a() {
            if (this.f120092e.compareAndSet(false, true)) {
                this.f120091d.a(this.f120090c, this.f120089b, this);
            }
        }

        public void b(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -9102637559663639004L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f120096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f120098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f120099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f120100i;

        DebounceTimedSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f120093b = dVar;
            this.f120094c = j10;
            this.f120095d = timeUnit;
            this.f120096e = cVar;
        }

        void a(long j10, T t10, DebounceEmitter<T> debounceEmitter) {
            if (j10 == this.f120099h) {
                if (get() == 0) {
                    cancel();
                    this.f120093b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                } else {
                    this.f120093b.onNext(t10);
                    io.reactivex.internal.util.b.e(this, 1L);
                    debounceEmitter.dispose();
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120097f.cancel();
            this.f120096e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120100i) {
                return;
            }
            this.f120100i = true;
            io.reactivex.disposables.b bVar = this.f120098g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
            if (debounceEmitter != null) {
                debounceEmitter.a();
            }
            this.f120093b.onComplete();
            this.f120096e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120100i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120100i = true;
            io.reactivex.disposables.b bVar = this.f120098g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f120093b.onError(th2);
            this.f120096e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120100i) {
                return;
            }
            long j10 = this.f120099h + 1;
            this.f120099h = j10;
            io.reactivex.disposables.b bVar = this.f120098g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f120098g = debounceEmitter;
            debounceEmitter.b(this.f120096e.c(debounceEmitter, this.f120094c, this.f120095d));
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120097f, eVar)) {
                this.f120097f = eVar;
                this.f120093b.onSubscribe(this);
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

    public FlowableDebounceTimed(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        super(jVar);
        this.f120086d = j10;
        this.f120087e = timeUnit;
        this.f120088f = h0Var;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new DebounceTimedSubscriber(new io.reactivex.subscribers.e(dVar), this.f120086d, this.f120087e, this.f120088f.c()));
    }
}
