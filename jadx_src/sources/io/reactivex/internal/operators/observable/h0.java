package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super T> f122904c;

    /* JADX INFO: compiled from: ObservableFilter.java */
    public static final class a<T> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.r<? super T> f122905g;

        a(io.reactivex.g0<? super T> g0Var, kh.r<? super T> rVar) {
            super(g0Var);
            this.f122905g = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f119630f != 0) {
                this.f119626b.onNext(null);
                return;
            }
            try {
                if (this.f122905g.test(t10)) {
                    this.f119626b.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f119628d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f122905g.test(tPoll));
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public h0(io.reactivex.e0<T> e0Var, kh.r<? super T> rVar) {
        super(e0Var);
        this.f122904c = rVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122904c));
    }
}
