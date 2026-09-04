package n4;

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
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n4.a f131999a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f132000b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f132001c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f132002d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f132003e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.this.f131999a = n4.a.AbstractBinderC1207a.g(iBinder);
            synchronized (c.this.f132002d) {
                c.this.f132002d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.f131999a = null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f132005a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:45:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot run on MainThread");
        }
        if (this.f131999a != null) {
            try {
                return c(context, str);
            } catch (RemoteException e10) {
                e10.printStackTrace();
                return "";
            }
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        if (!context.bindService(intent, this.f132003e, 1)) {
            if (this.f131999a == null) {
                return "";
            }
            return c(context, str);
        }
        synchronized (this.f132002d) {
            try {
                this.f132002d.wait(3000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
        if (this.f131999a == null) {
            return "";
        }
        try {
            return c(context, str);
        } catch (RemoteException e12) {
            e12.printStackTrace();
            return "";
        }
        throw th;
    }

    public boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
            }
            return packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f132000b)) {
            this.f132000b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f132001c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f132000b, 64).signatures;
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
            this.f132001c = string;
        }
        String strG = ((n4.a.AbstractBinderC1207a.C1208a) this.f131999a).g(this.f132000b, this.f132001c, str);
        return TextUtils.isEmpty(strG) ? "" : strG;
    }
}
