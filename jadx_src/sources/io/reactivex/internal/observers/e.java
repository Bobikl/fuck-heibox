package io.reactivex.internal.observers;

/* JADX INFO: compiled from: BlockingLastObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e<T> extends c<T> {
    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        this.f119631b = null;
        this.f119632c = th2;
        countDown();
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        this.f119631b = t10;
    }
}
