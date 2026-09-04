package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDoOnEach.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super T> f122786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super Throwable> f122787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.a f122788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.a f122789f;

    /* JADX INFO: compiled from: ObservableDoOnEach.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super T> f122791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.g<? super Throwable> f122792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.a f122793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final kh.a f122794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.b f122795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f122796h;

        a(io.reactivex.g0<? super T> g0Var, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
            this.f122790b = g0Var;
            this.f122791c = gVar;
            this.f122792d = gVar2;
            this.f122793e = aVar;
            this.f122794f = aVar2;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122795g.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122795g.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122796h) {
                return;
            }
            try {
                this.f122793e.run();
                this.f122796h = true;
                this.f122790b.onComplete();
                try {
                    this.f122794f.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122796h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f122796h = true;
            try {
                this.f122792d.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f122790b.onError(th2);
            try {
                this.f122794f.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122796h) {
                return;
            }
            try {
                this.f122791c.accept(t10);
                this.f122790b.onNext(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f122795g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122795g, bVar)) {
                this.f122795g = bVar;
                this.f122790b.onSubscribe(this);
            }
        }
    }

    public a0(io.reactivex.e0<T> e0Var, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
        super(e0Var);
        this.f122786c = gVar;
        this.f122787d = gVar2;
        this.f122788e = aVar;
        this.f122789f = aVar2;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122786c, this.f122787d, this.f122788e, this.f122789f));
    }
}
