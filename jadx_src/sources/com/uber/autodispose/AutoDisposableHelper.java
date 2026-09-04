package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public enum AutoDisposableHelper implements io.reactivex.disposables.b {
    DISPOSED;

    static boolean dispose(AtomicReference<io.reactivex.disposables.b> atomicReference) {
        io.reactivex.disposables.b andSet;
        io.reactivex.disposables.b bVar = atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = DISPOSED;
        if (bVar == autoDisposableHelper || (andSet = atomicReference.getAndSet(autoDisposableHelper)) == autoDisposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return true;
    }
}
