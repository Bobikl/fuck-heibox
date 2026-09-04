package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f52514a = 4225;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f52515b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private static x0 f52516c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @z8.d0
    @androidx.annotation.p0
    static HandlerThread f52517d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f52518e = false;

    @v8.a
    public static int c() {
        return f52514a;
    }

    @androidx.annotation.n0
    @v8.a
    public static f d(@androidx.annotation.n0 Context context) {
        synchronized (f52515b) {
            if (f52516c == null) {
                f52516c = new x0(context.getApplicationContext(), f52518e ? e().getLooper() : context.getMainLooper());
            }
        }
        return f52516c;
    }

    @androidx.annotation.n0
    @v8.a
    public static HandlerThread e() {
        synchronized (f52515b) {
            HandlerThread handlerThread = f52517d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f52517d = handlerThread2;
            handlerThread2.start();
            return f52517d;
        }
    }

    @v8.a
    public static void f() {
        synchronized (f52515b) {
            x0 x0Var = f52516c;
            if (x0Var != null && !f52518e) {
                x0Var.q(e().getLooper());
            }
            f52518e = true;
        }
    }

    @v8.a
    public boolean a(@androidx.annotation.n0 ComponentName componentName, @androidx.annotation.n0 ServiceConnection serviceConnection, @androidx.annotation.n0 String str) {
        return k(new s0(componentName, c()), serviceConnection, str, null);
    }

    @v8.a
    public boolean b(@androidx.annotation.n0 String str, @androidx.annotation.n0 ServiceConnection serviceConnection, @androidx.annotation.n0 String str2) {
        return k(new s0(str, c(), false), serviceConnection, str2, null);
    }

    @v8.a
    public void g(@androidx.annotation.n0 ComponentName componentName, @androidx.annotation.n0 ServiceConnection serviceConnection, @androidx.annotation.n0 String str) {
        i(new s0(componentName, c()), serviceConnection, str);
    }

    @v8.a
    public void h(@androidx.annotation.n0 String str, @androidx.annotation.n0 ServiceConnection serviceConnection, @androidx.annotation.n0 String str2) {
        i(new s0(str, c(), false), serviceConnection, str2);
    }

    protected abstract void i(s0 s0Var, ServiceConnection serviceConnection, String str);

    public final void j(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, int i10, @androidx.annotation.n0 ServiceConnection serviceConnection, @androidx.annotation.n0 String str3, boolean z10) {
        i(new s0(str, str2, i10, z10), serviceConnection, str3);
    }

    protected abstract boolean k(s0 s0Var, ServiceConnection serviceConnection, String str, @androidx.annotation.p0 Executor executor);
}
