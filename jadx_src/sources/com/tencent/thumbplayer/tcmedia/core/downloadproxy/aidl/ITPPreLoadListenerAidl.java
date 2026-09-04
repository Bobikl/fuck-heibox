package com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPPreLoadListenerAidl extends IInterface {

    public static abstract class Stub extends Binder implements ITPPreLoadListenerAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl";
        static final int TRANSACTION_onPrepareDownloadProgressUpdate = 3;
        static final int TRANSACTION_onPrepareError = 2;
        static final int TRANSACTION_onPrepareOK = 1;

        public static class Proxy implements ITPPreLoadListenerAidl {
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

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    parcelObtain.writeLong(j11);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareError(int i10, int i11, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPreLoadListenerAidl
            public void onPrepareOK() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
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

        public static ITPPreLoadListenerAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITPPreLoadListenerAidl)) ? new Proxy(iBinder) : (ITPPreLoadListenerAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareOK();
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onPrepareError(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onPrepareDownloadProgressUpdate(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onPrepareDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) throws RemoteException;

    void onPrepareError(int i10, int i11, String str) throws RemoteException;

    void onPrepareOK() throws RemoteException;
}
