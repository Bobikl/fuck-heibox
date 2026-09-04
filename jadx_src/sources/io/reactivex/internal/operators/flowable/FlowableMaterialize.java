package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMaterialize<T> extends a<T, io.reactivex.y<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, io.reactivex.y<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        MaterializeSubscriber(org.reactivestreams.d<? super io.reactivex.y<T>> dVar) {
            super(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(io.reactivex.y<T> yVar) {
            if (yVar.g()) {
                io.reactivex.plugins.a.Y(yVar.d());
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            a(io.reactivex.y.a());
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            a(io.reactivex.y.b(th2));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123783e++;
            this.f123780b.onNext(io.reactivex.y.c(t10));
        }
    }

    public FlowableMaterialize(io.reactivex.j<T> jVar) {
        super(jVar);
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super io.reactivex.y<T>> dVar) {
        this.f121039c.j6(new MaterializeSubscriber(dVar));
    }
}
