package io.reactivex.internal.operators.mixed;

import io.reactivex.d;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.c;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenPublisher<R> extends j<R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g f121729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c<? extends R> f121730d;

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<e> implements o<R>, d, e {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f121731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<? extends R> f121732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f121734e = new AtomicLong();

        AndThenPublisherSubscriber(org.reactivestreams.d<? super R> dVar, c<? extends R> cVar) {
            this.f121731b = dVar;
            this.f121732c = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121733d.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            c<? extends R> cVar = this.f121732c;
            if (cVar == null) {
                this.f121731b.onComplete();
            } else {
                this.f121732c = null;
                cVar.g(this);
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121731b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(R r10) {
            this.f121731b.onNext(r10);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121733d, bVar)) {
                this.f121733d = bVar;
                this.f121731b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(e eVar) {
            SubscriptionHelper.deferredSetOnce(this, this.f121734e, eVar);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f121734e, j10);
        }
    }

    public CompletableAndThenPublisher(g gVar, c<? extends R> cVar) {
        this.f121729c = gVar;
        this.f121730d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121729c.d(new AndThenPublisherSubscriber(dVar, this.f121730d));
    }
}
