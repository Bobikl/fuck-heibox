package com.tencent.qmsp.sdk.g.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1002a extends Binder implements a {

        /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.d.a$a$a, reason: collision with other inner class name */
        public static class C1003a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f101978a;

            C1003a(IBinder iBinder) {
                this.f101978a = iBinder;
            }

            @Override // com.tencent.qmsp.sdk.g.d.a
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.f101978a.transact(3, parcelObtain, parcelObtain2, 0);
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
                return this.f101978a;
            }

            @Override // com.tencent.qmsp.sdk.g.d.a
            public String b() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.f101978a.transact(5, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.qmsp.sdk.g.d.a
            public boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                boolean z10 = false;
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f101978a.transact(2, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.qmsp.sdk.g.d.a
            public boolean d() {
                boolean z10;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.f101978a.transact(1, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.qmsp.sdk.g.d.a
            public void e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.f101978a.transact(6, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                    }
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C1003a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    String a();

    String b();

    boolean c();

    boolean d();

    void e();
}
