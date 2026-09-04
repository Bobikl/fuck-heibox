package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface IHonorEarReturnService extends IInterface {

    public static class Default implements IHonorEarReturnService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void destroy() throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int enableEarReturn(boolean z10) throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int getEarReturnLatency() throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void init(String str) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public boolean isSupported(int i10) throws RemoteException {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int setParameter(String str, int i10) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IHonorEarReturnService {
        private static final String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnEarReturnService";
        static final int TRANSACTION_destroy = 6;
        static final int TRANSACTION_enableEarReturn = 2;
        static final int TRANSACTION_getEarReturnLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_setParameter = 4;

        public static class Proxy implements IHonorEarReturnService {
            public static IHonorEarReturnService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int enableEarReturn(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableEarReturn(z10);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int getEarReturnLatency() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEarReturnLatency();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().init(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public boolean isSupported(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    }
                    boolean zIsSupported = Stub.getDefaultImpl().isSupported(i10);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return zIsSupported;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int setParameter(String str, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setParameter(str, i10);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHonorEarReturnService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHonorEarReturnService)) ? new Proxy(iBinder) : (IHonorEarReturnService) iInterfaceQueryLocalInterface;
        }

        public static IHonorEarReturnService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorEarReturnService iHonorEarReturnService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorEarReturnService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorEarReturnService;
            return true;
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
            switch (i10) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsSupported = isSupported(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupported ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iEnableEarReturn = enableEarReturn(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iEnableEarReturn);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int earReturnLatency = getEarReturnLatency();
                    parcel2.writeNoException();
                    parcel2.writeInt(earReturnLatency);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int parameter = setParameter(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(parameter);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    init(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void destroy() throws RemoteException;

    int enableEarReturn(boolean z10) throws RemoteException;

    int getEarReturnLatency() throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isSupported(int i10) throws RemoteException;

    int setParameter(String str, int i10) throws RemoteException;
}
