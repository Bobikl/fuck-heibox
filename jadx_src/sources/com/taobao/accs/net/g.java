package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static volatile g f98323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f98324c = {270, 360, 480};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f98325a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98328f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f98329g = {0, 0, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98330h;

    protected g(Context context) {
        this.f98330h = true;
        try {
            this.f98325a = context;
            this.f98326d = 0;
            this.f98327e = System.currentTimeMillis();
            this.f98330h = com.taobao.accs.utl.t.a();
        } catch (Throwable th2) {
            ALog.e("HeartbeatManager", "HeartbeatManager", th2, new Object[0]);
        }
    }

    public static g a(Context context) {
        if (f98323b == null) {
            synchronized (g.class) {
                if (f98323b == null) {
                    if (GlobalConfig.isJobHeartbeatEnable() && b(context)) {
                        ALog.i("HeartbeatManager", "hb use job", new Object[0]);
                        f98323b = new f(context);
                    } else {
                        ALog.i("HeartbeatManager", "hb use alarm", new Object[0]);
                        f98323b = new e(context);
                    }
                }
            }
        }
        return f98323b;
    }

    private static boolean b(Context context) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0);
            return serviceInfo != null && serviceInfo.isEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    public synchronized void a() {
        try {
            if (this.f98327e < 0) {
                this.f98327e = System.currentTimeMillis();
            }
            int iB = b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("HeartbeatManager", "set " + iB, new Object[0]);
            }
            a(iB);
        } catch (Throwable th2) {
            ALog.e("HeartbeatManager", "set", th2, new Object[0]);
        }
    }

    protected abstract void a(int i10);

    public int b() {
        int i10 = this.f98330h ? f98324c[this.f98326d] : 270;
        this.f98330h = com.taobao.accs.utl.t.a();
        return i10;
    }

    public void c() {
        this.f98327e = -1L;
        if (this.f98328f) {
            int[] iArr = this.f98329g;
            int i10 = this.f98326d;
            iArr[i10] = iArr[i10] + 1;
        }
        int i11 = this.f98326d;
        this.f98326d = i11 > 0 ? i11 - 1 : 0;
        ALog.d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    public void d() {
        this.f98327e = -1L;
        ALog.d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    public void e() {
        ALog.d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f98327e <= 7199000) {
            this.f98328f = false;
            this.f98329g[this.f98326d] = 0;
            return;
        }
        int i10 = this.f98326d;
        if (i10 >= f98324c.length - 1 || this.f98329g[i10] > 2) {
            return;
        }
        ALog.d("HeartbeatManager", "upgrade", new Object[0]);
        this.f98326d++;
        this.f98328f = true;
        this.f98327e = System.currentTimeMillis();
    }

    public void f() {
        this.f98326d = 0;
        this.f98327e = System.currentTimeMillis();
        ALog.d("HeartbeatManager", "resetLevel", new Object[0]);
    }
}
