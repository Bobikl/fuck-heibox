package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f52808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f52809c;

    w(x xVar, k kVar) {
        this.f52809c = xVar;
        this.f52808b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f52808b.t()) {
            this.f52809c.f52812c.A();
            return;
        }
        try {
            this.f52809c.f52812c.z(this.f52809c.f52811b.a(this.f52808b));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f52809c.f52812c.y((Exception) e10.getCause());
            } else {
                this.f52809c.f52812c.y(e10);
            }
        } catch (Exception e11) {
            this.f52809c.f52812c.y(e11);
        }
    }
}
