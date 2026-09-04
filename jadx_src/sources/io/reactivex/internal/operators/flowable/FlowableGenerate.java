package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableGenerate<T, S> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<S> f120241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<S, io.reactivex.i<T>, S> f120242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super S> f120243e;

    public static final class GeneratorSubscription<T, S> extends AtomicLong implements io.reactivex.i<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7565982551505011832L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<S, ? super io.reactivex.i<T>, S> f120245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.g<? super S> f120246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        S f120247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f120249g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f120250h;

        GeneratorSubscription(org.reactivestreams.d<? super T> dVar, kh.c<S, ? super io.reactivex.i<T>, S> cVar, kh.g<? super S> gVar, S s10) {
            this.f120244b = dVar;
            this.f120245c = cVar;
            this.f120246d = gVar;
            this.f120247e = s10;
        }

        private void d(S s10) {
            try {
                this.f120246d.accept(s10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120248f) {
                return;
            }
            this.f120248f = true;
            if (io.reactivex.internal.util.b.a(this, 1L) == 0) {
                S s10 = this.f120247e;
                this.f120247e = null;
                d(s10);
            }
        }

        @Override // io.reactivex.i
        public void onComplete() {
            if (this.f120249g) {
                return;
            }
            this.f120249g = true;
            this.f120244b.onComplete();
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f120249g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f120249g = true;
            this.f120244b.onError(th2);
        }

        @Override // io.reactivex.i
        public void onNext(T t10) {
            if (this.f120249g) {
                return;
            }
            if (this.f120250h) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f120250h = true;
                this.f120244b.onNext(t10);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10) && io.reactivex.internal.util.b.a(this, j10) == 0) {
                S sApply = this.f120247e;
                kh.c<S, ? super io.reactivex.i<T>, S> cVar = this.f120245c;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        } else {
                            if (this.f120248f) {
                                this.f120247e = null;
                                d(sApply);
                                return;
                            }
                            this.f120250h = false;
                            try {
                                sApply = cVar.apply(sApply, this);
                                if (this.f120249g) {
                                    this.f120248f = true;
                                    this.f120247e = null;
                                    d(sApply);
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f120248f = true;
                                this.f120247e = null;
                                onError(th2);
                                d(sApply);
                                return;
                            }
                        }
                    }
                    this.f120247e = sApply;
                    j10 = addAndGet(-j11);
                } while (j10 != 0);
            }
        }
    }

    public FlowableGenerate(Callable<S> callable, kh.c<S, io.reactivex.i<T>, S> cVar, kh.g<? super S> gVar) {
        this.f120241c = callable;
        this.f120242d = cVar;
        this.f120243e = gVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            dVar.onSubscribe(new GeneratorSubscription(dVar, this.f120242d, this.f120243e, this.f120241c.call()));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
