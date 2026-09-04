package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.ml.scan.HmsScan;

/* JADX INFO: loaded from: classes7.dex */
public interface IRemoteViewDelegate extends IInterface {

    public static class Default implements IRemoteViewDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public boolean getLightStatus() throws RemoteException {
            return false;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public IObjectWrapper getView() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onCreate(Bundle bundle) throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onDestroy() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onPause() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onResume() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onStart() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onStop() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void pauseContinuouslyScan() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void resumeContinuouslyScan() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnClickListener(IObjectWrapper iObjectWrapper) throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnResultCallback(IOnResultCallback iOnResultCallback) throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void turnOffLight() throws RemoteException {
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void turnOnLight() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemoteViewDelegate {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate";
        static final int TRANSACTION_decodeWithBitmap = 12;
        static final int TRANSACTION_getLightStatus = 14;
        static final int TRANSACTION_getView = 1;
        static final int TRANSACTION_onCreate = 2;
        static final int TRANSACTION_onDestroy = 3;
        static final int TRANSACTION_onPause = 4;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onStart = 6;
        static final int TRANSACTION_onStop = 7;
        static final int TRANSACTION_pauseContinuouslyScan = 16;
        static final int TRANSACTION_resumeContinuouslyScan = 15;
        static final int TRANSACTION_setOnClickListener = 9;
        static final int TRANSACTION_setOnErrorCallback = 17;
        static final int TRANSACTION_setOnLightVisbleCallBack = 13;
        static final int TRANSACTION_setOnResultCallback = 8;
        static final int TRANSACTION_turnOffLight = 11;
        static final int TRANSACTION_turnOnLight = 10;

        public static class Proxy implements IRemoteViewDelegate {
            public static IRemoteViewDelegate sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeStrongBinder(iObjectWrapper2 != null ? iObjectWrapper2.asBinder() : null);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().decodeWithBitmap(iObjectWrapper, iObjectWrapper2);
                    }
                    parcelObtain2.readException();
                    return (HmsScan[]) parcelObtain2.createTypedArray(HmsScan.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public boolean getLightStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLightStatus();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public IObjectWrapper getView() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getView();
                    }
                    parcelObtain2.readException();
                    return IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onCreate(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onDestroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDestroy();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPause();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onResume() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResume();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStart();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStop();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void pauseContinuouslyScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().pauseContinuouslyScan();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void resumeContinuouslyScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().resumeContinuouslyScan();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnClickListener(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setOnClickListener(iObjectWrapper);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iOnErrorCallback != null ? iOnErrorCallback.asBinder() : null);
                    if (this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setOnErrorCallback(iOnErrorCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iOnLightCallback != null ? iOnLightCallback.asBinder() : null);
                    if (this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setOnLightVisbleCallBack(iOnLightCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnResultCallback(IOnResultCallback iOnResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iOnResultCallback != null ? iOnResultCallback.asBinder() : null);
                    if (this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setOnResultCallback(iOnResultCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void turnOffLight() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().turnOffLight();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void turnOnLight() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().turnOnLight();
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

        public static IRemoteViewDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteViewDelegate)) ? new Proxy(iBinder) : (IRemoteViewDelegate) iInterfaceQueryLocalInterface;
        }

        public static IRemoteViewDelegate getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteViewDelegate iRemoteViewDelegate) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteViewDelegate == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteViewDelegate;
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
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(view != null ? view.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCreate(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onResume();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onStop();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnResultCallback(IOnResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnClickListener(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    turnOnLight();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    turnOffLight();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    HmsScan[] hmsScanArrDecodeWithBitmap = decodeWithBitmap(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(hmsScanArrDecodeWithBitmap, 1);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnLightVisbleCallBack(IOnLightCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean lightStatus = getLightStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(lightStatus ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    resumeContinuouslyScan();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    pauseContinuouslyScan();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnErrorCallback(IOnErrorCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    boolean getLightStatus() throws RemoteException;

    IObjectWrapper getView() throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void pauseContinuouslyScan() throws RemoteException;

    void resumeContinuouslyScan() throws RemoteException;

    void setOnClickListener(IObjectWrapper iObjectWrapper) throws RemoteException;

    void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) throws RemoteException;

    void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) throws RemoteException;

    void setOnResultCallback(IOnResultCallback iOnResultCallback) throws RemoteException;

    void turnOffLight() throws RemoteException;

    void turnOnLight() throws RemoteException;
}
