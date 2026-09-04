package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class x implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f52811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f52812c;

    public x(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c cVar, @androidx.annotation.n0 q0 q0Var) {
        this.f52810a = executor;
        this.f52811b = cVar;
        this.f52812c = q0Var;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        this.f52810a.execute(new w(this, kVar));
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
