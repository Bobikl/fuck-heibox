package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52752b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private d f52753c;

    public b0(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 d dVar) {
        this.f52751a = executor;
        this.f52753c = dVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        if (kVar.t()) {
            synchronized (this.f52752b) {
                if (this.f52753c == null) {
                    return;
                }
                this.f52751a.execute(new a0(this));
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        synchronized (this.f52752b) {
            this.f52753c = null;
        }
    }
}
