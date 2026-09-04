package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends com.google.android.gms.internal.common.a implements f1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.f1
    public final com.google.android.gms.dynamic.c E() throws RemoteException {
        Parcel parcelG = g(1, f1());
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }

    @Override // com.google.android.gms.common.internal.f1
    public final int y() throws RemoteException {
        Parcel parcelG = g(2, f1());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }
}
