package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends com.google.android.gms.internal.common.a implements c0 {
    a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.c0
    public final boolean B() throws RemoteException {
        Parcel parcelG = g(7, f1());
        boolean zG = com.google.android.gms.internal.common.j.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final boolean D() throws RemoteException {
        Parcel parcelG = g(9, f1());
        boolean zG = com.google.android.gms.internal.common.j.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final boolean T0(zzs zzsVar, com.google.android.gms.dynamic.c cVar) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.d(parcelF1, zzsVar);
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        Parcel parcelG = g(5, parcelF1);
        boolean zG = com.google.android.gms.internal.common.j.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final zzq a0(zzo zzoVar) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.d(parcelF1, zzoVar);
        Parcel parcelG = g(6, parcelF1);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.j.a(parcelG, zzq.CREATOR);
        parcelG.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final zzq d0(zzo zzoVar) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.d(parcelF1, zzoVar);
        Parcel parcelG = g(8, parcelF1);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.j.a(parcelG, zzq.CREATOR);
        parcelG.recycle();
        return zzqVar;
    }
}
