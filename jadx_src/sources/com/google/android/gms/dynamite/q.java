package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class q extends com.google.android.gms.internal.common.a implements IInterface {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int q1() throws RemoteException {
        Parcel parcelG = g(6, f1());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final int r1(com.google.android.gms.dynamic.c cVar, String str, boolean z10) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        com.google.android.gms.internal.common.j.c(parcelF1, z10);
        Parcel parcelG = g(3, parcelF1);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final int s1(com.google.android.gms.dynamic.c cVar, String str, boolean z10) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        com.google.android.gms.internal.common.j.c(parcelF1, z10);
        Parcel parcelG = g(5, parcelF1);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final com.google.android.gms.dynamic.c t1(com.google.android.gms.dynamic.c cVar, String str, int i10) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        parcelF1.writeInt(i10);
        Parcel parcelG = g(2, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }

    public final com.google.android.gms.dynamic.c u1(com.google.android.gms.dynamic.c cVar, String str, int i10, com.google.android.gms.dynamic.c cVar2) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        parcelF1.writeInt(i10);
        com.google.android.gms.internal.common.j.f(parcelF1, cVar2);
        Parcel parcelG = g(8, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }

    public final com.google.android.gms.dynamic.c v1(com.google.android.gms.dynamic.c cVar, String str, int i10) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        parcelF1.writeInt(i10);
        Parcel parcelG = g(4, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }

    public final com.google.android.gms.dynamic.c w1(com.google.android.gms.dynamic.c cVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        com.google.android.gms.internal.common.j.c(parcelF1, z10);
        parcelF1.writeLong(j10);
        Parcel parcelG = g(7, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }
}
