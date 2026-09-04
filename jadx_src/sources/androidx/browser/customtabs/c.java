package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3166d = "CustomTabsClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.b f3167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f3168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f3169c;

    /* JADX INFO: compiled from: CustomTabsClient.java */
    public class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3170c;

        a(Context context) {
            this.f3170c = context;
        }

        @Override // androidx.browser.customtabs.f
        public final void b(@n0 ComponentName componentName, @n0 c cVar) {
            cVar.n(0L);
            this.f3170c.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: CustomTabsClient.java */
    public class b extends android.support.customtabs.a.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Handler f3171i = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f3172j;

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f3174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f3175c;

            a(int i10, Bundle bundle) {
                this.f3174b = i10;
                this.f3175c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.e(this.f3174b, this.f3175c);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class RunnableC0024b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3177b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f3178c;

            RunnableC0024b(String str, Bundle bundle) {
                this.f3177b = str;
                this.f3178c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.a(this.f3177b, this.f3178c);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class RunnableC0025c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f3180b;

            RunnableC0025c(Bundle bundle) {
                this.f3180b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.d(this.f3180b);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3182b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f3183c;

            d(String str, Bundle bundle) {
                this.f3182b = str;
                this.f3183c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.f(this.f3182b, this.f3183c);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f3185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f3186c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f3187d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f3188e;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f3185b = i10;
                this.f3186c = uri;
                this.f3187d = z10;
                this.f3188e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.g(this.f3185b, this.f3186c, this.f3187d, this.f3188e);
            }
        }

        /* JADX INFO: compiled from: CustomTabsClient.java */
        public class f implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f3190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f3191c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f3192d;

            f(int i10, int i11, Bundle bundle) {
                this.f3190b = i10;
                this.f3191c = i11;
                this.f3192d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3172j.c(this.f3190b, this.f3191c, this.f3192d);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f3172j = bVar;
        }

        @Override // android.support.customtabs.a
        public void M0(String str, Bundle bundle) throws RemoteException {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new RunnableC0024b(str, bundle));
        }

        @Override // android.support.customtabs.a
        public void a(String str, Bundle bundle) throws RemoteException {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new d(str, bundle));
        }

        @Override // android.support.customtabs.a
        public void e0(int i10, int i11, @p0 Bundle bundle) throws RemoteException {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new f(i10, i11, bundle));
        }

        @Override // android.support.customtabs.a
        public Bundle k(@n0 String str, @p0 Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f3172j;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // android.support.customtabs.a
        public void l0(int i10, Bundle bundle) {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new a(i10, bundle));
        }

        @Override // android.support.customtabs.a
        public void l1(Bundle bundle) throws RemoteException {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new RunnableC0025c(bundle));
        }

        @Override // android.support.customtabs.a
        public void m1(int i10, Uri uri, boolean z10, @p0 Bundle bundle) throws RemoteException {
            if (this.f3172j == null) {
                return;
            }
            this.f3171i.post(new e(i10, uri, z10, bundle));
        }
    }

    c(android.support.customtabs.b bVar, ComponentName componentName, Context context) {
        this.f3167a = bVar;
        this.f3168b = componentName;
        this.f3169c = context;
    }

    public static boolean b(@n0 Context context, @p0 String str, @n0 f fVar) {
        fVar.c(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f3131d);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, fVar, 33);
    }

    public static boolean c(@n0 Context context, @p0 String str, @n0 f fVar) {
        fVar.c(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f3131d);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, fVar, 1);
    }

    public static boolean d(@n0 Context context, @n0 String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private android.support.customtabs.a.b e(@p0 androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    private static PendingIntent f(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    @p0
    public static String h(@n0 Context context, @p0 List<String> list) {
        return i(context, list, false);
    }

    @p0
    public static String i(@n0 Context context, @p0 List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.f3131d);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(f3166d, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static g.b j(@n0 Context context, @p0 androidx.browser.customtabs.b bVar, int i10) {
        return new g.b(bVar, f(context, i10));
    }

    @p0
    private g m(@p0 androidx.browser.customtabs.b bVar, @p0 PendingIntent pendingIntent) {
        boolean zI0;
        android.support.customtabs.a.b bVarE = e(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(d.f3200e, pendingIntent);
                zI0 = this.f3167a.K0(bVarE, bundle);
            } else {
                zI0 = this.f3167a.i0(bVarE);
            }
            if (zI0) {
                return new g(this.f3167a, bVarE, this.f3168b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public g a(@n0 g.b bVar) {
        return m(bVar.a(), bVar.b());
    }

    @p0
    public Bundle g(@n0 String str, @p0 Bundle bundle) {
        try {
            return this.f3167a.y0(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @p0
    public g k(@p0 androidx.browser.customtabs.b bVar) {
        return m(bVar, null);
    }

    @p0
    public g l(@p0 androidx.browser.customtabs.b bVar, int i10) {
        return m(bVar, f(this.f3169c, i10));
    }

    public boolean n(long j10) {
        try {
            return this.f3167a.Z(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
