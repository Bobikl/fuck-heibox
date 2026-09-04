package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableCreate extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e f119715b;

    public static final class Emitter extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.c, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119716b;

        Emitter(io.reactivex.d dVar) {
            this.f119716b = dVar;
        }

        @Override // io.reactivex.c
        public void a(kh.f fVar) {
            c(new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.c
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
                this.f119716b.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.c
        public void c(io.reactivex.disposables.b bVar) {
            DisposableHelper.set(this, bVar);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.c, io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.c
        public void onComplete() {
            io.reactivex.disposables.b andSet;
            io.reactivex.disposables.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f119716b.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }
    }

    public CompletableCreate(io.reactivex.e eVar) {
        this.f119715b = eVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        Emitter emitter = new Emitter(dVar);
        dVar.onSubscribe(emitter);
        try {
            this.f119715b.a(emitter);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            emitter.onError(th2);
        }
    }
}
