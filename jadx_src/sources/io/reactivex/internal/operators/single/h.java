package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l0;
import io.reactivex.o0;

/* JADX INFO: compiled from: SingleDoAfterTerminate.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<T> f123526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.a f123527c;

    /* JADX INFO: compiled from: SingleDoAfterTerminate.java */
    public static final class a<T> implements l0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f123528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.a f123529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.b f123530d;

        a(l0<? super T> l0Var, kh.a aVar) {
            this.f123528b = l0Var;
            this.f123529c = aVar;
        }

        private void a() {
            try {
                this.f123529c.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123530d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123530d.isDisposed();
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            this.f123528b.onError(th2);
            a();
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123530d, bVar)) {
                this.f123530d = bVar;
                this.f123528b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123528b.onSuccess(t10);
            a();
        }
    }

    public h(o0<T> o0Var, kh.a aVar) {
        this.f123526b = o0Var;
        this.f123527c = aVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        this.f123526b.f(new a(l0Var, this.f123527c));
    }
}
