package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements g0<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = -5417183359794346637L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j<T> f119617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f119618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    lh.o<T> f119619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f119620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f119621f;

    public InnerQueuedObserver(j<T> jVar, int i10) {
        this.f119617b = jVar;
        this.f119618c = i10;
    }

    public int a() {
        return this.f119621f;
    }

    public boolean b() {
        return this.f119620e;
    }

    public lh.o<T> c() {
        return this.f119619d;
    }

    public void d() {
        this.f119620e = true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        this.f119617b.d(this);
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        this.f119617b.c(this, th2);
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        if (this.f119621f == 0) {
            this.f119617b.f(this, t10);
        } else {
            this.f119617b.b();
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            if (bVar instanceof lh.j) {
                lh.j jVar = (lh.j) bVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f119621f = iRequestFusion;
                    this.f119619d = jVar;
                    this.f119620e = true;
                    this.f119617b.d(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f119621f = iRequestFusion;
                    this.f119619d = jVar;
                    return;
                }
            }
            this.f119619d = io.reactivex.internal.util.n.c(-this.f119618c);
        }
    }
}
