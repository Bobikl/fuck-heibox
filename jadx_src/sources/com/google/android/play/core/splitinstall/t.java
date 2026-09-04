package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class t extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Collection f56382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Collection f56383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.i1 f56384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ l0 f56386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(l0 l0Var, com.google.android.gms.tasks.l lVar, Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.i1 i1Var, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56386g = l0Var;
        this.f56382c = collection;
        this.f56383d = collection2;
        this.f56384e = i1Var;
        this.f56385f = lVar2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        ArrayList arrayListN = l0.n(this.f56382c);
        arrayListN.addAll(l0.m(this.f56383d));
        try {
            this.f56384e.b(2);
            this.f56386g.f56356b.e().X0(this.f56386g.f56355a, arrayListN, l0.b(this.f56384e), new j0(this.f56386g, this.f56385f));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "startInstall(%s,%s)", this.f56382c, this.f56383d);
            this.f56385f.d(new RuntimeException(e10));
        }
    }
}
