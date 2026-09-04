package com.tencent.qmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface q extends IInterface {

    public static abstract class a extends Binder implements q {

        /* JADX INFO: renamed from: com.tencent.qmsp.oaid2.q$a$a, reason: collision with other inner class name */
        public static class C0988a implements q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f101648a;

            public C0988a(IBinder iBinder) {
                this.f101648a = iBinder;
            }

            @Override // com.tencent.qmsp.oaid2.q
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.f101648a.transact(3, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = "";
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
                return this.f101648a;
            }

            @Override // com.tencent.qmsp.oaid2.q
            public boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                boolean z10 = false;
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f101648a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z10;
            }

            @Override // com.tencent.qmsp.oaid2.q
            public String d() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.f101648a.transact(5, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        string = "";
                    }
                    return string;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // com.tencent.qmsp.oaid2.q
            public void f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f101648a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.qmsp.oaid2.q
            public boolean g() {
                boolean z10;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f101648a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    z10 = parcelObtain2.readInt() != 0;
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return z10;
            }
        }

        public static q a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new C0988a(iBinder) : (q) iInterfaceQueryLocalInterface;
        }
    }

    String a();

    boolean c();

    String d();

    void f();

    boolean g();
}
