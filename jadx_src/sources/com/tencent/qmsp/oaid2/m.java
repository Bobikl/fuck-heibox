package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.m$a$a, reason: collision with other inner class name */
        public static class C0986a implements m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101632a;

            public C0986a(IBinder iBinder) {
                this.f101632a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101632a;
            }

            @Override // com.tencent.qmsp.oaid2.m
            public boolean h() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(r4.b.f138783a);
                    this.f101632a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.oaid2.m
            public String m() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(r4.b.f138783a);
                    this.f101632a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(r4.b.f138783a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new C0986a(iBinder) : (m) iInterfaceQueryLocalInterface;
        }
    }

    boolean h();

    String m();
}
