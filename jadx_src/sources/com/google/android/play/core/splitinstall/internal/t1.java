package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class t1 extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ q1 f56325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f56326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t1(g gVar, com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.l lVar2, q1 q1Var) {
        super(lVar);
        this.f56326e = gVar;
        this.f56324c = lVar2;
        this.f56325d = q1Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.q1
    public final void c() {
        synchronized (this.f56326e.f56278f) {
            g.n(this.f56326e, this.f56324c);
            if (this.f56326e.f56283k.getAndIncrement() > 0) {
                this.f56326e.f56274b.d("Already connected to the service.", new Object[0]);
            }
            g.p(this.f56326e, this.f56325d);
        }
    }
}
