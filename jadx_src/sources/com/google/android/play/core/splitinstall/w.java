package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.q1;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class w extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f56465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f56466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l0 f56467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(l0 l0Var, com.google.android.gms.tasks.l lVar, List list, com.google.android.gms.tasks.l lVar2) {
        super(lVar);
        this.f56467e = l0Var;
        this.f56465c = list;
        this.f56466d = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.n0] */
    @Override // com.google.android.play.core.splitinstall.internal.q1
    protected final void c() {
        try {
            this.f56467e.f56356b.e().K(this.f56467e.f56355a, l0.m(this.f56465c), l0.o(), new d0(this.f56467e, this.f56466d));
        } catch (RemoteException e10) {
            l0.f56353c.c(e10, "deferredLanguageInstall(%s)", this.f56465c);
            this.f56466d.d(new RuntimeException(e10));
        }
    }
}
