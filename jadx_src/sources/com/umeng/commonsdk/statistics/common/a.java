package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: AdvertisingId.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdvertisingId.java */
    public static final class C1042a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f105306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f105307b;

        C1042a(String str, boolean z10) {
            this.f105306a = str;
            this.f105307b = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f105306a;
        }

        public boolean a() {
            return this.f105307b;
        }
    }

    /* JADX INFO: compiled from: AdvertisingId.java */
    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f105308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f105309b;

        private b() {
            this.f105308a = false;
            this.f105309b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() throws InterruptedException {
            if (this.f105308a) {
                throw new IllegalStateException();
            }
            this.f105308a = true;
            return this.f105309b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f105309b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: AdvertisingId.java */
    public static final class c implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f105310a;

        public c(IBinder iBinder) {
            this.f105310a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f105310a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f105310a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f105310a;
        }
    }

    public static String a(Context context) {
        try {
            C1042a c1042aC = c(context);
            if (c1042aC != null && !c1042aC.a()) {
                return c1042aC.b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String b(Context context) {
        try {
            C1042a c1042aC = c(context);
            if (c1042aC == null) {
                return null;
            }
            return c1042aC.b();
        } catch (Exception unused) {
            return null;
        }
    }

    private static C1042a c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, bVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    c cVar = new c(bVar.a());
                    boolean zA = cVar.a(true);
                    C1042a c1042a = new C1042a(zA ? "" : cVar.a(), zA);
                    context.unbindService(bVar);
                    return c1042a;
                } catch (Exception e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                context.unbindService(bVar);
                throw th2;
            }
        } catch (Exception e11) {
            throw e11;
        }
    }
}
