package com.huawei.hms.ads.identifier.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    public static abstract class Stub {
        private static final String DESCRIPTOR = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
        public static final int TRANSACTION_GETOAID = 1;
        public static final int TRANSACTION_ISOAIDTRACKLIMITED = 2;

        public static class Proxy implements OpenDeviceIdentifierService {
            private IBinder mBinderRemote;

            public Proxy(IBinder iBinder) {
                this.mBinderRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mBinderRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
            }

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public String getOaid() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(getInterfaceDescriptor());
                    this.mBinderRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public boolean isOaidTrackLimited() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(getInterfaceDescriptor());
                    this.mBinderRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static OpenDeviceIdentifierService asInterface(IBinder iBinder) {
            return new Proxy(iBinder);
        }
    }

    String getOaid();

    boolean isOaidTrackLimited();
}
