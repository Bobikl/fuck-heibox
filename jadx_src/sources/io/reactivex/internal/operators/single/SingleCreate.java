package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.k0;
import io.reactivex.l0;
import io.reactivex.m0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleCreate<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m0<T> f123356b;

    public static final class Emitter<T> extends AtomicReference<io.reactivex.disposables.b> implements k0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123357b;

        Emitter(l0<? super T> l0Var) {
            this.f123357b = l0Var;
        }

        @Override // io.reactivex.k0
        public void a(kh.f fVar) {
            c(new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.k0
        public boolean b(Throwable th2) {
            io.reactivex.disposables.b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f123357b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.k0
        public void c(io.reactivex.disposables.b bVar) {
            DisposableHelper.set(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.k0, io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.k0
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // io.reactivex.k0
        public void onSuccess(T t10) {
            io.reactivex.disposables.b andSet;
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f123357b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f123357b.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }
    }

    public SingleCreate(m0<T> m0Var) {
        this.f123356b = m0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        Emitter emitter = new Emitter(l0Var);
        l0Var.onSubscribe(emitter);
        try {
            this.f123356b.a(emitter);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            emitter.onError(th2);
        }
    }
}
