package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements Executor {
    n0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.n0 Runnable runnable) {
        runnable.run();
    }
}
