package androidx.browser.browseractions;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: BrowserActionsIntent.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3098b = "BrowserActions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3099c = "https://www.example.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3100d = "androidx.browser.browseractions.APP_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3101e = "androidx.browser.browseractions.browser_action_open";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3102f = "androidx.browser.browseractions.ICON_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3103g = "androidx.browser.browseractions.ICON_URI";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3104h = "androidx.browser.browseractions.TITLE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3105i = "androidx.browser.browseractions.ACTION";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3106j = "androidx.browser.browseractions.extra.TYPE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3107k = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3108l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f3109m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3110n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3111o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3112p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3113q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3114r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f3115s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f3116t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f3117u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f3118v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f3119w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f3120x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f3121y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private static a f3122z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Intent f3123a;

    /* JADX INFO: compiled from: BrowserActionsIntent.java */
    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: BrowserActionsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    /* JADX INFO: compiled from: BrowserActionsIntent.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    /* JADX INFO: compiled from: BrowserActionsIntent.java */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f3125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f3126c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f3124a = new Intent(e.f3101e);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3127d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f3128e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private PendingIntent f3129f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<Uri> f3130g = new ArrayList();

        public d(@n0 Context context, @n0 Uri uri) {
            this.f3125b = context;
            this.f3126c = uri;
        }

        @n0
        private Bundle b(@n0 androidx.browser.browseractions.a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString(e.f3104h, aVar.e());
            bundle.putParcelable(e.f3105i, aVar.a());
            if (aVar.b() != 0) {
                bundle.putInt(e.f3102f, aVar.b());
            }
            if (aVar.c() != null) {
                bundle.putParcelable(e.f3103g, aVar.c());
            }
            return bundle;
        }

        @n0
        public e a() {
            this.f3124a.setData(this.f3126c);
            this.f3124a.putExtra(e.f3106j, this.f3127d);
            this.f3124a.putParcelableArrayListExtra(e.f3107k, this.f3128e);
            this.f3124a.putExtra(e.f3100d, PendingIntent.getActivity(this.f3125b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f3129f;
            if (pendingIntent != null) {
                this.f3124a.putExtra(e.f3108l, pendingIntent);
            }
            BrowserServiceFileProvider.k(this.f3124a, this.f3130g, this.f3125b);
            return new e(this.f3124a);
        }

        @n0
        public d c(@n0 ArrayList<androidx.browser.browseractions.a> arrayList) {
            if (arrayList.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (TextUtils.isEmpty(arrayList.get(i10).e()) || arrayList.get(i10).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.f3128e.add(b(arrayList.get(i10)));
                if (arrayList.get(i10).c() != null) {
                    this.f3130g.add(arrayList.get(i10).c());
                }
            }
            return this;
        }

        @n0
        public d d(@n0 androidx.browser.browseractions.a... aVarArr) {
            return c(new ArrayList<>(Arrays.asList(aVarArr)));
        }

        @n0
        public d e(@n0 PendingIntent pendingIntent) {
            this.f3129f = pendingIntent;
            return this;
        }

        @n0
        public d f(int i10) {
            this.f3127d = i10;
            return this;
        }
    }

    e(@n0 Intent intent) {
        this.f3123a = intent;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<ResolveInfo> a(@n0 Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f3101e, Uri.parse(f3099c)), 131072);
    }

    @p0
    @Deprecated
    public static String b(@n0 Intent intent) {
        return d(intent);
    }

    @p0
    public static String d(@n0 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f3100d);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void e(@n0 Context context, @n0 Intent intent) {
        f(context, intent, a(context));
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static void f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            i(context, intent);
            return;
        }
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f3099c)), 65536);
            if (resolveInfoResolveActivity != null) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (str.equals(list.get(i10).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    }
                }
            }
        }
        androidx.core.content.d.w(context, intent, null);
    }

    public static void g(@n0 Context context, @n0 Uri uri) {
        e(context, new d(context, uri).a().c());
    }

    public static void h(@n0 Context context, @n0 Uri uri, int i10, @n0 ArrayList<androidx.browser.browseractions.a> arrayList, @n0 PendingIntent pendingIntent) {
        e(context, new d(context, uri).f(i10).c(arrayList).e(pendingIntent).a().c());
    }

    private static void i(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f3107k);
        j(context, data, parcelableArrayListExtra != null ? k(parcelableArrayListExtra) : null);
    }

    private static void j(Context context, Uri uri, List<androidx.browser.browseractions.a> list) {
        new androidx.browser.browseractions.d(context, uri, list).e();
        a aVar = f3122z;
        if (aVar != null) {
            aVar.a();
        }
    }

    @n0
    public static List<androidx.browser.browseractions.a> k(@n0 ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = arrayList.get(i10);
            String string = bundle.getString(f3104h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f3105i);
            int i11 = bundle.getInt(f3102f);
            Uri uri = (Uri) bundle.getParcelable(f3103g);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(i11 != 0 ? new androidx.browser.browseractions.a(string, pendingIntent, i11) : new androidx.browser.browseractions.a(string, pendingIntent, uri));
        }
        return arrayList2;
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static void l(a aVar) {
        f3122z = aVar;
    }

    @n0
    public Intent c() {
        return this.f3123a;
    }
}
