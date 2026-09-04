package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: ICustomTabsCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f1304d0 = "android.support.customtabs.ICustomTabsCallback";

    /* JADX INFO: renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ICustomTabsCallback.java */
    public static class C0003a implements a {
        @Override // android.support.customtabs.a
        public void M0(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void a(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.a
        public void e0(int i10, int i11, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public Bundle k(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.a
        public void l0(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void l1(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void m1(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: ICustomTabsCallback.java */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1305b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f1306c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f1307d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f1308e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f1309f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f1310g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f1311h = 8;

        /* JADX INFO: renamed from: android.support.customtabs.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ICustomTabsCallback.java */
        public static class C0004a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f1312b;

            C0004a(IBinder iBinder) {
                this.f1312b = iBinder;
            }

            @Override // android.support.customtabs.a
            public void M0(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N() {
                return a.f1304d0;
            }

            @Override // android.support.customtabs.a
            public void a(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1312b;
            }

            @Override // android.support.customtabs.a
            public void e0(int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public Bundle k(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void l0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void l1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.a
            public void m1(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1304d0);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f1312b.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f1304d0);
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f1304d0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0004a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f1304d0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f1304d0);
                return true;
            }
            switch (i10) {
                case 2:
                    l0(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    M0(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    l1((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    a(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    m1(parcel.readInt(), (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleK = k(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleK, 1);
                    return true;
                case 8:
                    e0(parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: compiled from: ICustomTabsCallback.java */
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

    void M0(String str, Bundle bundle) throws RemoteException;

    void a(String str, Bundle bundle) throws RemoteException;

    void e0(int i10, int i11, Bundle bundle) throws RemoteException;

    Bundle k(String str, Bundle bundle) throws RemoteException;

    void l0(int i10, Bundle bundle) throws RemoteException;

    void l1(Bundle bundle) throws RemoteException;

    void m1(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;
}
