package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IHonorAudioService extends IInterface {

    public static class Default implements IHonorAudioService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public List getSupportedServices() throws RemoteException {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public void init(String str, String str2) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
        public boolean isServiceSupported(int i10) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IHonorAudioService {
        private static final String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAudioService";
        static final int TRANSACTION_getSupportedServices = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isServiceSupported = 2;

        public static class Proxy implements IHonorAudioService {
            public static IHonorAudioService sDefaultImpl;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public List getSupportedServices() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSupportedServices();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public void init(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().init(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService
            public boolean isServiceSupported(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    }
                    boolean zIsServiceSupported = Stub.getDefaultImpl().isServiceSupported(i10);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return zIsServiceSupported;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHonorAudioService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHonorAudioService)) ? new Proxy(iBinder) : (IHonorAudioService) iInterfaceQueryLocalInterface;
        }

        public static IHonorAudioService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorAudioService iHonorAudioService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAudioService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorAudioService;
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
                List supportedServices = getSupportedServices();
                parcel2.writeNoException();
                parcel2.writeList(supportedServices);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsServiceSupported = isServiceSupported(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zIsServiceSupported ? 1 : 0);
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
            init(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    List getSupportedServices() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isServiceSupported(int i10) throws RemoteException;
}
