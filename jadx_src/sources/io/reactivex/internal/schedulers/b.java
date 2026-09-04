package io.reactivex.internal.schedulers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DisposeOnCancel.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements Future<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.disposables.b f123681b;

    b(io.reactivex.disposables.b bVar) {
        this.f123681b = bVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        this.f123681b.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
