package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class CompletableSubject extends io.reactivex.a implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final CompletableDisposable[] f124075e = new CompletableDisposable[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final CompletableDisposable[] f124076f = new CompletableDisposable[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f124079d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f124078c = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<CompletableDisposable[]> f124077b = new AtomicReference<>(f124075e);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f124080b;

        CompletableDisposable(d dVar, CompletableSubject completableSubject) {
            this.f124080b = dVar;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.p1(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == null;
        }
    }

    CompletableSubject() {
    }

    @e
    @jh.c
    public static CompletableSubject j1() {
        return new CompletableSubject();
    }

    @Override // io.reactivex.a
    protected void J0(d dVar) {
        CompletableDisposable completableDisposable = new CompletableDisposable(dVar, this);
        dVar.onSubscribe(completableDisposable);
        if (i1(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                p1(completableDisposable);
            }
        } else {
            Throwable th2 = this.f124079d;
            if (th2 != null) {
                dVar.onError(th2);
            } else {
                dVar.onComplete();
            }
        }
    }

    boolean i1(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.f124077b.get();
            if (completableDisposableArr == f124076f) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!s0.a(this.f124077b, completableDisposableArr, completableDisposableArr2));
        return true;
    }

    @f
    public Throwable k1() {
        if (this.f124077b.get() == f124076f) {
            return this.f124079d;
        }
        return null;
    }

    public boolean l1() {
        return this.f124077b.get() == f124076f && this.f124079d == null;
    }

    public boolean m1() {
        return this.f124077b.get().length != 0;
    }

    public boolean n1() {
        return this.f124077b.get() == f124076f && this.f124079d != null;
    }

    int o1() {
        return this.f124077b.get().length;
    }

    @Override // io.reactivex.d
    public void onComplete() {
        if (this.f124078c.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.f124077b.getAndSet(f124076f)) {
                completableDisposable.f124080b.onComplete();
            }
        }
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f124078c.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124079d = th2;
        for (CompletableDisposable completableDisposable : this.f124077b.getAndSet(f124076f)) {
            completableDisposable.f124080b.onError(th2);
        }
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124077b.get() == f124076f) {
            bVar.dispose();
        }
    }

    void p1(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.f124077b.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (completableDisposableArr[i11] == completableDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr2 = f124075e;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i10);
                System.arraycopy(completableDisposableArr, i10 + 1, completableDisposableArr3, i10, (length - i10) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!s0.a(this.f124077b, completableDisposableArr, completableDisposableArr2));
    }
}
