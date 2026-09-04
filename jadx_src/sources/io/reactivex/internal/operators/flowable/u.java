package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableDistinctUntilChanged.java */
/* JADX INFO: loaded from: classes12.dex */
public final class u<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, K> f121329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.d<? super K, ? super K> f121330e;

    /* JADX INFO: compiled from: FlowableDistinctUntilChanged.java */
    public static final class a<T, K> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, K> f121331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.d<? super K, ? super K> f121332h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        K f121333i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f121334j;

        a(lh.a<? super T> aVar, kh.o<? super T, K> oVar, kh.d<? super K, ? super K> dVar) {
            super(aVar);
            this.f121331g = oVar;
            this.f121332h = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123795e) {
                return false;
            }
            if (this.f123796f != 0) {
                return this.f123792b.m((Object) t10);
            }
            try {
                K kApply = this.f121331g.apply(t10);
                if (this.f121334j) {
                    boolean zTest = this.f121332h.test(this.f121333i, kApply);
                    this.f121333i = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f121334j = true;
                    this.f121333i = kApply;
                }
                this.f123792b.onNext((Object) t10);
                return true;
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
            while (true) {
                T tPoll = this.f123794d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f121331g.apply(tPoll);
                if (!this.f121334j) {
                    this.f121334j = true;
                    this.f121333i = kApply;
                    return tPoll;
                }
                if (!this.f121332h.test(this.f121333i, kApply)) {
                    this.f121333i = kApply;
                    return tPoll;
                }
                this.f121333i = kApply;
                if (this.f123796f != 1) {
                    this.f123793c.request(1L);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    /* JADX INFO: compiled from: FlowableDistinctUntilChanged.java */
    public static final class b<T, K> extends io.reactivex.internal.subscribers.b<T, T> implements lh.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, K> f121335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.d<? super K, ? super K> f121336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        K f121337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f121338j;

        b(org.reactivestreams.d<? super T> dVar, kh.o<? super T, K> oVar, kh.d<? super K, ? super K> dVar2) {
            super(dVar);
            this.f121335g = oVar;
            this.f121336h = dVar2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123800e) {
                return false;
            }
            if (this.f123801f != 0) {
                this.f123797b.onNext((Object) t10);
                return true;
            }
            try {
                K kApply = this.f121335g.apply(t10);
                if (this.f121338j) {
                    boolean zTest = this.f121336h.test(this.f121337i, kApply);
                    this.f121337i = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f121338j = true;
                    this.f121337i = kApply;
                }
                this.f123797b.onNext((Object) t10);
                return true;
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
            while (true) {
                T tPoll = this.f123799d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f121335g.apply(tPoll);
                if (!this.f121338j) {
                    this.f121338j = true;
                    this.f121337i = kApply;
                    return tPoll;
                }
                if (!this.f121336h.test(this.f121337i, kApply)) {
                    this.f121337i = kApply;
                    return tPoll;
                }
                this.f121337i = kApply;
                if (this.f123801f != 1) {
                    this.f123798c.request(1L);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public u(io.reactivex.j<T> jVar, kh.o<? super T, K> oVar, kh.d<? super K, ? super K> dVar) {
        super(jVar);
        this.f121329d = oVar;
        this.f121330e = dVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new a((lh.a) dVar, this.f121329d, this.f121330e));
        } else {
            this.f121039c.j6(new b(dVar, this.f121329d, this.f121330e));
        }
    }
}
