package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IRemoteServiceCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        public static final String DESCRIPTOR = "com.alipay.android.app.IRemoteServiceCallback";
        public static final int TRANSACTION_getVersion = 4;
        public static final int TRANSACTION_isHideLoadingScreen = 3;
        public static final int TRANSACTION_payEnd = 2;
        public static final int TRANSACTION_r03 = 5;
        public static final int TRANSACTION_startActivity = 1;

        public static class a implements IRemoteServiceCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f38057b;

            public a(IBinder iBinder) {
                this.f38057b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38057b;
            }

            public String d() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public int getVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f38057b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public boolean isHideLoadingScreen() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f38057b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void payEnd(boolean z10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.f38057b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void r03(String str, String str2, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeMap(map);
                    this.f38057b.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public void startActivity(String str, String str2, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i10);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f38057b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteServiceCallback)) ? new a(iBinder) : (IRemoteServiceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            if (i10 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                startActivity(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                payEnd(parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsHideLoadingScreen = isHideLoadingScreen();
                parcel2.writeNoException();
                parcel2.writeInt(zIsHideLoadingScreen ? 1 : 0);
                return true;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel.enforceInterface(DESCRIPTOR);
                r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int version = getVersion();
            parcel2.writeNoException();
            parcel2.writeInt(version);
            return true;
        }
    }

    int getVersion() throws RemoteException;

    boolean isHideLoadingScreen() throws RemoteException;

    void payEnd(boolean z10, String str) throws RemoteException;

    void r03(String str, String str2, Map map) throws RemoteException;

    void startActivity(String str, String str2, int i10, Bundle bundle) throws RemoteException;
}
