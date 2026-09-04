package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f52749b;

    a0(b0 b0Var) {
        this.f52749b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f52749b.f52752b) {
            b0 b0Var = this.f52749b;
            if (b0Var.f52753c != null) {
                b0Var.f52753c.onCanceled();
            }
        }
    }
}
