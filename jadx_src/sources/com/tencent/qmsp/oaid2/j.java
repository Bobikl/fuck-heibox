package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101611b;

        public a(String str, boolean z10) {
            this.f101610a = str;
            this.f101611b = z10;
        }

        public final String a() {
            return this.f101610a;
        }

        public final boolean b() {
            return this.f101611b;
        }
    }

    public static a a(Context context) {
        Log.i(a(), "getAdvertisingIdInfo " + System.currentTimeMillis());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c.b("Cannot be called from the main thread");
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            k kVar = new k();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            if (!context.bindService(intent, kVar, 1)) {
                c.b("bind failed");
                return null;
            }
            Log.i(a(), "bind ok");
            try {
                try {
                    if (kVar.f101620a) {
                        throw new IllegalStateException();
                    }
                    kVar.f101620a = true;
                    m mVarA = m.a.a(kVar.f101621b.take());
                    a aVar = new a(mVarA.m(), mVarA.h());
                    context.unbindService(kVar);
                    return aVar;
                } catch (Throwable th2) {
                    context.unbindService(kVar);
                    throw th2;
                }
            } catch (RemoteException unused) {
                c.b("bind hms service RemoteException");
                context.unbindService(kVar);
                return null;
            } catch (Throwable unused2) {
                c.b("bind hms service InterruptedException");
                context.unbindService(kVar);
                return null;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            c.b("HMS not found");
            return null;
        }
    }

    public static String a() {
        return "AdId";
    }
}
