package z5;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f141888a;

    public static String a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f141888a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.d(th2);
                packageName = "";
            }
            f141888a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f141888a;
    }

    public static synchronized String b(x5.a aVar, Context context, String str, String str2) {
        String strA;
        strA = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            strA = TextUtils.isEmpty(string) ? null : n5.e.a(a(context), string, str);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strA)) {
                h5.a.i(aVar, h5.b.f119115m, h5.b.F, String.format("%s,%s", str, string));
            }
        } catch (Exception e10) {
            e.d(e10);
        }
        return strA;
    }

    public static synchronized boolean c(Context context, String str) {
        boolean zContains;
        try {
            zContains = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
        } catch (Throwable th2) {
            e.d(th2);
            zContains = false;
        }
        return zContains;
    }

    public static synchronized void d(Context context, String str) {
        try {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    public static synchronized void e(x5.a aVar, Context context, String str, String str2) {
        try {
            String strC = n5.e.c(a(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strC)) {
                h5.a.i(aVar, h5.b.f119115m, h5.b.G, String.format("%s,%s", str, str2));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strC).apply();
        } catch (Throwable th2) {
            e.d(th2);
        }
    }
}
