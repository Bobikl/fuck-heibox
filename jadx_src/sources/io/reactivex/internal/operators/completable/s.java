package io.reactivex.internal.operators.completable;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: CompletableMergeDelayErrorArray.java */
/* JADX INFO: loaded from: classes12.dex */
public final class s extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g[] f119829b;

    /* JADX INFO: compiled from: CompletableMergeDelayErrorArray.java */
    public static final class a implements io.reactivex.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f119830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.a f119831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicThrowable f119832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f119833e;

        a(io.reactivex.d dVar, io.reactivex.disposables.a aVar, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f119830b = dVar;
            this.f119831c = aVar;
            this.f119832d = atomicThrowable;
            this.f119833e = atomicInteger;
        }

        void a() {
            if (this.f119833e.decrementAndGet() == 0) {
                Throwable thC = this.f119832d.c();
                if (thC == null) {
                    this.f119830b.onComplete();
                } else {
                    this.f119830b.onError(thC);
                }
            }
        }

        @Override // io.reactivex.d
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.d
        public void onError(Throwable th2) {
            if (this.f119832d.a(th2)) {
                a();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.d
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f119831c.c(bVar);
        }
    }

    public s(io.reactivex.g[] gVarArr) {
        this.f119829b = gVarArr;
    }

    @Override // io.reactivex.a
    public void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        AtomicInteger atomicInteger = new AtomicInteger(this.f119829b.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        dVar.onSubscribe(aVar);
        for (io.reactivex.g gVar : this.f119829b) {
            if (aVar.isDisposed()) {
                return;
            }
            if (gVar == null) {
                atomicThrowable.a(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                gVar.d(new a(dVar, aVar, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thC = atomicThrowable.c();
            if (thC == null) {
                dVar.onComplete();
            } else {
                dVar.onError(thC);
            }
        }
    }
}
