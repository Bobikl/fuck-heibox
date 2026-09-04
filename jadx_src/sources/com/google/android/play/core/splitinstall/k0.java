package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class k0 extends com.google.android.play.core.splitinstall.internal.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.gms.tasks.l f56346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l0 f56347c;

    k0(l0 l0Var, com.google.android.gms.tasks.l lVar) {
        this.f56347c = l0Var;
        this.f56346b = lVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.p0
    public final void D0(int i10, Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.splitinstall.internal.p0
    public final void E0(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.p0
    public final void H0(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        int i10 = bundle.getInt("error_code");
        l0.f56353c.b("onError(%d)", Integer.valueOf(i10));
        this.f56346b.d(new SplitInstallException(i10));
    }

    public void J0(int i10, Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.splitinstall.internal.p0
    public final void O0(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    public void Q0(int i10, Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    public void R(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onDeferredUninstall", new Object[0]);
    }

    public void V(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    public void Y(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onDeferredLanguageInstall", new Object[0]);
    }

    public void b(int i10, Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    public void c0(Bundle bundle) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onDeferredInstall", new Object[0]);
    }

    public void s0(List list) throws RemoteException {
        this.f56347c.f56356b.u(this.f56346b);
        l0.f56353c.d("onGetSessionStates", new Object[0]);
    }
}
