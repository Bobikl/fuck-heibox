package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class j0<TResult, TContinuationResult> implements g<TContinuationResult>, f, d, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f52772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f52773c;

    public j0(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 j jVar, @androidx.annotation.n0 q0 q0Var) {
        this.f52771a = executor;
        this.f52772b = jVar;
        this.f52773c = q0Var;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        this.f52771a.execute(new i0(this, kVar));
    }

    @Override // com.google.android.gms.tasks.d
    public final void onCanceled() {
        this.f52773c.A();
    }

    @Override // com.google.android.gms.tasks.f
    public final void onFailure(@androidx.annotation.n0 Exception exc) {
        this.f52773c.y(exc);
    }

    @Override // com.google.android.gms.tasks.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f52773c.z(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
