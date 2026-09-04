package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<io.reactivex.disposables.b> implements io.reactivex.disposables.b {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i10) {
        super(i10);
    }

    public io.reactivex.disposables.b a(int i10, io.reactivex.disposables.b bVar) {
        io.reactivex.disposables.b bVar2;
        do {
            bVar2 = get(i10);
            if (bVar2 == DisposableHelper.DISPOSED) {
                bVar.dispose();
                return null;
            }
        } while (!compareAndSet(i10, bVar2, bVar));
        return bVar2;
    }

    public boolean b(int i10, io.reactivex.disposables.b bVar) {
        io.reactivex.disposables.b bVar2;
        do {
            bVar2 = get(i10);
            if (bVar2 == DisposableHelper.DISPOSED) {
                bVar.dispose();
                return false;
            }
        } while (!compareAndSet(i10, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        io.reactivex.disposables.b andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                io.reactivex.disposables.b bVar = get(i10);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (bVar != disposableHelper && (andSet = getAndSet(i10, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
