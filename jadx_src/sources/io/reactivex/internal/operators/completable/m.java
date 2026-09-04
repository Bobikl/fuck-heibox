package io.reactivex.internal.operators.completable;

/* JADX INFO: compiled from: CompletableFromRunnable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class m extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f119819b;

    public m(Runnable runnable) {
        this.f119819b = runnable;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        dVar.onSubscribe(bVarB);
        try {
            this.f119819b.run();
            if (bVarB.isDisposed()) {
                return;
            }
            dVar.onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            if (bVarB.isDisposed()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
