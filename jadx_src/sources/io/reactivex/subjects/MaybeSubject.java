package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.q;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class MaybeSubject<T> extends q<T> implements t<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final MaybeDisposable[] f124081f = new MaybeDisposable[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final MaybeDisposable[] f124082g = new MaybeDisposable[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f124085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Throwable f124086e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f124084c = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<MaybeDisposable<T>[]> f124083b = new AtomicReference<>(f124081f);

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t<? super T> f124087b;

        MaybeDisposable(t<? super T> tVar, MaybeSubject<T> maybeSubject) {
            this.f124087b = tVar;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.o2(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == null;
        }
    }

    MaybeSubject() {
    }

    @e
    @jh.c
    public static <T> MaybeSubject<T> g2() {
        return new MaybeSubject<>();
    }

    boolean f2(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.f124083b.get();
            if (maybeDisposableArr == f124082g) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!s0.a(this.f124083b, maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    @f
    public Throwable h2() {
        if (this.f124083b.get() == f124082g) {
            return this.f124086e;
        }
        return null;
    }

    @f
    public T i2() {
        if (this.f124083b.get() == f124082g) {
            return this.f124085d;
        }
        return null;
    }

    public boolean j2() {
        return this.f124083b.get() == f124082g && this.f124085d == null && this.f124086e == null;
    }

    public boolean k2() {
        return this.f124083b.get().length != 0;
    }

    public boolean l2() {
        return this.f124083b.get() == f124082g && this.f124086e != null;
    }

    public boolean m2() {
        return this.f124083b.get() == f124082g && this.f124085d != null;
    }

    int n2() {
        return this.f124083b.get().length;
    }

    void o2(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.f124083b.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (maybeDisposableArr[i11] == maybeDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr2 = f124081f;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i10);
                System.arraycopy(maybeDisposableArr, i10 + 1, maybeDisposableArr3, i10, (length - i10) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!s0.a(this.f124083b, maybeDisposableArr, maybeDisposableArr2));
    }

    @Override // io.reactivex.t
    public void onComplete() {
        if (this.f124084c.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.f124083b.getAndSet(f124082g)) {
                maybeDisposable.f124087b.onComplete();
            }
        }
    }

    @Override // io.reactivex.t
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f124084c.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124086e = th2;
        for (MaybeDisposable<T> maybeDisposable : this.f124083b.getAndSet(f124082g)) {
            maybeDisposable.f124087b.onError(th2);
        }
    }

    @Override // io.reactivex.t
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124083b.get() == f124082g) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.t
    public void onSuccess(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124084c.compareAndSet(false, true)) {
            this.f124085d = t10;
            for (MaybeDisposable<T> maybeDisposable : this.f124083b.getAndSet(f124082g)) {
                maybeDisposable.f124087b.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.q
    protected void r1(t<? super T> tVar) {
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(tVar, this);
        tVar.onSubscribe(maybeDisposable);
        if (f2(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                o2(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f124086e;
        if (th2 != null) {
            tVar.onError(th2);
            return;
        }
        T t10 = this.f124085d;
        if (t10 == null) {
            tVar.onComplete();
        } else {
            tVar.onSuccess(t10);
        }
    }
}
