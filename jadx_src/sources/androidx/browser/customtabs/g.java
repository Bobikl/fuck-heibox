package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3238f = "CustomTabsSession";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3239a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.customtabs.b f3240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.customtabs.a f3241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f3242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final PendingIntent f3243e;

    /* JADX INFO: compiled from: CustomTabsSession.java */
    public static class a extends android.support.customtabs.b.AbstractBinderC0005b {
        a() {
        }

        @Override // android.support.customtabs.b
        public boolean I0(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean K0(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean O(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean Z(long j10) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean f(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public int g0(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean i(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean i0(android.support.customtabs.a aVar) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean j1(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean r(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public Bundle y0(String str, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    /* JADX INFO: compiled from: CustomTabsSession.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final androidx.browser.customtabs.b f3244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final PendingIntent f3245b;

        b(@p0 androidx.browser.customtabs.b bVar, @p0 PendingIntent pendingIntent) {
            this.f3244a = bVar;
            this.f3245b = pendingIntent;
        }

        @p0
        androidx.browser.customtabs.b a() {
            return this.f3244a;
        }

        @p0
        PendingIntent b() {
            return this.f3245b;
        }
    }

    g(android.support.customtabs.b bVar, android.support.customtabs.a aVar, ComponentName componentName, @p0 PendingIntent pendingIntent) {
        this.f3240b = bVar;
        this.f3241c = aVar;
        this.f3242d = componentName;
        this.f3243e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f3243e;
        if (pendingIntent != null) {
            bundle.putParcelable(d.f3200e, pendingIntent);
        }
    }

    private Bundle b(@p0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    @j1
    @n0
    public static g c(@n0 ComponentName componentName) {
        return new g(new a(), new h.b(), componentName, null);
    }

    IBinder d() {
        return this.f3241c.asBinder();
    }

    ComponentName e() {
        return this.f3242d;
    }

    @p0
    PendingIntent f() {
        return this.f3243e;
    }

    public boolean g(@p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list) {
        try {
            return this.f3240b.O(this.f3241c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(@n0 String str, @p0 Bundle bundle) {
        int iG0;
        Bundle bundleB = b(bundle);
        synchronized (this.f3239a) {
            try {
                try {
                    iG0 = this.f3240b.g0(this.f3241c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iG0;
    }

    public boolean i(@n0 Uri uri, int i10, @p0 Bundle bundle) {
        try {
            return this.f3240b.i(this.f3241c, uri, i10, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean j(@n0 Uri uri) {
        try {
            return this.f3243e != null ? this.f3240b.I0(this.f3241c, uri, b(null)) : this.f3240b.j1(this.f3241c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(@n0 Bitmap bitmap, @n0 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.f3216t, bitmap);
        bundle.putString(d.f3217u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.f3213q, bundle);
        a(bundle);
        try {
            return this.f3240b.r(this.f3241c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean l(@p0 RemoteViews remoteViews, @p0 int[] iArr, @p0 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.G, remoteViews);
        bundle.putIntArray(d.H, iArr);
        bundle.putParcelable(d.I, pendingIntent);
        a(bundle);
        try {
            return this.f3240b.r(this.f3241c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean m(int i10, @n0 Bitmap bitmap, @n0 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(d.f3194a0, i10);
        bundle.putParcelable(d.f3216t, bitmap);
        bundle.putString(d.f3217u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.f3213q, bundle);
        a(bundle2);
        try {
            return this.f3240b.r(this.f3241c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(int i10, @n0 Uri uri, @p0 Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f3240b.f(this.f3241c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
