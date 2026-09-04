package i5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: i5.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1085a extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f119222b = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f119223c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f119224d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f119225e = 3;

        /* JADX INFO: renamed from: i5.a$a$a, reason: collision with other inner class name */
        public static class C1086a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f119226b;

            public C1086a(IBinder iBinder) {
                this.f119226b = iBinder;
            }

            @Override // i5.a
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1085a.f119222b);
                    this.f119226b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // i5.a
            public String a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1085a.f119222b);
                    parcelObtain.writeString(str);
                    this.f119226b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f119226b;
            }

            @Override // i5.a
            public String b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1085a.f119222b);
                    parcelObtain.writeString(str);
                    this.f119226b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC1085a.f119222b;
            }
        }

        public AbstractBinderC1085a() {
            attachInterface(this, f119222b);
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f119222b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1086a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f119222b);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(f119222b);
                String strB = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f119222b);
                return true;
            }
            parcel.enforceInterface(f119222b);
            String strA2 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strA2);
            return true;
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;
}
