package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;

/* JADX INFO: compiled from: MaybeZipIterable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k0<T, R> extends io.reactivex.q<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.w<? extends T>> f121680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kh.o<? super Object[], ? extends R> f121681c;

    /* JADX INFO: compiled from: MaybeZipIterable.java */
    public final class a implements kh.o<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // kh.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.a.g(k0.this.f121681c.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    public k0(Iterable<? extends io.reactivex.w<? extends T>> iterable, kh.o<? super Object[], ? extends R> oVar) {
        this.f121680b = iterable;
        this.f121681c = oVar;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super R> tVar) {
        io.reactivex.w[] wVarArr = new io.reactivex.w[8];
        try {
            int i10 = 0;
            for (io.reactivex.w<? extends T> wVar : this.f121680b) {
                if (wVar == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), tVar);
                    return;
                }
                if (i10 == wVarArr.length) {
                    wVarArr = (io.reactivex.w[]) Arrays.copyOf(wVarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                wVarArr[i10] = wVar;
                i10 = i11;
            }
            if (i10 == 0) {
                EmptyDisposable.complete(tVar);
                return;
            }
            if (i10 == 1) {
                wVarArr[0].f(new c0.a(tVar, new a()));
                return;
            }
            MaybeZipArray.ZipCoordinator zipCoordinator = new MaybeZipArray.ZipCoordinator(tVar, i10, this.f121681c);
            tVar.onSubscribe(zipCoordinator);
            for (int i12 = 0; i12 < i10 && !zipCoordinator.isDisposed(); i12++) {
                wVarArr[i12].f(zipCoordinator.f121613d[i12]);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, tVar);
        }
    }
}
