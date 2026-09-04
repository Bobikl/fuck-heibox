package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.f$a$a, reason: collision with other inner class name */
        public static class C0983a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101585a;

            public C0983a(IBinder iBinder) {
                this.f101585a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101585a;
            }

            @Override // com.tencent.qmsp.oaid2.f
            public boolean b() {
                boolean z10;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101585a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z10 = parcelObtain2.readInt() != 0;
                } catch (Exception unused) {
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z10;
            }

            @Override // com.tencent.qmsp.oaid2.f
            public String c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101585a.transact(3, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.qmsp.oaid2.f
            public String i() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDidAidlInterface.Stub.DESCRIPTOR);
                    this.f101585a.transact(5, parcelObtain, parcelObtain2, 0);
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

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDidAidlInterface.Stub.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C0983a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }
    }

    boolean b();

    String c();

    String i();
}
