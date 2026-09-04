package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface f extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30128b = "anetwork.channel.aidl.ParcelableInputStream";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30129c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30130d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f30131e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f30132f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f30133g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f30134h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f30135i = 7;

        /* JADX INFO: renamed from: anetwork.channel.aidl.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0250a implements f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30136b;

            C0250a(IBinder iBinder) {
                this.f30136b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30136b;
            }

            @Override // anetwork.channel.aidl.f
            public int available() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    this.f30136b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public int b0(byte[] bArr, int i10, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f30136b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i12 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i12;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public long c(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    parcelObtain.writeInt(i10);
                    this.f30136b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public void close() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    this.f30136b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public int length() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    this.f30136b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public int read(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    this.f30136b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.f
            public int readByte() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30128b);
                    this.f30136b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30128b);
        }

        public static f g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30128b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C0250a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            byte[] bArr;
            if (i10 == 1598968902) {
                parcel2.writeString(f30128b);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f30128b);
                    int iAvailable = available();
                    parcel2.writeNoException();
                    parcel2.writeInt(iAvailable);
                    return true;
                case 2:
                    parcel.enforceInterface(f30128b);
                    close();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(f30128b);
                    int i12 = readByte();
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 4:
                    parcel.enforceInterface(f30128b);
                    int i13 = parcel.readInt();
                    bArr = i13 >= 0 ? new byte[i13] : null;
                    int iB0 = b0(bArr, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iB0);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 5:
                    parcel.enforceInterface(f30128b);
                    int i14 = parcel.readInt();
                    bArr = i14 >= 0 ? new byte[i14] : null;
                    int i15 = read(bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(i15);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 6:
                    parcel.enforceInterface(f30128b);
                    long jC = c(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jC);
                    return true;
                case 7:
                    parcel.enforceInterface(f30128b);
                    int length = length();
                    parcel2.writeNoException();
                    parcel2.writeInt(length);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    int available() throws RemoteException;

    int b0(byte[] bArr, int i10, int i11) throws RemoteException;

    long c(int i10) throws RemoteException;

    void close() throws RemoteException;

    int length() throws RemoteException;

    int read(byte[] bArr) throws RemoteException;

    int readByte() throws RemoteException;
}
