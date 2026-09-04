package io.reactivex.disposables;

import jh.e;

/* JADX INFO: loaded from: classes4.dex */
public final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@e Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
