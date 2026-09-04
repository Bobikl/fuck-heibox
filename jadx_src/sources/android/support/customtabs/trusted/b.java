package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: ITrustedWebActivityService.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f1333h0 = "android.support.customtabs.trusted.ITrustedWebActivityService";

    /* JADX INFO: compiled from: ITrustedWebActivityService.java */
    public static class a implements b {
        @Override // android.support.customtabs.trusted.b
        public Bundle A0(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle G0() throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle U0() throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public int c1() throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle d1(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public void g1(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle q(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.trusted.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ITrustedWebActivityService.java */
    public static abstract class AbstractBinderC0009b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1334b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f1335c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f1336d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f1337e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f1338f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f1339g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f1340h = 9;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.b$b$a */
        /* JADX INFO: compiled from: ITrustedWebActivityService.java */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f1341b;

            a(IBinder iBinder) {
                this.f1341b = iBinder;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle A0(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f1341b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle G0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    this.f1341b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String N() {
                return b.f1333h0;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle U0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    this.f1341b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1341b;
            }

            @Override // android.support.customtabs.trusted.b
            public int c1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    this.f1341b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle d1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1341b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public void g1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1341b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle q(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1333h0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1341b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0009b() {
            attachInterface(this, b.f1333h0);
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f1333h0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f1333h0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f1333h0);
                return true;
            }
            switch (i10) {
                case 2:
                    Bundle bundleQ = q((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleQ, 1);
                    return true;
                case 3:
                    g1((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iC1 = c1();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC1);
                    return true;
                case 5:
                    Bundle bundleU0 = U0();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleU0, 1);
                    return true;
                case 6:
                    Bundle bundleD1 = d1((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleD1, 1);
                    return true;
                case 7:
                    Bundle bundleG0 = G0();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleG0, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 9:
                    Bundle bundleA0 = A0(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.d(parcel2, bundleA0, 1);
                    return true;
            }
        }
    }

    /* JADX INFO: compiled from: ITrustedWebActivityService.java */
    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    Bundle A0(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle G0() throws RemoteException;

    Bundle U0() throws RemoteException;

    int c1() throws RemoteException;

    Bundle d1(Bundle bundle) throws RemoteException;

    void g1(Bundle bundle) throws RemoteException;

    Bundle q(Bundle bundle) throws RemoteException;
}
