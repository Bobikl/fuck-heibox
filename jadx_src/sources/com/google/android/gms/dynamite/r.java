package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class r extends com.google.android.gms.internal.common.a implements IInterface {
    r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.c q1(com.google.android.gms.dynamic.c cVar, String str, int i10, com.google.android.gms.dynamic.c cVar2) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        parcelF1.writeInt(i10);
        com.google.android.gms.internal.common.j.f(parcelF1, cVar2);
        Parcel parcelG = g(2, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }

    public final com.google.android.gms.dynamic.c r1(com.google.android.gms.dynamic.c cVar, String str, int i10, com.google.android.gms.dynamic.c cVar2) throws RemoteException {
        Parcel parcelF1 = f1();
        com.google.android.gms.internal.common.j.f(parcelF1, cVar);
        parcelF1.writeString(str);
        parcelF1.writeInt(i10);
        com.google.android.gms.internal.common.j.f(parcelF1, cVar2);
        Parcel parcelG = g(3, parcelF1);
        com.google.android.gms.dynamic.c cVarN = com.google.android.gms.dynamic.c.a.N(parcelG.readStrongBinder());
        parcelG.recycle();
        return cVarN;
    }
}
