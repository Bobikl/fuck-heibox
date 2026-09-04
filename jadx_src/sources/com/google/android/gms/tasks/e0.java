package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f0 f52760c;

    e0(f0 f0Var, k kVar) {
        this.f52760c = f0Var;
        this.f52759b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f52760c.f52762b) {
            f0 f0Var = this.f52760c;
            if (f0Var.f52763c != null) {
                f0Var.f52763c.onFailure((Exception) com.google.android.gms.common.internal.p.l(this.f52759b.q()));
            }
        }
    }
}
