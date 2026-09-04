package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class z implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f52575b;

    z(IBinder iBinder) {
        this.f52575b = iBinder;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void S(k kVar, @androidx.annotation.p0 GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                r0.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f52575b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f52575b;
    }
}
