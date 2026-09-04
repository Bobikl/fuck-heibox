package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class z extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l0 f56477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(l0 l0Var, com.google.android.gms.tasks.l lVar, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56477d = l0Var;
        this.f56476c = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            ?? E = this.f56477d.f56356b.e();
            l0 l0Var = this.f56477d;
            E.n(l0Var.f56355a, new h0(l0Var, this.f56476c));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "getSessionStates", new Object[0]);
            this.f56476c.d(new RuntimeException(e10));
        }
    }
}
