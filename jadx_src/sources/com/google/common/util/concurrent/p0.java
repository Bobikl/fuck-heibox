package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: ListenableFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@s9.f("Use the methods in Futures (like immediateFuture) or SettableFuture")
public interface p0<V> extends Future<V> {
    void V(Runnable runnable, Executor executor);
}
