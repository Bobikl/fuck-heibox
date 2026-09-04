package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CompletableAmb.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.g[] f119784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.g> f119785c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CompletableAmb.java */
    public static final class C1095a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f119786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f119787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.d f119788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.b f119789e;

        C1095a(AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, io.reactivex.d dVar) {
            this.f119786b = atomicBoolean;
            this.f119787c = aVar;
            this.f119788d = dVar;
        }

        @Override // io.reactivex.d
        public void onComplete() {
            if (this.f119786b.compareAndSet(false, true)) {
                this.f119787c.b(this.f119789e);
                this.f119787c.dispose();
                this.f119788d.onComplete();
            }
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (!this.f119786b.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f119787c.b(this.f119789e);
            this.f119787c.dispose();
            this.f119788d.onError(th2);
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119789e = bVar;
            this.f119787c.c(bVar);
        }
    }

    public a(io.reactivex.g[] gVarArr, Iterable<? extends io.reactivex.g> iterable) {
        this.f119784b = gVarArr;
        this.f119785c = iterable;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        int length;
        io.reactivex.g[] gVarArr = this.f119784b;
        if (gVarArr == null) {
            gVarArr = new io.reactivex.g[8];
            try {
                length = 0;
                for (io.reactivex.g gVar : this.f119785c) {
                    if (gVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), dVar);
                        return;
                    }
                    if (length == gVarArr.length) {
                        io.reactivex.g[] gVarArr2 = new io.reactivex.g[(length >> 2) + length];
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                        gVarArr = gVarArr2;
                    }
                    int i10 = length + 1;
                    gVarArr[length] = gVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                EmptyDisposable.error(th2, dVar);
                return;
            }
        } else {
            length = gVarArr.length;
        }
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        dVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            io.reactivex.g gVar2 = gVarArr[i11];
            if (aVar.isDisposed()) {
                return;
            }
            if (gVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                } else {
                    aVar.dispose();
                    dVar.onError(nullPointerException);
                    return;
                }
            }
            gVar2.d(new C1095a(atomicBoolean, aVar, dVar));
        }
        if (length == 0) {
            dVar.onComplete();
        }
    }
}
