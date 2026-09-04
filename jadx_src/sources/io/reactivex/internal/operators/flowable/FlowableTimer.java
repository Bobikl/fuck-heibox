package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTimer extends io.reactivex.j<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f120903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f120904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f120905e;

    public static final class TimerSubscriber extends AtomicReference<io.reactivex.disposables.b> implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super Long> f120906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f120907c;

        TimerSubscriber(org.reactivestreams.d<? super Long> dVar) {
            this.f120906b = dVar;
        }

        public void a(io.reactivex.disposables.b bVar) {
            DisposableHelper.trySet(this, bVar);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.f120907c = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.f120907c) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f120906b.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f120906b.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f120906b.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        this.f120904d = j10;
        this.f120905e = timeUnit;
        this.f120903c = h0Var;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super Long> dVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(dVar);
        dVar.onSubscribe(timerSubscriber);
        timerSubscriber.a(this.f120903c.g(timerSubscriber, this.f120904d, this.f120905e));
    }
}
