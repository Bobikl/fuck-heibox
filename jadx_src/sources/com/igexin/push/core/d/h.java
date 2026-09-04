package com.igexin.push.core.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class h implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f63718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63719b;

    private h(IBinder iBinder, String str) {
        this.f63718a = iBinder;
        this.f63719b = str;
    }

    static h a(IBinder iBinder, String str) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(str);
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, str);
    }

    String a(String str, String str2, String str3, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken(this.f63719b);
                if (!TextUtils.isEmpty(str)) {
                    parcelObtain.writeString(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    parcelObtain.writeString(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    parcelObtain.writeString(str3);
                }
                this.f63718a.transact(i10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Exception unused) {
                return "";
            }
        } catch (Throwable unused2) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return "";
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f63718a;
    }
}
