package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class u1 extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f56327c;

    u1(g gVar) {
        this.f56327c = gVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.q1
    public final void c() {
        synchronized (this.f56327c.f56278f) {
            if (this.f56327c.f56283k.get() > 0 && this.f56327c.f56283k.decrementAndGet() > 0) {
                this.f56327c.f56274b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            g gVar = this.f56327c;
            if (gVar.f56285m != null) {
                gVar.f56274b.d("Unbind from service.", new Object[0]);
                g gVar2 = this.f56327c;
                gVar2.f56273a.unbindService(gVar2.f56284l);
                this.f56327c.f56279g = false;
                this.f56327c.f56285m = null;
                this.f56327c.f56284l = null;
            }
            this.f56327c.w();
        }
    }
}
