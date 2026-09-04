package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableTakeUntilCompletable extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.a f119766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g f119767c;

    public static final class TakeUntilMainObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = 3533011714830024923L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final OtherObserver f119769c = new OtherObserver(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f119770d = new AtomicBoolean();

        public static final class OtherObserver extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.d {
            private static final long serialVersionUID = 5176264485428790318L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final TakeUntilMainObserver f119771b;

            OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.f119771b = takeUntilMainObserver;
            }

            @Override // io.reactivex.d
            public void onComplete() {
                this.f119771b.a();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                this.f119771b.b(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        TakeUntilMainObserver(io.reactivex.d dVar) {
            this.f119768b = dVar;
        }

        void a() {
            if (this.f119770d.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                this.f119768b.onComplete();
            }
        }

        void b(Throwable th2) {
            if (!this.f119770d.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this);
                this.f119768b.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f119770d.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(this.f119769c);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119770d.get();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119770d.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f119769c);
                this.f119768b.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (!this.f119770d.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                DisposableHelper.dispose(this.f119769c);
                this.f119768b.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public CompletableTakeUntilCompletable(io.reactivex.a aVar, io.reactivex.g gVar) {
        this.f119766b = aVar;
        this.f119767c = gVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(dVar);
        dVar.onSubscribe(takeUntilMainObserver);
        this.f119767c.d(takeUntilMainObserver.f119769c);
        this.f119766b.d(takeUntilMainObserver);
    }
}
