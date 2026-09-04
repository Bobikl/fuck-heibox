package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: ICustomTabsService.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f1313e0 = "android.support.customtabs.ICustomTabsService";

    /* JADX INFO: compiled from: ICustomTabsService.java */
    public static class a implements b {
        @Override // android.support.customtabs.b
        public boolean I0(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean K0(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean O(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean Z(long j10) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean f(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public int g0(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean i(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean i0(android.support.customtabs.a aVar) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean j1(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean r(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public Bundle y0(String str, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ICustomTabsService.java */
    public static abstract class AbstractBinderC0005b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1314b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f1315c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f1316d = 10;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f1317e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f1318f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f1319g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f1320h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f1321i = 11;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f1322j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f1323k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f1324l = 12;

        /* JADX INFO: renamed from: android.support.customtabs.b$b$a */
        /* JADX INFO: compiled from: ICustomTabsService.java */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f1325b;

            a(IBinder iBinder) {
                this.f1325b = iBinder;
            }

            @Override // android.support.customtabs.b
            public boolean I0(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean K0(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String N() {
                return b.f1313e0;
            }

            @Override // android.support.customtabs.b
            public boolean O(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeTypedList(list);
                    this.f1325b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean Z(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeLong(j10);
                    this.f1325b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1325b;
            }

            @Override // android.support.customtabs.b
            public boolean f(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public int g0(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean i(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean i0(android.support.customtabs.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f1325b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean j1(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    this.f1325b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean r(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public Bundle y0(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f1313e0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1325b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0005b() {
            attachInterface(this, b.f1313e0);
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f1313e0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f1313e0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f1313e0);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean Z = Z(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(Z ? 1 : 0);
                    return true;
                case 3:
                    boolean zI0 = i0(android.support.customtabs.a.b.g(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zI0 ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.a aVarG = android.support.customtabs.a.b.g(parcel.readStrongBinder());
                    Uri uri = (Uri) c.c(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zO = O(aVarG, uri, (Bundle) c.c(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleY0 = y0(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleY0, 1);
                    return true;
                case 6:
                    boolean zR = r(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                case 7:
                    boolean zJ1 = j1(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ1 ? 1 : 0);
                    return true;
                case 8:
                    int iG0 = g0(android.support.customtabs.a.b.g(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iG0);
                    return true;
                case 9:
                    boolean zF = f(android.support.customtabs.a.b.g(parcel.readStrongBinder()), parcel.readInt(), (Uri) c.c(parcel, Uri.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF ? 1 : 0);
                    return true;
                case 10:
                    boolean zK0 = K0(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zK0 ? 1 : 0);
                    return true;
                case 11:
                    boolean zI1 = I0(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zI1 ? 1 : 0);
                    return true;
                case 12:
                    boolean zI = i(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zI ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: compiled from: ICustomTabsService.java */
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

    boolean I0(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean K0(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    boolean O(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean Z(long j10) throws RemoteException;

    boolean f(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    int g0(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException;

    boolean i(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException;

    boolean i0(android.support.customtabs.a aVar) throws RemoteException;

    boolean j1(android.support.customtabs.a aVar, Uri uri) throws RemoteException;

    boolean r(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    Bundle y0(String str, Bundle bundle) throws RemoteException;
}
