package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class x extends com.google.android.gms.internal.common.a implements k {
    x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.k
    public final void F0(int i10, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelF1 = f1();
        parcelF1.writeInt(i10);
        parcelF1.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.j.d(parcelF1, bundle);
        N(1, parcelF1);
    }

    @Override // com.google.android.gms.common.internal.k
    public final void b(int i10, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.k
    public final void f0(int i10, IBinder iBinder, zzj zzjVar) throws RemoteException {
        throw null;
    }
}
