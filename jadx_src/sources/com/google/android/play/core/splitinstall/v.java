package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class v extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f56462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l0 f56464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(l0 l0Var, com.google.android.gms.tasks.l lVar, List list, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56464e = l0Var;
        this.f56462c = list;
        this.f56463d = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            this.f56464e.f56356b.e().v(this.f56464e.f56355a, l0.n(this.f56462c), l0.o(), new c0(this.f56464e, this.f56463d));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "deferredInstall(%s)", this.f56462c);
            this.f56463d.d(new RuntimeException(e10));
        }
    }
}
