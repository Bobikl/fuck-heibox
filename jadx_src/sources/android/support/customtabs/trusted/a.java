package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f1330g0 = "android.support.customtabs.trusted.ITrustedWebActivityCallback";

    /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
    public static class C0007a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.a
        public void k1(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1331b = 2;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
        public static class C0008a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f1332b;

            C0008a(IBinder iBinder) {
                this.f1332b = iBinder;
            }

            public String N() {
                return a.f1330g0;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1332b;
            }

            @Override // android.support.customtabs.trusted.a
            public void k1(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1330g0);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f1332b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f1330g0);
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f1330g0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0008a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f1330g0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f1330g0);
                return true;
            }
            if (i10 != 2) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            k1(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
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

    void k1(String str, Bundle bundle) throws RemoteException;
}
