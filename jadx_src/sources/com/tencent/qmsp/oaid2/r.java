package com.tencent.qmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f101649e = "com.mdid.msa";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f101650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f101651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f101652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f101653d;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f101654a;

        public a(r rVar, s sVar) {
            this.f101654a = sVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                r.this.f101653d = q.a.a(iBinder);
                new t(r.this.f101653d, this.f101654a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            r.this.f101653d = null;
            r.this.f101653d = null;
        }
    }

    public r(Context context, s sVar) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f101652c = context;
        this.f101650a = sVar;
        this.f101651b = new a(this, sVar);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(f101649e, "com.mdid.msa.service.MsaKlService");
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
            context.getPackageManager().getPackageInfo(f101649e, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public String a() {
        try {
            q qVar = this.f101653d;
            return qVar == null ? "" : qVar.d();
        } catch (Exception unused) {
            return "";
        }
    }

    public void a(String str) {
        s sVar;
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (this.f101652c.bindService(intent, this.f101651b, 1) || (sVar = this.f101650a) == null) {
            return;
        }
        sVar.b();
    }

    public String b() {
        try {
            q qVar = this.f101653d;
            return qVar == null ? "" : qVar.a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public boolean c() {
        try {
            q qVar = this.f101653d;
            if (qVar == null) {
                return false;
            }
            return qVar.g();
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        q qVar = this.f101653d;
        if (qVar != null) {
            try {
                qVar.f();
                ServiceConnection serviceConnection = this.f101651b;
                if (serviceConnection != null) {
                    this.f101652c.unbindService(serviceConnection);
                }
            } catch (Exception unused) {
            }
            this.f101651b = null;
            this.f101653d = null;
        }
    }
}
