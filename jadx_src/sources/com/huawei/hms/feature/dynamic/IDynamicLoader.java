package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IDynamicLoader extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.feature.dynamic.IDynamicLoader";

    public static class Default implements IDynamicLoader {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
        public IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDynamicLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f60656a = 1;

        public static class Proxy implements IDynamicLoader {
            public static IDynamicLoader sDefaultImpl;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f60657a;

            public Proxy(IBinder iBinder) {
                this.f60657a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60657a;
            }

            public String getInterfaceDescriptor() {
                return IDynamicLoader.DESCRIPTOR;
            }

            @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
            public IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
                IObjectWrapper iObjectWrapperAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDynamicLoader.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iObjectWrapper2 != null ? iObjectWrapper2.asBinder() : null);
                    if (this.f60657a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelObtain2.readStrongBinder());
                    } else {
                        iObjectWrapperAsInterface = Stub.getDefaultImpl().load(iObjectWrapper, str, i10, iObjectWrapper2);
                    }
                    return iObjectWrapperAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDynamicLoader.DESCRIPTOR);
        }

        public static IDynamicLoader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDynamicLoader.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDynamicLoader)) ? new Proxy(iBinder) : (IDynamicLoader) iInterfaceQueryLocalInterface;
        }

        public static IDynamicLoader getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDynamicLoader iDynamicLoader) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDynamicLoader == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDynamicLoader;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(IDynamicLoader.DESCRIPTOR);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface(IDynamicLoader.DESCRIPTOR);
            IObjectWrapper iObjectWrapperLoad = load(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iObjectWrapperLoad != null ? iObjectWrapperLoad.asBinder() : null);
            return true;
        }
    }

    IObjectWrapper load(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
