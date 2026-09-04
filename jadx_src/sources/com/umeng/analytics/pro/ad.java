package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: HuaweiDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ad implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f104401a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f104402b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104403c = 2;

    /* JADX INFO: compiled from: HuaweiDeviceIdSupplier.java */
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f104404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f104405b;

        private a() {
            this.f104404a = false;
            this.f104405b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.f104404a) {
                throw new IllegalStateException();
            }
            this.f104404a = true;
            return this.f104405b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f104405b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: HuaweiDeviceIdSupplier.java */
    public static final class b implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f104406a;

        public b(IBinder iBinder) {
            this.f104406a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f104406a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f104406a;
        }

        public boolean b() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f104406a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    ad() {
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
