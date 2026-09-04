package com.tencent.qmsp.sdk.g.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f101979e = "com.mdid.msa";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f101980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ServiceConnection f101981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f101982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.qmsp.sdk.g.d.a f101983d;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f101984a;

        a(b bVar, c cVar) {
            this.f101984a = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                b.this.f101983d = com.tencent.qmsp.sdk.g.d.a.AbstractBinderC1002a.a(iBinder);
                new d(b.this.f101983d, this.f101984a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f101983d = null;
            b.this.f101983d = null;
        }
    }

    public b(Context context, c cVar) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f101982c = context;
        this.f101980a = cVar;
        this.f101981b = new a(this, cVar);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(f101979e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(f101979e, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public String a() {
        try {
            com.tencent.qmsp.sdk.g.d.a aVar = this.f101983d;
            return aVar == null ? "" : aVar.b();
        } catch (Exception unused) {
            return "";
        }
    }

    public void a(String str) {
        c cVar;
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (this.f101982c.bindService(intent, this.f101981b, 1) || (cVar = this.f101980a) == null) {
            return;
        }
        cVar.g();
    }

    public String b() {
        try {
            com.tencent.qmsp.sdk.g.d.a aVar = this.f101983d;
            return aVar == null ? "" : aVar.a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public boolean c() {
        try {
            com.tencent.qmsp.sdk.g.d.a aVar = this.f101983d;
            if (aVar == null) {
                return false;
            }
            return aVar.d();
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        com.tencent.qmsp.sdk.g.d.a aVar = this.f101983d;
        if (aVar != null) {
            try {
                aVar.e();
                ServiceConnection serviceConnection = this.f101981b;
                if (serviceConnection != null) {
                    this.f101982c.unbindService(serviceConnection);
                }
            } catch (Exception unused) {
            }
            this.f101981b = null;
            this.f101983d = null;
        }
    }
}
