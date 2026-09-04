package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a0 extends IInterface {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f27025v0 = "androidx.room.IMultiInstanceInvalidationService";

    /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
    public static class a implements a0 {
        @Override // androidx.room.a0
        public void R0(int i10, String[] strArr) throws RemoteException {
        }

        @Override // androidx.room.a0
        public int V0(z zVar, String str) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.a0
        public void o1(z zVar, int i10) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class b extends Binder implements a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f27026b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f27027c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f27028d = 3;

        /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
        public static class a implements a0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f27029b;

            a(IBinder iBinder) {
                this.f27029b = iBinder;
            }

            public String N() {
                return a0.f27025v0;
            }

            @Override // androidx.room.a0
            public void R0(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a0.f27025v0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f27029b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.a0
            public int V0(z zVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a0.f27025v0);
                    parcelObtain.writeStrongInterface(zVar);
                    parcelObtain.writeString(str);
                    this.f27029b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27029b;
            }

            @Override // androidx.room.a0
            public void o1(z zVar, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a0.f27025v0);
                    parcelObtain.writeStrongInterface(zVar);
                    parcelObtain.writeInt(i10);
                    this.f27029b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a0.f27025v0);
        }

        public static a0 g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a0.f27025v0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a0)) ? new a(iBinder) : (a0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a0.f27025v0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a0.f27025v0);
                return true;
            }
            if (i10 == 1) {
                int iV0 = V0(z.b.g(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iV0);
            } else if (i10 == 2) {
                o1(z.b.g(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                R0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void R0(int i10, String[] strArr) throws RemoteException;

    int V0(z zVar, String str) throws RemoteException;

    void o1(z zVar, int i10) throws RemoteException;
}
