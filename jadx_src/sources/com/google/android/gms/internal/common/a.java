package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f52704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52705c;

    protected a(IBinder iBinder, String str) {
        this.f52704b = iBinder;
        this.f52705c = str;
    }

    protected final void N(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f52704b.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f52704b;
    }

    protected final Parcel f1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f52705c);
        return parcelObtain;
    }

    protected final Parcel g(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f52704b.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    protected final void r0(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f52704b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
