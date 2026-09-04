package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoFinally<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f121464c;

    public static final class DoFinallyObserver<T> extends AtomicInteger implements io.reactivex.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f121466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121467d;

        DoFinallyObserver(io.reactivex.t<? super T> tVar, kh.a aVar) {
            this.f121465b = tVar;
            this.f121466c = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f121466c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121467d.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121467d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121465b.onComplete();
            a();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            this.f121465b.onError(th2);
            a();
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121467d, bVar)) {
                this.f121467d = bVar;
                this.f121465b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121465b.onSuccess(t10);
            a();
        }
    }

    public MaybeDoFinally(io.reactivex.w<T> wVar, kh.a aVar) {
        super(wVar);
        this.f121464c = aVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new DoFinallyObserver(tVar, this.f121464c));
    }
}
