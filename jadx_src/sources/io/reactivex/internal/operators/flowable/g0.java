package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableFromObservable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g0<T> extends io.reactivex.j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.reactivex.z<T> f121115c;

    /* JADX INFO: compiled from: FlowableFromObservable.java */
    public static final class a<T> implements io.reactivex.g0<T>, org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f121116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f121117c;

        a(org.reactivestreams.d<? super T> dVar) {
            this.f121116b = dVar;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f121117c.dispose();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f121116b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f121116b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f121116b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121117c = bVar;
            this.f121116b.onSubscribe(this);
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
        }
    }

    public g0(io.reactivex.z<T> zVar) {
        this.f121115c = zVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        this.f121115c.g(new a(dVar));
    }
}
