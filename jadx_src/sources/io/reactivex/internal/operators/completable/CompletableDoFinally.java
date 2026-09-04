package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDoFinally extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f119729c;

    public static final class DoFinallyObserver extends AtomicInteger implements io.reactivex.d, io.reactivex.disposables.b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f119731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f119732d;

        DoFinallyObserver(io.reactivex.d dVar, kh.a aVar) {
            this.f119730b = dVar;
            this.f119731c = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f119731c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f119732d.dispose();
            a();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119732d.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            this.f119730b.onComplete();
            a();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            this.f119730b.onError(th2);
            a();
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f119732d, bVar)) {
                this.f119732d = bVar;
                this.f119730b.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(io.reactivex.g gVar, kh.a aVar) {
        this.f119728b = gVar;
        this.f119729c = aVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119728b.d(new DoFinallyObserver(dVar, this.f119729c));
    }
}
