package com.max.hbutils.optimize;

import android.os.Debug;
import android.os.Environment;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: OutOfMemoryDumper.java */
/* JADX INFO: loaded from: classes13.dex */
public class d implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f73460b = "OutOfMemoryDumper";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f73461c = "OOM-";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f73462d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f73463a;

    private d() {
    }

    public static void a() {
    }

    private boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.to, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return true;
        }
        Log.w(f73460b, "The external storage isn't available. hprof data won't be dumped! (state=" + externalStorageState + ")");
        return false;
    }

    private void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ro, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof d)) {
            this.f73463a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
        Log.v(f73460b, "OutOfMemoryDumper is ready");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{thread, th2}, this, changeQuickRedirect, false, bb.c.k.so, new Class[]{Thread.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.e(f73460b, "Uncaught exception: " + th2 + " " + Thread.currentThread().getName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Caused by: ");
        sb2.append(th2.getCause());
        Log.e(f73460b, sb2.toString());
        if ((th2.getClass().equals(OutOfMemoryError.class) || (th2.getCause() != null && th2.getCause().getClass().equals(OutOfMemoryError.class))) && b()) {
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                String str = externalStoragePublicDirectory.getAbsolutePath() + "/" + f73461c + System.currentTimeMillis() + ".hprof";
                Log.i(f73460b, "Dumping hprof data to: " + str);
                Debug.dumpHprofData(str);
            } catch (IOException e10) {
                Log.e(f73460b, "Failed to dump hprof data. " + e10.toString());
                e10.printStackTrace();
            }
        }
        if (this.f73463a != null) {
            Log.v(f73460b, "Invoking the original uncaught exception handler");
            this.f73463a.uncaughtException(thread, th2);
        }
    }
}
