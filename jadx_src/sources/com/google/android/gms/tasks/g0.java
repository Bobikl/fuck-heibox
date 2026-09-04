package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ h0 f52765c;

    g0(h0 h0Var, k kVar) {
        this.f52765c = h0Var;
        this.f52764b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f52765c.f52767b) {
            h0 h0Var = this.f52765c;
            if (h0Var.f52768c != null) {
                h0Var.f52768c.onSuccess(this.f52764b.r());
            }
        }
    }
}
