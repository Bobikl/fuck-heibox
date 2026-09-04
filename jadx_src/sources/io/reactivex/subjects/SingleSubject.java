package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.i0;
import io.reactivex.l0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleSubject<T> extends i0<T> implements l0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final SingleDisposable[] f124123f = new SingleDisposable[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final SingleDisposable[] f124124g = new SingleDisposable[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f124127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Throwable f124128e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f124126c = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<SingleDisposable<T>[]> f124125b = new AtomicReference<>(f124123f);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0<? super T> f124129b;

        SingleDisposable(l0<? super T> l0Var, SingleSubject<T> singleSubject) {
            this.f124129b = l0Var;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.W1(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == null;
        }
    }

    SingleSubject() {
    }

    @e
    @jh.c
    public static <T> SingleSubject<T> P1() {
        return new SingleSubject<>();
    }

    boolean O1(@e SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.f124125b.get();
            if (singleDisposableArr == f124124g) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!s0.a(this.f124125b, singleDisposableArr, singleDisposableArr2));
        return true;
    }

    @f
    public Throwable Q1() {
        if (this.f124125b.get() == f124124g) {
            return this.f124128e;
        }
        return null;
    }

    @f
    public T R1() {
        if (this.f124125b.get() == f124124g) {
            return this.f124127d;
        }
        return null;
    }

    public boolean S1() {
        return this.f124125b.get().length != 0;
    }

    public boolean T1() {
        return this.f124125b.get() == f124124g && this.f124128e != null;
    }

    public boolean U1() {
        return this.f124125b.get() == f124124g && this.f124127d != null;
    }

    int V1() {
        return this.f124125b.get().length;
    }

    void W1(@e SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.f124125b.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (singleDisposableArr[i11] == singleDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = f124123f;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i10);
                System.arraycopy(singleDisposableArr, i10 + 1, singleDisposableArr3, i10, (length - i10) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!s0.a(this.f124125b, singleDisposableArr, singleDisposableArr2));
    }

    @Override // io.reactivex.i0
    protected void c1(@e l0<? super T> l0Var) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(l0Var, this);
        l0Var.onSubscribe(singleDisposable);
        if (O1(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                W1(singleDisposable);
            }
        } else {
            Throwable th2 = this.f124128e;
            if (th2 != null) {
                l0Var.onError(th2);
            } else {
                l0Var.onSuccess(this.f124127d);
            }
        }
    }

    @Override // io.reactivex.l0
    public void onError(@e Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f124126c.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124128e = th2;
        for (SingleDisposable<T> singleDisposable : this.f124125b.getAndSet(f124124g)) {
            singleDisposable.f124129b.onError(th2);
        }
    }

    @Override // io.reactivex.l0
    public void onSubscribe(@e io.reactivex.disposables.b bVar) {
        if (this.f124125b.get() == f124124g) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l0
    public void onSuccess(@e T t10) {
        io.reactivex.internal.functions.a.g(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124126c.compareAndSet(false, true)) {
            this.f124127d = t10;
            for (SingleDisposable<T> singleDisposable : this.f124125b.getAndSet(f124124g)) {
                singleDisposable.f124129b.onSuccess(t10);
            }
        }
    }
}
