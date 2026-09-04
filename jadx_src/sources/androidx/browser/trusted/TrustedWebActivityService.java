package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.z0;
import androidx.core.app.l2;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String f3259e = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3260f = "android.support.customtabs.trusted.SMALL_ICON";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3261g = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3262h = "androidx.browser.trusted.SUCCESS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f3263i = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NotificationManager f3264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3265c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.support.customtabs.trusted.b.AbstractBinderC0009b f3266d = new a();

    public class a extends android.support.customtabs.trusted.b.AbstractBinderC0009b {
        a() {
        }

        private void N() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f3265c == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                m mVarA = TrustedWebActivityService.this.c().a();
                PackageManager packageManager = TrustedWebActivityService.this.getPackageManager();
                if (mVarA != null) {
                    for (String str : packagesForUid) {
                        if (mVarA.c(str, packageManager)) {
                            TrustedWebActivityService.this.f3265c = Binder.getCallingUid();
                            break;
                        }
                    }
                }
            }
            if (TrustedWebActivityService.this.f3265c != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle A0(String str, Bundle bundle, IBinder iBinder) {
            N();
            return TrustedWebActivityService.this.f(str, bundle, r.a(iBinder));
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle G0() {
            N();
            return TrustedWebActivityService.this.h();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle U0() {
            N();
            return new w.b(TrustedWebActivityService.this.g()).b();
        }

        @Override // android.support.customtabs.trusted.b
        public int c1() {
            N();
            return TrustedWebActivityService.this.i();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle d1(Bundle bundle) {
            N();
            return new w.f(TrustedWebActivityService.this.d(w.d.a(bundle).f3358a)).b();
        }

        @Override // android.support.customtabs.trusted.b
        public void g1(Bundle bundle) {
            N();
            w.c cVarA = w.c.a(bundle);
            TrustedWebActivityService.this.e(cVarA.f3356a, cVarA.f3357b);
        }

        @Override // android.support.customtabs.trusted.b
        @z0("android.permission.POST_NOTIFICATIONS")
        public Bundle q(Bundle bundle) {
            N();
            w.e eVarA = w.e.a(bundle);
            return new w.f(TrustedWebActivityService.this.j(eVarA.f3359a, eVarA.f3360b, eVarA.f3361c, eVarA.f3362d)).b();
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void b() {
        if (this.f3264b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @n0
    @androidx.annotation.g
    public abstract p c();

    @androidx.annotation.g
    public boolean d(@n0 String str) {
        b();
        if (!l2.p(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return i.b(this.f3264b, a(str));
    }

    @androidx.annotation.g
    public void e(@n0 String str, int i10) {
        b();
        this.f3264b.cancel(str, i10);
    }

    @androidx.annotation.g
    @p0
    public Bundle f(@n0 String str, @n0 Bundle bundle, @p0 r rVar) {
        return null;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.g
    public Parcelable[] g() {
        b();
        return d.a(this.f3264b);
    }

    @n0
    @androidx.annotation.g
    public Bundle h() {
        int i10 = i();
        Bundle bundle = new Bundle();
        if (i10 == -1) {
            return bundle;
        }
        bundle.putParcelable(f3261g, BitmapFactory.decodeResource(getResources(), i10));
        return bundle;
    }

    @androidx.annotation.g
    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(f3260f, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @z0("android.permission.POST_NOTIFICATIONS")
    @androidx.annotation.g
    public boolean j(@n0 String str, int i10, @n0 Notification notification, @n0 String str2) {
        b();
        if (!l2.p(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strA = a(str2);
            notification = i.a(this, this.f3264b, notification, strA, str2);
            if (!i.b(this.f3264b, strA)) {
                return false;
            }
        }
        this.f3264b.notify(str, i10, notification);
        return true;
    }

    @Override // android.app.Service
    @k0
    @p0
    public final IBinder onBind(@p0 Intent intent) {
        return this.f3266d;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @k0
    public void onCreate() {
        super.onCreate();
        this.f3264b = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    @k0
    public final boolean onUnbind(@p0 Intent intent) {
        this.f3265c = -1;
        return super.onUnbind(intent);
    }
}
