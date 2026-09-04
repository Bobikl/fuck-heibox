package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableUsing<T, D> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends D> f120915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super D, ? extends org.reactivestreams.c<? extends T>> f120916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super D> f120917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f120918f;

    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final D f120920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.g<? super D> f120921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f120922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.e f120923f;

        UsingSubscriber(org.reactivestreams.d<? super T> dVar, D d10, kh.g<? super D> gVar, boolean z10) {
            this.f120919b = dVar;
            this.f120920c = d10;
            this.f120921d = gVar;
            this.f120922e = z10;
        }

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f120921d.accept(this.f120920c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            a();
            this.f120923f.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (!this.f120922e) {
                this.f120919b.onComplete();
                this.f120923f.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f120921d.accept(this.f120920c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f120919b.onError(th2);
                    return;
                }
            }
            this.f120923f.cancel();
            this.f120919b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (!this.f120922e) {
                this.f120919b.onError(th2);
                this.f120923f.cancel();
                a();
                return;
            }
            Throwable th3 = null;
            if (compareAndSet(false, true)) {
                try {
                    this.f120921d.accept(this.f120920c);
                } catch (Throwable th4) {
                    th3 = th4;
                    io.reactivex.exceptions.a.b(th3);
                }
            }
            this.f120923f.cancel();
            if (th3 != null) {
                this.f120919b.onError(new CompositeException(th2, th3));
            } else {
                this.f120919b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120919b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120923f, eVar)) {
                this.f120923f = eVar;
                this.f120919b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120923f.request(j10);
        }
    }

    public FlowableUsing(Callable<? extends D> callable, kh.o<? super D, ? extends org.reactivestreams.c<? extends T>> oVar, kh.g<? super D> gVar, boolean z10) {
        this.f120915c = callable;
        this.f120916d = oVar;
        this.f120917e = gVar;
        this.f120918f = z10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            D dCall = this.f120915c.call();
            try {
                ((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120916d.apply(dCall), "The sourceSupplier returned a null Publisher")).g(new UsingSubscriber(dVar, dCall, this.f120917e, this.f120918f));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                try {
                    this.f120917e.accept(dCall);
                    EmptySubscription.error(th2, dVar);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    EmptySubscription.error(new CompositeException(th2, th3), dVar);
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            EmptySubscription.error(th4, dVar);
        }
    }
}
