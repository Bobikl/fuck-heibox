package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface h extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30144b = "anetwork.channel.aidl.RemoteNetwork";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30145c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30146d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f30147e = 3;

        /* JADX INFO: renamed from: anetwork.channel.aidl.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0252a implements h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30148b;

            C0252a(IBinder iBinder) {
                this.f30148b = iBinder;
            }

            @Override // anetwork.channel.aidl.h
            public NetworkResponse Z0(ParcelableRequest parcelableRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30144b);
                    if (parcelableRequest != null) {
                        parcelObtain.writeInt(1);
                        parcelableRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f30148b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? NetworkResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30148b;
            }

            @Override // anetwork.channel.aidl.h
            public e o(ParcelableRequest parcelableRequest, g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30144b);
                    if (parcelableRequest != null) {
                        parcelObtain.writeInt(1);
                        parcelableRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f30148b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return e.a.g(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.h
            public anetwork.channel.aidl.a u(ParcelableRequest parcelableRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30144b);
                    if (parcelableRequest != null) {
                        parcelObtain.writeInt(1);
                        parcelableRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f30148b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return anetwork.channel.aidl.a.AbstractBinderC0245a.q1(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30144b);
        }

        public static h g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30144b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new C0252a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f30144b);
                NetworkResponse networkResponseZ0 = Z0(parcel.readInt() != 0 ? ParcelableRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (networkResponseZ0 != null) {
                    parcel2.writeInt(1);
                    networkResponseZ0.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(f30144b);
                e eVarO = o(parcel.readInt() != 0 ? ParcelableRequest.CREATOR.createFromParcel(parcel) : null, g.a.g(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarO != null ? eVarO.asBinder() : null);
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f30144b);
                return true;
            }
            parcel.enforceInterface(f30144b);
            anetwork.channel.aidl.a aVarU = u(parcel.readInt() != 0 ? ParcelableRequest.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(aVarU != null ? aVarU.asBinder() : null);
            return true;
        }
    }

    NetworkResponse Z0(ParcelableRequest parcelableRequest) throws RemoteException;

    e o(ParcelableRequest parcelableRequest, g gVar) throws RemoteException;

    anetwork.channel.aidl.a u(ParcelableRequest parcelableRequest) throws RemoteException;
}
