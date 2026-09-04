package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class u extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f56459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l0 f56461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(l0 l0Var, com.google.android.gms.tasks.l lVar, List list, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56461e = l0Var;
        this.f56459c = list;
        this.f56460d = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            this.f56461e.f56356b.e().S0(this.f56461e.f56355a, l0.n(this.f56459c), l0.o(), new f0(this.f56461e, this.f56460d));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "deferredUninstall(%s)", this.f56459c);
            this.f56460d.d(new RuntimeException(e10));
        }
    }
}
