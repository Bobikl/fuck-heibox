package com.umeng.commonsdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.max.xiaoheihe.utils.z;
import com.umeng.analytics.c;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.message.MessageSharedPrefs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_APP_KEY = "appkey";
    private static final String KEY_CHANNEL = "channel";
    private static final String KEY_LAST_APP_KEY = "last_appkey";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_SESSION_ID = "session_id";
    private static final String KEY_SHARED_PREFERENCES_NAME = "umeng_common_config";
    public static final String MOBILE_NETWORK = "2G/3G";
    private static final String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String SP_FILE_NAME = "um_session_id";
    private static final String TAG = "UMUtils";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static final Pattern pattern = Pattern.compile("UTDID\">([^<]+)");
    private static Object spLock = new Object();
    public static String VALUE_ANALYTICS_VERSION = "";
    public static String VALUE_GAME_VERSION = "";
    public static String VALUE_PUSH_VERSION = "";
    public static String VALUE_SHARE_VERSION = "";
    public static String VALUE_APM_VERSION = "";
    public static String VALUE_VERIFY_VERSION = "";
    public static String VALUE_SMS_VERSION = "";
    public static String VALUE_REC_VERSION_NAME = "";
    public static String VALUE_VISUAL_VERSION = "";
    public static String VALUE_ASMS_VERSION = "";
    public static String VALUE_LINK_VERSION = "";
    public static String VALUE_ABTEST_VERSION = "";

    public static String MD5(String str) {
        try {
            if (str == null) {
                return null;
            }
            try {
                try {
                    byte[] bytes = str.getBytes();
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b10 : bArrDigest) {
                        stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
                    }
                    return stringBuffer.toString();
                } catch (Exception e10) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "MD5 e is " + e10);
                    }
                    return null;
                }
            } catch (Exception unused) {
                return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
            }
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "MD5 e is " + th2);
            }
            return null;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            String hexString = Integer.toHexString(bArr[i10]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb2.append(hexString.toUpperCase());
            if (i10 < bArr.length - 1) {
                sb2.append(':');
            }
        }
        return sb2.toString();
    }

    private static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getActivityInfo(new ComponentName(context.getApplicationContext().getPackageName(), str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse("tencent" + str + ":"));
            List<ResolveInfo> listQueryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() > 0) {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getApplicationContext().getPackageName())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            return (applicationInfo == null || applicationInfo.metaData.get(str) == null) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean checkPath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return false;
        }
    }

    public static boolean checkResource(Context context, String str, String str2) {
        try {
            return context.getApplicationContext().getResources().getIdentifier(str, str2, context.getApplicationContext().getPackageName()) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String encryptBySHA1(String str) {
        try {
            try {
                byte[] bytes = str.getBytes();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    messageDigest.update(bytes);
                    return bytes2Hex(messageDigest.digest());
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception e10) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "encrypt by SHA1 e is " + e10);
                }
                return null;
            }
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "encrypt by SHA1 e is " + th2);
            }
            return null;
        }
    }

    public static String genId() {
        return "1234567890";
    }

    public static byte[] genIv() {
        byte[] miniArray = getMiniArray();
        return new byte[]{10, 1, (byte) (10 + 1), 5, 4, (byte) (10 + 5), 7, 9, com.google.common.base.a.A, 3, miniArray[0], miniArray[1], miniArray[2], miniArray[3], miniArray[4], (byte) (100 - 9)};
    }

    public static String[] getActiveUser(Context context) {
        return c.a(context);
    }

    public static String getApmFlag() {
        Method declaredMethod;
        try {
            Class<?> cls = getClass("com.umeng.umcrash.UMCrash");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getUMAPMFlag", new Class[0])) == null) {
                return "";
            }
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getAppHashKey(Context context) {
        return DeviceConfig.getAppHashKey(context);
    }

    public static String getAppMD5Signature(Context context) {
        String strReplace = "";
        try {
            String appMD5Signature = DeviceConfig.getAppMD5Signature(context);
            try {
                if (TextUtils.isEmpty(appMD5Signature)) {
                    return appMD5Signature;
                }
                strReplace = appMD5Signature.replace(":", "");
                return strReplace.toLowerCase();
            } catch (Throwable unused) {
                return appMD5Signature;
            }
        } catch (Throwable unused2) {
            return strReplace;
        }
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app name e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app name e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getAppSHA1Key(Context context) {
        return DeviceConfig.getAppSHA1Key(context);
    }

    public static String getAppVersinoCode(Context context, String str) {
        if (context != null && str != null) {
            try {
                return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
            } catch (Exception e10) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app version code e is " + e10);
                }
            } catch (Throwable th2) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app version code e is " + th2);
                }
                return "";
            }
        }
        return "";
    }

    public static String getAppVersionCode(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version code e is " + e10);
            }
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version code e is " + th2);
            }
            return "";
        }
    }

    public static String getAppVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version name e is " + e10);
            }
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version name e is " + th2);
            }
            return "";
        }
    }

    public static String getAppVersionName(Context context, String str) {
        if (context != null && str != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app version name e is " + e10);
                }
                UMCrashManager.reportCrash(context, e10);
            } catch (Throwable th2) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app version name e is " + th2);
                }
                UMCrashManager.reportCrash(context, th2);
                return "";
            }
        }
        return "";
    }

    public static String getAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return !TextUtils.isEmpty(UMConfigure.sAppkey) ? UMConfigure.sAppkey : getMultiProcessSP(context, "appkey");
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app key e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app key e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getAppkeyByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString("UMENG_APPKEY");
            if (string != null) {
                return string.trim();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Properties getBuildProp() throws Throwable {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                try {
                    properties.load(fileInputStream2);
                    fileInputStream2.close();
                } catch (IOException unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return properties;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        return properties;
    }

    public static String getCPU() {
        String line = null;
        try {
            try {
                FileReader fileReader = new FileReader("/proc/cpuinfo");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                    line = bufferedReader.readLine();
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException e10) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "Could not read from file /proc/cpuinfo, e is " + e10);
                    }
                }
            } catch (FileNotFoundException e11) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "Could not read from file /proc/cpuinfo, e is " + e11);
                }
            }
            return line != null ? line.substring(line.indexOf(58) + 1).trim() : "";
        } catch (Exception e12) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get cpu e is " + e12);
            }
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get cpu e is " + th2);
            }
            return "";
        }
    }

    public static String getChannel(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return !TextUtils.isEmpty(UMConfigure.sChannel) ? UMConfigure.sChannel : getMultiProcessSP(context, "channel");
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get channel e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get channel e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getChannelByXML(Context context) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("UMENG_CHANNEL")) == null) {
                return null;
            }
            String string = obj.toString();
            if (string != null) {
                return string.trim();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceToken(Context context) {
        Object objInvoke;
        Method method;
        Object objInvoke2;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Method method2 = MessageSharedPrefs.class.getMethod("getInstance", Context.class);
            if (method2 == null || (objInvoke = method2.invoke(MessageSharedPrefs.class, applicationContext)) == null || (method = MessageSharedPrefs.class.getMethod("getDeviceToken", new Class[0])) == null || (objInvoke2 = method.invoke(objInvoke, new Object[0])) == null || !(objInvoke2 instanceof String)) {
                return null;
            }
            return (String) objInvoke2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Tablet" : "Phone";
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get device type e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get device type e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            return String.valueOf(displayMetrics.heightPixels) + androidx.webkit.b.f28327e + String.valueOf(i10);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get display resolution e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get display resolution e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return "";
        }
    }

    public static String getFileMD5(File file) {
        try {
            try {
                byte[] bArr = new byte[1024];
                try {
                    if (!file.isFile()) {
                        return "";
                    }
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        int i10 = fileInputStream.read(bArr, 0, 1024);
                        if (i10 == -1) {
                            fileInputStream.close();
                            return String.format("%1$032x", new BigInteger(1, messageDigest.digest()));
                        }
                        messageDigest.update(bArr, 0, i10);
                    }
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th2) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get file MD5 e is " + th2);
                }
                return null;
            }
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get file MD5 e is " + e10);
            }
            return null;
        }
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(bb.c.k.L0), gl10.glGetString(bb.c.k.M0)};
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "Could not read gpu infor, e is " + e10);
            }
            return new String[0];
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "Could not read gpu infor, e is " + th2);
            }
            return new String[0];
        }
    }

    public static String getLastAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return getMultiProcessSP(context, KEY_LAST_APP_KEY);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get last app key e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get last app key e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return null;
        }
        try {
            try {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(context.getContentResolver(), configuration);
                locale = configuration.locale;
            } catch (Exception e10) {
                try {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "fail to read user config locale, e is " + e10);
                    }
                    locale = null;
                } catch (Exception e11) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "get locale e is " + e11);
                    }
                    UMCrashManager.reportCrash(context, e11);
                    return null;
                }
            }
            return locale == null ? Locale.getDefault() : locale;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get locale e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getMac(Context context) {
        if (context == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
            return "";
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get mac e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get mac e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    private static byte[] getMiniArray() {
        return new byte[]{1, 6, 8, 12, 13};
    }

    public static String getMultiProcessSP(Context context, String str) {
        SharedPreferences sharedPreferences;
        try {
            synchronized (spLock) {
                if (context != null) {
                    if (!TextUtils.isEmpty(str)) {
                        if (isMainProgress(context)) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                        } else {
                            String subProcessName = UMFrUtils.getSubProcessName(context);
                            sharedPreferences = context.getApplicationContext().getSharedPreferences(subProcessName + lg.a.f131412e + "umeng_common_config", 0);
                        }
                        if (sharedPreferences == null) {
                            return null;
                        }
                        return sharedPreferences.getString(str, null);
                    }
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                strArr[0] = "";
                return strArr;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                strArr[0] = "";
                return strArr;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                strArr[0] = "Wi-Fi";
                return strArr;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                strArr[0] = "2G/3G";
                strArr[1] = networkInfo2.getSubtypeName();
                return strArr;
            }
            return strArr;
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network access mode e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network access mode e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            return (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) ? telephonyManager.getNetworkOperatorName() : "";
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network operator e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network operator e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return "";
        }
    }

    public static String getOaidRequiredTime(Context context) {
        if (!FieldManager.allow(b.G) || Build.VERSION.SDK_INT <= 28) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(h.f105367a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(h.f105369c, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getOperator(Context context) {
        if (context == null) {
            return "Unknown";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            return telephonyManager == null ? "Unknown" : telephonyManager.getNetworkOperator();
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get get operator e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return "Unknown";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get get operator e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return "Unknown";
        }
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (telephonyManager != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkOperator();
            }
            return null;
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get registered operator e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
            return null;
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get registered operator e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
            return null;
        }
    }

    public static String getSubOSName(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            try {
                Properties buildProp = getBuildProp();
                try {
                    String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
                    if (!TextUtils.isEmpty(property)) {
                        str = "MIUI";
                    } else if (isFlyMe()) {
                        str = "Flyme";
                    } else {
                        if (TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                            return property;
                        }
                        str = "YunOS";
                    }
                    return str;
                } catch (Exception e10) {
                    UMCrashManager.reportCrash(context, e10);
                    return null;
                }
            } catch (Throwable th2) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get sub os name e is " + th2);
                }
                UMCrashManager.reportCrash(context, th2);
                return null;
            }
        } catch (Exception e11) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get sub os name e is " + e11);
            }
            UMCrashManager.reportCrash(context, e11);
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        if (context == null) {
            return null;
        }
        try {
            try {
                Properties buildProp = getBuildProp();
                try {
                    String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
                    if (TextUtils.isEmpty(property)) {
                        try {
                            return isFlyMe() ? getFlymeVersion(buildProp) : getYunOSVersion(buildProp);
                        } catch (Exception unused) {
                        }
                    }
                    return property;
                } catch (Exception e10) {
                    UMCrashManager.reportCrash(context, e10);
                    return null;
                }
            } catch (Throwable th2) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get sub os version e is " + th2);
                }
                UMCrashManager.reportCrash(context, th2);
                return null;
            }
        } catch (Exception e11) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get sub os version e is " + e11);
            }
            UMCrashManager.reportCrash(context, e11);
            return null;
        }
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static int getTargetSdkVersion(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getUMId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "umid", null);
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return null;
        }
    }

    public static String getUUIDForZid(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("um_session_id", 0);
        return sharedPreferences != null ? sharedPreferences.getString("session_id", "") : "";
    }

    public static String getUmengToken(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), "ztoken", null);
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return null;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getZid(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (UMConfigure.needSendZcfgEnv(applicationContext)) {
            return null;
        }
        return com.umeng.commonsdk.internal.b.a(applicationContext).a().a();
    }

    public static boolean isAppInstalled(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isApplication(Context context) {
        try {
            String name = context.getApplicationContext().getClass().getSuperclass().getName();
            return !TextUtils.isEmpty(name) && name.equals(z.f95790b);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDebug(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return false;
        }
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMainProgress(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getApplicationContext().getPackageName();
            return (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSdCardWrittenable() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String parseId(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int i10 = inputStreamReader.read(cArr);
            if (-1 == i10) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i10);
        }
    }

    private static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ak.av);
        if (UMConfigure.isDebugLog()) {
            UMLog.mutlInfo(2, "统计SDK版本号: 9.4.4+000");
        }
        VALUE_ANALYTICS_VERSION = "9.4.4+000";
        String strB = com.umeng.commonsdk.internal.c.b();
        if (!TextUtils.isEmpty(strB)) {
            VALUE_ASMS_VERSION = strB;
            if (UMConfigure.isDebugLog()) {
                UMLog.mutlInfo(2, "ZID SDK版本号: " + strB);
            }
        }
        Class<?> cls = getClass("com.umeng.analytics.game.GameSdkVersion");
        if (cls != null) {
            stringBuffer.append("g");
            try {
                String str = (String) cls.getDeclaredField("SDK_VERSION").get(cls);
                if (!TextUtils.isEmpty(str)) {
                    VALUE_GAME_VERSION = str;
                    if (UMConfigure.isDebugLog()) {
                        UMLog.mutlInfo(2, "游戏统计SDK版本号: " + str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Class<?> cls2 = getClass("com.umeng.vt.V");
        if (cls2 != null) {
            stringBuffer.append("v");
            try {
                String str2 = (String) cls2.getDeclaredField("VERSION").get(cls2);
                if (!TextUtils.isEmpty(str2)) {
                    VALUE_VISUAL_VERSION = str2;
                    if (UMConfigure.isDebugLog()) {
                        UMLog.mutlInfo(2, "可视化埋点SDK版本号: " + str2);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (getClass("com.umeng.message.PushAgent") != null) {
            stringBuffer.append("p");
            Class<?> cls3 = getClass("com.umeng.message.MsgConstant");
            if (cls3 != null) {
                try {
                    String str3 = (String) cls3.getDeclaredField("SDK_VERSION").get(cls3);
                    if (!TextUtils.isEmpty(str3)) {
                        VALUE_PUSH_VERSION = str3;
                        if (UMConfigure.isDebugLog()) {
                            UMLog.mutlInfo(2, "推送SDK版本号: " + str3);
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(ak.aB);
            Class<?> cls4 = getClass("com.umeng.a");
            if (cls4 != null) {
                try {
                    String str4 = (String) cls4.getDeclaredField("g").get(cls4);
                    if (!TextUtils.isEmpty(str4) && UMConfigure.isDebugLog()) {
                        UMLog.mutlInfo(2, "分享SDK版本号: " + str4);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        if (getClass("com.umeng.umzid.ZIDManager") != null) {
            stringBuffer.append(ak.aD);
        }
        stringBuffer.append("i");
        if (SdkVersion.SDK_TYPE != 1 && getClass("com.umeng.commonsdk.internal.UMOplus") != null) {
            stringBuffer.append("o");
        }
        if (getClass("com.umeng.airec.RecAgent") != null) {
            stringBuffer.append(ak.aG);
            Class<?> cls5 = getClass("com.umeng.airec.BuildConfig");
            if (cls5 != null) {
                try {
                    String str5 = (String) cls5.getDeclaredField("VERSION_NAME").get(cls5);
                    if (!TextUtils.isEmpty(str5)) {
                        VALUE_REC_VERSION_NAME = str5;
                        if (UMConfigure.isDebugLog()) {
                            UMLog.mutlInfo(2, "智能推荐SDK版本号: " + str5);
                        }
                    }
                } catch (Throwable unused5) {
                }
            }
        }
        if (getClass("com.umeng.umverify.UMVerifyHelper") != null) {
            stringBuffer.append("n");
        }
        Class<?> cls6 = getClass("com.umeng.sms.UMSMS");
        if (cls6 != null) {
            stringBuffer.append("m");
            try {
                Method declaredMethod = cls6.getDeclaredMethod("getVersion", new Class[0]);
                if (declaredMethod != null) {
                    String str6 = (String) declaredMethod.invoke(cls6, new Object[0]);
                    if (!TextUtils.isEmpty(str6)) {
                        VALUE_SMS_VERSION = str6;
                        if (UMConfigure.isDebugLog()) {
                            UMLog.mutlInfo(2, "短信验证码SDK版本号: " + str6);
                        }
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        try {
            Class<?> cls7 = getClass("com.umeng.umcrash.UMCrash");
            if (cls7 != null) {
                stringBuffer.append(ak.aF);
                Field declaredField = cls7.getDeclaredField("crashSdkVersion");
                declaredField.setAccessible(true);
                String str7 = (String) declaredField.get(cls7);
                if (!TextUtils.isEmpty(str7)) {
                    VALUE_APM_VERSION = str7;
                    if (UMConfigure.isDebugLog()) {
                        UMLog.mutlInfo(2, "APM SDK版本号: " + str7);
                    }
                }
            }
        } catch (Throwable unused7) {
        }
        Class<?> cls8 = getClass("com.umeng.umlink.MobclickLink");
        if (cls8 != null) {
            stringBuffer.append("l");
            try {
                Method declaredMethod2 = cls8.getDeclaredMethod("getVersion", new Class[0]);
                if (declaredMethod2 != null) {
                    String str8 = (String) declaredMethod2.invoke(cls8, new Object[0]);
                    if (!TextUtils.isEmpty(str8)) {
                        VALUE_LINK_VERSION = str8;
                        if (UMConfigure.isDebugLog()) {
                            UMLog.mutlInfo(2, "ULink SDK版本号: " + str8);
                        }
                    }
                }
            } catch (Throwable unused8) {
            }
        }
        Class<?> cls9 = getClass("com.umeng.cconfig.UMRemoteConfig");
        if (cls9 != null) {
            try {
                Method declaredMethod3 = cls9.getDeclaredMethod("getVersion", new Class[0]);
                if (declaredMethod3 != null) {
                    stringBuffer.append("t");
                    String str9 = (String) declaredMethod3.invoke(cls9, new Object[0]);
                    if (!TextUtils.isEmpty(str9)) {
                        VALUE_ABTEST_VERSION = str9;
                        if (UMConfigure.isDebugLog()) {
                            UMLog.mutlInfo(2, "UABTEST SDK版本号: " + str9);
                        }
                    }
                }
            } catch (Throwable unused9) {
            }
        }
        if (TextUtils.isEmpty(stringBuffer)) {
            return;
        }
        com.umeng.commonsdk.statistics.b.f105276a = stringBuffer.toString();
        Log.i(AnalyticsConstants.LOG_TAG, "module init:" + com.umeng.commonsdk.statistics.b.f105276a);
    }

    public static void setAppkey(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            setMultiProcessSP(context, "appkey", str);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set app key e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set app key e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static void setChannel(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            setMultiProcessSP(context, "channel", str);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set channel e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set channel e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static void setLastAppkey(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            setMultiProcessSP(context, KEY_LAST_APP_KEY, str);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set last app key e is " + e10);
            }
            UMCrashManager.reportCrash(context, e10);
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set last app key e is " + th2);
            }
            UMCrashManager.reportCrash(context, th2);
        }
    }

    public static void setMultiProcessSP(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        try {
            synchronized (spLock) {
                if (context != null) {
                    if (!TextUtils.isEmpty(str) && str2 != null) {
                        if (isMainProgress(context)) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                        } else {
                            String subProcessName = UMFrUtils.getSubProcessName(context);
                            sharedPreferences = context.getApplicationContext().getSharedPreferences(subProcessName + lg.a.f131412e + "umeng_common_config", 0);
                        }
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(str, str2).commit();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setUUIDForZid(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("um_session_id", 0);
        try {
            string = UUID.randomUUID().toString();
        } catch (Throwable unused) {
            string = "";
        }
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("session_id", string).commit();
        }
    }
}
