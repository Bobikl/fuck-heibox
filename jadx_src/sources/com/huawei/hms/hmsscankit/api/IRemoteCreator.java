package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes7.dex */
public interface IRemoteCreator extends IInterface {

    public static class Default implements IRemoteCreator {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteCreator {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteCreator";
        static final int TRANSACTION_newRemoteDecoderDelegate = 2;
        static final int TRANSACTION_newRemoteHmsDecoderDelegate = 3;
        static final int TRANSACTION_newRemoteViewDelegate = 1;

        public static class Proxy implements IRemoteCreator {
            public static IRemoteCreator sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newRemoteDecoderDelegate();
                    }
                    parcelObtain2.readException();
                    return IRemoteDecoderDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newRemoteHmsDecoderDelegate();
                    }
                    parcelObtain2.readException();
                    return IRemoteHmsDecoderDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeStrongBinder(iObjectWrapper2 != null ? iObjectWrapper2.asBinder() : null);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newRemoteViewDelegate(iObjectWrapper, iObjectWrapper2);
                    }
                    parcelObtain2.readException();
                    return IRemoteViewDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteCreator)) ? new Proxy(iBinder) : (IRemoteCreator) iInterfaceQueryLocalInterface;
        }

        public static IRemoteCreator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteCreator iRemoteCreator) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteCreator == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteCreator;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                IRemoteViewDelegate iRemoteViewDelegateNewRemoteViewDelegate = newRemoteViewDelegate(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iRemoteViewDelegateNewRemoteViewDelegate != null ? iRemoteViewDelegateNewRemoteViewDelegate.asBinder() : null);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                IRemoteDecoderDelegate iRemoteDecoderDelegateNewRemoteDecoderDelegate = newRemoteDecoderDelegate();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iRemoteDecoderDelegateNewRemoteDecoderDelegate != null ? iRemoteDecoderDelegateNewRemoteDecoderDelegate.asBinder() : null);
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
            IRemoteHmsDecoderDelegate iRemoteHmsDecoderDelegateNewRemoteHmsDecoderDelegate = newRemoteHmsDecoderDelegate();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iRemoteHmsDecoderDelegateNewRemoteHmsDecoderDelegate != null ? iRemoteHmsDecoderDelegateNewRemoteHmsDecoderDelegate.asBinder() : null);
            return true;
        }
    }

    IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException;

    IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException;

    IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
