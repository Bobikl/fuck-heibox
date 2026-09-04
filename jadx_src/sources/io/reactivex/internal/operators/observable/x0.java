package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x0<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends U> f123137c;

    /* JADX INFO: compiled from: ObservableMap.java */
    public static final class a<T, U> extends io.reactivex.internal.observers.a<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.o<? super T, ? extends U> f123138g;

        a(io.reactivex.g0<? super U> g0Var, kh.o<? super T, ? extends U> oVar) {
            super(g0Var);
            this.f123138g = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f119629e) {
                return;
            }
            if (this.f119630f != 0) {
                this.f119626b.onNext(null);
                return;
            }
            try {
                this.f119626b.onNext((Object) io.reactivex.internal.functions.a.g(this.f123138g.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public U poll() throws Exception {
            T tPoll = this.f119628d.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.a.g(this.f123138g.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public x0(io.reactivex.e0<T> e0Var, kh.o<? super T, ? extends U> oVar) {
        super(e0Var);
        this.f123137c = oVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super U> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123137c));
    }
}
