package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.j2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3131d = "android.support.customtabs.action.CustomTabsService";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3132e = "androidx.browser.customtabs.category.NavBarColorCustomization";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3133f = "androidx.browser.customtabs.category.ColorSchemeCustomization";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3134g = "androidx.browser.trusted.category.TrustedWebActivities";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3135h = "androidx.browser.trusted.category.WebShareTargetV2";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3136i = "androidx.browser.trusted.category.ImmersiveMode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3137j = "android.support.customtabs.otherurls.URL";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3138k = "androidx.browser.customtabs.SUCCESS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f3139l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f3140m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3141n = -2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3142o = -3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3143p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3144q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3145r = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j2<IBinder, IBinder.DeathRecipient> f3146b = new j2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.customtabs.b.AbstractBinderC0005b f3147c = new a();

    public class a extends android.support.customtabs.b.AbstractBinderC0005b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f1(h hVar) {
            CustomTabsService.this.a(hVar);
        }

        private boolean q1(@n0 android.support.customtabs.a aVar, @p0 PendingIntent pendingIntent) {
            final h hVar = new h(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.e
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f3234a.f1(hVar);
                    }
                };
                synchronized (CustomTabsService.this.f3146b) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f3146b.put(aVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.d(hVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @p0
        private PendingIntent r0(@p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(androidx.browser.customtabs.d.f3200e);
            bundle.remove(androidx.browser.customtabs.d.f3200e);
            return pendingIntent;
        }

        @Override // android.support.customtabs.b
        public boolean I0(@n0 android.support.customtabs.a aVar, @n0 Uri uri, @n0 Bundle bundle) {
            return CustomTabsService.this.g(new h(aVar, r0(bundle)), uri);
        }

        @Override // android.support.customtabs.b
        public boolean K0(@n0 android.support.customtabs.a aVar, @p0 Bundle bundle) {
            return q1(aVar, r0(bundle));
        }

        @Override // android.support.customtabs.b
        public boolean O(@p0 android.support.customtabs.a aVar, @p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list) {
            return CustomTabsService.this.c(new h(aVar, r0(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.b
        public boolean Z(long j10) {
            return CustomTabsService.this.j(j10);
        }

        @Override // android.support.customtabs.b
        public boolean f(@n0 android.support.customtabs.a aVar, int i10, @n0 Uri uri, @p0 Bundle bundle) {
            return CustomTabsService.this.i(new h(aVar, r0(bundle)), i10, uri, bundle);
        }

        @Override // android.support.customtabs.b
        public int g0(@n0 android.support.customtabs.a aVar, @n0 String str, @p0 Bundle bundle) {
            return CustomTabsService.this.e(new h(aVar, r0(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean i(@n0 android.support.customtabs.a aVar, @n0 Uri uri, int i10, @p0 Bundle bundle) {
            return CustomTabsService.this.f(new h(aVar, r0(bundle)), uri, i10, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean i0(@n0 android.support.customtabs.a aVar) {
            return q1(aVar, null);
        }

        @Override // android.support.customtabs.b
        public boolean j1(@n0 android.support.customtabs.a aVar, @n0 Uri uri) {
            return CustomTabsService.this.g(new h(aVar, null), uri);
        }

        @Override // android.support.customtabs.b
        public boolean r(@n0 android.support.customtabs.a aVar, @p0 Bundle bundle) {
            return CustomTabsService.this.h(new h(aVar, r0(bundle)), bundle);
        }

        @Override // android.support.customtabs.b
        public Bundle y0(@n0 String str, @p0 Bundle bundle) {
            return CustomTabsService.this.b(str, bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    protected boolean a(@n0 h hVar) {
        try {
            synchronized (this.f3146b) {
                IBinder iBinderC = hVar.c();
                if (iBinderC == null) {
                    return false;
                }
                iBinderC.unlinkToDeath(this.f3146b.get(iBinderC), 0);
                this.f3146b.remove(iBinderC);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @p0
    protected abstract Bundle b(@n0 String str, @p0 Bundle bundle);

    protected abstract boolean c(@n0 h hVar, @p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list);

    protected abstract boolean d(@n0 h hVar);

    protected abstract int e(@n0 h hVar, @n0 String str, @p0 Bundle bundle);

    protected abstract boolean f(@n0 h hVar, @n0 Uri uri, int i10, @p0 Bundle bundle);

    protected abstract boolean g(@n0 h hVar, @n0 Uri uri);

    protected abstract boolean h(@n0 h hVar, @p0 Bundle bundle);

    protected abstract boolean i(@n0 h hVar, int i10, @n0 Uri uri, @p0 Bundle bundle);

    protected abstract boolean j(long j10);

    @Override // android.app.Service
    @n0
    public IBinder onBind(@p0 Intent intent) {
        return this.f3147c;
    }
}
