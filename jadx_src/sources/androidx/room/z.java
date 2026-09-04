package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public interface z extends IInterface {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f27366u0 = "androidx.room.IMultiInstanceInvalidationCallback";

    /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
    public static class a implements z {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.z
        public void h(String[] strArr) throws RemoteException {
        }
    }

    /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class b extends Binder implements z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f27367b = 1;

        /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
        public static class a implements z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f27368b;

            a(IBinder iBinder) {
                this.f27368b = iBinder;
            }

            public String N() {
                return z.f27366u0;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27368b;
            }

            @Override // androidx.room.z
            public void h(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(z.f27366u0);
                    parcelObtain.writeStringArray(strArr);
                    this.f27368b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, z.f27366u0);
        }

        public static z g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(z.f27366u0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z)) ? new a(iBinder) : (z) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(z.f27366u0);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(z.f27366u0);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            h(parcel.createStringArray());
            return true;
        }
    }

    void h(String[] strArr) throws RemoteException;
}
