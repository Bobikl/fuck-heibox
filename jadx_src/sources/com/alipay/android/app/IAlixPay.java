package com.alipay.android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IAlixPay extends IInterface {

    public static abstract class Stub extends Binder implements IAlixPay {
        public static final String DESCRIPTOR = "com.alipay.android.app.IAlixPay";
        public static final int TRANSACTION_Pay = 1;
        public static final int TRANSACTION_deployFastConnect = 6;
        public static final int TRANSACTION_getVersion = 8;
        public static final int TRANSACTION_manager = 7;
        public static final int TRANSACTION_pay02 = 9;
        public static final int TRANSACTION_prePay = 5;
        public static final int TRANSACTION_r03 = 10;
        public static final int TRANSACTION_registerCallback = 3;
        public static final int TRANSACTION_registerCallback03 = 11;
        public static final int TRANSACTION_test = 2;
        public static final int TRANSACTION_unregisterCallback = 4;

        public static class a implements IAlixPay {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f38056b;

            public a(IBinder iBinder) {
                this.f38056b = iBinder;
            }

            @Override // com.alipay.android.app.IAlixPay
            public String Pay(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f38056b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38056b;
            }

            public String d() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.alipay.android.app.IAlixPay
            public void deployFastConnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f38056b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public int getVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f38056b.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public boolean manager(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f38056b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String pay02(String str, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeMap(map);
                    this.f38056b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String prePay(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f38056b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void r03(String str, String str2, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeMap(map);
                    this.f38056b.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemoteServiceCallback != null ? iRemoteServiceCallback.asBinder() : null);
                    this.f38056b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemoteServiceCallback != null ? iRemoteServiceCallback.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeMap(map);
                    this.f38056b.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public String test() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f38056b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IAlixPay
            public void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemoteServiceCallback != null ? iRemoteServiceCallback.asBinder() : null);
                    this.f38056b.transact(4, parcelObtain, parcelObtain2, 0);
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

        public static IAlixPay asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAlixPay)) ? new a(iBinder) : (IAlixPay) iInterfaceQueryLocalInterface;
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
                    String strPay = Pay(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strPay);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strTest = test();
                    parcel2.writeNoException();
                    parcel2.writeString(strTest);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strPrePay = prePay(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strPrePay);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    deployFastConnect();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zManager = manager(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zManager ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strPay02 = pay02(parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strPay02);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    r03(parcel.readString(), parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallback03(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readHashMap(Stub.class.getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    String Pay(String str) throws RemoteException;

    void deployFastConnect() throws RemoteException;

    int getVersion() throws RemoteException;

    boolean manager(String str) throws RemoteException;

    String pay02(String str, Map map) throws RemoteException;

    String prePay(String str) throws RemoteException;

    void r03(String str, String str2, Map map) throws RemoteException;

    void registerCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;

    void registerCallback03(IRemoteServiceCallback iRemoteServiceCallback, String str, Map map) throws RemoteException;

    String test() throws RemoteException;

    void unregisterCallback(IRemoteServiceCallback iRemoteServiceCallback) throws RemoteException;
}
