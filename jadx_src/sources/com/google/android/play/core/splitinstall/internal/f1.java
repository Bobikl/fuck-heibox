package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class f1 implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f56270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f56271c = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    protected f1(IBinder iBinder, String str) {
        this.f56270b = iBinder;
    }

    protected final Parcel N() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f56271c);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f56270b;
    }

    protected final void r0(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f56270b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
