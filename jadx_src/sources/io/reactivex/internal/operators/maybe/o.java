package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;

/* JADX INFO: compiled from: MaybeFlatMapIterableObservable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class o<T, R> extends io.reactivex.z<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<T> f121693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, ? extends Iterable<? extends R>> f121694c;

    /* JADX INFO: compiled from: MaybeFlatMapIterableObservable.java */
    public static final class a<T, R> extends io.reactivex.internal.observers.b<R> implements io.reactivex.t<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f121695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super T, ? extends Iterable<? extends R>> f121696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile Iterator<? extends R> f121698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f121699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f121700g;

        a(io.reactivex.g0<? super R> g0Var, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f121695b = g0Var;
            this.f121696c = oVar;
        }

        @Override // lh.o
        public void clear() {
            this.f121698e = null;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121699f = true;
            this.f121697d.dispose();
            this.f121697d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121699f;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f121698e == null;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121695b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121697d = DisposableHelper.DISPOSED;
            this.f121695b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121697d, bVar)) {
                this.f121697d = bVar;
                this.f121695b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            io.reactivex.g0<? super R> g0Var = this.f121695b;
            try {
                Iterator<? extends R> it = this.f121696c.apply(t10).iterator();
                if (!it.hasNext()) {
                    g0Var.onComplete();
                    return;
                }
                this.f121698e = it;
                if (this.f121700g) {
                    g0Var.onNext(null);
                    g0Var.onComplete();
                    return;
                }
                while (!this.f121699f) {
                    try {
                        g0Var.onNext(it.next());
                        if (this.f121699f) {
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
                g0Var.onError(th4);
            }
        }

        @Override // lh.o
        @jh.f
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f121698e;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.a.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f121698e = null;
            }
            return r10;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f121700g = true;
            return 2;
        }
    }

    public o(io.reactivex.w<T> wVar, kh.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f121693b = wVar;
        this.f121694c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        this.f121693b.f(new a(g0Var, this.f121694c));
    }
}
