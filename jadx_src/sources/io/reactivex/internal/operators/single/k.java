package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoOnSubscribe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.g<? super io.reactivex.disposables.b> f123540c;

    /* JADX INFO: compiled from: SingleDoOnSubscribe.java */
    public static final class a<T> implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.g<? super io.reactivex.disposables.b> f123542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123543d;

        a(l0<? super T> l0Var, kh.g<? super io.reactivex.disposables.b> gVar) {
            this.f123541b = l0Var;
            this.f123542c = gVar;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            if (this.f123543d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123541b.onError(th2);
            }
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            try {
                this.f123542c.accept(bVar);
                this.f123541b.onSubscribe(bVar);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123543d = true;
                bVar.dispose();
                EmptyDisposable.error(th2, this.f123541b);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            if (this.f123543d) {
                return;
            }
            this.f123541b.onSuccess(t10);
        }
    }

    public k(o0<T> o0Var, kh.g<? super io.reactivex.disposables.b> gVar) {
        this.f123539b = o0Var;
        this.f123540c = gVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123539b.f(new a(l0Var, this.f123540c));
    }
}
