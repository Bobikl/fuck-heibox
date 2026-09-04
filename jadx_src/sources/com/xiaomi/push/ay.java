package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class ay implements ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f106842a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f201a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ServiceConnection f202a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile int f200a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile a f203a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object f204a = new Object();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f106844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f106845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f106846d;

        private a() {
            this.f205a = null;
            this.f106844b = null;
            this.f106845c = null;
            this.f106846d = null;
        }
    }

    public class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ay.this.f203a != null) {
                return;
            }
            new Thread(new ba(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class c {
        static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public ay(Context context) {
        this.f201a = context;
        a();
    }

    private void a() {
        boolean zBindService;
        this.f202a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            zBindService = this.f201a.bindService(intent, this.f202a, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f200a = zBindService ? 1 : 2;
    }

    private void a(String str) {
        if (this.f200a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f204a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m62a("oppo's " + str + " wait...");
                this.f204a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z10 = (packageInfo.applicationInfo.flags & 1) != 0;
                f106842a = longVersionCode >= 1;
                if (z10) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f201a.getPackageManager().getPackageInfo(this.f201a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m157b() {
        ServiceConnection serviceConnection = this.f202a;
        if (serviceConnection != null) {
            try {
                this.f201a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public String mo150a() {
        a("getOAID");
        if (this.f203a == null) {
            return null;
        }
        return this.f203a.f106844b;
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public boolean mo151a() {
        return f106842a;
    }
}
