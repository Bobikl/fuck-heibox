package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface g0 extends IInterface {

    public static abstract class a extends Binder implements g0 {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.g0$a$a, reason: collision with other inner class name */
        public static class C0984a implements g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101589a;

            public C0984a(IBinder iBinder) {
                this.f101589a = iBinder;
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
                    this.f101589a.transact(1, parcelObtain, parcelObtain2, 0);
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
                return this.f101589a;
            }
        }

        public static g0 a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g0)) ? new C0984a(iBinder) : (g0) iInterfaceQueryLocalInterface;
        }
    }
}
