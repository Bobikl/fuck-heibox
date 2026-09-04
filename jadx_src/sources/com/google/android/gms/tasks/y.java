package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f52814c;

    y(z zVar, k kVar) {
        this.f52814c = zVar;
        this.f52813b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            k kVar = (k) this.f52814c.f52816b.a(this.f52813b);
            if (kVar == null) {
                this.f52814c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = m.f52779b;
            kVar.l(executor, this.f52814c);
            kVar.i(executor, this.f52814c);
            kVar.c(executor, this.f52814c);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f52814c.f52817c.y((Exception) e10.getCause());
            } else {
                this.f52814c.f52817c.y(e10);
            }
        } catch (Exception e11) {
            this.f52814c.f52817c.y(e11);
        }
    }
}
