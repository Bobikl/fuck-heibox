package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.y0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import z8.d0;
import z8.v;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f52643b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile b f52644c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    @d0
    public ConcurrentHashMap f52645a = new ConcurrentHashMap();

    private b() {
    }

    @n0
    @v8.a
    public static b b() {
        if (f52644c == null) {
            synchronized (f52643b) {
                if (f52644c == null) {
                    f52644c = new b();
                }
            }
        }
        b bVar = f52644c;
        p.l(bVar);
        return bVar;
    }

    private static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((com.google.android.gms.common.wrappers.e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!h(serviceConnection)) {
            return i(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f52645a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zI = i(context, intent, serviceConnection, i10, executor);
            if (zI) {
                return zI;
            }
            this.f52645a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            this.f52645a.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }

    private static boolean h(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof y0);
    }

    private static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return (!v.p() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @v8.a
    public boolean a(@n0 Context context, @n0 Intent intent, @n0 ServiceConnection serviceConnection, int i10) {
        return g(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    @v8.a
    public void c(@n0 Context context, @n0 ServiceConnection serviceConnection) {
        if (!h(serviceConnection) || !this.f52645a.containsKey(serviceConnection)) {
            f(context, serviceConnection);
            return;
        }
        try {
            f(context, (ServiceConnection) this.f52645a.get(serviceConnection));
        } finally {
            this.f52645a.remove(serviceConnection);
        }
    }

    @v8.a
    public void d(@n0 Context context, @n0 ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean e(@n0 Context context, @n0 String str, @n0 Intent intent, @n0 ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        return g(context, str, intent, serviceConnection, i10, true, executor);
    }
}
