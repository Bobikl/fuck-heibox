package com.apm.lite.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.efs.sdk.base.core.util.NetworkUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40075a;

        static {
            int[] iArr = new int[com.apm.lite.j.e.b.values().length];
            f40075a = iArr;
            try {
                iArr[com.apm.lite.j.e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40075a[com.apm.lite.j.e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40075a[com.apm.lite.j.e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40075a[com.apm.lite.j.e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40075a[com.apm.lite.j.e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40075a[com.apm.lite.j.e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String a(Context context) {
        return b(d(context));
    }

    public static String b(com.apm.lite.j.e.b bVar) {
        String str;
        try {
            switch (a.f40075a[bVar.ordinal()]) {
                case 1:
                    str = "wifi";
                    break;
                case 2:
                    str = "2g";
                    break;
                case 3:
                    str = "3g";
                    break;
                case 4:
                    str = "4g";
                    break;
                case 5:
                    str = "mobile";
                    break;
                case 6:
                    str = NetworkUtil.NETWORK_CLASS_5G;
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static com.apm.lite.j.e.b d(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return com.apm.lite.j.e.b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return com.apm.lite.j.e.b.WIFI;
                }
                if (type != 0) {
                    return com.apm.lite.j.e.b.MOBILE;
                }
                int networkType = ((TelephonyManager) context.getSystemService(g0.a.f118921e)).getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return com.apm.lite.j.e.b.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return com.apm.lite.j.e.b.MOBILE_4G;
                                    default:
                                        return com.apm.lite.j.e.b.MOBILE;
                                }
                                break;
                        }
                    }
                }
                return com.apm.lite.j.e.b.MOBILE_3G;
            }
            return com.apm.lite.j.e.b.NONE;
        } catch (Throwable unused) {
            return com.apm.lite.j.e.b.MOBILE;
        }
    }
}
