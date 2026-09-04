package com.coolpad.deviceidsupport;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface IDeviceIdManager extends IInterface {

    public static class Default implements IDeviceIdManager {
        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getAAID(String str);

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getCoolOsVersion();

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getIMEI(String str);

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getOAID(String str);

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getUDID(String str);

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native String getVAID(String str);

        @Override // com.coolpad.deviceidsupport.IDeviceIdManager
        public native boolean isCoolOs();
    }

    public static abstract class Stub extends Binder implements IDeviceIdManager {
        private static final String DESCRIPTOR = "com.coolpad.deviceidsupport.IDeviceIdManager";
        public static final int TRANSACTION_getAAID = 4;
        public static final int TRANSACTION_getCoolOsVersion = 7;
        public static final int TRANSACTION_getIMEI = 5;
        public static final int TRANSACTION_getOAID = 2;
        public static final int TRANSACTION_getUDID = 1;
        public static final int TRANSACTION_getVAID = 3;
        public static final int TRANSACTION_isCoolOs = 6;

        public static class Proxy implements IDeviceIdManager {
            public static IDeviceIdManager sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getAAID(String str);

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getCoolOsVersion();

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getIMEI(String str);

            public native String getInterfaceDescriptor();

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getOAID(String str);

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getUDID(String str);

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native String getVAID(String str);

            @Override // com.coolpad.deviceidsupport.IDeviceIdManager
            public native boolean isCoolOs();
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native IDeviceIdManager asInterface(IBinder iBinder);

        public static native IDeviceIdManager getDefaultImpl();

        public static native boolean setDefaultImpl(IDeviceIdManager iDeviceIdManager);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    String getAAID(String str);

    String getCoolOsVersion();

    String getIMEI(String str);

    String getOAID(String str);

    String getUDID(String str);

    String getVAID(String str);

    boolean isCoolOs();
}
