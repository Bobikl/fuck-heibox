package com.bun.miitmdid;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface q0 extends IInterface {

    public static abstract class a extends Binder implements q0 {
        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11);
    }

    void a(int i10, long j10, boolean z10, float f10, double d10, String str);

    void a(int i10, Bundle bundle);
}
