package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFromIterable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m0<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends T> f122965b;

    /* JADX INFO: compiled from: ObservableFromIterable.java */
    public static final class a<T> extends io.reactivex.internal.observers.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Iterator<? extends T> f122967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f122968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f122969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f122971g;

        a(io.reactivex.g0<? super T> g0Var, Iterator<? extends T> it) {
            this.f122966b = g0Var;
            this.f122967c = it;
        }

        void a() {
            while (!isDisposed()) {
                try {
                    this.f122966b.onNext(io.reactivex.internal.functions.a.g(this.f122967c.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f122967c.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f122966b.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        this.f122966b.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    this.f122966b.onError(th3);
                    return;
                }
            }
        }

        @Override // lh.o
        public void clear() {
            this.f122970f = true;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122968d = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122968d;
        }

        @Override // lh.o
        public boolean isEmpty() {
            return this.f122970f;
        }

        @Override // lh.o
        @jh.f
        public T poll() {
            if (this.f122970f) {
                return null;
            }
            if (!this.f122971g) {
                this.f122971g = true;
            } else if (!this.f122967c.hasNext()) {
                this.f122970f = true;
                return null;
            }
            return (T) io.reactivex.internal.functions.a.g(this.f122967c.next(), "The iterator returned a null value");
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f122969e = true;
            return 1;
        }
    }

    public m0(Iterable<? extends T> iterable) {
        this.f122965b = iterable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            Iterator<? extends T> it = this.f122965b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(g0Var);
                    return;
                }
                a aVar = new a(g0Var, it);
                g0Var.onSubscribe(aVar);
                if (aVar.f122969e) {
                    return;
                }
                aVar.a();
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
