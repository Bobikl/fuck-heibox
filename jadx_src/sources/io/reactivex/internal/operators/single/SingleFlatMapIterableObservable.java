package io.reactivex.internal.operators.single;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleFlatMapIterableObservable<T, R> extends io.reactivex.z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f123406c;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements l0<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super R> f123407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f123408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile Iterator<? extends R> f123410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f123411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f123412g;

        FlatMapIterableObserver(g0<? super R> g0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f123407b = g0Var;
            this.f123408c = oVar;
        }

        @Override // lh.o
        public void clear() {
            this.f123410e = null;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123411f = true;
            this.f123409d.dispose();
            this.f123409d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123411f;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f123410e == null;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123409d = DisposableHelper.DISPOSED;
            this.f123407b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123409d, bVar)) {
                this.f123409d = bVar;
                this.f123407b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            g0<? super R> g0Var = this.f123407b;
            try {
                Iterator<? extends R> it = this.f123408c.apply(t10).iterator();
                if (!it.hasNext()) {
                    g0Var.onComplete();
                    return;
                }
                if (this.f123412g) {
                    this.f123410e = it;
                    g0Var.onNext(null);
                    g0Var.onComplete();
                    return;
                }
                while (!this.f123411f) {
                    try {
                        g0Var.onNext(it.next());
                        if (this.f123411f) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                g0Var.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            g0Var.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.a.b(th3);
                        g0Var.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                this.f123407b.onError(th4);
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f123410e;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f123410e = null;
            }
            return r10;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f123412g = true;
            return 2;
        }
    }

    public SingleFlatMapIterableObservable(o0<T> o0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f123405b = o0Var;
        this.f123406c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super R> g0Var) {
        this.f123405b.f(new FlatMapIterableObserver(g0Var, this.f123406c));
    }
}
