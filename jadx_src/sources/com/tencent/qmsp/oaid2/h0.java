package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f101596f = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f101597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f101600d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f101601e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h0.this.f101597a = g0.a.a(iBinder);
            synchronized (h0.this.f101600d) {
                h0.this.f101600d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h0.this.f101597a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public String a(Context context, String str) {
        String strB;
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (this.f101597a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f101601e, 1)) {
                    synchronized (this.f101600d) {
                        try {
                            this.f101600d.wait(3000L);
                        } catch (InterruptedException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (this.f101597a == null) {
                        strB = "";
                    } else {
                        try {
                            strB = b(context, str);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            strB = "";
                        }
                    }
                } else if (this.f101597a == null) {
                    strB = "";
                } else {
                    strB = b(context, str);
                }
            } else {
                try {
                    strB = b(context, str);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    strB = "";
                }
            }
        }
        return strB;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0027 -> B:15:0x002a). Please report as a decompilation issue!!! */
    public boolean a(Context context) {
        boolean z10 = true;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28 ? packageInfo == null || packageInfo.versionCode < 1 : packageInfo == null || packageInfo.getLongVersionCode() < 1) {
                z10 = false;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        return z10;
    }

    public final String b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f101598b)) {
            this.f101598b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f101599c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f101598b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
                        }
                        string = sb2.toString();
                    }
                } catch (NoSuchAlgorithmException e11) {
                    e11.printStackTrace();
                }
            }
            this.f101599c = string;
        }
        String strA = ((g0.a.C0984a) this.f101597a).a(this.f101598b, this.f101599c, str);
        return TextUtils.isEmpty(strA) ? "" : strA;
    }
}
