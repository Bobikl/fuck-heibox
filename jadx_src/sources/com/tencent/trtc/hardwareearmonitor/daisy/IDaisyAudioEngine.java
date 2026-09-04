package com.tencent.trtc.hardwareearmonitor.daisy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IDaisyAudioEngine extends IInterface {

    public static abstract class Stub extends Binder implements IDaisyAudioEngine {
        private static final String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioEngine";
        static final int TRANSACTION_getSupportedFeatures = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isFeatureSupported = 2;

        public static final class a implements IDaisyAudioEngine {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f103199a;

            a(IBinder iBinder) {
                this.f103199a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f103199a;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final List getSupportedFeatures() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f103199a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(a.class.getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final void init(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f103199a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final boolean isFeatureSupported(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.f103199a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDaisyAudioEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDaisyAudioEngine)) ? new a(iBinder) : (IDaisyAudioEngine) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                List supportedFeatures = getSupportedFeatures();
                parcel2.writeNoException();
                parcel2.writeList(supportedFeatures);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsFeatureSupported = isFeatureSupported(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zIsFeatureSupported ? 1 : 0);
                return true;
            }
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            init(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    List getSupportedFeatures() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isFeatureSupported(int i10) throws RemoteException;
}
