package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeCreate<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.u<T> f121435b;

    public static final class Emitter<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.s<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121436b;

        Emitter(io.reactivex.t<? super T> tVar) {
            this.f121436b = tVar;
        }

        @Override // io.reactivex.s
        public void a(kh.f fVar) {
            c(new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.s
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
                this.f121436b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.s
        public void c(io.reactivex.disposables.b bVar) {
            DisposableHelper.set(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.s, io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            io.reactivex.disposables.b andSet;
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f121436b.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // io.reactivex.s
        public void onSuccess(T t10) {
            io.reactivex.disposables.b andSet;
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f121436b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f121436b.onSuccess(t10);
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

    public MaybeCreate(io.reactivex.u<T> uVar) {
        this.f121435b = uVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        Emitter emitter = new Emitter(tVar);
        tVar.onSubscribe(emitter);
        try {
            this.f121435b.a(emitter);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            emitter.onError(th2);
        }
    }
}
