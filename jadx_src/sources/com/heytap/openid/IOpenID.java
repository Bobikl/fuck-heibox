package com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface IOpenID extends IInterface {

    public static class Default implements IOpenID {
        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // com.heytap.openid.IOpenID
        public native String getSerID(String str, String str2, String str3);
    }

    public static abstract class Stub extends Binder implements IOpenID {
        private static final String DESCRIPTOR = "com.heytap.openid.IOpenID";
        public static final int TRANSACTION_getSerID = 1;

        public static class Proxy implements IOpenID {
            public static IOpenID sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            public native String getInterfaceDescriptor();

            @Override // com.heytap.openid.IOpenID
            public native String getSerID(String str, String str2, String str3);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native IOpenID asInterface(IBinder iBinder);

        public static native IOpenID getDefaultImpl();

        public static native boolean setDefaultImpl(IOpenID iOpenID);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    String getSerID(String str, String str2, String str3);
}
