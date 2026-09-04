package com.tencent.qmsp.sdk.g.h;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.h.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1005a extends Binder implements a {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.h.a$a$a, reason: collision with other inner class name */
        public static class C1006a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f102021a;

            C1006a(IBinder iBinder) {
                this.f102021a = iBinder;
            }

            @Override // com.tencent.qmsp.sdk.g.h.a
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(i5.a.AbstractBinderC1085a.f119222b);
                        this.f102021a.transact(1, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.qmsp.sdk.g.h.a
            public String a(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(i5.a.AbstractBinderC1085a.f119222b);
                        parcelObtain.writeString(str);
                        this.f102021a.transact(3, parcelObtain, parcelObtain2, 0);
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
                return this.f102021a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(i5.a.AbstractBinderC1085a.f119222b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1006a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    String a();

    String a(String str);
}
