package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSubscribeOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.h0 f120762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f120763e;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements io.reactivex.o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0.c f120765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.e> f120766d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f120767e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f120768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.c<T> f120769g;

        public static final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final org.reactivestreams.e f120770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f120771c;

            a(org.reactivestreams.e eVar, long j10) {
                this.f120770b = eVar;
                this.f120771c = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f120770b.request(this.f120771c);
            }
        }

        SubscribeOnSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.h0.c cVar, org.reactivestreams.c<T> cVar2, boolean z10) {
            this.f120764b = dVar;
            this.f120765c = cVar;
            this.f120769g = cVar2;
            this.f120768f = !z10;
        }

        void a(long j10, org.reactivestreams.e eVar) {
            if (this.f120768f || Thread.currentThread() == get()) {
                eVar.request(j10);
            } else {
                this.f120765c.b(new a(eVar, j10));
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            SubscriptionHelper.cancel(this.f120766d);
            this.f120765c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120764b.onComplete();
            this.f120765c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120764b.onError(th2);
            this.f120765c.dispose();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120764b.onNext(t10);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.setOnce(this.f120766d, eVar)) {
                long andSet = this.f120767e.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, eVar);
                }
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                org.reactivestreams.e eVar = this.f120766d.get();
                if (eVar != null) {
                    a(j10, eVar);
                    return;
                }
                io.reactivex.internal.util.b.a(this.f120767e, j10);
                org.reactivestreams.e eVar2 = this.f120766d.get();
                if (eVar2 != null) {
                    long andSet = this.f120767e.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, eVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            org.reactivestreams.c<T> cVar = this.f120769g;
            this.f120769g = null;
            cVar.g(this);
        }
    }

    public FlowableSubscribeOn(io.reactivex.j<T> jVar, io.reactivex.h0 h0Var, boolean z10) {
        super(jVar);
        this.f120762d = h0Var;
        this.f120763e = z10;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.h0.c cVarC = this.f120762d.c();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(dVar, cVarC, this.f121039c, this.f120763e);
        dVar.onSubscribe(subscribeOnSubscriber);
        cVarC.b(subscribeOnSubscriber);
    }
}
