package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableZipIterable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y1<T, U, V> extends io.reactivex.z<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.z<? extends T> f123166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<U> f123167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<? super T, ? super U, ? extends V> f123168d;

    /* JADX INFO: compiled from: ObservableZipIterable.java */
    public static final class a<T, U, V> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super V> f123169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Iterator<U> f123170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.c<? super T, ? super U, ? extends V> f123171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f123173f;

        a(io.reactivex.g0<? super V> g0Var, Iterator<U> it, kh.c<? super T, ? super U, ? extends V> cVar) {
            this.f123169b = g0Var;
            this.f123170c = it;
            this.f123171d = cVar;
        }

        void a(Throwable th2) {
            this.f123173f = true;
            this.f123172e.dispose();
            this.f123169b.onError(th2);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f123172e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123172e.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f123173f) {
                return;
            }
            this.f123173f = true;
            this.f123169b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f123173f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123173f = true;
                this.f123169b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f123173f) {
                return;
            }
            try {
                try {
                    this.f123169b.onNext(io.reactivex.internal.functions.a.g(this.f123171d.apply(t10, io.reactivex.internal.functions.a.g(this.f123170c.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f123170c.hasNext()) {
                            return;
                        }
                        this.f123173f = true;
                        this.f123172e.dispose();
                        this.f123169b.onComplete();
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    a(th3);
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                a(th4);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f123172e, bVar)) {
                this.f123172e = bVar;
                this.f123169b.onSubscribe(this);
            }
        }
    }

    public y1(io.reactivex.z<? extends T> zVar, Iterable<U> iterable, kh.c<? super T, ? super U, ? extends V> cVar) {
        this.f123166b = zVar;
        this.f123167c = iterable;
        this.f123168d = cVar;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super V> g0Var) {
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.a.g(this.f123167c.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f123166b.g(new a(g0Var, it, this.f123168d));
                } else {
                    EmptyDisposable.complete(g0Var);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, g0Var);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.b(th3);
            EmptyDisposable.error(th3, g0Var);
        }
    }
}
