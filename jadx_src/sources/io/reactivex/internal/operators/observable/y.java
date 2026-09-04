package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, K> f123152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super K, ? super K> f123153d;

    /* JADX INFO: compiled from: ObservableDistinctUntilChanged.java */
    public static final class a<T, K> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, K> f123154g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.d<? super K, ? super K> f123155h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        K f123156i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f123157j;

        a(io.reactivex.g0<? super T> g0Var, kh.o<? super T, K> oVar, kh.d<? super K, ? super K> dVar) {
            super(g0Var);
            this.f123154g = oVar;
            this.f123155h = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f119629e) {
                return;
            }
            if (this.f119630f != 0) {
                this.f119626b.onNext((Object) t10);
                return;
            }
            try {
                K kApply = this.f123154g.apply(t10);
                if (this.f123157j) {
                    boolean zTest = this.f123155h.test(this.f123156i, kApply);
                    this.f123156i = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f123157j = true;
                    this.f123156i = kApply;
                }
                this.f119626b.onNext((Object) t10);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f119628d.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f123154g.apply(tPoll);
                if (!this.f123157j) {
                    this.f123157j = true;
                    this.f123156i = kApply;
                    return tPoll;
                }
                if (!this.f123155h.test(this.f123156i, kApply)) {
                    this.f123156i = kApply;
                    return tPoll;
                }
                this.f123156i = kApply;
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public y(io.reactivex.e0<T> e0Var, kh.o<? super T, K> oVar, kh.d<? super K, ? super K> dVar) {
        super(e0Var);
        this.f123152c = oVar;
        this.f123153d = dVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123152c, this.f123153d));
    }
}
