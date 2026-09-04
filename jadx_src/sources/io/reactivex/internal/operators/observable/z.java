package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableDoAfterNext.java */
/* JADX INFO: loaded from: classes5.dex */
public final class z<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f123174c;

    /* JADX INFO: compiled from: ObservableDoAfterNext.java */
    public static final class a<T> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.g<? super T> f123175g;

        a(io.reactivex.g0<? super T> g0Var, kh.g<? super T> gVar) {
            super(g0Var);
            this.f123175g = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f119626b.onNext((Object) t10);
            if (this.f119630f == 0) {
                try {
                    this.f123175g.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f119628d.poll();
            if (tPoll != null) {
                this.f123175g.accept(tPoll);
            }
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public z(io.reactivex.e0<T> e0Var, kh.g<? super T> gVar) {
        super(e0Var);
        this.f123174c = gVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f123174c));
    }
}
