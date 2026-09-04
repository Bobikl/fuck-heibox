package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.t;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapPublisher<T, R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final w<T> f121846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final o<? super T, ? extends c<? extends R>> f121847d;

    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<e> implements io.reactivex.o<R>, t<T>, e {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super R> f121848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? super T, ? extends c<? extends R>> f121849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121851e = new AtomicLong();

        FlatMapPublisherSubscriber(d<? super R> dVar, o<? super T, ? extends c<? extends R>> oVar) {
            this.f121848b = dVar;
            this.f121849c = oVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121850d.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121848b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121848b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(R r10) {
            this.f121848b.onNext(r10);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121850d, bVar)) {
                this.f121850d = bVar;
                this.f121848b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            SubscriptionHelper.deferredSetOnce(this, this.f121851e, eVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            try {
                ((c) io.reactivex.internal.functions.a.g(this.f121849c.apply(t10), "The mapper returned a null Publisher")).g(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121848b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f121851e, j10);
        }
    }

    public MaybeFlatMapPublisher(w<T> wVar, o<? super T, ? extends c<? extends R>> oVar) {
        this.f121846c = wVar;
        this.f121847d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super R> dVar) {
        this.f121846c.f(new FlatMapPublisherSubscriber(dVar, this.f121847d));
    }
}
