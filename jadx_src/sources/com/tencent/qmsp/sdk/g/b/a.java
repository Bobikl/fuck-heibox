package com.tencent.qmsp.sdk.g.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.g.b.a$a, reason: collision with other inner class name */
    public static final class C0998a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f101956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f101957b;

        C0998a(String str, boolean z10) {
            this.f101956a = str;
            this.f101957b = z10;
        }

        public final String a() {
            return this.f101956a;
        }

        public final boolean b() {
            return this.f101957b;
        }
    }

    public static C0998a a(Context context) {
        String str;
        String str2;
        Log.i(a(), "getAdvertisingIdInfo " + System.currentTimeMillis());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.tencent.qmsp.sdk.base.c.b("Cannot be called from the main thread");
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            b bVar = new b();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            if (!context.bindService(intent, bVar, 1)) {
                str = "bind failed";
                com.tencent.qmsp.sdk.base.c.b(str);
                return null;
            }
            Log.i(a(), "bind ok");
            try {
                if (bVar.f101959a) {
                    throw new IllegalStateException();
                }
                bVar.f101959a = true;
                d dVarA = d.a.a(bVar.f101960b.take());
                C0998a c0998a = new C0998a(dVarA.i(), dVarA.f());
                context.unbindService(bVar);
                return c0998a;
            } catch (RemoteException unused) {
                str2 = "bind hms service RemoteException";
                try {
                    com.tencent.qmsp.sdk.base.c.b(str2);
                    return null;
                } finally {
                    context.unbindService(bVar);
                }
            } catch (Throwable unused2) {
                str2 = "bind hms service InterruptedException";
                com.tencent.qmsp.sdk.base.c.b(str2);
                return null;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            str = "HMS not found";
        }
    }

    private static String a() {
        return "AdId";
    }
}
