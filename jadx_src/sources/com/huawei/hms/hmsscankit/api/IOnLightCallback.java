package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IOnLightCallback extends IInterface {

    public static class Default implements IOnLightCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IOnLightCallback
        public void onVisibleChanged(boolean z10) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOnLightCallback {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IOnLightCallback";
        static final int TRANSACTION_onVisibleChanged = 1;

        public static class Proxy implements IOnLightCallback {
            public static IOnLightCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.huawei.hms.hmsscankit.api.IOnLightCallback
            public void onVisibleChanged(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onVisibleChanged(z10);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnLightCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOnLightCallback)) ? new Proxy(iBinder) : (IOnLightCallback) iInterfaceQueryLocalInterface;
        }

        public static IOnLightCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnLightCallback iOnLightCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOnLightCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iOnLightCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onVisibleChanged(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void onVisibleChanged(boolean z10) throws RemoteException;
}
