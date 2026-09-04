package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IWorkManagerImplCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c extends IInterface {
    public static final String A0 = "androidx.work.multiprocess.IWorkManagerImplCallback";

    /* JADX INFO: compiled from: IWorkManagerImplCallback.java */
    public static class a implements c {
        @Override // androidx.work.multiprocess.c
        public void Y0(String str) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.c
        public void m0(byte[] bArr) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: IWorkManagerImplCallback.java */
    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f29452b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f29453c = 2;

        /* JADX INFO: compiled from: IWorkManagerImplCallback.java */
        public static class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29454b;

            a(IBinder iBinder) {
                this.f29454b = iBinder;
            }

            public String N() {
                return c.A0;
            }

            @Override // androidx.work.multiprocess.c
            public void Y0(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.A0);
                    parcelObtain.writeString(str);
                    this.f29454b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29454b;
            }

            @Override // androidx.work.multiprocess.c
            public void m0(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.A0);
                    parcelObtain.writeByteArray(bArr);
                    this.f29454b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.A0);
        }

        public static c g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.A0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c.A0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c.A0);
                return true;
            }
            if (i10 == 1) {
                m0(parcel.createByteArray());
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Y0(parcel.readString());
            }
            return true;
        }
    }

    void Y0(String str) throws RemoteException;

    void m0(byte[] bArr) throws RemoteException;
}
