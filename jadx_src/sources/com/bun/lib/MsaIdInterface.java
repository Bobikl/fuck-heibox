package com.bun.lib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface MsaIdInterface extends IInterface {

    public static class Default implements MsaIdInterface {
        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // com.bun.lib.MsaIdInterface
        public native String getAAID();

        @Override // com.bun.lib.MsaIdInterface
        public native String getOAID();

        @Override // com.bun.lib.MsaIdInterface
        public native String getVAID();

        @Override // com.bun.lib.MsaIdInterface
        public native boolean isDataArrived();

        @Override // com.bun.lib.MsaIdInterface
        public native boolean isSupported();

        @Override // com.bun.lib.MsaIdInterface
        public native void shutDown();
    }

    public static abstract class Stub extends Binder implements MsaIdInterface {
        private static final String DESCRIPTOR = "com.bun.lib.MsaIdInterface";
        public static final int TRANSACTION_getAAID = 2;
        public static final int TRANSACTION_getOAID = 1;
        public static final int TRANSACTION_getVAID = 3;
        public static final int TRANSACTION_isDataArrived = 4;
        public static final int TRANSACTION_isSupported = 5;
        public static final int TRANSACTION_shutDown = 6;

        public static class Proxy implements MsaIdInterface {
            public static MsaIdInterface sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.bun.lib.MsaIdInterface
            public native String getAAID();

            public native String getInterfaceDescriptor();

            @Override // com.bun.lib.MsaIdInterface
            public native String getOAID();

            @Override // com.bun.lib.MsaIdInterface
            public native String getVAID();

            @Override // com.bun.lib.MsaIdInterface
            public native boolean isDataArrived();

            @Override // com.bun.lib.MsaIdInterface
            public native boolean isSupported();

            @Override // com.bun.lib.MsaIdInterface
            public native void shutDown();
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native MsaIdInterface asInterface(IBinder iBinder);

        public static native MsaIdInterface getDefaultImpl();

        public static native boolean setDefaultImpl(MsaIdInterface msaIdInterface);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    String getAAID();

    String getOAID();

    String getVAID();

    boolean isDataArrived();

    boolean isSupported();

    void shutDown();
}
