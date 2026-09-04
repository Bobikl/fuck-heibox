package com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface IDeviceidInterface extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceidInterface {
        private static final String DESCRIPTOR = "com.zui.deviceidservice.IDeviceidInterface";
        public static final int TRANSACTION_createAAIDForPackageName = 6;
        public static final int TRANSACTION_getAAID = 5;
        public static final int TRANSACTION_getOAID = 1;
        public static final int TRANSACTION_getUDID = 2;
        public static final int TRANSACTION_getVAID = 4;
        public static final int TRANSACTION_isSupport = 3;

        public static class Proxy implements IDeviceidInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native boolean createAAIDForPackageName(String str);

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native String getAAID(String str);

            public native String getInterfaceDescriptor();

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native String getOAID();

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native String getUDID();

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native String getVAID(String str);

            @Override // com.zui.deviceidservice.IDeviceidInterface
            public native boolean isSupport();
        }

        public Stub() {
            attachInterface(this, "com.zui.deviceidservice.IDeviceidInterface");
        }

        public static native IDeviceidInterface asInterface(IBinder iBinder);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    boolean createAAIDForPackageName(String str);

    String getAAID(String str);

    String getOAID();

    String getUDID();

    String getVAID(String str);

    boolean isSupport();
}
