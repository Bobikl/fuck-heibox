package com.uber.autodispose.android.internal;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MainThreadDisposable.java */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class d implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f104067b = new AtomicBoolean();

    protected abstract void b();

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (this.f104067b.compareAndSet(false, true)) {
            if (b.b()) {
                b();
            } else {
                io.reactivex.android.schedulers.a.c().f(new Runnable() { // from class: com.uber.autodispose.android.internal.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f104066b.b();
                    }
                });
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f104067b.get();
    }
}
