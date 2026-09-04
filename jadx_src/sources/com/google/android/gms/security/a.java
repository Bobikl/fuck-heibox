package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    public static final String f52741a = "GmsCore_OpenSSL";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f52742b = e.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52743c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("ProviderInstaller.lock")
    private static Method f52744d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("ProviderInstaller.lock")
    private static Method f52745e = null;

    /* JADX INFO: renamed from: com.google.android.gms.security.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface InterfaceC0413a {
        void a(int i10, @p0 Intent intent);

        void b();
    }

    public static void a(@n0 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context contextB;
        p.m(context, "Context must not be null");
        f52742b.p(context, 11925000);
        synchronized (f52743c) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                contextB = DynamiteModule.e(context, DynamiteModule.f52683j, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.LoadingException e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                contextB = null;
            }
            if (contextB != null) {
                e(contextB, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Context contextI = f.i(context);
            if (contextI != null) {
                try {
                    if (f52745e == null) {
                        Class cls = Long.TYPE;
                        f52745e = d(contextI, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f52745e.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (contextI != null) {
                e(contextI, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void b(@n0 Context context, @n0 InterfaceC0413a interfaceC0413a) {
        p.m(context, "Context must not be null");
        p.m(interfaceC0413a, "Listener must not be null");
        p.g("Must be called on the UI thread");
        new b(context, interfaceC0413a).execute(new Void[0]);
    }

    private static Method d(Context context, String str, String str2, Class[] clsArr) throws NoSuchMethodException, ClassNotFoundException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @b0("ProviderInstaller.lock")
    private static void e(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f52744d == null) {
                f52744d = d(context, str, "insertProvider", new Class[]{Context.class});
            }
            f52744d.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
