package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservablePublishSelector<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super io.reactivex.z<T>, ? extends io.reactivex.e0<R>> f122367c;

    public static final class TargetObserver<T, R> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<R>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 854110278590336484L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super R> f122368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f122369c;

        TargetObserver(io.reactivex.g0<? super R> g0Var) {
            this.f122368b = g0Var;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122369c.dispose();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122369c.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            DisposableHelper.dispose(this);
            this.f122368b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this);
            this.f122368b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(R r10) {
            this.f122368b.onNext(r10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122369c, bVar)) {
                this.f122369c = bVar;
                this.f122368b.onSubscribe(this);
            }
        }
    }

    public static final class a<T, R> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PublishSubject<T> f122370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.b> f122371c;

        a(PublishSubject<T> publishSubject, AtomicReference<io.reactivex.disposables.b> atomicReference) {
            this.f122370b = publishSubject;
            this.f122371c = atomicReference;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122370b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122370b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122370b.onNext(t10);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f122371c, bVar);
        }
    }

    public ObservablePublishSelector(io.reactivex.e0<T> e0Var, kh.o<? super io.reactivex.z<T>, ? extends io.reactivex.e0<R>> oVar) {
        super(e0Var);
        this.f122367c = oVar;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super R> g0Var) {
        PublishSubject publishSubjectN8 = PublishSubject.n8();
        try {
            io.reactivex.e0 e0Var = (io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122367c.apply(publishSubjectN8), "The selector returned a null ObservableSource");
            TargetObserver targetObserver = new TargetObserver(g0Var);
            e0Var.g(targetObserver);
            this.f122785b.g(new a(publishSubjectN8, targetObserver));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}
