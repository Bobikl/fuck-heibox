package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d0 f52755c;

    c0(d0 d0Var, k kVar) {
        this.f52755c = d0Var;
        this.f52754b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f52755c.f52757b) {
            d0 d0Var = this.f52755c;
            if (d0Var.f52758c != null) {
                d0Var.f52758c.a(this.f52754b);
            }
        }
    }
}
