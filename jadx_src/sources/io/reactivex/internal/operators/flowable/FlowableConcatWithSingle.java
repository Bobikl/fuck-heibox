package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableConcatWithSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.o0<? extends T> f120052d;

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements io.reactivex.l0<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f120053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.o0<? extends T> f120054i;

        ConcatWithSubscriber(org.reactivestreams.d<? super T> dVar, io.reactivex.o0<? extends T> o0Var) {
            super(dVar);
            this.f120054i = o0Var;
            this.f120053h = new AtomicReference<>();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f120053h);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f123781c = SubscriptionHelper.CANCELLED;
            io.reactivex.o0<? extends T> o0Var = this.f120054i;
            this.f120054i = null;
            o0Var.f(this);
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

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f120053h, bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            a(t10);
        }
    }

    public FlowableConcatWithSingle(io.reactivex.j<T> jVar, io.reactivex.o0<? extends T> o0Var) {
        super(jVar);
        this.f120052d = o0Var;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new ConcatWithSubscriber(dVar, this.f120052d));
    }
}
