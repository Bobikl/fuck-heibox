package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class AsyncSubject<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AsyncDisposable[] f124069e = new AsyncDisposable[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AsyncDisposable[] f124070f = new AsyncDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<AsyncDisposable<T>[]> f124071b = new AtomicReference<>(f124069e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f124072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f124073d;

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AsyncSubject<T> f124074i;

        AsyncDisposable(g0<? super T> g0Var, AsyncSubject<T> asyncSubject) {
            super(g0Var);
            this.f124074i = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            if (super.d()) {
                this.f124074i.s8(this);
            }
        }

        void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.f119610b.onComplete();
        }

        void onError(Throwable th2) {
            if (isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f119610b.onError(th2);
            }
        }
    }

    AsyncSubject() {
    }

    @e
    @jh.c
    public static <T> AsyncSubject<T> n8() {
        return new AsyncSubject<>();
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(g0Var, this);
        g0Var.onSubscribe(asyncDisposable);
        if (m8(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                s8(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f124072c;
        if (th2 != null) {
            g0Var.onError(th2);
            return;
        }
        T t10 = this.f124073d;
        if (t10 != null) {
            asyncDisposable.b(t10);
        } else {
            asyncDisposable.onComplete();
        }
    }

    @Override // io.reactivex.subjects.c
    public Throwable h8() {
        if (this.f124071b.get() == f124070f) {
            return this.f124072c;
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return this.f124071b.get() == f124070f && this.f124072c == null;
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124071b.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return this.f124071b.get() == f124070f && this.f124072c != null;
    }

    boolean m8(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f124071b.get();
            if (asyncDisposableArr == f124070f) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!s0.a(this.f124071b, asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    @f
    public T o8() {
        if (this.f124071b.get() == f124070f) {
            return this.f124073d;
        }
        return null;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.f124071b.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f124070f;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t10 = this.f124073d;
        AsyncDisposable<T>[] andSet = this.f124071b.getAndSet(asyncDisposableArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].b(t10);
            i10++;
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncDisposable<T>[] asyncDisposableArr = this.f124071b.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f124070f;
        if (asyncDisposableArr == asyncDisposableArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124073d = null;
        this.f124072c = th2;
        for (AsyncDisposable<T> asyncDisposable : this.f124071b.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124071b.get() == f124070f) {
            return;
        }
        this.f124073d = t10;
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124071b.get() == f124070f) {
            bVar.dispose();
        }
    }

    @Deprecated
    public Object[] p8() {
        T tO8 = o8();
        return tO8 != null ? new Object[]{tO8} : new Object[0];
    }

    @Deprecated
    public T[] q8(T[] tArr) {
        T tO8 = o8();
        if (tO8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tO8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean r8() {
        return this.f124071b.get() == f124070f && this.f124073d != null;
    }

    void s8(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f124071b.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (asyncDisposableArr[i11] == asyncDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = f124069e;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i10);
                System.arraycopy(asyncDisposableArr, i10 + 1, asyncDisposableArr3, i10, (length - i10) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!s0.a(this.f124071b, asyncDisposableArr, asyncDisposableArr2));
    }
}
