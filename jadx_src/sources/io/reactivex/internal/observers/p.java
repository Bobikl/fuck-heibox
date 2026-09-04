package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: SubscriberCompletableObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p<T> implements io.reactivex.d, org.reactivestreams.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.d<? super T> f119676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.reactivex.disposables.b f119677c;

    public p(org.reactivestreams.d<? super T> dVar) {
        this.f119676b = dVar;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
        this.f119677c.dispose();
    }

    @Override // io.reactivex.d
    public void onComplete() {
        this.f119676b.onComplete();
    }

    @Override // io.reactivex.d
    public void onError(Throwable th2) {
        this.f119676b.onError(th2);
    }

    @Override // io.reactivex.d
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.validate(this.f119677c, bVar)) {
            this.f119677c = bVar;
            this.f119676b.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
    }
}
