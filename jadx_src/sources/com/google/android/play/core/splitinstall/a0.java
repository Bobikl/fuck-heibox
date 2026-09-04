package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f56224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l0 f56226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(l0 l0Var, com.google.android.gms.tasks.l lVar, int i10, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56226e = l0Var;
        this.f56224c = i10;
        this.f56225d = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            this.f56226e.f56356b.e().d(this.f56226e.f56355a, this.f56224c, l0.o(), new b0(this.f56226e, this.f56225d));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "cancelInstall(%d)", Integer.valueOf(this.f56224c));
            this.f56225d.d(new RuntimeException(e10));
        }
    }
}
