package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j0 f52770c;

    i0(j0 j0Var, k kVar) {
        this.f52770c = j0Var;
        this.f52769b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            k kVarThen = this.f52770c.f52772b.then(this.f52769b.r());
            if (kVarThen == null) {
                this.f52770c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = m.f52779b;
            kVarThen.l(executor, this.f52770c);
            kVarThen.i(executor, this.f52770c);
            kVarThen.c(executor, this.f52770c);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f52770c.onFailure((Exception) e10.getCause());
            } else {
                this.f52770c.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.f52770c.onCanceled();
        } catch (Exception e11) {
            this.f52770c.onFailure(e11);
        }
    }
}
