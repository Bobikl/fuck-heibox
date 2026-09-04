package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52767b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private g f52768c;

    public h0(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 g gVar) {
        this.f52766a = executor;
        this.f52768c = gVar;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        if (kVar.v()) {
            synchronized (this.f52767b) {
                if (this.f52768c == null) {
                    return;
                }
                this.f52766a.execute(new g0(this, kVar));
            }
        }
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        synchronized (this.f52767b) {
            this.f52768c = null;
        }
    }
}
