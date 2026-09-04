package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.ml.scan.HmsScan;

/* JADX INFO: loaded from: classes7.dex */
public interface IOnResultCallback extends IInterface {

    public static class Default implements IOnResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
        public void onResult(HmsScan[] hmsScanArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOnResultCallback {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IOnResultCallback";
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IOnResultCallback {
            public static IOnResultCallback sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
            public void onResult(HmsScan[] hmsScanArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedArray(hmsScanArr, 0);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(hmsScanArr);
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

        public static IOnResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOnResultCallback)) ? new Proxy(iBinder) : (IOnResultCallback) iInterfaceQueryLocalInterface;
        }

        public static IOnResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnResultCallback iOnResultCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOnResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iOnResultCallback;
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
            onResult((HmsScan[]) parcel.createTypedArray(HmsScan.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(HmsScan[] hmsScanArr) throws RemoteException;
}
