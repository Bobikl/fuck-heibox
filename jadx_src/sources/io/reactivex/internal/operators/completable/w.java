package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletablePeek.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f119841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super Throwable> f119842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.a f119843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.a f119844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.a f119845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final kh.a f119846h;

    /* JADX INFO: compiled from: CompletablePeek.java */
    public final class a implements io.reactivex.d, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.b f119848c;

        a(io.reactivex.d dVar) {
            this.f119847b = dVar;
        }

        void a() {
            try {
                w.this.f119845g.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            try {
                w.this.f119846h.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f119848c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f119848c.isDisposed();
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119848c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                w.this.f119843e.run();
                w.this.f119844f.run();
                this.f119847b.onComplete();
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f119847b.onError(th2);
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (this.f119848c == DisposableHelper.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            try {
                w.this.f119842d.accept(th2);
                w.this.f119844f.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f119847b.onError(th2);
            a();
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            try {
                w.this.f119841c.accept(bVar);
                if (DisposableHelper.validate(this.f119848c, bVar)) {
                    this.f119848c = bVar;
                    this.f119847b.onSubscribe(this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                bVar.dispose();
                this.f119848c = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, this.f119847b);
            }
        }
    }

    public w(io.reactivex.g gVar, kh.g<? super io.reactivex.disposables.b> gVar2, kh.g<? super Throwable> gVar3, kh.a aVar, kh.a aVar2, kh.a aVar3, kh.a aVar4) {
        this.f119840b = gVar;
        this.f119841c = gVar2;
        this.f119842d = gVar3;
        this.f119843e = aVar;
        this.f119844f = aVar2;
        this.f119845g = aVar3;
        this.f119846h = aVar4;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        this.f119840b.d(new a(dVar));
    }
}
