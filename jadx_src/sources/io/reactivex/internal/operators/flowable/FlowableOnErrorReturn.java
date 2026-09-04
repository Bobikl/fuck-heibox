package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnErrorReturn<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends T> f120504d;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends T> f120505h;

        OnErrorReturnSubscriber(org.reactivestreams.d<? super T> dVar, kh.o<? super Throwable, ? extends T> oVar) {
            super(dVar);
            this.f120505h = oVar;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f123780b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            try {
                a(io.reactivex.internal.functions.a.g(this.f120505h.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123780b.onError(new CompositeException(th2, th3));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123783e++;
            this.f123780b.onNext((Object) t10);
        }
    }

    public FlowableOnErrorReturn(io.reactivex.j<T> jVar, kh.o<? super Throwable, ? extends T> oVar) {
        super(jVar);
        this.f120504d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new OnErrorReturnSubscriber(dVar, this.f120504d));
    }
}
