package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleUnsubscribeOn<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h0 f123468c;

    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements l0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0 f123470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123471d;

        UnsubscribeOnSingleObserver(l0<? super T> l0Var, h0 h0Var) {
            this.f123469b = l0Var;
            this.f123470c = h0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            io.reactivex.disposables.b andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f123471d = andSet;
                this.f123470c.f(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123469b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f123469b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123469b.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f123471d.dispose();
        }
    }

    public SingleUnsubscribeOn(o0<T> o0Var, h0 h0Var) {
        this.f123467b = o0Var;
        this.f123468c = h0Var;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123467b.f(new UnsubscribeOnSingleObserver(l0Var, this.f123468c));
    }
}
