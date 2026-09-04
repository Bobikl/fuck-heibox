package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final IBinder f52529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ d f52530h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.g
    public l0(d dVar, @androidx.annotation.p0 int i10, @androidx.annotation.p0 IBinder iBinder, Bundle bundle) {
        super(dVar, i10, bundle);
        this.f52530h = dVar;
        this.f52529g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.w
    protected final void f(ConnectionResult connectionResult) {
        if (this.f52530h.f52496v != null) {
            this.f52530h.f52496v.a(connectionResult);
        }
        this.f52530h.J(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.w
    protected final boolean g() {
        try {
            IBinder iBinder = this.f52529g;
            p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f52530h.z().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f52530h.z() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceD = this.f52530h.d(this.f52529g);
            if (iInterfaceD == null || !(d.i0(this.f52530h, 2, 4, iInterfaceD) || d.i0(this.f52530h, 3, 4, iInterfaceD))) {
                return false;
            }
            this.f52530h.f52500z = null;
            Bundle bundleM = this.f52530h.m();
            d dVar = this.f52530h;
            if (dVar.f52495u == null) {
                return true;
            }
            dVar.f52495u.a(bundleM);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
