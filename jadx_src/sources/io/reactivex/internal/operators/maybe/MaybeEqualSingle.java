package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeEqualSingle<T> extends io.reactivex.i0<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.w<? extends T> f121468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.w<? extends T> f121469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super T, ? super T> f121470d;

    public static final class EqualCoordinator<T> extends AtomicInteger implements io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super Boolean> f121471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final EqualObserver<T> f121472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final EqualObserver<T> f121473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final kh.d<? super T, ? super T> f121474e;

        EqualCoordinator(l0<? super Boolean> l0Var, kh.d<? super T, ? super T> dVar) {
            super(2);
            this.f121471b = l0Var;
            this.f121474e = dVar;
            this.f121472c = new EqualObserver<>(this);
            this.f121473d = new EqualObserver<>(this);
        }

        void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f121472c.f121476c;
                Object obj2 = this.f121473d.f121476c;
                if (obj == null || obj2 == null) {
                    this.f121471b.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    this.f121471b.onSuccess(Boolean.valueOf(this.f121474e.test(obj, obj2)));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f121471b.onError(th2);
                }
            }
        }

        void b(EqualObserver<T> equalObserver, Throwable th2) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            EqualObserver<T> equalObserver2 = this.f121472c;
            if (equalObserver == equalObserver2) {
                this.f121473d.a();
            } else {
                equalObserver2.a();
            }
            this.f121471b.onError(th2);
        }

        void c(io.reactivex.w<? extends T> wVar, io.reactivex.w<? extends T> wVar2) {
            wVar.f(this.f121472c);
            wVar2.f(this.f121473d);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121472c.a();
            this.f121473d.a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f121472c.get());
        }
    }

    public static final class EqualObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T> {
        private static final long serialVersionUID = -3031974433025990931L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EqualCoordinator<T> f121475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f121476c;

        EqualObserver(EqualCoordinator<T> equalCoordinator) {
            this.f121475b = equalCoordinator;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121475b.a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121475b.b(this, th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121476c = t10;
            this.f121475b.a();
        }
    }

    public MaybeEqualSingle(io.reactivex.w<? extends T> wVar, io.reactivex.w<? extends T> wVar2, kh.d<? super T, ? super T> dVar) {
        this.f121468b = wVar;
        this.f121469c = wVar2;
        this.f121470d = dVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Boolean> l0Var) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(l0Var, this.f121470d);
        l0Var.onSubscribe(equalCoordinator);
        equalCoordinator.c(this.f121468b, this.f121469c);
    }
}
