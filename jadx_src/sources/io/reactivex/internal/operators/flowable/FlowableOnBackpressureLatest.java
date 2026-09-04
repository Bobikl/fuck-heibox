package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureLatest<T> extends a<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 163080509307634843L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f120490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f120491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f120492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f120493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f120494g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<T> f120495h = new AtomicReference<>();

        BackpressureLatestSubscriber(org.reactivestreams.d<? super T> dVar) {
            this.f120489b = dVar;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, AtomicReference<T> atomicReference) {
            if (this.f120493f) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f120492e;
            if (th2 != null) {
                atomicReference.lazySet(null);
                dVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            dVar.onComplete();
            return true;
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f120489b;
            AtomicLong atomicLong = this.f120494g;
            AtomicReference<T> atomicReference = this.f120495h;
            int iAddAndGet = 1;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z10 = this.f120491d;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (a(z10, z11, dVar, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    if (a(this.f120491d, atomicReference.get() == null, dVar, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    io.reactivex.internal.util.b.e(atomicLong, j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f120493f) {
                return;
            }
            this.f120493f = true;
            this.f120490c.cancel();
            if (getAndIncrement() == 0) {
                this.f120495h.lazySet(null);
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f120491d = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120492e = th2;
            this.f120491d = true;
            b();
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120495h.lazySet(t10);
            b();
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120490c, eVar)) {
                this.f120490c = eVar;
                this.f120489b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120494g, j10);
                b();
            }
        }
    }

    public FlowableOnBackpressureLatest(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new BackpressureLatestSubscriber(dVar));
    }
}
