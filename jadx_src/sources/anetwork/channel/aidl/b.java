package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30114b = "anetwork.channel.aidl.IRemoteNetworkGetter";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30115c = 1;

        /* JADX INFO: renamed from: anetwork.channel.aidl.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0247a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30116b;

            C0247a(IBinder iBinder) {
                this.f30116b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30116b;
            }

            @Override // anetwork.channel.aidl.b
            public h get(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30114b);
                    parcelObtain.writeInt(i10);
                    this.f30116b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return h.a.g(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30114b);
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30114b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0247a(iBinder) : (b) iInterfaceQueryLocalInterface;
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
                parcel2.writeString(f30114b);
                return true;
            }
            parcel.enforceInterface(f30114b);
            h hVar = get(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
            return true;
        }
    }

    h get(int i10) throws RemoteException;
}
