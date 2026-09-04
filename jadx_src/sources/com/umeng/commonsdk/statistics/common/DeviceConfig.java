package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.material.timepicker.TimeModel;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    private static volatile String sWifiMac = "";
    private static volatile String sImei = "";
    private static volatile String sMeid = "";
    private static volatile String sImsi = "";
    private static volatile String sSerialNo = "";
    private static volatile String sAndroidID = "";
    private static volatile String sIDFA = "";
    private static volatile String sOAID = "";
    private static volatile String sSecondImei = "";
    private static volatile String sSimSerialNumber = "";
    private static volatile boolean sImeiOrMeidFlag = false;
    private static volatile boolean sSerialFlag = false;
    private static volatile boolean sSimSerialNumberFlag = false;
    private static volatile boolean sImsiFlag = false;
    private static volatile boolean sSecondImeiFlag = false;

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
            sb2.append(hexString.toUpperCase(Locale.getDefault()));
            if (i10 < bArr.length - 1) {
                sb2.append(':');
            }
        }
        return sb2.toString();
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getAndroidId(Context context) {
        if (!TextUtils.isEmpty(sAndroidID)) {
            return sAndroidID;
        }
        String string = null;
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i) || context == null) {
            return null;
        }
        try {
            string = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
            sAndroidID = string;
            return string;
        } catch (Exception unused) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return string;
            }
            MLog.w("can't read android id");
            return string;
        }
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th2) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.i(LOG_TAG, th2);
            return null;
        }
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static String getApplicationLable(Context context) {
        return context == null ? "" : context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    private static Properties getBuildProp() {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                try {
                    properties.load(fileInputStream2);
                    fileInputStream2.close();
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return properties;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
        return properties;
    }

    public static String getCPU() {
        String line = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                line = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th2) {
                MLog.e(LOG_TAG, "Could not read from file /proc/cpuinfo", th2);
            }
        } catch (FileNotFoundException e10) {
            MLog.e(LOG_TAG, "Could not open file /proc/cpuinfo", e10);
        }
        return line != null ? line.substring(line.indexOf(58) + 1).trim() : "";
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static String getDeviceId(Context context) {
        return AnalyticsConstants.getDeviceType() == 2 ? getDeviceIdForBox(context) : getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdForBox(Context context) {
        String androidId = "";
        if (context == null) {
            return "";
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i)) {
                    androidId = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + androidId);
                    }
                }
                if (!TextUtils.isEmpty(androidId)) {
                    return androidId;
                }
                String macByJavaAPI = getMacByJavaAPI();
                DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                deviceTypeEnum = deviceTypeEnum2;
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        macByJavaAPI = getMacShell();
                        deviceTypeEnum = deviceTypeEnum2;
                    } else {
                        macByJavaAPI = getMacBySystemInterface(context);
                        deviceTypeEnum = deviceTypeEnum2;
                    }
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
                }
                if (!TextUtils.isEmpty(macByJavaAPI)) {
                    return macByJavaAPI;
                }
                String serialNo = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                if (!TextUtils.isEmpty(serialNo)) {
                    return serialNo;
                }
                String imei = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                return imei;
            }
            if (i10 >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (!TextUtils.isEmpty(oaid)) {
                    return oaid;
                }
                String idfa = getIdfa(context);
                deviceTypeEnum = DeviceTypeEnum.IDFA;
                if (!TextUtils.isEmpty(idfa)) {
                    return idfa;
                }
                String androidId2 = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (!TextUtils.isEmpty(androidId2)) {
                    return androidId2;
                }
                String serialNo2 = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                if (!TextUtils.isEmpty(serialNo2)) {
                    return serialNo2;
                }
                String macByJavaAPI2 = getMacByJavaAPI();
                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                deviceTypeEnum = deviceTypeEnum3;
                if (!TextUtils.isEmpty(macByJavaAPI2)) {
                    return macByJavaAPI2;
                }
                String macBySystemInterface = getMacBySystemInterface(context);
                deviceTypeEnum = deviceTypeEnum3;
                return macBySystemInterface;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i)) {
                androidId = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i(LOG_TAG, "getDeviceId: ANDROID_ID: " + androidId);
                }
            }
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo3 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            String imei2 = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            if (!TextUtils.isEmpty(imei2)) {
                return imei2;
            }
            String macByJavaAPI3 = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum4;
            if (!TextUtils.isEmpty(macByJavaAPI3)) {
                return macByJavaAPI3;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            deviceTypeEnum = deviceTypeEnum4;
            if (!AnalyticsConstants.UM_DEBUG) {
                return macBySystemInterface2;
            }
            MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
            return macBySystemInterface2;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDeviceIdForGeneral(Context context) {
        if (context == null) {
            return "";
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                String imei = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (!TextUtils.isEmpty(imei)) {
                    return imei;
                }
                String macByJavaAPI = getMacByJavaAPI();
                DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                deviceTypeEnum = deviceTypeEnum2;
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        macByJavaAPI = getMacShell();
                        deviceTypeEnum = deviceTypeEnum2;
                    } else {
                        macByJavaAPI = getMacBySystemInterface(context);
                        deviceTypeEnum = deviceTypeEnum2;
                    }
                }
                boolean z10 = AnalyticsConstants.UM_DEBUG;
                if (z10) {
                    MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
                }
                if (!TextUtils.isEmpty(macByJavaAPI)) {
                    return macByJavaAPI;
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i)) {
                    macByJavaAPI = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (z10) {
                        MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + macByJavaAPI);
                    }
                }
                if (!TextUtils.isEmpty(macByJavaAPI)) {
                    return macByJavaAPI;
                }
                String serialNo = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                return serialNo;
            }
            if (i10 >= 29) {
                String oaid = getOaid(context);
                deviceTypeEnum = DeviceTypeEnum.OAID;
                if (!TextUtils.isEmpty(oaid)) {
                    return oaid;
                }
                String idfa = getIdfa(context);
                deviceTypeEnum = DeviceTypeEnum.IDFA;
                if (!TextUtils.isEmpty(idfa)) {
                    return idfa;
                }
                String androidId = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (!TextUtils.isEmpty(androidId)) {
                    return androidId;
                }
                String serialNo2 = getSerialNo();
                deviceTypeEnum = DeviceTypeEnum.SERIALNO;
                if (!TextUtils.isEmpty(serialNo2)) {
                    return serialNo2;
                }
                String macByJavaAPI2 = getMacByJavaAPI();
                DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
                deviceTypeEnum = deviceTypeEnum3;
                if (!TextUtils.isEmpty(macByJavaAPI2)) {
                    return macByJavaAPI2;
                }
                String macBySystemInterface = getMacBySystemInterface(context);
                deviceTypeEnum = deviceTypeEnum3;
                return macBySystemInterface;
            }
            String imei2 = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            if (!TextUtils.isEmpty(imei2)) {
                return imei2;
            }
            String serialNo3 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i)) {
                serialNo3 = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + serialNo3);
                }
            }
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            String macByJavaAPI3 = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum4;
            if (!TextUtils.isEmpty(macByJavaAPI3)) {
                return macByJavaAPI3;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            deviceTypeEnum = deviceTypeEnum4;
            if (!AnalyticsConstants.UM_DEBUG) {
                return macBySystemInterface2;
            }
            MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
            return macBySystemInterface2;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Tablet" : "Phone";
        } catch (Throwable unused) {
            return "Phone";
        }
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i10 = displayMetrics.widthPixels;
                return String.valueOf(displayMetrics.heightPixels) + androidx.webkit.b.f28327e + String.valueOf(i10);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
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
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(bb.c.k.L0), gl10.glGetString(bb.c.k.M0)};
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th2);
            }
            return new String[0];
        }
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    private static String getIMEI(Context context) {
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        int i10 = Build.VERSION.SDK_INT;
        String str = "";
        if (i10 >= 29 && sImeiOrMeidFlag) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105524g)) {
            if (context == null) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (telephonyManager != null) {
                try {
                    if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        String deviceId = telephonyManager.getDeviceId();
                        try {
                            if (AnalyticsConstants.UM_DEBUG) {
                                MLog.i(LOG_TAG, "getDeviceId, IMEI: " + deviceId);
                            }
                            str = deviceId;
                        } catch (Throwable th2) {
                            th = th2;
                            str = deviceId;
                            try {
                                if (AnalyticsConstants.UM_DEBUG) {
                                    MLog.w(LOG_TAG, "No IMEI.", th);
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                }
                                sImei = str;
                                return sImei;
                            } catch (Throwable th3) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    sImeiOrMeidFlag = true;
                                }
                                throw th3;
                            }
                        }
                    }
                    if (i10 >= 29) {
                        sImeiOrMeidFlag = true;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        sImei = str;
        return sImei;
    }

    public static String getIPAddress(Context context) {
        String hostAddress;
        String hostAddress2 = null;
        try {
            hostAddress = null;
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                try {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address) && !networkInterface.getDisplayName().contains("dummy") && hostAddress2 == null) {
                            hostAddress2 = inetAddress.getHostAddress();
                        }
                        if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address) && !networkInterface.getDisplayName().contains("dummy") && hostAddress == null) {
                            hostAddress = inetAddress.getHostAddress();
                        }
                    }
                } catch (SocketException unused) {
                    hostAddress2 = hostAddress;
                    hostAddress = hostAddress2;
                    hostAddress2 = "SocketException";
                }
            }
        } catch (SocketException unused2) {
        }
        if (hostAddress2 != null) {
            return hostAddress2;
        }
        return hostAddress == null ? "null" : hostAddress;
    }

    public static String getIdfa(Context context) {
        if (!TextUtils.isEmpty(sIDFA)) {
            return sIDFA;
        }
        String strA = "";
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.f105540w)) {
                return "";
            }
            strA = a.a(context);
            sIDFA = strA;
            return strA;
        } catch (Throwable unused) {
            return strA;
        }
    }

    public static String getImei(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String deviceId = null;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && sImeiOrMeidFlag) {
                if (i10 >= 29) {
                    sImeiOrMeidFlag = true;
                }
                return null;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105524g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e)) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                deviceId = telephonyManager.getDeviceId();
            }
            if (i10 >= 29) {
            }
            sImei = deviceId;
            return deviceId;
        } catch (Throwable th2) {
            try {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("No IMEI.", th2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                }
            } catch (Throwable th3) {
                if (Build.VERSION.SDK_INT >= 29) {
                    sImeiOrMeidFlag = true;
                }
                throw th3;
            }
        }
        sImeiOrMeidFlag = true;
        sImei = deviceId;
        return deviceId;
    }

    public static String getImeiNew(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String deviceId = null;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && sImeiOrMeidFlag) {
                if (i10 >= 29) {
                    sImeiOrMeidFlag = true;
                }
                return null;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105524g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e)) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                if (i10 >= 26) {
                    try {
                        Method method = telephonyManager.getClass().getMethod("getImei", new Class[0]);
                        method.setAccessible(true);
                        deviceId = (String) method.invoke(telephonyManager, new Object[0]);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(deviceId)) {
                        deviceId = telephonyManager.getDeviceId();
                    }
                } else {
                    deviceId = telephonyManager.getDeviceId();
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                sImeiOrMeidFlag = true;
            }
            sImei = deviceId;
            return deviceId;
        } catch (Throwable th2) {
            try {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("No IMEI.", th2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                }
            } catch (Throwable th3) {
                if (Build.VERSION.SDK_INT >= 29) {
                    sImeiOrMeidFlag = true;
                }
                throw th3;
            }
        }
    }

    public static String getImsi(Context context) {
        if (!TextUtils.isEmpty(sImsi)) {
            return sImsi;
        }
        String subscriberId = null;
        if (context == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && sImsiFlag) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105515ai)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                    subscriberId = telephonyManager.getSubscriberId();
                }
                if (i10 >= 29) {
                    sImsiFlag = true;
                }
            } catch (Throwable unused) {
                if (Build.VERSION.SDK_INT >= 29) {
                }
            }
        }
        sImsi = subscriberId;
        return sImsi;
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th2) {
            MLog.e(LOG_TAG, "error in getLocaleInfo", th2);
            return strArr;
        }
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (getImsi(context) == null) {
                return null;
            }
            int i10 = context.getResources().getConfiguration().mcc;
            int i11 = context.getResources().getConfiguration().mnc;
            if (i10 != 0) {
                String strValueOf = String.valueOf(i11);
                if (i11 < 10) {
                    strValueOf = String.format(TimeModel.f55753i, Integer.valueOf(i11));
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(String.valueOf(i10));
                stringBuffer.append(strValueOf);
                return stringBuffer.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getMac(Context context) {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        String macByJavaAPI = "";
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105525h)) {
            if (context == null) {
                return "";
            }
            if (Build.VERSION.SDK_INT == 23) {
                macByJavaAPI = getMacByJavaAPI();
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    macByJavaAPI = AnalyticsConstants.CHECK_DEVICE ? getMacShell() : getMacBySystemInterface(context);
                }
            } else {
                macByJavaAPI = getMacByJavaAPI();
                if (TextUtils.isEmpty(macByJavaAPI)) {
                    macByJavaAPI = getMacBySystemInterface(context);
                }
            }
        }
        sWifiMac = macByJavaAPI;
        return sWifiMac;
    }

    private static String getMacByJavaAPI() {
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.f105525h)) {
                return null;
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if ("wlan0".equals(networkInterfaceNextElement.getName()) || "eth0".equals(networkInterfaceNextElement.getName())) {
                    byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : hardwareAddress) {
                            sb2.append(String.format("%02X:", Byte.valueOf(b10)));
                        }
                        if (sb2.length() > 0) {
                            sb2.deleteCharAt(sb2.length() - 1);
                        }
                        return sb2.toString().toLowerCase(Locale.getDefault());
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getMacBySystemInterface(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105525h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                    return wifiManager != null ? wifiManager.getConnectionInfo().getMacAddress() : "";
                }
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
            }
            return "";
        } catch (Throwable th2) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.w(LOG_TAG, "Could not get mac address." + th2.toString());
            }
            return "";
        }
    }

    private static String getMacShell() {
        try {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.f105525h)) {
                return null;
            }
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    String strReaMac = reaMac(strArr[i10]);
                    if (strReaMac != null) {
                        return strReaMac;
                    }
                } catch (Throwable th2) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.e(LOG_TAG, "open file  Failed", th2);
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getMeid(Context context) {
        String strMeid = null;
        if (context == null || ((TelephonyManager) context.getSystemService(g0.a.f118921e)) == null) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105516aj)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    if (Build.VERSION.SDK_INT < 26) {
                        strMeid = getIMEI(context);
                    } else {
                        strMeid = meid(context);
                        if (TextUtils.isEmpty(strMeid)) {
                            strMeid = getIMEI(context);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return strMeid;
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
            }
            return strArr;
        } catch (Throwable unused) {
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static String getOaid(Context context) {
        if (!TextUtils.isEmpty(sOAID)) {
            return sOAID;
        }
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
            return "";
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(h.f105367a, 0);
            if (sharedPreferences == null) {
                return "";
            }
            String string = sharedPreferences.getString(h.f105368b, "");
            try {
                sOAID = string;
            } catch (Throwable unused) {
            }
            return string;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (!checkPermission(context, "android.permission.READ_PHONE_STATE") || telephonyManager == null) {
                return null;
            }
            return telephonyManager.getNetworkOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int[] getResolutionArray(Context context) {
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Method method = Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class);
                if (method != null) {
                    method.invoke(defaultDisplay, displayMetrics);
                    int i10 = displayMetrics.widthPixels;
                    int i11 = displayMetrics.heightPixels;
                    if (i10 > i11) {
                        iArr[0] = i11;
                        iArr[1] = i10;
                    } else {
                        iArr[0] = i10;
                        iArr[1] = i11;
                    }
                    iArr[0] = i10;
                    iArr[1] = i11;
                    return iArr;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String getSecondSimIMEi(Context context) {
        if (!TextUtils.isEmpty(sSecondImei)) {
            return sSecondImei;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && sSecondImeiFlag) {
            return null;
        }
        if (context != null && FieldManager.allow(com.umeng.commonsdk.utils.b.f105518al) && UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager == null) {
                    if (i10 >= 29) {
                        sSecondImeiFlag = true;
                    }
                    return null;
                }
                Class<?> cls = telephonyManager.getClass();
                if (((Integer) cls.getMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue() == 2) {
                    sSecondImei = (String) cls.getMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, 2);
                }
                if (i10 >= 29) {
                }
            } catch (Throwable unused) {
                if (Build.VERSION.SDK_INT >= 29) {
                }
            }
            sSecondImeiFlag = true;
        }
        return sSecondImei;
    }

    public static String getSerial() {
        return getSerialNo();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0052, please report this as an issue */
    private static String getSerialNo() {
        String str;
        if (!TextUtils.isEmpty(sSerialNo)) {
            return sSerialNo;
        }
        int i10 = Build.VERSION.SDK_INT;
        String str2 = "";
        if (i10 >= 29 && sSerialFlag) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105527j)) {
            if (i10 >= 26) {
                try {
                    Class<?> cls = Class.forName("android.os.Build");
                    str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
                } catch (Throwable unused) {
                }
            } else {
                try {
                    str = Build.SERIAL;
                } catch (Throwable unused2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                    }
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i(LOG_TAG, "getDeviceId, serial no: " + str2);
                    }
                    return sSerialNo;
                }
            }
            str2 = str;
            sSerialNo = str2;
            if (Build.VERSION.SDK_INT >= 29) {
                sSerialFlag = true;
            }
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.i(LOG_TAG, "getDeviceId, serial no: " + str2);
        }
        return sSerialNo;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    public static String getSimICCID(Context context) {
        if (!TextUtils.isEmpty(sSimSerialNumber)) {
            return sSimSerialNumber;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && sSimSerialNumberFlag) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.b.am)) {
            if (context != null) {
                try {
                    if (UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                        if (telephonyManager == null) {
                            if (i10 >= 29) {
                                sSimSerialNumberFlag = true;
                            }
                            return null;
                        }
                        sSimSerialNumber = telephonyManager.getSimSerialNumber();
                    }
                    if (i10 >= 29) {
                        sSimSerialNumberFlag = true;
                    }
                } catch (Throwable unused) {
                    if (Build.VERSION.SDK_INT >= 29) {
                    }
                    return sSimSerialNumber;
                }
            } else if (i10 >= 29) {
                sSimSerialNumberFlag = true;
            }
        }
        return sSimSerialNumber;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (!TextUtils.isEmpty(property)) {
                return "MIUI";
            }
            if (isFlyMe()) {
                return "Flyme";
            }
            if (isEmui(buildProp)) {
                return "Emui";
            }
            return !TextUtils.isEmpty(getYunOSVersion(buildProp)) ? "YunOS" : property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            try {
                if (isFlyMe()) {
                    property = getFlymeVersion(buildProp);
                } else {
                    property = isEmui(buildProp) ? getEmuiVersion(buildProp) : getYunOSVersion(buildProp);
                }
                return property;
            } catch (Throwable unused) {
                return property;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th2) {
            MLog.i(LOG_TAG, "error in getTimeZone", th2);
        }
        return 8;
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

    public static boolean isChineseAera(Context context) {
        if (context == null) {
            return false;
        }
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, ak.O, "");
            if (!TextUtils.isEmpty(strImprintProperty)) {
                return strImprintProperty.equals("cn");
            }
            if (getImsi(context) != null) {
                int i10 = context.getResources().getConfiguration().mcc;
                if (i10 != 460 && i10 != 461) {
                    if (i10 == 0) {
                        String str = getLocaleInfo(context)[0];
                        if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("cn")) {
                        }
                    }
                }
                return true;
            }
            String str2 = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("cn")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    private static boolean isEmui(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null;
        } catch (Exception unused) {
        }
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isHarmony(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", w.b.f17895e, "android")).equals("harmony");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    private static String meid(Context context) {
        if (TextUtils.isEmpty(sMeid)) {
            return sMeid;
        }
        int i10 = Build.VERSION.SDK_INT;
        String str = null;
        if ((i10 >= 29 && sImeiOrMeidFlag) || context == null) {
            return null;
        }
        try {
            Object objInvoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null && (objInvoke instanceof String)) {
                str = (String) objInvoke;
            }
            if (i10 >= 29) {
                sImeiOrMeidFlag = true;
            }
        } catch (Throwable th2) {
            try {
                ULog.e("meid:" + th2.getMessage());
                if (Build.VERSION.SDK_INT >= 29) {
                }
            } catch (Throwable th3) {
                if (Build.VERSION.SDK_INT >= 29) {
                    sImeiOrMeidFlag = true;
                }
                throw th3;
            }
        }
        sMeid = str;
        return sMeid;
    }

    private static String reaMac(String str) {
        BufferedReader bufferedReader;
        String line = null;
        try {
            FileReader fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader, 1024);
                try {
                    line = bufferedReader.readLine();
                    try {
                        fileReader.close();
                    } catch (Throwable unused) {
                    }
                    bufferedReader.close();
                    return line;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileReader.close();
                    } catch (Throwable unused2) {
                    }
                    if (bufferedReader == null) {
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable unused3) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable unused4) {
        }
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
