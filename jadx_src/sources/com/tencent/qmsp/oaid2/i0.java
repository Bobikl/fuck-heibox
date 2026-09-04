package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface i0 extends IInterface {

    public static abstract class a extends Binder implements i0 {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.i0$a$a, reason: collision with other inner class name */
        public static class C0985a implements i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101609a;

            public C0985a(IBinder iBinder) {
                this.f101609a = iBinder;
            }

            @Override // com.tencent.qmsp.oaid2.i0
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(i5.a.AbstractBinderC1085a.f119222b);
                        this.f101609a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // com.tencent.qmsp.oaid2.i0
            public String a(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(i5.a.AbstractBinderC1085a.f119222b);
                        parcelObtain.writeString(str);
                        this.f101609a.transact(3, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = null;
                    }
                    return string;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101609a;
            }
        }

        public static i0 a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(i5.a.AbstractBinderC1085a.f119222b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i0)) ? new C0985a(iBinder) : (i0) iInterfaceQueryLocalInterface;
        }
    }

    String a();

    String a(String str);
}
