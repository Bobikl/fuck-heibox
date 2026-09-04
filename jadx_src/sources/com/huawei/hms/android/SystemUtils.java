package com.huawei.hms.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class SystemUtils {
    public static final String UNKNOWN = "unknown";

    private static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    private static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getAndoridVersion() {
        return getSystemProperties(TPSystemInfo.KEY_PROPERTY_VERSION_RELEASE, "unknown");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    public static String getManufacturer() {
        return getSystemProperties(TPSystemInfo.KEY_PROPERTY_MANUFACTURER, "unknown");
    }

    public static long getMegabyte(double d10) {
        double d11 = Build.VERSION.SDK_INT > 25 ? 1000.0d : 1024.0d;
        return (long) (d10 * d11 * d11);
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? "" : activeNetworkInfo.getTypeName();
    }

    public static String getPhoneModel() {
        return getSystemProperties(TPSystemInfo.KEY_PROPERTY_MODEL, "unknown");
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    public static boolean isChinaROM() {
        String strB = b();
        if (!TextUtils.isEmpty(strB)) {
            return "cn".equalsIgnoreCase(strB);
        }
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            return strA.toLowerCase(Locale.US).contains("cn");
        }
        String localCountry = getLocalCountry();
        if (TextUtils.isEmpty(localCountry)) {
            return false;
        }
        return "cn".equalsIgnoreCase(localCountry);
    }

    public static boolean isEMUI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is Emui :");
        int i10 = HwBuildEx.VERSION.EMUI_SDK_INT;
        sb2.append(i10);
        HMSLog.i("SystemUtils", sb2.toString());
        return i10 > 0;
    }

    public static boolean isSystemApp(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (AndroidException e10) {
            HMSLog.e("SystemUtils", "isSystemApp Exception: " + e10);
            packageInfo = null;
        } catch (RuntimeException e11) {
            HMSLog.e("SystemUtils", "isSystemApp RuntimeException:" + e11);
            packageInfo = null;
        }
        return packageInfo != null && (packageInfo.applicationInfo.flags & 1) > 0;
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }
}
