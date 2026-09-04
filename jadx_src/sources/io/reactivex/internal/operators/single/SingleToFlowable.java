package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleToFlowable<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<? extends T> f123463c;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements l0<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        io.reactivex.disposables.b f123464l;

        SingleToFlowableObserver(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            super.cancel();
            this.f123464l.dispose();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123845b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123464l, bVar)) {
                this.f123464l = bVar;
                this.f123845b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            c(t10);
        }
    }

    public SingleToFlowable(o0<? extends T> o0Var) {
        this.f123463c = o0Var;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super T> dVar) {
        this.f123463c.f(new SingleToFlowableObserver(dVar));
    }
}
