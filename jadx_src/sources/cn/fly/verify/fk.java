package cn.fly.verify;

import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class fk {
    public static int a(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1001", str)) {
            return -1;
        }
        return applicationInfo.uid;
    }

    public static ApplicationInfo a(Object obj, String str) {
        if (obj == null || !a("2001", str)) {
            return null;
        }
        return (ApplicationInfo) gi.a(obj, eh.b("015ciifBch?bchRchcjFdDddWdRdecj"), (Object) null);
    }

    public static boolean a(String str, String str2) {
        String str3 = (String) by.a("aps", (Object) null);
        if (str3 == null) {
            return true;
        }
        String[] strArrSplit = str3.split(";");
        if (TextUtils.equals(str2, fz.d.c())) {
            if (strArrSplit.length > 1) {
                return !strArrSplit[1].contains(str);
            }
            return true;
        }
        if (strArrSplit.length > 0) {
            return !strArrSplit[0].contains(str);
        }
        return true;
    }

    public static String b(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1004", str)) {
            return null;
        }
        return applicationInfo.name;
    }

    public static Signature[] b(Object obj, String str) {
        if (obj == null || !a("2002", str)) {
            return null;
        }
        return (Signature[]) gi.a(obj, eh.b("010Fehchdi>dchXcfciDe[eh"), (Object) null);
    }

    public static int c(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1005", str)) {
            return -1;
        }
        return applicationInfo.labelRes;
    }

    public static String c(Object obj, String str) {
        return (obj == null || !a("2004", str)) ? "1.0" : (String) gi.a(obj, eh.b("011$cc6eOciehchcjPdTdf$cYceCe"), "1.0");
    }

    public static long d(Object obj, String str) {
        if (obj == null || !a("2005", str)) {
            return 0L;
        }
        return ((Long) gi.a(obj, eh.b("016SdechciehMh]dd3d)ehUhcffIebchceNe"), 0L)).longValue();
    }

    public static CharSequence d(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1006", str)) {
            return null;
        }
        return applicationInfo.nonLocalizedLabel;
    }

    public static long e(Object obj, String str) {
        if (obj == null || !a("2006", str)) {
            return 0L;
        }
        return ((Long) gi.a(obj, eh.b("014fcAeh5h2dj!i<cb-che7ebchce%e"), 0L)).longValue();
    }

    public static boolean e(ApplicationInfo applicationInfo, String str) {
        return applicationInfo != null && a("1007", str) && applicationInfo.enabled;
    }

    public static int f(Object obj, String str) {
        if (obj == null || !a("2007", str)) {
            return 0;
        }
        return ((Integer) gi.a(obj, eh.b("0111ccRe?ciehchcjAd6dccjcbYe"), 0)).intValue();
    }

    public static String f(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1008", str)) {
            return null;
        }
        return applicationInfo.processName;
    }

    public static long g(Object obj, String str) {
        if (obj == null || !a("2101", str)) {
            return 0L;
        }
        return ((Long) gi.a(obj, eh.b("018Wdi$ehYedcj%dNdifjQe:ciehchcj1dBdccjcb*e"), 0L, new Object[0])).longValue();
    }

    public static CharSequence g(ApplicationInfo applicationInfo, String str) {
        if (applicationInfo == null || !a("1101", str)) {
            return null;
        }
        return applicationInfo.loadLabel(ax.g().getPackageManager());
    }
}
