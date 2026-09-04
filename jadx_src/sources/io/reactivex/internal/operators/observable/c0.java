package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAt.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final T f122818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f122819e;

    /* JADX INFO: compiled from: ObservableElementAt.java */
    public static final class a<T> implements io.reactivex.g0<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f122820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final T f122822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f122823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f122825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f122826h;

        a(io.reactivex.g0<? super T> g0Var, long j10, T t10, boolean z10) {
            this.f122820b = g0Var;
            this.f122821c = j10;
            this.f122822d = t10;
            this.f122823e = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122824f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122824f.isDisposed();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f122826h) {
                return;
            }
            this.f122826h = true;
            T t10 = this.f122822d;
            if (t10 == null && this.f122823e) {
                this.f122820b.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f122820b.onNext(t10);
            }
            this.f122820b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f122826h) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f122826h = true;
                this.f122820b.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f122826h) {
                return;
            }
            long j10 = this.f122825g;
            if (j10 != this.f122821c) {
                this.f122825g = j10 + 1;
                return;
            }
            this.f122826h = true;
            this.f122824f.dispose();
            this.f122820b.onNext(t10);
            this.f122820b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122824f, bVar)) {
                this.f122824f = bVar;
                this.f122820b.onSubscribe(this);
            }
        }
    }

    public c0(io.reactivex.e0<T> e0Var, long j10, T t10, boolean z10) {
        super(e0Var);
        this.f122817c = j10;
        this.f122818d = t10;
        this.f122819e = z10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        this.f122785b.g(new a(g0Var, this.f122817c, this.f122818d, this.f122819e));
    }
}
