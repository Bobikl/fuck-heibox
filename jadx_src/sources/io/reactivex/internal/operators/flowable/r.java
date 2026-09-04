package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: FlowableDematerialize.java */
/* JADX INFO: loaded from: classes12.dex */
public final class r<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends io.reactivex.y<R>> f121303d;

    /* JADX INFO: compiled from: FlowableDematerialize.java */
    public static final class a<T, R> implements io.reactivex.o<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f121304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.y<R>> f121305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f121306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.e f121307e;

        a(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends io.reactivex.y<R>> oVar) {
            this.f121304b = dVar;
            this.f121305c = oVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121307e.cancel();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f121306d) {
                return;
            }
            this.f121306d = true;
            this.f121304b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f121306d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121306d = true;
                this.f121304b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f121306d) {
                if (t10 instanceof io.reactivex.y) {
                    io.reactivex.y yVar = (io.reactivex.y) t10;
                    if (yVar.g()) {
                        io.reactivex.plugins.a.Y(yVar.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.y yVar2 = (io.reactivex.y) io.reactivex.internal.functions.a.g(this.f121305c.apply(t10), "The selector returned a null Notification");
                if (yVar2.g()) {
                    this.f121307e.cancel();
                    onError(yVar2.d());
                } else if (!yVar2.f()) {
                    this.f121304b.onNext((Object) yVar2.e());
                } else {
                    this.f121307e.cancel();
                    onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f121307e.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f121307e, eVar)) {
                this.f121307e = eVar;
                this.f121304b.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f121307e.request(j10);
        }
    }

    public r(io.reactivex.j<T> jVar, kh.o<? super T, ? extends io.reactivex.y<R>> oVar) {
        super(jVar);
        this.f121303d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121039c.j6(new a(dVar, this.f121303d));
    }
}
