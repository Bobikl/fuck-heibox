package com.umeng.message.proguard;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UPLog;
import com.umeng.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f105787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f105788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f105789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f105790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f105791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f105792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f105793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f105794h;

    private static int a(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            return -1;
        }
    }

    public static String a() {
        return UMUtils.getCPU();
    }

    public static String a(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String a(Context context, String str) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
            if (string != null) {
                return string.trim();
            }
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
        }
        UPLog.w("DeviceConfig", String.format("Could not read meta-data %s from AndroidManifest.xml.", str));
        return null;
    }

    private static String a(String str) {
        try {
            return (String) ba.a("android.os.SystemProperties", "get", new Class[]{String.class}, null, new Object[]{str});
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        return DeviceConfig.getSerial();
    }

    public static String b(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String c() {
        return "02:00:00:00:00:00";
    }

    public static String c(Context context) {
        String str = "";
        try {
            String imeiNew = DeviceConfig.getImeiNew(context);
            try {
                if (TextUtils.isEmpty(imeiNew)) {
                    return "";
                }
                String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
                return (messageAppkey == null || messageAppkey.length() < 16) ? imeiNew : ax.a(imeiNew, messageAppkey.substring(0, 16), as.a(new String(new byte[]{98, 109, org.apache.tools.tar.c.G, 108, 100, 87, 99, 117, 90, 106, 107, 118, 84, org.apache.tools.tar.c.H, org.apache.tools.tar.c.F, 114, 84, 68, org.apache.tools.tar.c.S, 121, 77, 119, 61, 61})));
            } catch (Exception e10) {
                e = e10;
                str = imeiNew;
                UPLog.e("DeviceConfig", e);
                return str;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static String d() {
        if (TextUtils.isEmpty(f105787a)) {
            f105787a = Build.MODEL;
        }
        return f105787a;
    }

    public static String d(Context context) {
        String str = "";
        try {
            String strS = s(context);
            try {
                if (TextUtils.isEmpty(strS)) {
                    return "";
                }
                String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
                return (messageAppkey == null || messageAppkey.length() < 16) ? strS : ax.a(strS, messageAppkey.substring(0, 16), as.a(new String(new byte[]{98, 109, org.apache.tools.tar.c.G, 108, 100, 87, 99, 117, 90, 106, 107, 118, 84, org.apache.tools.tar.c.H, org.apache.tools.tar.c.F, 114, 84, 68, org.apache.tools.tar.c.S, 121, 77, 119, 61, 61})));
            } catch (Exception e10) {
                e = e10;
                str = strS;
                UPLog.e("DeviceConfig", e);
                return str;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static String e() {
        if (TextUtils.isEmpty(f105789c)) {
            f105789c = Build.BOARD;
        }
        return f105789c;
    }

    public static String e(Context context) {
        return DeviceConfig.getAndroidId(context);
    }

    public static String f() {
        if (TextUtils.isEmpty(f105788b)) {
            String str = Build.BRAND;
            f105788b = str;
            if (TextUtils.isEmpty(str)) {
                f105788b = Build.MANUFACTURER;
            }
        }
        return f105788b;
    }

    public static String f(Context context) {
        return UMUtils.MD5(s(context));
    }

    public static boolean g() {
        Boolean bool = f105791e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String strF = f();
            if ("huawei".equalsIgnoreCase(strF)) {
                f105791e = Boolean.TRUE;
                return true;
            }
            if ("honor".equalsIgnoreCase(strF)) {
                f105791e = Boolean.TRUE;
                return true;
            }
            f105791e = Boolean.FALSE;
            return false;
        } catch (Throwable unused) {
        }
    }

    public static String[] g(Context context) {
        return UMUtils.getNetworkAccessMode(context);
    }

    public static boolean h() {
        Boolean bool = f105792f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ("vivo".equalsIgnoreCase(f())) {
                f105792f = Boolean.TRUE;
                return true;
            }
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                f105792f = Boolean.FALSE;
                return false;
            }
            if (strK.startsWith("OriginOS") || strK.startsWith("Funtouch")) {
                f105792f = Boolean.TRUE;
                return true;
            }
            f105792f = Boolean.FALSE;
            return false;
        } catch (Throwable unused) {
        }
    }

    public static boolean h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return true;
        } catch (Throwable th2) {
            UPLog.e("DeviceConfig", th2);
            return true;
        }
    }

    public static int i(Context context) {
        try {
            return Calendar.getInstance(t(context)).getTimeZone().getRawOffset() / 3600000;
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            return 8;
        }
    }

    public static boolean i() {
        Boolean bool = f105794h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Boolean boolValueOf = Boolean.valueOf("harmony".equalsIgnoreCase((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            f105794h = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Throwable unused) {
            f105794h = Boolean.FALSE;
            return false;
        }
    }

    public static String j() {
        return a(r4.a.f138782b);
    }

    public static String[] j(Context context) {
        String[] strArr = new String[2];
        try {
            Locale localeT = t(context);
            strArr[0] = localeT.getCountry();
            strArr[1] = localeT.getLanguage();
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            return strArr;
        }
    }

    private static String k() {
        String str = f105793g;
        if (str != null) {
            return str;
        }
        try {
            if (!"vivo".equalsIgnoreCase(f())) {
                f105793g = "";
                return "";
            }
            String strA = a("ro.vivo.os.build.display.id");
            f105793g = strA;
            if (!TextUtils.isEmpty(strA)) {
                return f105793g;
            }
            String strA2 = a("ro.iqoo.os.build.display.id");
            f105793g = strA2;
            if (!TextUtils.isEmpty(strA2)) {
                return f105793g;
            }
            f105793g = "";
            return "";
        } catch (Throwable unused) {
        }
    }

    public static String k(Context context) {
        String uMId = UMUtils.getUMId(context);
        return uMId == null ? "" : uMId;
    }

    public static String l(Context context) {
        int iA;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int iA2 = 0;
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                iA = a(displayMetrics, "noncompatWidthPixels");
                iA2 = a(displayMetrics, "noncompatHeightPixels");
            } else {
                iA = -1;
            }
            if (iA == -1 || iA2 == -1) {
                iA = displayMetrics.widthPixels;
                iA2 = displayMetrics.heightPixels;
            }
            return iA + androidx.webkit.b.f28327e + iA2;
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            return "Unknown";
        }
    }

    public static String m(Context context) {
        try {
            return UMUtils.getOperator(context);
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    public static String n(Context context) {
        String channelByXML = UMUtils.getChannelByXML(context);
        return !TextUtils.isEmpty(channelByXML) ? channelByXML : "Unknown";
    }

    public static String o(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable th2) {
            UPLog.e("DeviceConfig", "utdid failed! " + th2.getMessage());
            return "";
        }
    }

    public static String p(Context context) {
        int iQ = q(context);
        if (iQ == 0) {
            return Boolean.toString(false);
        }
        return iQ == 1 ? Boolean.toString(true) : "unknown";
    }

    public static int q(Context context) {
        if (f.b()) {
            UPLog.d("DeviceConfig", "silent mode disabled");
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled() ? 1 : 0;
            } catch (Throwable th2) {
                UPLog.e("DeviceConfig", th2);
                return -1;
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0 ? 1 : 0;
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            return -1;
        }
    }

    public static boolean r(Context context) {
        if (f.b()) {
            UPLog.d("DeviceConfig", "silent mode disabled");
            return false;
        }
        try {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            } else {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            UPLog.e("DeviceConfig", th2);
            try {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th3) {
                UPLog.e("DeviceConfig", th3);
                return false;
            }
        }
    }

    private static String s(Context context) {
        if (!TextUtils.isEmpty(f105790d)) {
            return f105790d;
        }
        String imeiNew = DeviceConfig.getImeiNew(context);
        f105790d = imeiNew;
        if (!TextUtils.isEmpty(imeiNew)) {
            return f105790d;
        }
        String androidId = DeviceConfig.getAndroidId(context);
        f105790d = androidId;
        if (!TextUtils.isEmpty(androidId)) {
            return f105790d;
        }
        String serial = DeviceConfig.getSerial();
        f105790d = serial;
        if (TextUtils.isEmpty(serial)) {
            f105790d = "";
        }
        return f105790d;
    }

    private static Locale t(Context context) {
        Locale locale;
        try {
            Configuration configuration = new Configuration();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Exception e10) {
            UPLog.e("DeviceConfig", e10);
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }
}
