package com.asus.msa.SupplementaryDID;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface IDidAidlInterface extends IInterface {

    public static abstract class Stub extends Binder implements IDidAidlInterface {
        public static final String DESCRIPTOR = "com.asus.msa.SupplementaryDID.IDidAidlInterface";
        public static final int TRANSACTION_getAAID = 5;
        public static final int TRANSACTION_getOAID = 3;
        public static final int TRANSACTION_getUDID = 2;
        public static final int TRANSACTION_getVAID = 4;
        public static final int TRANSACTION_isSupport = 1;

        public static class Proxy implements IDidAidlInterface {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.asus.msa.SupplementaryDID.IDidAidlInterface
            public native String getAAID();

            public native String getInterfaceDescriptor();

            @Override // com.asus.msa.SupplementaryDID.IDidAidlInterface
            public native String getOAID();

            @Override // com.asus.msa.SupplementaryDID.IDidAidlInterface
            public native String getUDID();

            @Override // com.asus.msa.SupplementaryDID.IDidAidlInterface
            public native String getVAID();

            @Override // com.asus.msa.SupplementaryDID.IDidAidlInterface
            public native boolean isSupport();
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native IDidAidlInterface asInterface(IBinder iBinder);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    String getAAID();

    String getOAID();

    String getUDID();

    String getVAID();

    boolean isSupport();
}
