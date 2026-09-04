package com.google.android.play.core.splitinstall.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class g1 extends Binder implements IInterface {
    protected g1(String str) {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    protected boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return g(i10, parcel, parcel2, i11);
    }
}
