package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface d extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30118b = "anetwork.channel.aidl.ParcelableBodyHandler";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30119c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30120d = 2;

        /* JADX INFO: renamed from: anetwork.channel.aidl.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0248a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30121b;

            C0248a(IBinder iBinder) {
                this.f30121b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30121b;
            }

            @Override // anetwork.channel.aidl.d
            public int read(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30118b);
                    parcelObtain.writeByteArray(bArr);
                    this.f30121b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.d
            public boolean x() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30118b);
                    this.f30121b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30118b);
        }

        public static d g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30118b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0248a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f30118b);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i12 = read(bArrCreateByteArray);
                parcel2.writeNoException();
                parcel2.writeInt(i12);
                parcel2.writeByteArray(bArrCreateByteArray);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f30118b);
                return true;
            }
            parcel.enforceInterface(f30118b);
            boolean zX = x();
            parcel2.writeNoException();
            parcel2.writeInt(zX ? 1 : 0);
            return true;
        }
    }

    int read(byte[] bArr) throws RemoteException;

    boolean x() throws RemoteException;
}
