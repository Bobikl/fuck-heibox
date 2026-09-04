package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52757b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private e f52758c;

    public d0(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 e eVar) {
        this.f52756a = executor;
        this.f52758c = eVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        synchronized (this.f52757b) {
            if (this.f52758c == null) {
                return;
            }
            this.f52756a.execute(new c0(this, kVar));
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        synchronized (this.f52757b) {
            this.f52758c = null;
        }
    }
}
