package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.h0 f120881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final org.reactivestreams.c<? extends T> f120882g;

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements io.reactivex.o<T>, b {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120883j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final long f120884k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final TimeUnit f120885l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final io.reactivex.h0.c f120886m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final SequentialDisposable f120887n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120888o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final AtomicLong f120889p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f120890q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        org.reactivestreams.c<? extends T> f120891r;

        TimeoutFallbackSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar, org.reactivestreams.c<? extends T> cVar2) {
            super(true);
            this.f120883j = dVar;
            this.f120884k = j10;
            this.f120885l = timeUnit;
            this.f120886m = cVar;
            this.f120891r = cVar2;
            this.f120887n = new SequentialDisposable();
            this.f120888o = new AtomicReference<>();
            this.f120889p = new AtomicLong();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void b(long j10) {
            if (this.f120889p.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f120888o);
                long j11 = this.f120890q;
                if (j11 != 0) {
                    g(j11);
                }
                org.reactivestreams.c<? extends T> cVar = this.f120891r;
                this.f120891r = null;
                cVar.g(new a(this.f120883j, this));
                this.f120886m.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f120886m.dispose();
        }

        void j(long j10) {
            this.f120887n.a(this.f120886m.c(new c(j10, this), this.f120884k, this.f120885l));
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120889p.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f120887n.dispose();
                this.f120883j.onComplete();
                this.f120886m.dispose();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120889p.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120887n.dispose();
            this.f120883j.onError(th2);
            this.f120886m.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = this.f120889p.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f120889p.compareAndSet(j10, j11)) {
                    this.f120887n.get().dispose();
                    this.f120890q++;
                    this.f120883j.onNext(t10);
                    j(j11);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f120888o, eVar)) {
                h(eVar);
            }
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements io.reactivex.o<T>, org.reactivestreams.e, b {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f120894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.h0.c f120895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SequentialDisposable f120896f = new SequentialDisposable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120897g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f120898h = new AtomicLong();

        TimeoutSubscriber(org.reactivestreams.d<? super T> dVar, long j10, TimeUnit timeUnit, io.reactivex.h0.c cVar) {
            this.f120892b = dVar;
            this.f120893c = j10;
            this.f120894d = timeUnit;
            this.f120895e = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.f120897g);
                this.f120892b.onError(new TimeoutException(ExceptionHelper.e(this.f120893c, this.f120894d)));
                this.f120895e.dispose();
            }
        }

        void c(long j10) {
            this.f120896f.a(this.f120895e.c(new c(j10, this), this.f120893c, this.f120894d));
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120897g);
            this.f120895e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f120896f.dispose();
                this.f120892b.onComplete();
                this.f120895e.dispose();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120896f.dispose();
            this.f120892b.onError(th2);
            this.f120895e.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f120896f.get().dispose();
                    this.f120892b.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            SubscriptionHelper.deferredSetOnce(this.f120897g, this.f120898h, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f120897g, this.f120898h, j10);
        }
    }

    public static final class a<T> implements io.reactivex.o<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SubscriptionArbiter f120900c;

        a(org.reactivestreams.d<? super T> dVar, SubscriptionArbiter subscriptionArbiter) {
            this.f120899b = dVar;
            this.f120900c = subscriptionArbiter;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120899b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120899b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120899b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f120900c.h(eVar);
        }
    }

    public interface b {
        void b(long j10);
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b f120901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f120902c;

        c(long j10, b bVar) {
            this.f120902c = j10;
            this.f120901b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f120901b.b(this.f120902c);
        }
    }

    public FlowableTimeoutTimed(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var, org.reactivestreams.c<? extends T> cVar) {
        super(jVar);
        this.f120879d = j10;
        this.f120880e = timeUnit;
        this.f120881f = h0Var;
        this.f120882g = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (this.f120882g == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(dVar, this.f120879d, this.f120880e, this.f120881f.c());
            dVar.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.c(0L);
            this.f121039c.j6(timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(dVar, this.f120879d, this.f120880e, this.f120881f.c(), this.f120882g);
        dVar.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.j(0L);
        this.f121039c.j6(timeoutFallbackSubscriber);
    }
}
