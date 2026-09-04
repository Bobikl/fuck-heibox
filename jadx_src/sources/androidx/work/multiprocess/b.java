package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IWorkManagerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f29440z0 = "androidx.work.multiprocess.IWorkManagerImpl";

    /* JADX INFO: compiled from: IWorkManagerImpl.java */
    public static class a implements b {
        @Override // androidx.work.multiprocess.b
        public void J(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void L(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void L0(String str, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void a1(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.b
        public void e(String str, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void i1(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void p0(String str, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void t(String str, byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void u0(byte[] bArr, c cVar) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void w0(c cVar) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: androidx.work.multiprocess.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IWorkManagerImpl.java */
    public static abstract class AbstractBinderC0238b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f29441b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f29442c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f29443d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f29444e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f29445f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f29446g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f29447h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f29448i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f29449j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f29450k = 10;

        /* JADX INFO: renamed from: androidx.work.multiprocess.b$b$a */
        /* JADX INFO: compiled from: IWorkManagerImpl.java */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29451b;

            a(IBinder iBinder) {
                this.f29451b = iBinder;
            }

            @Override // androidx.work.multiprocess.b
            public void J(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void L(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void L0(String str, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N() {
                return b.f29440z0;
            }

            @Override // androidx.work.multiprocess.b
            public void a1(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29451b;
            }

            @Override // androidx.work.multiprocess.b
            public void e(String str, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void i1(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void p0(String str, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void t(String str, byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void u0(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void w0(c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f29440z0);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f29451b.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0238b() {
            attachInterface(this, b.f29440z0);
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f29440z0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f29440z0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f29440z0);
                return true;
            }
            switch (i10) {
                case 1:
                    u0(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 2:
                    t(parcel.readString(), parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 3:
                    L(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 4:
                    L0(parcel.readString(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 5:
                    p0(parcel.readString(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 6:
                    e(parcel.readString(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 7:
                    w0(c.b.g(parcel.readStrongBinder()));
                    return true;
                case 8:
                    a1(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 9:
                    J(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                case 10:
                    i1(parcel.createByteArray(), c.b.g(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void J(byte[] bArr, c cVar) throws RemoteException;

    void L(byte[] bArr, c cVar) throws RemoteException;

    void L0(String str, c cVar) throws RemoteException;

    void a1(byte[] bArr, c cVar) throws RemoteException;

    void e(String str, c cVar) throws RemoteException;

    void i1(byte[] bArr, c cVar) throws RemoteException;

    void p0(String str, c cVar) throws RemoteException;

    void t(String str, byte[] bArr, c cVar) throws RemoteException;

    void u0(byte[] bArr, c cVar) throws RemoteException;

    void w0(c cVar) throws RemoteException;
}
