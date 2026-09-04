package com.huawei.hmf.tasks;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    public abstract CancellationToken register(Runnable runnable);
}
