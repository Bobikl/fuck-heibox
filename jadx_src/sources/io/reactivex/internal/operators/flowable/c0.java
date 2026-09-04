package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableFilter.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.r<? super T> f121060d;

    /* JADX INFO: compiled from: FlowableFilter.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.r<? super T> f121061g;

        a(lh.a<? super T> aVar, kh.r<? super T> rVar) {
            super(aVar);
            this.f121061g = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123795e) {
                return false;
            }
            if (this.f123796f != 0) {
                return this.f123792b.m(null);
            }
            try {
                return this.f121061g.test(t10) && this.f123792b.m((Object) t10);
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10)) {
                return;
            }
            this.f123793c.request(1L);
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            lh.l<T> lVar = this.f123794d;
            kh.r<? super T> rVar = this.f121061g;
            while (true) {
                T tPoll = lVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (rVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f123796f == 2) {
                    lVar.request(1L);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    /* JADX INFO: compiled from: FlowableFilter.java */
    public static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements lh.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.r<? super T> f121062g;

        b(org.reactivestreams.d<? super T> dVar, kh.r<? super T> rVar) {
            super(dVar);
            this.f121062g = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123800e) {
                return false;
            }
            if (this.f123801f != 0) {
                this.f123797b.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f121062g.test(t10);
                if (zTest) {
                    this.f123797b.onNext((Object) t10);
                }
                return zTest;
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (m(t10)) {
                return;
            }
            this.f123798c.request(1L);
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            lh.l<T> lVar = this.f123799d;
            kh.r<? super T> rVar = this.f121062g;
            while (true) {
                T tPoll = lVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (rVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f123801f == 2) {
                    lVar.request(1L);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public c0(io.reactivex.j<T> jVar, kh.r<? super T> rVar) {
        super(jVar);
        this.f121060d = rVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new a((lh.a) dVar, this.f121060d));
        } else {
            this.f121039c.j6(new b(dVar, this.f121060d));
        }
    }
}
