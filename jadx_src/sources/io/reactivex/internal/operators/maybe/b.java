package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MaybeAmb.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> extends io.reactivex.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.w<? extends T>[] f121620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.w<? extends T>> f121621c;

    /* JADX INFO: compiled from: MaybeAmb.java */
    public static final class a<T> implements io.reactivex.t<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.t<? super T> f121622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f121623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.disposables.a f121624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f121625e;

        a(io.reactivex.t<? super T> tVar, io.reactivex.disposables.a aVar, AtomicBoolean atomicBoolean) {
            this.f121622b = tVar;
            this.f121624d = aVar;
            this.f121623c = atomicBoolean;
        }

        @Override // io.reactivex.t
        public void onComplete() {
            if (this.f121623c.compareAndSet(false, true)) {
                this.f121624d.b(this.f121625e);
                this.f121624d.dispose();
                this.f121622b.onComplete();
            }
        }

        @Override // io.reactivex.t
        public void onError(Throwable th2) {
            if (!this.f121623c.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f121624d.b(this.f121625e);
            this.f121624d.dispose();
            this.f121622b.onError(th2);
        }

        @Override // io.reactivex.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f121625e = bVar;
            this.f121624d.c(bVar);
        }

        @Override // io.reactivex.t
        public void onSuccess(T t10) {
            if (this.f121623c.compareAndSet(false, true)) {
                this.f121624d.b(this.f121625e);
                this.f121624d.dispose();
                this.f121622b.onSuccess(t10);
            }
        }
    }

    public b(io.reactivex.w<? extends T>[] wVarArr, Iterable<? extends io.reactivex.w<? extends T>> iterable) {
        this.f121620b = wVarArr;
        this.f121621c = iterable;
    }

    @Override // io.reactivex.q
    protected void r1(io.reactivex.t<? super T> tVar) {
        int length;
        io.reactivex.w<? extends T>[] wVarArr = this.f121620b;
        if (wVarArr == null) {
            wVarArr = new io.reactivex.w[8];
            try {
                length = 0;
                for (io.reactivex.w<? extends T> wVar : this.f121621c) {
                    if (wVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), tVar);
                        return;
                    }
                    if (length == wVarArr.length) {
                        io.reactivex.w<? extends T>[] wVarArr2 = new io.reactivex.w[(length >> 2) + length];
                        System.arraycopy(wVarArr, 0, wVarArr2, 0, length);
                        wVarArr = wVarArr2;
                    }
                    int i10 = length + 1;
                    wVarArr[length] = wVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, tVar);
                return;
            }
        } else {
            length = wVarArr.length;
        }
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        tVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            io.reactivex.w<? extends T> wVar2 = wVarArr[i11];
            if (aVar.isDisposed()) {
                return;
            }
            if (wVar2 == null) {
                aVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    tVar.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            wVar2.f(new a(tVar, aVar, atomicBoolean));
        }
        if (length == 0) {
            tVar.onComplete();
        }
    }
}
