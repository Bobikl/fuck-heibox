package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class y extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f56472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l0 f56474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(l0 l0Var, com.google.android.gms.tasks.l lVar, int i10, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56474e = l0Var;
        this.f56472c = i10;
        this.f56473d = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            ?? E = this.f56474e.f56356b.e();
            l0 l0Var = this.f56474e;
            E.p(l0Var.f56355a, this.f56472c, new g0(l0Var, this.f56473d));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "getSessionState(%d)", Integer.valueOf(this.f56472c));
            this.f56473d.d(new RuntimeException(e10));
        }
    }
}
