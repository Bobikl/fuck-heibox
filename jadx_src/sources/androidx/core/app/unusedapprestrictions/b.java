package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.y;

/* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f20380s0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(y.f128594c, lg.a.f131414g);

    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
    public static class a implements b {
        @Override // androidx.core.app.unusedapprestrictions.b
        public void W0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
    public static abstract class AbstractBinderC0124b extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f20381b = 1;

        /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
        public static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f20382b;

            a(IBinder iBinder) {
                this.f20382b = iBinder;
            }

            public String N() {
                return b.f20380s0;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public void W0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f20380s0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f20382b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20382b;
            }
        }

        public AbstractBinderC0124b() {
            attachInterface(this, b.f20380s0);
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f20380s0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.f20380s0;
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
            W0(androidx.core.app.unusedapprestrictions.a.b.g(parcel.readStrongBinder()));
            return true;
        }
    }

    void W0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException;
}
