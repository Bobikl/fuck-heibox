package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: SingleZipIterable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class z<T, R> extends i0<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends o0<? extends T>> f123585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f123586c;

    /* JADX INFO: compiled from: SingleZipIterable.java */
    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(z.this.f123586c.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public z(Iterable<? extends o0<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        this.f123585b = iterable;
        this.f123586c = oVar;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super R> l0Var) {
        o0[] o0VarArr = new o0[8];
        try {
            int i10 = 0;
            for (o0<? extends T> o0Var : this.f123585b) {
                if (o0Var == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), l0Var);
                    return;
                }
                if (i10 == o0VarArr.length) {
                    o0VarArr = (o0[]) Arrays.copyOf(o0VarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                o0VarArr[i10] = o0Var;
                i10 = i11;
            }
            if (i10 == 0) {
                EmptyDisposable.error(new NoSuchElementException(), l0Var);
                return;
            }
            if (i10 == 1) {
                o0VarArr[0].f(new v.a(l0Var, new a()));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(l0Var, i10, this.f123586c);
            l0Var.onSubscribe(zipCoordinator);
            for (int i12 = 0; i12 < i10 && !zipCoordinator.isDisposed(); i12++) {
                o0VarArr[i12].f(zipCoordinator.f123484d[i12]);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, l0Var);
        }
    }
}
