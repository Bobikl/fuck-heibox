package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableFromArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j0<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T[] f122921b;

    /* JADX INFO: compiled from: ObservableFromArray.java */
    public static final class a<T> extends io.reactivex.internal.observers.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T[] f122923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f122924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f122926f;

        a(io.reactivex.g0<? super T> g0Var, T[] tArr) {
            this.f122922b = g0Var;
            this.f122923c = tArr;
        }

        void a() {
            T[] tArr = this.f122923c;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f122922b.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                this.f122922b.onNext(t10);
            }
            if (isDisposed()) {
                return;
            }
            this.f122922b.onComplete();
        }

        @Override // lh.o
        public void clear() {
            this.f122924d = this.f122923c.length;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122926f = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122926f;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f122924d == this.f122923c.length;
        }

        @Override // lh.o
        @jh.f
        public T poll() {
            int i10 = this.f122924d;
            T[] tArr = this.f122923c;
            if (i10 == tArr.length) {
                return null;
            }
            this.f122924d = i10 + 1;
            return (T) io.reactivex.internal.functions.a.g(tArr[i10], "The array element is null");
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f122925e = true;
            return 1;
        }
    }

    public j0(T[] tArr) {
        this.f122921b = tArr;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        a aVar = new a(g0Var, this.f122921b);
        g0Var.onSubscribe(aVar);
        if (aVar.f122925e) {
            return;
        }
        aVar.a();
    }
}
