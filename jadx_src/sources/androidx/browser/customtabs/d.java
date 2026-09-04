package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomTabsIntent.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    private static final int D = 2;
    public static final String E = "androidx.browser.customtabs.extra.SHARE_STATE";

    @Deprecated
    public static final String F = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String H = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String I = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String J = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String K = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String L = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String M = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String N = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    private static final int R = 2;
    public static final String S = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String T = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    private static final int X = 2;
    public static final String Y = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String Z = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f3194a0 = "android.support.customtabs.customaction.ID";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f3195b0 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3196c = "android.support.customtabs.extra.user_opt_out";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f3197c0 = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3198d = "android.support.customtabs.extra.SESSION";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f3199d0 = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f3200e = "android.support.customtabs.extra.SESSION_ID";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f3201e0 = "Accept-Language";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3202f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3203g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f3204h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3205i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3206j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3207k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3208l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f3209m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f3210n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3211o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3212p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f3213q = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f3214r = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f3215s = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f3216t = "android.support.customtabs.customaction.ICON";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f3217u = "android.support.customtabs.customaction.DESCRIPTION";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f3218v = "android.support.customtabs.customaction.PENDING_INTENT";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f3219w = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f3220x = "android.support.customtabs.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f3221y = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f3222z = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    public final Intent f3223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final Bundle f3224b;

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    @w0(api = 24)
    public static class b {
        private b() {
        }

        @u
        @p0
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private ArrayList<Bundle> f3227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Bundle f3228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private ArrayList<Bundle> f3229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private SparseArray<Bundle> f3230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Bundle f3231g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f3225a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0023a f3226b = new androidx.browser.customtabs.a.C0023a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f3232h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f3233i = true;

        public c() {
        }

        public c(@p0 g gVar) {
            if (gVar != null) {
                x(gVar);
            }
        }

        @w0(api = 24)
        private void l() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f3225a.hasExtra("com.android.browser.headers") ? this.f3225a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f3225a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void y(@p0 IBinder iBinder, @p0 PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            r.b(bundle, d.f3198d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(d.f3200e, pendingIntent);
            }
            this.f3225a.putExtras(bundle);
        }

        @n0
        public c A(boolean z10) {
            this.f3225a.putExtra(d.f3210n, z10 ? 1 : 0);
            return this;
        }

        @n0
        public c B(@n0 Context context, @androidx.annotation.a int i10, @androidx.annotation.a int i11) {
            this.f3228d = androidx.core.app.i.d(context, i10, i11).l();
            return this;
        }

        @n0
        @Deprecated
        public c C(@l int i10) {
            this.f3226b.e(i10);
            return this;
        }

        @n0
        public c D(@androidx.annotation.r(unit = 0) int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.f3225a.putExtra(d.T, i10);
            return this;
        }

        @n0
        public c E(boolean z10) {
            this.f3225a.putExtra(d.f3208l, z10);
            return this;
        }

        @n0
        @Deprecated
        public c a() {
            z(1);
            return this;
        }

        @n0
        public c b(@n0 String str, @n0 PendingIntent pendingIntent) {
            if (this.f3227c == null) {
                this.f3227c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(d.f3221y, str);
            bundle.putParcelable(d.f3218v, pendingIntent);
            this.f3227c.add(bundle);
            return this;
        }

        @n0
        @Deprecated
        public c c(int i10, @n0 Bitmap bitmap, @n0 String str, @n0 PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f3229e == null) {
                this.f3229e = new ArrayList<>();
            }
            if (this.f3229e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(d.f3194a0, i10);
            bundle.putParcelable(d.f3216t, bitmap);
            bundle.putString(d.f3217u, str);
            bundle.putParcelable(d.f3218v, pendingIntent);
            this.f3229e.add(bundle);
            return this;
        }

        @n0
        public d d() {
            if (!this.f3225a.hasExtra(d.f3198d)) {
                y(null, null);
            }
            ArrayList<Bundle> arrayList = this.f3227c;
            if (arrayList != null) {
                this.f3225a.putParcelableArrayListExtra(d.f3220x, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f3229e;
            if (arrayList2 != null) {
                this.f3225a.putParcelableArrayListExtra(d.f3214r, arrayList2);
            }
            this.f3225a.putExtra(d.K, this.f3233i);
            this.f3225a.putExtras(this.f3226b.a().b());
            Bundle bundle = this.f3231g;
            if (bundle != null) {
                this.f3225a.putExtras(bundle);
            }
            if (this.f3230f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(d.L, this.f3230f);
                this.f3225a.putExtras(bundle2);
            }
            this.f3225a.putExtra(d.E, this.f3232h);
            if (Build.VERSION.SDK_INT >= 24) {
                l();
            }
            return new d(this.f3225a, this.f3228d);
        }

        @n0
        @Deprecated
        public c e() {
            this.f3225a.putExtra(d.f3208l, true);
            return this;
        }

        @n0
        public c f(@n0 Bitmap bitmap, @n0 String str, @n0 PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        @n0
        public c g(@n0 Bitmap bitmap, @n0 String str, @n0 PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt(d.f3194a0, 0);
            bundle.putParcelable(d.f3216t, bitmap);
            bundle.putString(d.f3217u, str);
            bundle.putParcelable(d.f3218v, pendingIntent);
            this.f3225a.putExtra(d.f3213q, bundle);
            this.f3225a.putExtra(d.f3219w, z10);
            return this;
        }

        @n0
        public c h(@n0 Bitmap bitmap) {
            this.f3225a.putExtra(d.f3209m, bitmap);
            return this;
        }

        @n0
        public c i(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f3225a.putExtra(d.Y, i10);
            return this;
        }

        @n0
        public c j(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f3225a.putExtra(d.f3206j, i10);
            return this;
        }

        @n0
        public c k(int i10, @n0 androidx.browser.customtabs.a aVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i10);
            }
            if (this.f3230f == null) {
                this.f3230f = new SparseArray<>();
            }
            this.f3230f.put(i10, aVar.b());
            return this;
        }

        @n0
        public c m(@n0 androidx.browser.customtabs.a aVar) {
            this.f3231g = aVar.b();
            return this;
        }

        @n0
        @Deprecated
        public c n(boolean z10) {
            if (z10) {
                z(1);
            } else {
                z(2);
            }
            return this;
        }

        @n0
        public c o(@n0 Context context, @androidx.annotation.a int i10, @androidx.annotation.a int i11) {
            this.f3225a.putExtra(d.f3222z, androidx.core.app.i.d(context, i10, i11).l());
            return this;
        }

        @n0
        public c p(@androidx.annotation.r(unit = 1) int i10) {
            return q(i10, 0);
        }

        @n0
        public c q(@androidx.annotation.r(unit = 1) int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f3225a.putExtra(d.N, i10);
            this.f3225a.putExtra(d.S, i11);
            return this;
        }

        @n0
        public c r(boolean z10) {
            this.f3233i = z10;
            return this;
        }

        @n0
        @Deprecated
        public c s(@l int i10) {
            this.f3226b.b(i10);
            return this;
        }

        @n0
        @Deprecated
        public c t(@l int i10) {
            this.f3226b.c(i10);
            return this;
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public c u(@n0 g.b bVar) {
            y(null, bVar.b());
            return this;
        }

        @n0
        @Deprecated
        public c v(@l int i10) {
            this.f3226b.d(i10);
            return this;
        }

        @n0
        public c w(@n0 RemoteViews remoteViews, @p0 int[] iArr, @p0 PendingIntent pendingIntent) {
            this.f3225a.putExtra(d.G, remoteViews);
            this.f3225a.putExtra(d.H, iArr);
            this.f3225a.putExtra(d.I, pendingIntent);
            return this;
        }

        @n0
        public c x(@n0 g gVar) {
            this.f3225a.setPackage(gVar.e().getPackageName());
            y(gVar.d(), gVar.f());
            return this;
        }

        @n0
        public c z(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f3232h = i10;
            if (i10 == 1) {
                this.f3225a.putExtra(d.F, true);
            } else if (i10 == 2) {
                this.f3225a.putExtra(d.F, false);
            } else {
                this.f3225a.removeExtra(d.F);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomTabsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface InterfaceC0026d {
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface f {
    }

    d(@n0 Intent intent, @p0 Bundle bundle) {
        this.f3223a = intent;
        this.f3224b = bundle;
    }

    public static int a(@n0 Intent intent) {
        return intent.getIntExtra(S, 0);
    }

    public static int b(@n0 Intent intent) {
        return intent.getIntExtra(Y, 0);
    }

    @n0
    public static androidx.browser.customtabs.a c(@n0 Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i10);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.customtabs.a.a(null);
        }
        androidx.browser.customtabs.a aVarA = androidx.browser.customtabs.a.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(L);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) ? aVarA : androidx.browser.customtabs.a.a(bundle).c(aVarA);
    }

    @androidx.annotation.r(unit = 1)
    public static int d(@n0 Intent intent) {
        return intent.getIntExtra(N, 0);
    }

    public static int e() {
        return 5;
    }

    @androidx.annotation.r(unit = 0)
    public static int f(@n0 Intent intent) {
        return intent.getIntExtra(T, 16);
    }

    @n0
    public static Intent h(@p0 Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f3196c, true);
        return intent;
    }

    public static boolean i(@n0 Intent intent) {
        return intent.getBooleanExtra(f3196c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void g(@n0 Context context, @n0 Uri uri) {
        this.f3223a.setData(uri);
        androidx.core.content.d.w(context, this.f3223a, this.f3224b);
    }
}
