package com.asus.msa.sdid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface IDIDBinderStatusListener extends IInterface {

    public static abstract class Stub extends Binder implements IDIDBinderStatusListener {
        public static final String DESCRIPTOR = "com.asus.msa.sdid.IDIDBinderStatusListener";
        public static final int TRANSACTION_onError = 2;
        public static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IDIDBinderStatusListener {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            public native String getInterfaceDescriptor();

            @Override // com.asus.msa.sdid.IDIDBinderStatusListener
            public native void onError();

            @Override // com.asus.msa.sdid.IDIDBinderStatusListener
            public native void onSuccess(IDidAidlInterface iDidAidlInterface);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static native IDIDBinderStatusListener asInterface(IBinder iBinder);

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    void onError();

    void onSuccess(IDidAidlInterface iDidAidlInterface);
}
