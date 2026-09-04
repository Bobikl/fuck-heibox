package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSubscribeOn<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.h0 f121549c;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SequentialDisposable f121550b = new SequentialDisposable();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.t<? super T> f121551c;

        SubscribeOnMaybeObserver(io.reactivex.t<? super T> tVar) {
            this.f121551c = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.f121550b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121551c.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121551c.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121551c.onSuccess(t10);
        }
    }

    public static final class a<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.w<T> f121553c;

        a(io.reactivex.t<? super T> tVar, io.reactivex.w<T> wVar) {
            this.f121552b = tVar;
            this.f121553c = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f121553c.f(this.f121552b);
        }
    }

    public MaybeSubscribeOn(io.reactivex.w<T> wVar, io.reactivex.h0 h0Var) {
        super(wVar);
        this.f121549c = h0Var;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(tVar);
        tVar.onSubscribe(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.f121550b.a(this.f121549c.f(new a(subscribeOnMaybeObserver, this.f121618b)));
    }
}
