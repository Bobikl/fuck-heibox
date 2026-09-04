package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.n$a$a, reason: collision with other inner class name */
        public static class C0987a implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101634a;

            public C0987a(IBinder iBinder) {
                this.f101634a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101634a;
            }

            @Override // com.tencent.qmsp.oaid2.n
            public String b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    this.f101634a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (RemoteException unused) {
                    return null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.oaid2.n
            public String b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    parcelObtain.writeString(str);
                    this.f101634a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (RemoteException unused) {
                    return null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.oaid2.n
            public boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                boolean z10 = false;
                try {
                    parcelObtain.writeInterfaceToken(u5.a.AbstractBinderC1271a.f140755b);
                    this.f101634a.transact(3, parcelObtain, parcelObtain2, 0);
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
        }

        public static n a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u5.a.AbstractBinderC1271a.f140755b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new C0987a(iBinder) : (n) iInterfaceQueryLocalInterface;
        }
    }

    String b();

    String b(String str);

    boolean c();
}
