package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableAmb<T> extends io.reactivex.z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T>[] f121959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.e0<? extends T>> f121960c;

    public static final class AmbInnerObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.g0<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T> f121961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f121962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.g0<? super T> f121963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f121964e;

        AmbInnerObserver(a<T> aVar, int i10, io.reactivex.g0<? super T> g0Var) {
            this.f121961b = aVar;
            this.f121962c = i10;
            this.f121963d = g0Var;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f121964e) {
                this.f121963d.onComplete();
            } else if (this.f121961b.b(this.f121962c)) {
                this.f121964e = true;
                this.f121963d.onComplete();
            }
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (this.f121964e) {
                this.f121963d.onError(th2);
            } else if (!this.f121961b.b(this.f121962c)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f121964e = true;
                this.f121963d.onError(th2);
            }
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            if (this.f121964e) {
                this.f121963d.onNext(t10);
            } else if (!this.f121961b.b(this.f121962c)) {
                get().dispose();
            } else {
                this.f121964e = true;
                this.f121963d.onNext(t10);
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class a<T> implements io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super T> f121965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AmbInnerObserver<T>[] f121966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f121967d = new AtomicInteger();

        a(io.reactivex.g0<? super T> g0Var, int i10) {
            this.f121965b = g0Var;
            this.f121966c = new AmbInnerObserver[i10];
        }

        public void a(io.reactivex.e0<? extends T>[] e0VarArr) {
            AmbInnerObserver<T>[] ambInnerObserverArr = this.f121966c;
            int length = ambInnerObserverArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerObserverArr[i10] = new AmbInnerObserver<>(this, i11, this.f121965b);
                i10 = i11;
            }
            this.f121967d.lazySet(0);
            this.f121965b.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.f121967d.get() == 0; i12++) {
                e0VarArr[i12].g(ambInnerObserverArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f121967d.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f121967d.compareAndSet(0, i10)) {
                return false;
            }
            AmbInnerObserver<T>[] ambInnerObserverArr = this.f121966c;
            int length = ambInnerObserverArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    ambInnerObserverArr[i12].a();
                }
                i12 = i13;
            }
            return true;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f121967d.get() != -1) {
                this.f121967d.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.f121966c) {
                    ambInnerObserver.a();
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f121967d.get() == -1;
        }
    }

    public ObservableAmb(io.reactivex.e0<? extends T>[] e0VarArr, Iterable<? extends io.reactivex.e0<? extends T>> iterable) {
        this.f121959b = e0VarArr;
        this.f121960c = iterable;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super T> g0Var) {
        int length;
        io.reactivex.e0<? extends T>[] e0VarArr = this.f121959b;
        if (e0VarArr == null) {
            e0VarArr = new io.reactivex.z[8];
            try {
                length = 0;
                for (io.reactivex.e0<? extends T> e0Var : this.f121960c) {
                    if (e0Var == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), g0Var);
                        return;
                    }
                    if (length == e0VarArr.length) {
                        io.reactivex.e0<? extends T>[] e0VarArr2 = new io.reactivex.e0[(length >> 2) + length];
                        System.arraycopy(e0VarArr, 0, e0VarArr2, 0, length);
                        e0VarArr = e0VarArr2;
                    }
                    int i10 = length + 1;
                    e0VarArr[length] = e0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, g0Var);
                return;
            }
        } else {
            length = e0VarArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(g0Var);
        } else if (length == 1) {
            e0VarArr[0].g(g0Var);
        } else {
            new a(g0Var, length).a(e0VarArr);
        }
    }
}
