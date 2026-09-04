package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface g extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30137b = "anetwork.channel.aidl.ParcelableNetworkListener";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30138c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30139d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f30140e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f30141f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f30142g = 5;

        /* JADX INFO: renamed from: anetwork.channel.aidl.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0251a implements g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30143b;

            C0251a(IBinder iBinder) {
                this.f30143b = iBinder;
            }

            @Override // anetwork.channel.aidl.g
            public byte C0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30137b);
                    this.f30143b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readByte();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.g
            public void Q(DefaultProgressEvent defaultProgressEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30137b);
                    if (defaultProgressEvent != null) {
                        parcelObtain.writeInt(1);
                        defaultProgressEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f30143b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30143b;
            }

            @Override // anetwork.channel.aidl.g
            public void j(f fVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30137b);
                    parcelObtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f30143b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.g
            public boolean s(int i10, ParcelableHeader parcelableHeader) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30137b);
                    parcelObtain.writeInt(i10);
                    if (parcelableHeader != null) {
                        parcelObtain.writeInt(1);
                        parcelableHeader.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f30143b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.g
            public void x0(DefaultFinishEvent defaultFinishEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30137b);
                    if (defaultFinishEvent != null) {
                        parcelObtain.writeInt(1);
                        defaultFinishEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f30143b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30137b);
        }

        public static g g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30137b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0251a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f30137b);
                Q(parcel.readInt() != 0 ? DefaultProgressEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(f30137b);
                x0(parcel.readInt() != 0 ? DefaultFinishEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface(f30137b);
                boolean zS = s(parcel.readInt(), parcel.readInt() != 0 ? ParcelableHeader.f30042d.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            }
            if (i10 == 4) {
                parcel.enforceInterface(f30137b);
                j(f.a.g(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 5) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f30137b);
                return true;
            }
            parcel.enforceInterface(f30137b);
            byte bC0 = C0();
            parcel2.writeNoException();
            parcel2.writeByte(bC0);
            return true;
        }
    }

    byte C0() throws RemoteException;

    void Q(DefaultProgressEvent defaultProgressEvent) throws RemoteException;

    void j(f fVar) throws RemoteException;

    boolean s(int i10, ParcelableHeader parcelableHeader) throws RemoteException;

    void x0(DefaultFinishEvent defaultFinishEvent) throws RemoteException;
}
