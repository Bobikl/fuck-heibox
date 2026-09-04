package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SingleAmb.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0<? extends T>[] f123489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Iterable<? extends o0<? extends T>> f123490c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.single.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SingleAmb.java */
    public static final class C1108a<T> implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.a f123491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final l0<? super T> f123492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f123493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f123494e;

        C1108a(l0<? super T> l0Var, io.reactivex.disposables.a aVar, AtomicBoolean atomicBoolean) {
            this.f123492c = l0Var;
            this.f123491b = aVar;
            this.f123493d = atomicBoolean;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            if (!this.f123493d.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f123491b.b(this.f123494e);
            this.f123491b.dispose();
            this.f123492c.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123494e = bVar;
            this.f123491b.c(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            if (this.f123493d.compareAndSet(false, true)) {
                this.f123491b.b(this.f123494e);
                this.f123491b.dispose();
                this.f123492c.onSuccess(t10);
            }
        }
    }

    public a(o0<? extends T>[] o0VarArr, Iterable<? extends o0<? extends T>> iterable) {
        this.f123489b = o0VarArr;
        this.f123490c = iterable;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        int length;
        o0<? extends T>[] o0VarArr = this.f123489b;
        if (o0VarArr == null) {
            o0VarArr = new o0[8];
            try {
                length = 0;
                for (o0<? extends T> o0Var : this.f123490c) {
                    if (o0Var == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), l0Var);
                        return;
                    }
                    if (length == o0VarArr.length) {
                        o0<? extends T>[] o0VarArr2 = new o0[(length >> 2) + length];
                        System.arraycopy(o0VarArr, 0, o0VarArr2, 0, length);
                        o0VarArr = o0VarArr2;
                    }
                    int i10 = length + 1;
                    o0VarArr[length] = o0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, l0Var);
                return;
            }
        } else {
            length = o0VarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        l0Var.onSubscribe(aVar);
        for (int i11 = 0; i11 < length; i11++) {
            o0<? extends T> o0Var2 = o0VarArr[i11];
            if (aVar.isDisposed()) {
                return;
            }
            if (o0Var2 == null) {
                aVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    l0Var.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            o0Var2.f(new C1108a(l0Var, aVar, atomicBoolean));
        }
    }
}
