package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableResumeNext extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends io.reactivex.g> f119757c;

    public static final class ResumeNextObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = 5018523762564524046L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends io.reactivex.g> f119759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f119760d;

        ResumeNextObserver(io.reactivex.d dVar, kh.o<? super Throwable, ? extends io.reactivex.g> oVar) {
            this.f119758b = dVar;
            this.f119759c = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119758b.onComplete();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (this.f119760d) {
                this.f119758b.onError(th2);
                return;
            }
            this.f119760d = true;
            try {
                ((io.reactivex.g) io.reactivex.internal.functions.a.g(this.f119759c.apply(th2), "The errorMapper returned a null CompletableSource")).d(this);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f119758b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.replace(this, bVar);
        }
    }

    public CompletableResumeNext(io.reactivex.g gVar, kh.o<? super Throwable, ? extends io.reactivex.g> oVar) {
        this.f119756b = gVar;
        this.f119757c = oVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(dVar, this.f119757c);
        dVar.onSubscribe(resumeNextObserver);
        this.f119756b.d(resumeNextObserver);
    }
}
