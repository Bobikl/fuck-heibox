package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybePeek.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h0<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f121660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super T> f121661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super Throwable> f121662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.a f121663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.a f121664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final kh.a f121665h;

    /* JADX INFO: compiled from: MaybePeek.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h0<T> f121667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121668d;

        a(io.reactivex.t<? super T> tVar, h0<T> h0Var) {
            this.f121666b = tVar;
            this.f121667c = h0Var;
        }

        void a() {
            try {
                this.f121667c.f121664g.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        void b(Throwable th2) {
            try {
                this.f121667c.f121662e.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f121668d = DisposableHelper.DISPOSED;
            this.f121666b.onError(th2);
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            try {
                this.f121667c.f121665h.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f121668d.dispose();
            this.f121668d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121668d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            io.reactivex.disposables.b bVar = this.f121668d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f121667c.f121663f.run();
                this.f121668d = disposableHelper;
                this.f121666b.onComplete();
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                b(th2);
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            if (this.f121668d == DisposableHelper.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                b(th2);
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121668d, bVar)) {
                try {
                    this.f121667c.f121660c.accept(bVar);
                    this.f121668d = bVar;
                    this.f121666b.onSubscribe(this);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    bVar.dispose();
                    this.f121668d = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th2, this.f121666b);
                }
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            io.reactivex.disposables.b bVar = this.f121668d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f121667c.f121661d.accept(t10);
                this.f121668d = disposableHelper;
                this.f121666b.onSuccess(t10);
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                b(th2);
            }
        }
    }

    public h0(io.reactivex.w<T> wVar, kh.g<? super io.reactivex.disposables.b> gVar, kh.g<? super T> gVar2, kh.g<? super Throwable> gVar3, kh.a aVar, kh.a aVar2, kh.a aVar3) {
        super(wVar);
        this.f121660c = gVar;
        this.f121661d = gVar2;
        this.f121662e = gVar3;
        this.f121663f = aVar;
        this.f121664g = aVar2;
        this.f121665h = aVar3;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this));
    }
}
