package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import kh.f;

/* JADX INFO: loaded from: classes7.dex */
public final class CancellableDisposable extends AtomicReference<f> implements io.reactivex.disposables.b {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(f fVar) {
        super(fVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        f andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e10) {
            io.reactivex.exceptions.a.b(e10);
            io.reactivex.plugins.a.Y(e10);
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == null;
    }
}
