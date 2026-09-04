package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: CompletableDisposeOn.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f119800c;

    /* JADX INFO: compiled from: CompletableDisposeOn.java */
    public static final class a implements io.reactivex.d, io.reactivex.disposables.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0 f119802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f119803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f119804e;

        a(io.reactivex.d dVar, h0 h0Var) {
            this.f119801b = dVar;
            this.f119802c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119804e = true;
            this.f119802c.f(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119804e;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119804e) {
                return;
            }
            this.f119801b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (this.f119804e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119801b.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119803d, bVar)) {
                this.f119803d = bVar;
                this.f119801b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119803d.dispose();
            this.f119803d = DisposableHelper.DISPOSED;
        }
    }

    public d(io.reactivex.g gVar, h0 h0Var) {
        this.f119799b = gVar;
        this.f119800c = h0Var;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119799b.d(new a(dVar, this.f119800c));
    }
}
