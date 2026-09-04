package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleDoFinally<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f123378c;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements l0<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f123380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123381d;

        DoFinallyObserver(l0<? super T> l0Var, kh.a aVar) {
            this.f123379b = l0Var;
            this.f123380c = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f123380c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123381d.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123381d.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123379b.onError(th2);
            a();
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123381d, bVar)) {
                this.f123381d = bVar;
                this.f123379b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123379b.onSuccess(t10);
            a();
        }
    }

    public SingleDoFinally(o0<T> o0Var, kh.a aVar) {
        this.f123377b = o0Var;
        this.f123378c = aVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123377b.f(new DoFinallyObserver(l0Var, this.f123378c));
    }
}
