package com.tencent.qmsp.sdk.g.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1000a extends Binder implements a {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.c.a$a$a, reason: collision with other inner class name */
        public static class C1001a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f101969a;

            C1001a(IBinder iBinder) {
                this.f101969a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101969a;
            }

            @Override // com.tencent.qmsp.sdk.g.c.a
            public String b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    parcelObtain.writeString(str);
                    this.f101969a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (RemoteException unused) {
                    return null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.sdk.g.c.a
            public boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                boolean z10 = false;
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    this.f101969a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                } catch (RemoteException unused) {
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z10;
            }

            @Override // com.tencent.qmsp.sdk.g.c.a
            public String g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    this.f101969a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (RemoteException unused) {
                    return null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u5.a.AbstractBinderC1271a.f140755b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1001a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    String b(String str);

    boolean c();

    String g();
}
