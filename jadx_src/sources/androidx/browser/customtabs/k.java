package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.core.app.r;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: compiled from: TrustedWebUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3257a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f3258b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    private k() {
    }

    public static boolean a(@n0 Context context, @n0 String str, @n0 String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction(CustomTabsService.f3131d).setPackage(str), 64);
        if (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void b(@n0 Context context, @n0 d dVar, @n0 Uri uri) {
        if (r.a(dVar.f3223a.getExtras(), d.f3198d) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        dVar.f3223a.putExtra(f3257a, true);
        dVar.g(context, uri);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void c(@n0 Context context, @n0 g gVar, @n0 Uri uri) {
        Intent intent = new Intent(f3258b);
        intent.setPackage(gVar.e().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        r.b(bundle, d.f3198d, gVar.d());
        intent.putExtras(bundle);
        PendingIntent pendingIntentF = gVar.f();
        if (pendingIntentF != null) {
            intent.putExtra(d.f3200e, pendingIntentF);
        }
        context.startActivity(intent);
    }

    @k1
    public static boolean d(@n0 Context context, @n0 File file, @n0 String str, @n0 String str2, @n0 g gVar) {
        Uri uriF = FileProvider.f(context, str, file);
        context.grantUriPermission(str2, uriF, 1);
        return gVar.i(uriF, 1, null);
    }
}
