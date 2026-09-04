package com.tencent.open.log;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.connect.common.Constants;
import java.io.File;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class SLog implements TraceLevel {
    public static final String TAG = "openSDK_LOG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f101096c = false;
    public static SLog instance;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f101097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Tracer f101098b;

    private SLog() {
    }

    protected static File a() {
        String str = c.f101126d;
        try {
            d.c cVarB = d.b.b();
            return cVarB != null && (cVarB.c() > c.f101128f ? 1 : (cVarB.c() == c.f101128f ? 0 : -1)) > 0 ? new File(Environment.getExternalStorageDirectory(), str) : new File(com.tencent.open.utils.g.c(), str);
        } catch (Throwable th2) {
            e(TAG, "getLogFilePath:", th2);
            return null;
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return d.a(str) ? "xxxxxx" : str;
    }

    private void d() {
        this.f101097a = new a(new b(a(), c.f101135m, c.f101129g, c.f101130h, c.f101125c, c.f101131i, 10, c.f101127e, c.f101136n));
    }

    public static final void d(String str, String str2) {
        getInstance().a(2, str, str2, null);
    }

    public static final void d(String str, String str2, Throwable th2) {
        getInstance().a(2, str, str2, th2);
    }

    public static final void e(String str, String str2) {
        getInstance().a(16, str, str2, null);
    }

    public static final void e(String str, String str2, Throwable th2) {
        getInstance().a(16, str, str2, th2);
    }

    public static void flushLogs() {
        getInstance().c();
    }

    public static SLog getInstance() {
        if (instance == null) {
            synchronized (SLog.class) {
                if (instance == null) {
                    SLog sLog = new SLog();
                    instance = sLog;
                    sLog.d();
                    f101096c = true;
                }
            }
        }
        return instance;
    }

    public static final void i(String str, String str2) {
        getInstance().a(4, str, str2, null);
    }

    public static final void i(String str, String str2, Throwable th2) {
        getInstance().a(4, str, str2, th2);
    }

    public static void release() {
        synchronized (SLog.class) {
            getInstance().b();
            if (instance != null) {
                instance = null;
            }
        }
    }

    public static final void u(String str, String str2) {
        getInstance().a(32, str, str2, null);
    }

    public static final void u(String str, String str2, Throwable th2) {
        getInstance().a(32, str, str2, th2);
    }

    public static final void v(String str, String str2) {
        getInstance().a(1, str, str2, null);
    }

    public static final void v(String str, String str2, Throwable th2) {
        getInstance().a(1, str, str2, th2);
    }

    public static final void w(String str, String str2) {
        getInstance().a(8, str, str2, null);
    }

    public static final void w(String str, String str2, Throwable th2) {
        getInstance().a(8, str, str2, th2);
    }

    protected void a(int i10, String str, String str2, Throwable th2) {
        if (f101096c) {
            String strB = com.tencent.open.utils.g.b();
            if (!TextUtils.isEmpty(strB)) {
                String str3 = strB + " SDK_VERSION:" + Constants.SDK_VERSION;
                if (this.f101097a == null) {
                    return;
                }
                e.f101141a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.f101097a.a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                f101096c = false;
            }
        }
        e.f101141a.a(i10, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
        if (d.a.a(c.f101124b, i10)) {
            a aVar = this.f101097a;
            if (aVar == null) {
                return;
            } else {
                aVar.a(i10, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
            }
        }
        Tracer tracer = this.f101098b;
        if (tracer != null) {
            try {
                tracer.a(i10, Thread.currentThread(), System.currentTimeMillis(), str, a(str2), th2);
            } catch (Exception e10) {
                Log.e(str, "Exception", e10);
            }
        }
    }

    protected void b() {
        a aVar = this.f101097a;
        if (aVar != null) {
            aVar.a();
            this.f101097a.b();
            this.f101097a = null;
        }
    }

    protected void c() {
        a aVar = this.f101097a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setCustomLogger(Tracer tracer) {
        this.f101098b = tracer;
    }
}
