package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableMap.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p0<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends U> f121283d;

    /* JADX INFO: compiled from: FlowableMap.java */
    public static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, ? extends U> f121284g;

        a(lh.a<? super U> aVar, kh.o<? super T, ? extends U> oVar) {
            super(aVar);
            this.f121284g = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123795e) {
                return false;
            }
            try {
                return this.f123792b.m((Object) io.reactivex.internal.functions.a.g(this.f121284g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123795e) {
                return;
            }
            if (this.f123796f != 0) {
                this.f123792b.onNext(null);
                return;
            }
            try {
                this.f123792b.onNext((Object) io.reactivex.internal.functions.a.g(this.f121284g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public U poll() throws Exception {
            T tPoll = this.f123794d.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.a.g(this.f121284g.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    /* JADX INFO: compiled from: FlowableMap.java */
    public static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, ? extends U> f121285g;

        b(org.reactivestreams.d<? super U> dVar, kh.o<? super T, ? extends U> oVar) {
            super(dVar);
            this.f121285g = oVar;
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
                this.f123797b.onNext((Object) io.reactivex.internal.functions.a.g(this.f121285g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public U poll() throws Exception {
            T tPoll = this.f123799d.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.a.g(this.f121285g.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public p0(io.reactivex.j<T> jVar, kh.o<? super T, ? extends U> oVar) {
        super(jVar);
        this.f121283d = oVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super U> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new a((lh.a) dVar, this.f121283d));
        } else {
            this.f121039c.j6(new b(dVar, this.f121283d));
        }
    }
}
