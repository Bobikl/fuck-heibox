package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableSkipWhile.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f121050d;

    /* JADX INFO: compiled from: FlowableSkipWhile.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121054e;

        a(org.reactivestreams.d<? super T> dVar, kh.r<? super T> rVar) {
            this.f121051b = dVar;
            this.f121052c = rVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121053d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121051b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121051b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121054e) {
                this.f121051b.onNext(t10);
                return;
            }
            try {
                if (this.f121052c.test(t10)) {
                    this.f121053d.request(1L);
                } else {
                    this.f121054e = true;
                    this.f121051b.onNext(t10);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121053d.cancel();
                this.f121051b.onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121053d, eVar)) {
                this.f121053d = eVar;
                this.f121051b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121053d.request(j10);
        }
    }

    public b1(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f121050d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121050d));
    }
}
