package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class y extends com.google.android.gms.internal.common.i implements k {
    public y() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.i
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.j.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.j.b(parcel);
            F0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.j.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.j.b(parcel);
            b(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.j.a(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.j.b(parcel);
            f0(i14, strongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
