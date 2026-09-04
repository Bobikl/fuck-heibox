package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3346c = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3347d = "android.support.customtabs.trusted.PLATFORM_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3348e = "android.support.customtabs.trusted.NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3349f = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3350g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f3351h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.trusted.b f3352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f3353b;

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public class a extends android.support.customtabs.trusted.a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f3354c;

        a(q qVar) {
            this.f3354c = qVar;
        }

        @Override // android.support.customtabs.trusted.a
        public void k1(String str, Bundle bundle) throws RemoteException {
            this.f3354c.a(str, bundle);
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable[] f3355a;

        b(Parcelable[] parcelableArr) {
            this.f3355a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            w.c(bundle, w.f3350g);
            return new b(bundle.getParcelableArray(w.f3350g));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(w.f3350g, this.f3355a);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3357b;

        c(String str, int i10) {
            this.f3356a = str;
            this.f3357b = i10;
        }

        public static c a(Bundle bundle) {
            w.c(bundle, w.f3346c);
            w.c(bundle, w.f3347d);
            return new c(bundle.getString(w.f3346c), bundle.getInt(w.f3347d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(w.f3346c, this.f3356a);
            bundle.putInt(w.f3347d, this.f3357b);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3358a;

        d(String str) {
            this.f3358a = str;
        }

        public static d a(Bundle bundle) {
            w.c(bundle, w.f3349f);
            return new d(bundle.getString(w.f3349f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(w.f3349f, this.f3358a);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Notification f3361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3362d;

        e(String str, int i10, Notification notification, String str2) {
            this.f3359a = str;
            this.f3360b = i10;
            this.f3361c = notification;
            this.f3362d = str2;
        }

        public static e a(Bundle bundle) {
            w.c(bundle, w.f3346c);
            w.c(bundle, w.f3347d);
            w.c(bundle, w.f3348e);
            w.c(bundle, w.f3349f);
            return new e(bundle.getString(w.f3346c), bundle.getInt(w.f3347d), (Notification) bundle.getParcelable(w.f3348e), bundle.getString(w.f3349f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(w.f3346c, this.f3359a);
            bundle.putInt(w.f3347d, this.f3360b);
            bundle.putParcelable(w.f3348e, this.f3361c);
            bundle.putString(w.f3349f, this.f3362d);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3363a;

        f(boolean z10) {
            this.f3363a = z10;
        }

        public static f a(Bundle bundle) {
            w.c(bundle, w.f3351h);
            return new f(bundle.getBoolean(w.f3351h));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(w.f3351h, this.f3363a);
            return bundle;
        }
    }

    w(@n0 android.support.customtabs.trusted.b bVar, @n0 ComponentName componentName) {
        this.f3352a = bVar;
        this.f3353b = componentName;
    }

    static void c(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    @p0
    private static android.support.customtabs.trusted.a j(@p0 q qVar) {
        if (qVar == null) {
            return null;
        }
        return new a(qVar);
    }

    public boolean a(@n0 String str) throws RemoteException {
        return f.a(this.f3352a.d1(new d(str).b())).f3363a;
    }

    public void b(@n0 String str, int i10) throws RemoteException {
        this.f3352a.g1(new c(str, i10).b());
    }

    @n0
    @w0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] d() throws RemoteException {
        return b.a(this.f3352a.U0()).f3355a;
    }

    @n0
    public ComponentName e() {
        return this.f3353b;
    }

    @p0
    public Bitmap f() throws RemoteException {
        return (Bitmap) this.f3352a.G0().getParcelable(TrustedWebActivityService.f3261g);
    }

    public int g() throws RemoteException {
        return this.f3352a.c1();
    }

    public boolean h(@n0 String str, int i10, @n0 Notification notification, @n0 String str2) throws RemoteException {
        return f.a(this.f3352a.q(new e(str, i10, notification, str2).b())).f3363a;
    }

    @p0
    public Bundle i(@n0 String str, @n0 Bundle bundle, @p0 q qVar) throws RemoteException {
        android.support.customtabs.trusted.a aVarJ = j(qVar);
        return this.f3352a.A0(str, bundle, aVarJ == null ? null : aVarJ.asBinder());
    }
}
