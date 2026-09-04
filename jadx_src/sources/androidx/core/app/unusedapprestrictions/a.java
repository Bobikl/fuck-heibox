package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.y;

/* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f20377r0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace(y.f128594c, lg.a.f131414g);

    /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
    public static class C0122a implements a {
        @Override // androidx.core.app.unusedapprestrictions.a
        public void P0(boolean z10, boolean z11) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f20378b = 1;

        /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
        public static class C0123a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f20379b;

            C0123a(IBinder iBinder) {
                this.f20379b = iBinder;
            }

            public String N() {
                return a.f20377r0;
            }

            @Override // androidx.core.app.unusedapprestrictions.a
            public void P0(boolean z10, boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f20377r0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f20379b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20379b;
            }
        }

        public b() {
            attachInterface(this, a.f20377r0);
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f20377r0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0123a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f20377r0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            P0(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }
    }

    void P0(boolean z10, boolean z11) throws RemoteException;
}
