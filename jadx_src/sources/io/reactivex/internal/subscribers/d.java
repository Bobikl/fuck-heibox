package io.reactivex.internal.subscribers;

/* JADX INFO: compiled from: BlockingFirstSubscriber.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> extends c<T> {
    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        if (this.f123802b == null) {
            this.f123803c = th2;
        } else {
            io.reactivex.plugins.a.Y(th2);
        }
        countDown();
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        if (this.f123802b == null) {
            this.f123802b = t10;
            this.f123804d.cancel();
            countDown();
        }
    }
}
