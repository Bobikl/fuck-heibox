package com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface TPDownloadProxyFactoryAidl extends IInterface {

    public static abstract class Stub extends Binder implements TPDownloadProxyFactoryAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl";
        static final int TRANSACTION_getNativeVersion = 4;
        static final int TRANSACTION_getTPDownloadProxy = 1;
        static final int TRANSACTION_isReadyForDownload = 3;
        static final int TRANSACTION_isReadyForPlay = 2;

        public static class Proxy implements TPDownloadProxyFactoryAidl {
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

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public String getNativeVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public ITPDownloadProxyAidl getTPDownloadProxy(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return ITPDownloadProxyAidl.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public boolean isReadyForDownload() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
            public boolean isReadyForPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static TPDownloadProxyFactoryAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof TPDownloadProxyFactoryAidl)) ? new Proxy(iBinder) : (TPDownloadProxyFactoryAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                ITPDownloadProxyAidl tPDownloadProxy = getTPDownloadProxy(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(tPDownloadProxy != null ? tPDownloadProxy.asBinder() : null);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsReadyForPlay = isReadyForPlay();
                parcel2.writeNoException();
                parcel2.writeInt(zIsReadyForPlay ? 1 : 0);
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsReadyForDownload = isReadyForDownload();
                parcel2.writeNoException();
                parcel2.writeInt(zIsReadyForDownload ? 1 : 0);
                return true;
            }
            if (i10 != 4) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String nativeVersion = getNativeVersion();
            parcel2.writeNoException();
            parcel2.writeString(nativeVersion);
            return true;
        }
    }

    String getNativeVersion() throws RemoteException;

    ITPDownloadProxyAidl getTPDownloadProxy(int i10) throws RemoteException;

    boolean isReadyForDownload() throws RemoteException;

    boolean isReadyForPlay() throws RemoteException;
}
