package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.app.r;

/* JADX INFO: compiled from: CustomTabsSessionToken.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3246d = "CustomTabsSessionToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    final android.support.customtabs.a f3247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final PendingIntent f3248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final androidx.browser.customtabs.b f3249c;

    /* JADX INFO: compiled from: CustomTabsSessionToken.java */
    public class a extends androidx.browser.customtabs.b {
        a() {
        }

        @Override // androidx.browser.customtabs.b
        public void a(@n0 String str, @p0 Bundle bundle) {
            try {
                h.this.f3247a.M0(str, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.b
        @n0
        public Bundle b(@n0 String str, @p0 Bundle bundle) {
            try {
                return h.this.f3247a.k(str, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // androidx.browser.customtabs.b
        public void c(int i10, int i11, @n0 Bundle bundle) {
            try {
                h.this.f3247a.e0(i10, i11, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.b
        public void d(@p0 Bundle bundle) {
            try {
                h.this.f3247a.l1(bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.b
        public void e(int i10, @p0 Bundle bundle) {
            try {
                h.this.f3247a.l0(i10, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.b
        public void f(@n0 String str, @p0 Bundle bundle) {
            try {
                h.this.f3247a.a(str, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.b
        public void g(int i10, @n0 Uri uri, boolean z10, @p0 Bundle bundle) {
            try {
                h.this.f3247a.m1(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
                Log.e(h.f3246d, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    /* JADX INFO: compiled from: CustomTabsSessionToken.java */
    public static class b extends android.support.customtabs.a.b {
        b() {
        }

        @Override // android.support.customtabs.a
        public void M0(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void a(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a.b, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.a
        public void e0(int i10, int i11, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public Bundle k(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.a
        public void l0(int i10, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void l1(Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void m1(int i10, Uri uri, boolean z10, Bundle bundle) {
        }
    }

    h(@p0 android.support.customtabs.a aVar, @p0 PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f3247a = aVar;
        this.f3248b = pendingIntent;
        this.f3249c = aVar == null ? null : new a();
    }

    @n0
    public static h a() {
        return new h(new b(), null);
    }

    private IBinder d() {
        android.support.customtabs.a aVar = this.f3247a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @p0
    public static h f(@n0 Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder iBinderA = r.a(extras, d.f3198d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(d.f3200e);
        if (iBinderA == null && pendingIntent == null) {
            return null;
        }
        return new h(iBinderA != null ? android.support.customtabs.a.b.g(iBinderA) : null, pendingIntent);
    }

    @p0
    public androidx.browser.customtabs.b b() {
        return this.f3249c;
    }

    @p0
    IBinder c() {
        android.support.customtabs.a aVar = this.f3247a;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    @p0
    PendingIntent e() {
        return this.f3248b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        PendingIntent pendingIntentE = hVar.e();
        PendingIntent pendingIntent = this.f3248b;
        if ((pendingIntent == null) != (pendingIntentE == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentE) : d().equals(hVar.d());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean g() {
        return this.f3247a != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h() {
        return this.f3248b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f3248b;
        return pendingIntent != null ? pendingIntent.hashCode() : d().hashCode();
    }

    public boolean i(@n0 g gVar) {
        return gVar.d().equals(this.f3247a);
    }
}
