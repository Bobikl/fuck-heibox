package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableDistinct.java */
/* JADX INFO: loaded from: classes12.dex */
public final class t<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, K> f121318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f121319e;

    /* JADX INFO: compiled from: FlowableDistinct.java */
    public static final class a<T, K> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Collection<? super K> f121320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super T, K> f121321h;

        a(org.reactivestreams.d<? super T> dVar, kh.o<? super T, K> oVar, Collection<? super K> collection) {
            super(dVar);
            this.f121321h = oVar;
            this.f121320g = collection;
        }

        @Override // io.reactivex.internal.subscribers.b, lh.o
        public void clear() {
            this.f121320g.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.d
        public void onComplete() {
            if (this.f123800e) {
                return;
            }
            this.f123800e = true;
            this.f121320g.clear();
            this.f123797b.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123800e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123800e = true;
            this.f121320g.clear();
            this.f123797b.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123800e) {
                return;
            }
            if (this.f123801f != 0) {
                this.f123797b.onNext(null);
                return;
            }
            try {
                if (this.f121320g.add(io.reactivex.internal.functions.a.g(this.f121321h.apply(t10), "The keySelector returned a null key"))) {
                    this.f123797b.onNext((Object) t10);
                } else {
                    this.f123798c.request(1L);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll;
            while (true) {
                tPoll = this.f123799d.poll();
                if (tPoll == null || this.f121320g.add((Object) io.reactivex.internal.functions.a.g(this.f121321h.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.f123801f == 2) {
                    this.f123798c.request(1L);
                }
            }
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public t(io.reactivex.j<T> jVar, kh.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(jVar);
        this.f121318d = oVar;
        this.f121319e = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        try {
            this.f121039c.j6(new a(dVar, this.f121318d, (Collection) io.reactivex.internal.functions.a.g(this.f121319e.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
