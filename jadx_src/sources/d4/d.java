package d4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* JADX INFO: compiled from: MobileUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f108133a = "None";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f108134b = "WIFI";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f108135c = "2G";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f108136d = "3G";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f108137e = "4G";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f108138f = "Mobile";

    public static String a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + androidx.webkit.b.f28327e + displayMetrics.heightPixels;
    }

    public static String b() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getDisplayLanguage() : "";
    }

    @SuppressLint({"MissingPermission"})
    public static String c(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return f108133a;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return "WIFI";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        switch (telephonyManager != null ? telephonyManager.getNetworkType() : 0) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return f108135c;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return f108136d;
            case 13:
                return f108137e;
            default:
                return f108138f;
        }
    }

    public static String d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception unused) {
            return "";
        }
    }
}
