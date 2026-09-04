package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20487a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20488b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20489c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20490d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @j1
    static final String f20491e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @j1
    static final String f20492f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f20493g = 96;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f20494h = 48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20495i = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile o<?> f20496j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile List<g> f20497k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f20498l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f20499m = "androidx.core.content.pm.shortcut_listener_impl";

    @w0(25)
    public static class a {
        private a() {
        }

        static String a(@n0 List<ShortcutInfo> list) {
            int rank = -1;
            String id2 = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id2 = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    private ShortcutManagerCompat() {
    }

    @j1
    static void A(List<g> list) {
        f20497k = list;
    }

    @j1
    static void B(o<Void> oVar) {
        f20496j = oVar;
    }

    public static boolean C(@n0 Context context, @n0 List<l> list) {
        List<l> listW = w(list, 1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, listW);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<l> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(listW);
        Iterator<g> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().d(list);
        }
        return true;
    }

    public static boolean a(@n0 Context context, @n0 List<l> list) {
        List<l> listW = w(list, 1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, listW);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<l> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(listW);
        Iterator<g> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
        return true;
    }

    @j1
    static boolean b(@n0 Context context, @n0 l lVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = lVar.f20510i;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f20664a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream inputStreamD = iconCompat.D(context);
        if (inputStreamD == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamD)) == null) {
            return false;
        }
        lVar.f20510i = i10 == 6 ? IconCompat.o(bitmapDecodeStream) : IconCompat.r(bitmapDecodeStream);
        return true;
    }

    @j1
    static void c(@n0 Context context, @n0 List<l> list) {
        for (l lVar : new ArrayList(list)) {
            if (!b(context, lVar)) {
                list.remove(lVar);
            }
        }
    }

    @n0
    public static Intent d(@n0 Context context, @n0 l lVar) {
        Intent intentCreateShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(lVar.H()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return lVar.a(intentCreateShortcutResultIntent);
    }

    public static void e(@n0 Context context, @n0 List<String> list, @p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        Iterator<g> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@n0 Context context, @n0 List<l> list) {
        List<l> listW = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<l> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f20503b);
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        o(context).a(listW);
        Iterator<g> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @n0
    public static List<l> g(@n0 Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return o(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new l.b(context, it.next()).c());
        }
        return arrayList;
    }

    private static int h(@n0 Context context, boolean z10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z10 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@n0 Context context) {
        androidx.core.util.o.l(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight() : h(context, false);
    }

    public static int j(@n0 Context context) {
        androidx.core.util.o.l(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth() : h(context, true);
    }

    public static int k(@n0 Context context) {
        androidx.core.util.o.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @j1
    static List<g> l() {
        return f20497k;
    }

    private static String m(@n0 List<l> list) {
        int iV = -1;
        String strK = null;
        for (l lVar : list) {
            if (lVar.v() > iV) {
                strK = lVar.k();
                iV = lVar.v();
            }
        }
        return strK;
    }

    private static List<g> n(Context context) {
        Bundle bundle;
        String string;
        if (f20497k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f20498l);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(f20499m)) != null) {
                    try {
                        arrayList.add((g) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f20497k == null) {
                f20497k = arrayList;
            }
        }
        return f20497k;
    }

    private static o<?> o(Context context) {
        if (f20496j == null) {
            try {
                f20496j = (o) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f20496j == null) {
                f20496j = new o.a();
            }
        }
        return f20496j;
    }

    @n0
    public static List<l> p(@n0 Context context, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            return l.c(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i10));
        }
        if (i11 < 25) {
            if ((i10 & 2) != 0) {
                try {
                    return o(context).b();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i10 & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i10 & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return l.c(context, arrayList);
    }

    public static boolean q(@n0 Context context) {
        androidx.core.util.o.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
        }
        return p(context, 3).size() == k(context);
    }

    public static boolean r(@n0 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (androidx.core.content.d.a(context, f20492f) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(f20491e), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || f20492f.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(@n0 Context context, @n0 l lVar) {
        androidx.core.util.o.l(context);
        androidx.core.util.o.l(lVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && lVar.E(1)) {
            Iterator<g> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(lVar));
            }
            return true;
        }
        int iK = k(context);
        if (iK == 0) {
            return false;
        }
        if (i10 <= 29) {
            b(context, lVar);
        }
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(lVar.H());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iK) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(lVar.H()));
        }
        o<?> oVarO = o(context);
        try {
            List<l> listB = oVarO.b();
            if (listB.size() >= iK) {
                oVarO.d(Arrays.asList(m(listB)));
            }
            oVarO.a(Arrays.asList(lVar));
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Iterator<g> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(lVar));
            }
            x(context, lVar.k());
        }
    }

    public static void t(@n0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        o(context).c();
        Iterator<g> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@n0 Context context, @n0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        Iterator<g> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@n0 Context context, @n0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        Iterator<g> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    @n0
    private static List<l> w(@n0 List<l> list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (l lVar : list) {
            if (lVar.E(i10)) {
                arrayList.remove(lVar);
            }
        }
        return arrayList;
    }

    public static void x(@n0 Context context, @n0 String str) {
        androidx.core.util.o.l(context);
        androidx.core.util.o.l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        Iterator<g> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@n0 Context context, @n0 l lVar, @p0 final IntentSender intentSender) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && lVar.E(1)) {
            return false;
        }
        if (i10 >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(lVar.H(), intentSender);
        }
        if (!r(context)) {
            return false;
        }
        Intent intentA = lVar.a(new Intent(f20491e));
        if (intentSender == null) {
            context.sendBroadcast(intentA);
            return true;
        }
        context.sendOrderedBroadcast(intentA, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static boolean z(@n0 Context context, @n0 List<l> list) {
        androidx.core.util.o.l(context);
        androidx.core.util.o.l(list);
        List<l> listW = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(listW.size());
            Iterator<l> it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).c();
        o(context).a(listW);
        for (g gVar : n(context)) {
            gVar.a();
            gVar.b(list);
        }
        return true;
    }
}
