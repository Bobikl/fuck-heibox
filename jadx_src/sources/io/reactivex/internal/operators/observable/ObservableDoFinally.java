package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableDoFinally<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f122119c;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements io.reactivex.g0<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f122121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f122122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        lh.j<T> f122123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122124f;

        DoFinallyObserver(io.reactivex.g0<? super T> g0Var, kh.a aVar) {
            this.f122120b = g0Var;
            this.f122121c = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f122121c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // lh.o
        public void clear() {
            this.f122123e.clear();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122122d.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122122d.isDisposed();
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f122123e.isEmpty();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122120b.onComplete();
            a();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122120b.onError(th2);
            a();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122120b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122122d, bVar)) {
                this.f122122d = bVar;
                if (bVar instanceof lh.j) {
                    this.f122123e = (lh.j) bVar;
                }
                this.f122120b.onSubscribe(this);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f122123e.poll();
            if (tPoll == null && this.f122124f) {
                a();
            }
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            lh.j<T> jVar = this.f122123e;
            if (jVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = jVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f122124f = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ObservableDoFinally(io.reactivex.e0<T> e0Var, kh.a aVar) {
        super(e0Var);
        this.f122119c = aVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new DoFinallyObserver(g0Var, this.f122119c));
    }
}
