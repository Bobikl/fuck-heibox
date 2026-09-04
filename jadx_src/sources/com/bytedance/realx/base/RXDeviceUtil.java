package com.bytedance.realx.base;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class RXDeviceUtil {
    private static final String KEY_COLOROS_VERSION_NAME = "ro.build.version.opporom";
    private static final String KEY_EMUI_VERSION_NAME = "ro.build.version.emui";
    private static final String KEY_FLYME_VERSION_NAME = "ro.build.display.id";
    private static final String KEY_HARMONYOS_VERSION_NAME = "hw_sc.build.platform.version";
    private static final String KEY_MAGICUI_VERSION = "ro.build.version.magic";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_NUBIA_VERSION_CODE = "ro.build.nubia.rom.code";
    private static final String KEY_NUBIA_VERSION_NAME = "ro.build.nubia.rom.name";
    private static final String KEY_ONEPLUS_VERSION_NAME = "ro.rom.version";
    private static final String KEY_VIVO_VERSION = "ro.vivo.os.version";
    private static final String KEY_VIVO_VERSION_NAME = "ro.vivo.os.name";
    private static String customOS = "";
    private static String customOSVersion = "";

    public static String deleteSpaceAndToUpperCase(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(" ", "").toUpperCase();
    }

    public static String getCustomOSVersion(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOSVersion;
    }

    public static String getPhoneSystem(String str) {
        if (TextUtils.isEmpty(customOS)) {
            setCustomOSInfo(str);
        }
        return customOS + lg.a.f131412e + customOSVersion;
    }

    private static String getSystemPropertyValue(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean isMagicUI() {
        return false;
    }

    private static void setCustomOSInfo(String str) {
        try {
            switch (deleteSpaceAndToUpperCase(str)) {
                case "HUAWEI":
                    if (isHarmonyOS()) {
                        customOSVersion = getSystemPropertyValue("hw_sc.build.platform.version");
                        customOS = "HarmonyOS";
                        break;
                    } else {
                        customOS = "EMUI";
                        customOSVersion = getSystemPropertyValue("ro.build.version.emui");
                        break;
                    }
                    break;
                case "HONOR":
                    if (TextUtils.isEmpty(getSystemPropertyValue(KEY_MAGICUI_VERSION))) {
                        if (!isHarmonyOS()) {
                            customOS = "EMUI";
                            customOSVersion = getSystemPropertyValue("ro.build.version.emui");
                        } else {
                            customOS = "HarmonyOS";
                            if (!TextUtils.isEmpty(getSystemPropertyValue("hw_sc.build.platform.version"))) {
                                customOSVersion = getSystemPropertyValue("hw_sc.build.platform.version");
                            } else {
                                customOSVersion = "";
                            }
                        }
                        break;
                    } else {
                        customOS = "MagicUI";
                        customOSVersion = getSystemPropertyValue(KEY_MAGICUI_VERSION);
                        break;
                    }
                    break;
                case "XIAOMI":
                case "REDMI":
                    customOS = "MIUI";
                    customOSVersion = getSystemPropertyValue(KEY_MIUI_VERSION_NAME);
                    break;
                case "REALME":
                case "OPPO":
                    customOS = "ColorOS";
                    customOSVersion = getSystemPropertyValue(KEY_COLOROS_VERSION_NAME);
                    break;
                case "VIVO":
                    customOS = "Funtouch";
                    customOSVersion = getSystemPropertyValue(KEY_VIVO_VERSION);
                    break;
                case "ONEPLUS":
                    customOS = "HydrogenOS";
                    customOSVersion = getSystemPropertyValue(KEY_ONEPLUS_VERSION_NAME);
                    break;
                case "MEIZU":
                    customOS = "Flyme";
                    customOSVersion = getSystemPropertyValue(KEY_FLYME_VERSION_NAME);
                    break;
                case "NUBIA":
                    customOS = getSystemPropertyValue(KEY_NUBIA_VERSION_NAME);
                    customOSVersion = getSystemPropertyValue(KEY_NUBIA_VERSION_CODE);
                    break;
                default:
                    customOS = "Android";
                    customOSVersion = Build.VERSION.RELEASE;
                    break;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
