package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f107349a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Set<String> f566a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f567a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f107350b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f107351c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f107352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f107353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f107354f = String.valueOf((char) 2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f568a = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    static {
        HashSet hashSet = new HashSet();
        f566a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
        f567a = true;
    }

    private static double a(double d10) {
        int i10 = 1;
        while (true) {
            double d11 = i10;
            if (d11 >= d10) {
                return d11;
            }
            i10 <<= 1;
        }
    }

    private static float a(int i10) {
        float f10 = ((((((i10 + 102400) / 524288) + 1) * 512) * 1024) / 1024.0f) / 1024.0f;
        double d10 = f10;
        return d10 > 0.5d ? (float) Math.ceil(d10) : f10;
    }

    @TargetApi(17)
    public static int a() {
        Object objA = bk.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (objA == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objA)).intValue();
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m465a() {
        return a(b()) + "GB";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m466a(int i10) {
        if (i10 > 0) {
            String[] strArr = f568a;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        return f568a[0];
    }

    @Deprecated
    public static String a(Context context) {
        return null;
    }

    public static synchronized String a(Context context, boolean z10) {
        if (f107352d == null) {
            String strB = b(context);
            String strC = "";
            if (!j.m526d()) {
                strC = z10 ? c(context) : j(context);
            }
            String strA = a(context);
            int i10 = 1;
            if (!(Build.VERSION.SDK_INT < 26) && b(strC) && b(strA)) {
                String strB2 = ax.a(context).b();
                if (TextUtils.isEmpty(strB2)) {
                    String strMo150a = ax.a(context).mo150a();
                    if (!TextUtils.isEmpty(strMo150a) && !strMo150a.startsWith("00000000-0000-0000-0000-000000000000")) {
                        i10 = 4;
                        strB = strMo150a;
                    } else if (TextUtils.isEmpty(strB)) {
                        strB = k(context);
                        i10 = 6;
                    } else {
                        i10 = 5;
                    }
                } else {
                    strB = strB2 + strB;
                    i10 = 2;
                }
            } else {
                strB = strC + strB + strA;
            }
            com.xiaomi.channel.commonutils.logger.b.b("devid rule select:" + i10);
            if (i10 == 3) {
                f107352d = strB;
            } else {
                f107352d = m466a(i10) + bp.b(strB);
            }
        }
        return f107352d;
    }

    private static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("default_id exist,do not change it.");
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m467a() {
        return a() <= 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m468a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m469a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) bk.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i10 = 0;
        while (true) {
            String[] strArr = f568a;
            if (i10 >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i10])) {
                return true;
            }
            i10++;
        }
    }

    public static int b() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        String[] strArrSplit;
        int i10 = 0;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                    try {
                        String line = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line) && (strArrSplit = line.split("\\s+")) != null && strArrSplit.length >= 2 && TextUtils.isDigitsOnly(strArrSplit[1])) {
                            i10 = Integer.parseInt(strArrSplit[1]);
                        }
                        bufferedReader.close();
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return i10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th4) {
                bufferedReader = null;
                th2 = th4;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m470b() {
        return a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    public static String b(Context context) {
        String str = f107350b;
        if (str != null || !f567a) {
            return str;
        }
        boolean zM472c = m472c(context);
        f567a = zM472c;
        if (!zM472c) {
            return null;
        }
        try {
            f107350b = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("failure to get androidId: " + th2);
        }
        return f107350b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m471b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 || strTrim.equalsIgnoreCase("null") || strTrim.equalsIgnoreCase("unknown");
    }

    public static String c() {
        return b() + "KB";
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static boolean m472c(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("supportGetAndroidID");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                return Boolean.parseBoolean(string);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static String d() {
        return (a(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    @Deprecated
    public static String e(Context context) {
        return null;
    }

    @Deprecated
    public static String f(Context context) {
        return "";
    }

    public static synchronized String g(Context context) {
        String str = f107353e;
        if (str != null) {
            return str;
        }
        String strB = bp.b(b(context) + a(context));
        f107353e = strB;
        return strB;
    }

    public static synchronized String h(Context context) {
        return bp.b(b(context) + ((String) null));
    }

    public static String i(Context context) {
        return ((TelephonyManager) context.getSystemService(g0.a.f118921e)).getSimOperatorName();
    }

    @Deprecated
    private static String j(Context context) {
        return "";
    }

    private static String k(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strL = l(context);
        a(context, strL);
        return strL;
    }

    private static String l(Context context) {
        return bm.a(Build.BRAND + lg.a.f131412e + Build.MODEL + lg.a.f131412e + Build.VERSION.SDK_INT + lg.a.f131412e + Build.VERSION.RELEASE + lg.a.f131412e + Build.VERSION.INCREMENTAL + lg.a.f131412e + a() + lg.a.f131412e + context.getPackageName() + lg.a.f131412e + System.currentTimeMillis() + lg.a.f131412e + bp.a(16));
    }
}
