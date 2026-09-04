package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeOnErrorComplete.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f0<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.r<? super Throwable> f121644c;

    /* JADX INFO: compiled from: MaybeOnErrorComplete.java */
    public static final class a<T> implements io.reactivex.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.r<? super Throwable> f121646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f121647d;

        a(io.reactivex.t<? super T> tVar, kh.r<? super Throwable> rVar) {
            this.f121645b = tVar;
            this.f121646c = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f121647d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121647d.isDisposed();
        }

        @Override // io.reactivex.t
        public void onComplete() {
            this.f121645b.onComplete();
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            try {
                if (this.f121646c.test(th2)) {
                    this.f121645b.onComplete();
                } else {
                    this.f121645b.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f121645b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f121647d, bVar)) {
                this.f121647d = bVar;
                this.f121645b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            this.f121645b.onSuccess(t10);
        }
    }

    public f0(io.reactivex.w<T> wVar, kh.r<? super Throwable> rVar) {
        super(wVar);
        this.f121644c = rVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        this.f121618b.f(new a(tVar, this.f121644c));
    }
}
