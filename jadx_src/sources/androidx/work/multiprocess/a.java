package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IListenableWorkerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f29436y0 = "androidx.work.multiprocess.IListenableWorkerImpl";

    /* JADX INFO: renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IListenableWorkerImpl.java */
    public static class C0236a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.a
        public void h0(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.a
        public void l(byte[] bArr, c cVar) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: IListenableWorkerImpl.java */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f29437b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f29438c = 2;

        /* JADX INFO: renamed from: androidx.work.multiprocess.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IListenableWorkerImpl.java */
        public static class C0237a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29439b;

            C0237a(IBinder iBinder) {
                this.f29439b = iBinder;
            }

            public String N() {
                return a.f29436y0;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29439b;
            }

            @Override // androidx.work.multiprocess.a
            public void h0(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f29436y0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29439b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.a
            public void l(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f29436y0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29439b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f29436y0);
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f29436y0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0237a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f29436y0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f29436y0);
                return true;
            }
            if (i10 == 1) {
                l(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                h0(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void h0(byte[] bArr, c cVar) throws RemoteException;

    void l(byte[] bArr, c cVar) throws RemoteException;
}
