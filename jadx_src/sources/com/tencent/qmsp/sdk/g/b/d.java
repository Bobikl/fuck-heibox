package com.tencent.qmsp.sdk.g.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.b.d$a$a, reason: collision with other inner class name */
        public static class C0999a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f101968a;

            C0999a(IBinder iBinder) {
                this.f101968a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101968a;
            }

            @Override // com.tencent.qmsp.sdk.g.b.d
            public boolean f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(r4.b.f138783a);
                    this.f101968a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.sdk.g.b.d
            public String i() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(r4.b.f138783a);
                    this.f101968a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(r4.b.f138783a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0999a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }
    }

    boolean f();

    String i();
}
