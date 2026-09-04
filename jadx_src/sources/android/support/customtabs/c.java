package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: IPostMessageService.java */
/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f1326f0 = "android.support.customtabs.IPostMessageService";

    /* JADX INFO: compiled from: IPostMessageService.java */
    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.c
        public void b1(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.c
        public void m(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: IPostMessageService.java */
    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f1327b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f1328c = 3;

        /* JADX INFO: compiled from: IPostMessageService.java */
        public static class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f1329b;

            a(IBinder iBinder) {
                this.f1329b = iBinder;
            }

            public String N() {
                return c.f1326f0;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1329b;
            }

            @Override // android.support.customtabs.c
            public void b1(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f1326f0);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0006c.d(parcelObtain, bundle, 0);
                    this.f1329b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.c
            public void m(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f1326f0);
                    parcelObtain.writeStrongInterface(aVar);
                    C0006c.d(parcelObtain, bundle, 0);
                    this.f1329b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.f1326f0);
        }

        public static c g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f1326f0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c.f1326f0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c.f1326f0);
                return true;
            }
            if (i10 == 2) {
                m(android.support.customtabs.a.b.g(parcel.readStrongBinder()), (Bundle) C0006c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                b1(android.support.customtabs.a.b.g(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0006c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IPostMessageService.java */
    public static class C0006c {
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

    void b1(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException;

    void m(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;
}
