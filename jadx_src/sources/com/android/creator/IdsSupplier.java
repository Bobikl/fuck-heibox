package com.android.creator;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface IdsSupplier extends IInterface {

    public static class Default implements IdsSupplier {
        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // com.android.creator.IdsSupplier
        public native String getAAID(String str);

        @Override // com.android.creator.IdsSupplier
        public native String getOAID();

        @Override // com.android.creator.IdsSupplier
        public native String getUDID(String str);

        @Override // com.android.creator.IdsSupplier
        public native String getVAID();

        @Override // com.android.creator.IdsSupplier
        public native boolean isSupported();
    }

    public static abstract class Stub extends Binder implements IdsSupplier {
        private static final String DESCRIPTOR = "com.android.creator.IdsSupplier";
        public static final int TRANSACTION_getAAID = 5;
        public static final int TRANSACTION_getOAID = 3;
        public static final int TRANSACTION_getUDID = 2;
        public static final int TRANSACTION_getVAID = 4;
        public static final int TRANSACTION_isSupported = 1;

        public static class Proxy implements IdsSupplier {
            public static IdsSupplier sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.android.creator.IdsSupplier
            public native String getAAID(String str);

            public native String getInterfaceDescriptor();

            @Override // com.android.creator.IdsSupplier
            public native String getOAID();

            @Override // com.android.creator.IdsSupplier
            public native String getUDID(String str);

            @Override // com.android.creator.IdsSupplier
            public native String getVAID();

            @Override // com.android.creator.IdsSupplier
            public native boolean isSupported();
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native IdsSupplier asInterface(IBinder iBinder);

        public static native IdsSupplier getDefaultImpl();

        public static native boolean setDefaultImpl(IdsSupplier idsSupplier);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    String getAAID(String str);

    String getOAID();

    String getUDID(String str);

    String getVAID();

    boolean isSupported();
}
