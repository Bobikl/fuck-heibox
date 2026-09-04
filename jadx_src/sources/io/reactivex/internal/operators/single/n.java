package io.reactivex.internal.operators.single;

import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SingleEquals.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends i0<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final o0<? extends T> f123553c;

    /* JADX INFO: compiled from: SingleEquals.java */
    public static class a<T> implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f123554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f123555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object[] f123556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final l0<? super Boolean> f123557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f123558f;

        a(int i10, io.reactivex.disposables.a aVar, Object[] objArr, l0<? super Boolean> l0Var, AtomicInteger atomicInteger) {
            this.f123554b = i10;
            this.f123555c = aVar;
            this.f123556d = objArr;
            this.f123557e = l0Var;
            this.f123558f = atomicInteger;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            int i10;
            do {
                i10 = this.f123558f.get();
                if (i10 >= 2) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
            } while (!this.f123558f.compareAndSet(i10, 2));
            this.f123555c.dispose();
            this.f123557e.onError(th2);
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123555c.c(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            this.f123556d[this.f123554b] = t10;
            if (this.f123558f.incrementAndGet() == 2) {
                l0<? super Boolean> l0Var = this.f123557e;
                Object[] objArr = this.f123556d;
                l0Var.onSuccess(Boolean.valueOf(io.reactivex.internal.functions.a.c(objArr[0], objArr[1])));
            }
        }
    }

    public n(o0<? extends T> o0Var, o0<? extends T> o0Var2) {
        this.f123552b = o0Var;
        this.f123553c = o0Var2;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super Boolean> l0Var) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        l0Var.onSubscribe(aVar);
        this.f123552b.f(new a(0, aVar, objArr, l0Var, atomicInteger));
        this.f123553c.f(new a(1, aVar, objArr, l0Var, atomicInteger));
    }
}
