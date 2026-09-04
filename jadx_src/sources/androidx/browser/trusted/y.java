package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TrustedWebActivityServiceConnectionPool.java */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3366c = "TWAConnectionPool";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Uri, b> f3368b = new HashMap();

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnectionPool.java */
    public static class a extends AsyncTask<Void, Void, Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f3370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f3371c;

        a(Context context, Intent intent, b bVar) {
            this.f3369a = context.getApplicationContext();
            this.f3370b = intent;
            this.f3371c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f3369a.bindService(this.f3370b, this.f3371c, 4097)) {
                    return null;
                }
                this.f3369a.unbindService(this.f3371c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e10) {
                Log.w(y.f3366c, "SecurityException while binding.", e10);
                return e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f3371c.b(exc);
            }
        }
    }

    private y(@n0 Context context) {
        this.f3367a = context.getApplicationContext();
    }

    @n0
    public static y c(@n0 Context context) {
        return new y(context);
    }

    @p0
    private Intent d(Context context, Uri uri, Set<m> set, boolean z10) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            Iterator<m> it2 = set.iterator();
            while (it2.hasNext()) {
                if (it2.next().c(str2, context.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            if (z10) {
                Log.w(f3366c, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.f3259e);
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveInfoResolveService == null) {
            if (z10) {
                Log.w(f3366c, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z10) {
            Log.i(f3366c, "Found " + resolveInfoResolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        return intent3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Uri uri) {
        this.f3368b.remove(uri);
    }

    @n0
    @k0
    public com.google.common.util.concurrent.p0<w> b(@n0 final Uri uri, @n0 Set<m> set, @n0 Executor executor) {
        b bVar = this.f3368b.get(uri);
        if (bVar != null) {
            return bVar.c();
        }
        Intent intentD = d(this.f3367a, uri, set, true);
        if (intentD == null) {
            return c.a(new IllegalArgumentException("No service exists for scope"));
        }
        b bVar2 = new b(new Runnable() { // from class: androidx.browser.trusted.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3364b.e(uri);
            }
        });
        this.f3368b.put(uri, bVar2);
        new a(this.f3367a, intentD, bVar2).executeOnExecutor(executor, new Void[0]);
        return bVar2.c();
    }

    @k0
    public boolean f(@n0 Uri uri, @n0 Set<m> set) {
        return (this.f3368b.get(uri) == null && d(this.f3367a, uri, set, false) == null) ? false : true;
    }

    void g() {
        Iterator<b> it = this.f3368b.values().iterator();
        while (it.hasNext()) {
            this.f3367a.unbindService(it.next());
        }
        this.f3368b.clear();
    }
}
