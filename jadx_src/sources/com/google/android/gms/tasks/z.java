package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class z<TResult, TContinuationResult> implements g<TContinuationResult>, f, d, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f52815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f52816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f52817c;

    public z(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c cVar, @androidx.annotation.n0 q0 q0Var) {
        this.f52815a = executor;
        this.f52816b = cVar;
        this.f52817c = q0Var;
    }

    @Override // com.google.android.gms.tasks.k0
    public final void a(@androidx.annotation.n0 k kVar) {
        this.f52815a.execute(new y(this, kVar));
    }

    @Override // com.google.android.gms.tasks.d
    public final void onCanceled() {
        this.f52817c.A();
    }

    @Override // com.google.android.gms.tasks.f
    public final void onFailure(@androidx.annotation.n0 Exception exc) {
        this.f52817c.y(exc);
    }

    @Override // com.google.android.gms.tasks.g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f52817c.z(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.k0
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
