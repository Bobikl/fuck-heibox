package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f52782b = new b9.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@androidx.annotation.n0 Runnable runnable) {
        this.f52782b.post(runnable);
    }
}
