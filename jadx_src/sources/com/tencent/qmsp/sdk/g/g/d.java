package com.tencent.qmsp.sdk.g.g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.g.d$a$a, reason: collision with other inner class name */
        public static class C1004a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f102013a;

            public C1004a(IBinder iBinder) {
                this.f102013a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f102013a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    try {
                        throw th2;
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        string = "";
                    }
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f102013a;
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C1004a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }
    }
}
