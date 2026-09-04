package com.mcs.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMcsSdkService.java */
/* JADX INFO: loaded from: classes13.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.mcs.aidl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IMcsSdkService.java */
    public static class C0913a implements a {
        @Override // com.mcs.aidl.a
        public void X(Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: IMcsSdkService.java */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f96199b = "com.mcs.aidl.IMcsSdkService";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f96200c = 1;

        /* JADX INFO: renamed from: com.mcs.aidl.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMcsSdkService.java */
        public static class C0914a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f96201c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f96202b;

            C0914a(IBinder iBinder) {
                this.f96202b = iBinder;
            }

            public String N() {
                return b.f96199b;
            }

            @Override // com.mcs.aidl.a
            public void X(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f96199b);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f96202b.transact(1, parcelObtain, parcelObtain2, 0) || b.N() == null) {
                        parcelObtain2.readException();
                    } else {
                        b.N().X(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f96202b;
            }
        }

        public b() {
            attachInterface(this, f96199b);
        }

        public static a N() {
            return C0914a.f96201c;
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f96199b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0914a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static boolean r0(a aVar) {
            if (C0914a.f96201c != null || aVar == null) {
                return false;
            }
            C0914a.f96201c = aVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f96199b);
                return true;
            }
            parcel.enforceInterface(f96199b);
            X(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void X(Bundle bundle) throws RemoteException;
}
