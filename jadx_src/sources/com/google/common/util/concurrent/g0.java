package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ForwardingListeningExecutorService.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.a
@o9.c
public abstract class g0 extends c0 implements u0 {
    protected g0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.c0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract u0 X0();

    @Override // com.google.common.util.concurrent.c0, java.util.concurrent.ExecutorService
    public p0<?> submit(Runnable runnable) {
        return X0().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.c0, java.util.concurrent.ExecutorService
    public <T> p0<T> submit(Runnable runnable, @b1 T t10) {
        return X0().submit(runnable, (Object) t10);
    }

    @Override // com.google.common.util.concurrent.c0, java.util.concurrent.ExecutorService
    public <T> p0<T> submit(Callable<T> callable) {
        return X0().submit((Callable) callable);
    }
}
