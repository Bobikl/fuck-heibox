package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDistinct.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super T, K> f123133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f123134d;

    /* JADX INFO: compiled from: ObservableDistinct.java */
    public static final class a<T, K> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Collection<? super K> f123135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super T, K> f123136h;

        a(io.reactivex.g0<? super T> g0Var, kh.o<? super T, K> oVar, Collection<? super K> collection) {
            super(g0Var);
            this.f123136h = oVar;
            this.f123135g = collection;
        }

        @Override // io.reactivex.internal.observers.a, lh.o
        public void clear() {
            this.f123135g.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.a, io.reactivex.g0
        public void onComplete() {
            if (this.f119629e) {
                return;
            }
            this.f119629e = true;
            this.f123135g.clear();
            this.f119626b.onComplete();
        }

        @Override // io.reactivex.internal.observers.a, io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f119629e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f119629e = true;
            this.f123135g.clear();
            this.f119626b.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f119629e) {
                return;
            }
            if (this.f119630f != 0) {
                this.f119626b.onNext(null);
                return;
            }
            try {
                if (this.f123135g.add(io.reactivex.internal.functions.a.g(this.f123136h.apply(t10), "The keySelector returned a null key"))) {
                    this.f119626b.onNext((Object) t10);
                }
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f119628d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f123135g.add((Object) io.reactivex.internal.functions.a.g(this.f123136h.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public x(io.reactivex.e0<T> e0Var, kh.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(e0Var);
        this.f123133c = oVar;
        this.f123134d = callable;
    }

    @Override // io.reactivex.z
    protected void H5(io.reactivex.g0<? super T> g0Var) {
        try {
            this.f122785b.g(new a(g0Var, this.f123133c, (Collection) io.reactivex.internal.functions.a.g(this.f123134d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
        }
    }
}
