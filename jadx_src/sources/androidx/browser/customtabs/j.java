package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: PostMessageServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements i, ServiceConnection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3251g = "PostMessageServConn";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3252b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.customtabs.a f3253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private android.support.customtabs.c f3254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private String f3255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3256f;

    public j(@n0 h hVar) {
        IBinder iBinderC = hVar.c();
        if (iBinderC == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.f3253c = android.support.customtabs.a.b.g(iBinderC);
    }

    private boolean g() {
        return this.f3254d != null;
    }

    private boolean i(@p0 Bundle bundle) {
        if (this.f3254d == null) {
            return false;
        }
        synchronized (this.f3252b) {
            try {
                try {
                    this.f3254d.m(this.f3253c, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.i
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean a(@n0 String str, @p0 Bundle bundle) {
        return l(str, bundle);
    }

    @Override // androidx.browser.customtabs.i
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean b(@p0 Bundle bundle) {
        return h(bundle);
    }

    @Override // androidx.browser.customtabs.i
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void c(@n0 Context context) {
        n(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean d(@n0 Context context) {
        String str = this.f3255e;
        if (str != null) {
            return e(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public boolean e(@n0 Context context, @n0 String str) {
        Intent intent = new Intent();
        intent.setClassName(str, PostMessageService.class.getName());
        boolean zBindService = context.bindService(intent, this, 1);
        if (!zBindService) {
            Log.w(f3251g, "Could not bind to PostMessageService in client.");
        }
        return zBindService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void f(@n0 Context context) {
        if (g()) {
            n(context);
        }
    }

    public final boolean h(@p0 Bundle bundle) {
        this.f3256f = true;
        return i(bundle);
    }

    public void j() {
        if (this.f3256f) {
            i(null);
        }
    }

    public void k() {
    }

    public final boolean l(@n0 String str, @p0 Bundle bundle) {
        if (this.f3254d == null) {
            return false;
        }
        synchronized (this.f3252b) {
            try {
                try {
                    this.f3254d.b1(this.f3253c, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void m(@n0 String str) {
        this.f3255e = str;
    }

    public void n(@n0 Context context) {
        if (g()) {
            context.unbindService(this);
            this.f3254d = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@n0 ComponentName componentName, @n0 IBinder iBinder) {
        this.f3254d = android.support.customtabs.c.b.g(iBinder);
        j();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@n0 ComponentName componentName) {
        this.f3254d = null;
        k();
    }
}
