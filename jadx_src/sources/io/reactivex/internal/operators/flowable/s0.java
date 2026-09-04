package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableReduceMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s0<T> extends io.reactivex.q<T> implements lh.h<T>, lh.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.c<T, T, T> f121312c;

    /* JADX INFO: compiled from: FlowableReduceMaybe.java */
    public static final class a<T> implements io.reactivex.o<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<T, T, T> f121314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f121315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f121317f;

        a(io.reactivex.t<? super T> tVar, kh.c<T, T, T> cVar) {
            this.f121313b = tVar;
            this.f121314c = cVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121316e.cancel();
            this.f121317f = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121317f;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121317f) {
                return;
            }
            this.f121317f = true;
            T t10 = this.f121315d;
            if (t10 != null) {
                this.f121313b.onSuccess(t10);
            } else {
                this.f121313b.onComplete();
            }
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121317f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121317f = true;
                this.f121313b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121317f) {
                return;
            }
            T t11 = this.f121315d;
            if (t11 == null) {
                this.f121315d = t10;
                return;
            }
            try {
                this.f121315d = (T) io.reactivex.internal.functions.a.g(this.f121314c.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121316e.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121316e, eVar)) {
                this.f121316e = eVar;
                this.f121313b.onSubscribe(this);
                eVar.request(Long.MAX_VALUE);
            }
        }
    }

    public s0(io.reactivex.j<T> jVar, kh.c<T, T, T> cVar) {
        this.f121311b = jVar;
        this.f121312c = cVar;
    }

    @Override // lh.b
    public io.reactivex.j<T> c() {
        return io.reactivex.plugins.a.P(new FlowableReduce(this.f121311b, this.f121312c));
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121311b.j6(new a(tVar, this.f121312c));
    }

    @Override // lh.h
    public org.reactivestreams.c<T> source() {
        return this.f121311b;
    }
}
