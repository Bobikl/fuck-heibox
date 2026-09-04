package io.reactivex.internal.observers;

import io.reactivex.g0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class BlockingObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements g0<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f119599c = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Queue<Object> f119600b;

    public BlockingObserver(Queue<Object> queue) {
        this.f119600b = queue;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f119600b.offer(f119599c);
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        this.f119600b.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        this.f119600b.offer(NotificationLite.error(th2));
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        this.f119600b.offer(NotificationLite.next(t10));
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
