package io.reactivex.internal.operators.single;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoOnTerminate.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f123549c;

    /* JADX INFO: compiled from: SingleDoOnTerminate.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123550b;

        a(l0<? super T> l0Var) {
            this.f123550b = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            try {
                m.this.f123549c.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f123550b.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123550b.onSubscribe(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            try {
                m.this.f123549c.run();
                this.f123550b.onSuccess(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123550b.onError(th2);
            }
        }
    }

    public m(o0<T> o0Var, kh.a aVar) {
        this.f123548b = o0Var;
        this.f123549c = aVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123548b.f(new a(l0Var));
    }
}
