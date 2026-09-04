package com.alipay.deviceid.module.x;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;

/* JADX INFO: compiled from: EnvironmentInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f38348a = new l();

    private l() {
    }

    public static l a() {
        return f38348a;
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static boolean a(Context context) {
        boolean z10;
        int length;
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.PRODUCT.contains("sdk") && !Build.FINGERPRINT.contains("generic")) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    String deviceId = telephonyManager.getDeviceId();
                    if (deviceId != null && (length = deviceId.length()) != 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                z10 = true;
                                break;
                            }
                            if (!Character.isWhitespace(deviceId.charAt(i10)) && deviceId.charAt(i10) != '0') {
                                z10 = false;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                    if (z10) {
                        return true;
                    }
                }
                return e.a(Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b() {
        return "android";
    }

    public static boolean c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                if (new File(strArr[i10] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String d() {
        return Build.BOARD;
    }

    public static String e() {
        return Build.BRAND;
    }

    public static String f() {
        return Build.DEVICE;
    }

    public static String g() {
        return Build.DISPLAY;
    }

    public static String h() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String i() {
        return Build.MANUFACTURER;
    }

    public static String j() {
        return Build.MODEL;
    }

    public static String k() {
        return Build.PRODUCT;
    }

    public static String l() {
        return Build.VERSION.RELEASE;
    }

    public static String m() {
        return Build.VERSION.SDK;
    }

    public static String n() {
        return Build.TAGS;
    }
}
