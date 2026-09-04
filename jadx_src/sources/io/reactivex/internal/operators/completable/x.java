package io.reactivex.internal.operators.completable;

import io.reactivex.h0;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CompletableTimeout.java */
/* JADX INFO: loaded from: classes12.dex */
public final class x extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f119851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f119852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h0 f119853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.g f119854f;

    /* JADX INFO: compiled from: CompletableTimeout.java */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f119855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f119856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.d f119857d;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableTimeout.java */
        public final class C1096a implements io.reactivex.d {
            C1096a() {
            }

            @Override // io.reactivex.d
            public void onComplete() {
                a.this.f119856c.dispose();
                a.this.f119857d.onComplete();
            }

            @Override // io.reactivex.d
            public void onError(Throwable th2) {
                a.this.f119856c.dispose();
                a.this.f119857d.onError(th2);
            }

            @Override // io.reactivex.d
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                a.this.f119856c.c(bVar);
            }
        }

        a(AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, io.reactivex.d dVar) {
            this.f119855b = atomicBoolean;
            this.f119856c = aVar;
            this.f119857d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f119855b.compareAndSet(false, true)) {
                this.f119856c.f();
                io.reactivex.g gVar = x.this.f119854f;
                if (gVar != null) {
                    gVar.d(new C1096a());
                    return;
                }
                io.reactivex.d dVar = this.f119857d;
                x xVar = x.this;
                dVar.onError(new TimeoutException(ExceptionHelper.e(xVar.f119851c, xVar.f119852d)));
            }
        }
    }

    /* JADX INFO: compiled from: CompletableTimeout.java */
    public static final class b implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.disposables.a f119860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f119861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.d f119862d;

        b(io.reactivex.disposables.a aVar, AtomicBoolean atomicBoolean, io.reactivex.d dVar) {
            this.f119860b = aVar;
            this.f119861c = atomicBoolean;
            this.f119862d = dVar;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119861c.compareAndSet(false, true)) {
                this.f119860b.dispose();
                this.f119862d.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (!this.f119861c.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119860b.dispose();
                this.f119862d.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119860b.c(bVar);
        }
    }

    public x(io.reactivex.g gVar, long j10, TimeUnit timeUnit, h0 h0Var, io.reactivex.g gVar2) {
        this.f119850b = gVar;
        this.f119851c = j10;
        this.f119852d = timeUnit;
        this.f119853e = h0Var;
        this.f119854f = gVar2;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        dVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        aVar.c(this.f119853e.g(new a(atomicBoolean, aVar, dVar), this.f119851c, this.f119852d));
        this.f119850b.d(new b(aVar, atomicBoolean, dVar));
    }
}
