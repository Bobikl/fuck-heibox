package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableTakeWhile.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f1<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f121106d;

    /* JADX INFO: compiled from: FlowableTakeWhile.java */
    public static final class a<T> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super T> f121108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.e f121109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121110e;

        a(org.reactivestreams.d<? super T> dVar, kh.r<? super T> rVar) {
            this.f121107b = dVar;
            this.f121108c = rVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121109d.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121110e) {
                return;
            }
            this.f121110e = true;
            this.f121107b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121110e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121110e = true;
                this.f121107b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121110e) {
                return;
            }
            try {
                if (this.f121108c.test(t10)) {
                    this.f121107b.onNext(t10);
                    return;
                }
                this.f121110e = true;
                this.f121109d.cancel();
                this.f121107b.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121109d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121109d, eVar)) {
                this.f121109d = eVar;
                this.f121107b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121109d.request(j10);
        }
    }

    public f1(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f121106d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121039c.j6(new a(dVar, this.f121106d));
    }
}
