package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.g f120043d;

    public static final class ConcatWithSubscriber<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.o<T>, io.reactivex.d, org.reactivestreams.e {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f120044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.e f120045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.g f120046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f120047e;

        ConcatWithSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.g gVar) {
            this.f120044b = dVar;
            this.f120046d = gVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120045c.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120047e) {
                this.f120044b.onComplete();
                return;
            }
            this.f120047e = true;
            this.f120045c = SubscriptionHelper.CANCELLED;
            io.reactivex.g gVar = this.f120046d;
            this.f120046d = null;
            gVar.d(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f120044b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f120044b.onNext(t10);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120045c, eVar)) {
                this.f120045c = eVar;
                this.f120044b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f120045c.request(j10);
        }
    }

    public FlowableConcatWithCompletable(io.reactivex.j<T> jVar, io.reactivex.g gVar) {
        super(jVar);
        this.f120043d = gVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ConcatWithSubscriber(dVar, this.f120043d));
    }
}
