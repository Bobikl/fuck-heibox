package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e1 extends com.google.android.gms.internal.common.i implements f1 {
    public e1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static f1 N(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof f1 ? (f1) iInterfaceQueryLocalInterface : new d1(iBinder);
    }

    @Override // com.google.android.gms.internal.common.i
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.c cVarE = E();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.j.f(parcel2, cVarE);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iY = y();
            parcel2.writeNoException();
            parcel2.writeInt(iY);
        }
        return true;
    }
}
