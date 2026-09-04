package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableScan.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<T, T, T> f121359d;

    /* JADX INFO: compiled from: FlowableScan.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<T, T, T> f121361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        T f121363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f121364f;

        a(org.reactivestreams.d<? super T> dVar, kh.c<T, T, T> cVar) {
            this.f121360b = dVar;
            this.f121361c = cVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121362d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121364f) {
                return;
            }
            this.f121364f = true;
            this.f121360b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121364f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121364f = true;
                this.f121360b.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121364f) {
                return;
            }
            org.reactivestreams.d<? super T> dVar = this.f121360b;
            T t11 = this.f121363e;
            if (t11 == null) {
                this.f121363e = t10;
                dVar.onNext(t10);
                return;
            }
            try {
                ?? r10 = (T) io.reactivex.internal.functions.a.g(this.f121361c.apply(t11, t10), "The value returned by the accumulator is null");
                this.f121363e = r10;
                dVar.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121362d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121362d, eVar)) {
                this.f121362d = eVar;
                this.f121360b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121362d.request(j10);
        }
    }

    public w0(io.reactivex.j<T> jVar, kh.c<T, T, T> cVar) {
        super(jVar);
        this.f121359d = cVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121359d));
    }
}
