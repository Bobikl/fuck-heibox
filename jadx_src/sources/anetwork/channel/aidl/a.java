package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import anetwork.channel.statist.StatisticData;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: anetwork.channel.aidl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static abstract class AbstractBinderC0245a extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30059b = "anetwork.channel.aidl.Connection";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f30060c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f30061d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f30062e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f30063f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f30064g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f30065h = 6;

        /* JADX INFO: renamed from: anetwork.channel.aidl.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Taobao */
        public static class C0246a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f30066b;

            C0246a(IBinder iBinder) {
                this.f30066b = iBinder;
            }

            @Override // anetwork.channel.aidl.a
            public Map C() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30066b;
            }

            @Override // anetwork.channel.aidl.a
            public void cancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.a
            public f getInputStream() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return f.a.g(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.a
            public int getStatusCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.a
            public String w() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.a
            public StatisticData z() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0245a.f30059b);
                    this.f30066b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() == 1 ? (StatisticData) parcelObtain2.readSerializable() : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0245a() {
            attachInterface(this, f30059b);
        }

        public static a q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f30059b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0246a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(f30059b);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f30059b);
                    f inputStream = getInputStream();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(inputStream != null ? inputStream.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface(f30059b);
                    int statusCode = getStatusCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(statusCode);
                    return true;
                case 3:
                    parcel.enforceInterface(f30059b);
                    String strW = w();
                    parcel2.writeNoException();
                    parcel2.writeString(strW);
                    return true;
                case 4:
                    parcel.enforceInterface(f30059b);
                    Map mapC = C();
                    parcel2.writeNoException();
                    parcel2.writeMap(mapC);
                    return true;
                case 5:
                    parcel.enforceInterface(f30059b);
                    StatisticData statisticDataZ = z();
                    parcel2.writeNoException();
                    if (statisticDataZ != null) {
                        parcel2.writeInt(1);
                        parcel2.writeSerializable(statisticDataZ);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(f30059b);
                    cancel();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    Map C() throws RemoteException;

    void cancel() throws RemoteException;

    f getInputStream() throws RemoteException;

    int getStatusCode() throws RemoteException;

    String w() throws RemoteException;

    StatisticData z() throws RemoteException;
}
