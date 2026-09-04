package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52762b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private f f52763c;

    public f0(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 f fVar) {
        this.f52761a = executor;
        this.f52763c = fVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        if (kVar.v() || kVar.t()) {
            return;
        }
        synchronized (this.f52762b) {
            if (this.f52763c == null) {
                return;
            }
            this.f52761a.execute(new e0(this, kVar));
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        synchronized (this.f52762b) {
            this.f52763c = null;
        }
    }
}
