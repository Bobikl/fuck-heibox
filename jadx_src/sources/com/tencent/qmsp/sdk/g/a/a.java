package com.tencent.qmsp.sdk.g.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0996a extends Binder implements a {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.a.a$a$a, reason: collision with other inner class name */
        public static class C0997a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101943a;

            public C0997a(IBinder iBinder) {
                this.f101943a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101943a;
            }

            @Override // com.tencent.qmsp.sdk.g.a.a
            public String c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101943a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable unused) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return "";
                }
            }

            @Override // com.tencent.qmsp.sdk.g.a.a
            public boolean g() {
                boolean z10;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101943a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z10 = parcelObtain2.readInt() != 0;
                } catch (Exception unused) {
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z10;
            }

            @Override // com.tencent.qmsp.sdk.g.a.a
            public String h() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101943a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable unused) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return "";
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDidAidlInterface.Stub.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0997a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    String c();

    boolean g();

    String h();
}
