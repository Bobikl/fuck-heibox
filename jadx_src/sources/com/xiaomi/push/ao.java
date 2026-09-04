package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class ao implements ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f106820a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f179a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ServiceConnection f180a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile int f178a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile String f182a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private volatile boolean f183b = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f106821b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object f181a = new Object();

    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new aq(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class b {
        static String a(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(r4.b.f138783a);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        static boolean m152a(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(r4.b.f138783a);
                iBinder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public ao(Context context) {
        this.f179a = context;
        a();
    }

    private void a() {
        boolean zBindService;
        this.f180a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            zBindService = this.f179a.bindService(intent, this.f180a, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f178a = zBindService ? 1 : 2;
    }

    private void a(String str) {
        if (this.f178a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f181a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m62a("huawei's " + str + " wait...");
                this.f181a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z10 = (packageInfo.applicationInfo.flags & 1) != 0;
            f106820a = packageInfo.versionCode >= 20602000;
            return z10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f180a;
        if (serviceConnection != null) {
            try {
                this.f179a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo150a() {
        a("getOAID");
        return this.f182a;
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo151a() {
        return f106820a;
    }
}
