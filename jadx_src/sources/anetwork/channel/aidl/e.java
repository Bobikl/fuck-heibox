package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface e extends IInterface {

    /* JADX INFO: compiled from: Taobao */
    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30122b = "anetwork.channel.aidl.ParcelableFuture";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30123c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30124d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f30125e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f30126f = 4;

        /* JADX INFO: renamed from: anetwork.channel.aidl.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0249a implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30127b;

            C0249a(IBinder iBinder) {
                this.f30127b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30127b;
            }

            @Override // anetwork.channel.aidl.e
            public boolean cancel(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30122b);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f30127b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.e
            public boolean isCancelled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30122b);
                    this.f30127b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.e
            public boolean isDone() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30122b);
                    this.f30127b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.e
            public NetworkResponse n1(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f30122b);
                    parcelObtain.writeLong(j10);
                    this.f30127b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? NetworkResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f30122b);
        }

        public static e g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30122b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0249a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f30122b);
                boolean zCancel = cancel(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zCancel ? 1 : 0);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(f30122b);
                boolean zIsCancelled = isCancelled();
                parcel2.writeNoException();
                parcel2.writeInt(zIsCancelled ? 1 : 0);
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface(f30122b);
                boolean zIsDone = isDone();
                parcel2.writeNoException();
                parcel2.writeInt(zIsDone ? 1 : 0);
                return true;
            }
            if (i10 != 4) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f30122b);
                return true;
            }
            parcel.enforceInterface(f30122b);
            NetworkResponse networkResponseN1 = n1(parcel.readLong());
            parcel2.writeNoException();
            if (networkResponseN1 != null) {
                parcel2.writeInt(1);
                networkResponseN1.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    boolean cancel(boolean z10) throws RemoteException;

    boolean isCancelled() throws RemoteException;

    boolean isDone() throws RemoteException;

    NetworkResponse n1(long j10) throws RemoteException;
}
