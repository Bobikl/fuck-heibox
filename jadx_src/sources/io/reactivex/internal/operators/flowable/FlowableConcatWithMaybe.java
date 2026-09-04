package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithMaybe<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.w<? extends T> f120048d;

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements io.reactivex.t<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f120049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.w<? extends T> f120050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f120051j;

        ConcatWithSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.w<? extends T> wVar) {
            super(dVar);
            this.f120050i = wVar;
            this.f120049h = new AtomicReference<>();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f120049h);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120051j) {
                this.f123780b.onComplete();
                return;
            }
            this.f120051j = true;
            this.f123781c = SubscriptionHelper.CANCELLED;
            io.reactivex.w<? extends T> wVar = this.f120050i;
            this.f120050i = null;
            wVar.f(this);
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f123780b.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123783e++;
            this.f123780b.onNext((Object) t10);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f120049h, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            a(t10);
        }
    }

    public FlowableConcatWithMaybe(io.reactivex.j<T> jVar, io.reactivex.w<? extends T> wVar) {
        super(jVar);
        this.f120048d = wVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ConcatWithSubscriber(dVar, this.f120048d));
    }
}
