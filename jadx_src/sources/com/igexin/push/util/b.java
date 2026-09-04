package com.igexin.push.util;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.vivo.push.PushClientConstants;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f64040a = "CommonUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f64041b;

    public static Intent a(String str, int i10) throws URISyntaxException {
        String string;
        String strSubstring;
        StringBuilder sb2;
        int i11;
        boolean z10;
        int i12 = 0;
        try {
            boolean zStartsWith = str.startsWith("android-app:");
            if ((i10 & 3) != 0) {
                try {
                    if (!str.startsWith("intent:") && !zStartsWith) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(str));
                            return intent;
                        } catch (IllegalArgumentException e10) {
                            throw new URISyntaxException(str, e10.getMessage());
                        }
                    }
                } catch (IndexOutOfBoundsException unused) {
                    throw new URISyntaxException(str, "illegal Intent URI format", i12);
                }
            }
            int iLastIndexOf = str.lastIndexOf("#");
            try {
                if (iLastIndexOf == -1) {
                    if (!zStartsWith) {
                        return new Intent("android.intent.action.VIEW", Uri.parse(str));
                    }
                } else if (!str.startsWith("#Intent;", iLastIndexOf)) {
                    if (!zStartsWith) {
                        return b(str, i10);
                    }
                    iLastIndexOf = -1;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (iLastIndexOf >= 0) {
                    string = str.substring(0, iLastIndexOf);
                    iLastIndexOf += 8;
                } else {
                    string = str;
                }
                if (intent2.getExtras() == null) {
                    intent2.putExtras(new Bundle());
                }
                Bundle extras = intent2.getExtras();
                boolean z11 = false;
                boolean z12 = false;
                Intent intent3 = intent2;
                String strSubstring2 = null;
                while (true) {
                    if (iLastIndexOf < 0 || str.startsWith(com.google.android.exoplayer2.text.ttml.d.f49800p0, iLastIndexOf)) {
                        break;
                    }
                    int iIndexOf = str.indexOf(61, iLastIndexOf);
                    if (iIndexOf < 0) {
                        iIndexOf = iLastIndexOf - 1;
                    }
                    int iIndexOf2 = str.indexOf(59, iLastIndexOf);
                    String strDecode = iIndexOf < iIndexOf2 ? Uri.decode(str.substring(iIndexOf + 1, iIndexOf2)) : "";
                    if (str.startsWith("action=", iLastIndexOf)) {
                        intent3.setAction(strDecode);
                        if (!z11) {
                            z12 = true;
                        }
                    } else if (str.startsWith("category=", iLastIndexOf)) {
                        intent3.addCategory(strDecode);
                    } else if (str.startsWith("type=", iLastIndexOf)) {
                        intent3.setType(strDecode);
                    } else if (str.startsWith("launchFlags=", iLastIndexOf)) {
                        intent3.setFlags(Integer.decode(strDecode).intValue());
                        if ((i10 & 4) == 0) {
                            intent3.setFlags((~(67 | 128)) & intent3.getFlags());
                        }
                    } else if (str.startsWith("package=", iLastIndexOf)) {
                        intent3.setPackage(strDecode);
                    } else if (str.startsWith("component=", iLastIndexOf)) {
                        intent3.setComponent(ComponentName.unflattenFromString(strDecode));
                    } else if (str.startsWith("scheme=", iLastIndexOf)) {
                        if (z11) {
                            intent3.setData(Uri.parse(strDecode + ":"));
                        } else {
                            strSubstring2 = strDecode;
                        }
                    } else if (str.startsWith("sourceBounds=", iLastIndexOf)) {
                        intent3.setSourceBounds(Rect.unflattenFromString(strDecode));
                    } else if (iIndexOf2 == iLastIndexOf + 3 && str.startsWith("SEL", iLastIndexOf)) {
                        intent3 = new Intent();
                        z11 = true;
                    } else {
                        String strDecode2 = Uri.decode(str.substring(iLastIndexOf + 2, iIndexOf));
                        if (str.startsWith("S.", iLastIndexOf)) {
                            extras.putString(strDecode2, strDecode);
                        } else if (str.startsWith("B.", iLastIndexOf)) {
                            extras.putBoolean(strDecode2, Boolean.parseBoolean(strDecode));
                        } else {
                            if (str.startsWith("b.", iLastIndexOf)) {
                                extras.putByte(strDecode2, Byte.parseByte(strDecode));
                            } else if (str.startsWith("c.", iLastIndexOf)) {
                                z10 = false;
                                extras.putChar(strDecode2, strDecode.charAt(0));
                            } else {
                                z10 = false;
                                if (str.startsWith("d.", iLastIndexOf)) {
                                    extras.putDouble(strDecode2, Double.parseDouble(strDecode));
                                } else if (str.startsWith("f.", iLastIndexOf)) {
                                    extras.putFloat(strDecode2, Float.parseFloat(strDecode));
                                } else if (str.startsWith("i.", iLastIndexOf)) {
                                    extras.putInt(strDecode2, Integer.parseInt(strDecode));
                                } else if (str.startsWith("l.", iLastIndexOf)) {
                                    extras.putLong(strDecode2, Long.parseLong(strDecode));
                                } else {
                                    if (!str.startsWith("s.", iLastIndexOf)) {
                                        throw new URISyntaxException(str, "unknown EXTRA type", iLastIndexOf);
                                    }
                                    extras.putShort(strDecode2, Short.parseShort(strDecode));
                                }
                            }
                            iLastIndexOf = iIndexOf2 + 1;
                        }
                    }
                    z10 = false;
                    iLastIndexOf = iIndexOf2 + 1;
                }
                intent3.putExtras(extras);
                if (!z11) {
                    intent2 = intent3;
                } else if (intent2.getPackage() == null) {
                    intent2.setSelector(intent3);
                }
                if (string != null) {
                    if (string.startsWith("intent:")) {
                        string = string.substring(7);
                        if (strSubstring2 != null) {
                            string = strSubstring2 + ':' + string;
                        }
                    } else if (string.startsWith("android-app:")) {
                        if (string.charAt(12) == '/' && string.charAt(13) == '/') {
                            int iIndexOf3 = string.indexOf(47, 14);
                            if (iIndexOf3 < 0) {
                                intent2.setPackage(string.substring(14));
                                if (!z12) {
                                    intent2.setAction("android.intent.action.MAIN");
                                }
                                string = "";
                            } else {
                                intent2.setPackage(string.substring(14, iIndexOf3));
                                int i13 = iIndexOf3 + 1;
                                if (i13 >= string.length()) {
                                    strSubstring = null;
                                } else {
                                    int iIndexOf4 = string.indexOf(47, i13);
                                    if (iIndexOf4 >= 0) {
                                        strSubstring2 = string.substring(i13, iIndexOf4);
                                        if (iIndexOf4 >= string.length() || (iIndexOf3 = string.indexOf(47, (i11 = iIndexOf4 + 1))) < 0) {
                                            iIndexOf3 = iIndexOf4;
                                        } else {
                                            strSubstring = string.substring(i11, iIndexOf3);
                                        }
                                    } else {
                                        strSubstring2 = string.substring(i13);
                                    }
                                    strSubstring = null;
                                }
                                if (strSubstring2 == null) {
                                    if (!z12) {
                                        intent2.setAction("android.intent.action.MAIN");
                                    }
                                    string = "";
                                } else {
                                    if (strSubstring == null) {
                                        sb2 = new StringBuilder();
                                        sb2.append(strSubstring2);
                                        sb2.append(":");
                                    } else {
                                        sb2 = new StringBuilder();
                                        sb2.append(strSubstring2);
                                        sb2.append(HttpConstant.SCHEME_SPLIT);
                                        sb2.append(strSubstring);
                                        sb2.append(string.substring(iIndexOf3));
                                    }
                                    string = sb2.toString();
                                }
                            }
                        } else {
                            string = "";
                        }
                    }
                    if (string.length() > 0) {
                        try {
                            intent2.setData(Uri.parse(string));
                        } catch (IllegalArgumentException e11) {
                            throw new URISyntaxException(str, e11.getMessage());
                        }
                    }
                }
                return intent2;
            } catch (IndexOutOfBoundsException unused2) {
                i12 = iLastIndexOf;
                throw new URISyntaxException(str, "illegal Intent URI format", i12);
            }
        } catch (IndexOutOfBoundsException unused3) {
        }
    }

    public static Pair<ServiceInfo, Class> a(Context context, Class cls) {
        try {
            ServiceInfo[] serviceInfoArrC = n.c(context);
            if (serviceInfoArrC != null && serviceInfoArrC.length > 0) {
                int length = serviceInfoArrC.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ServiceInfo serviceInfo = serviceInfoArrC[i10];
                    try {
                        Class<?> cls2 = Class.forName(serviceInfo.name);
                        if (cls2 != cls && cls.isAssignableFrom(cls2)) {
                            com.igexin.a.a.c.b.a(f64040a + cls.getSimpleName() + " child is " + cls2.getSimpleName(), new Object[0]);
                            return Pair.create(serviceInfo, cls2);
                        }
                    } catch (Throwable th2) {
                        com.igexin.a.a.c.b.a(f64040a, th2.toString());
                    }
                }
            }
        } catch (Throwable th3) {
            com.igexin.a.a.c.b.a(f64040a, th3.toString());
            com.igexin.a.a.c.a.c.a().a(" findGtImplClassInManifest error = " + th3.toString());
        }
        return Pair.create(null, null);
    }

    private static String a(Context context) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 0);
            return listQueryIntentActivities.size() > 0 ? listQueryIntentActivities.get(0).activityInfo.name : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(ApplicationInfo applicationInfo) {
        try {
            String string = applicationInfo.metaData.getString("BUILD_CONFIG");
            if (TextUtils.isEmpty(string)) {
                string = applicationInfo.packageName;
            }
            Class<?> cls = Class.forName(string + ".BuildConfig");
            return (String) cls.getField("GETUI_APP_ID").get(cls);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static boolean a() {
        try {
            if (f64041b != null) {
                return f64041b.booleanValue();
            }
            f64041b = Boolean.valueOf((!"Xiaomi".equalsIgnoreCase(n.a()) && TextUtils.isEmpty(a("ro.miui.ui.version.name")) && TextUtils.isEmpty(a("ro.miui.ui.version.code"))) ? false : true);
            return f64041b.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized boolean a(int i10, Notification notification) {
        try {
            if (a()) {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static synchronized boolean a(int i10, boolean z10) {
        try {
            if (com.igexin.push.core.d.f63671e == null) {
                return false;
            }
            String strA = n.a();
            if ("huawei".equalsIgnoreCase(strA) || "honor".equalsIgnoreCase(strA)) {
                int iIntValue = ((Integer) o.c(com.igexin.push.core.d.f63671e, "hwBadgeNum", 0, new String[0])).intValue();
                if (!z10) {
                    i10 += iIntValue;
                }
                o.a(com.igexin.push.core.d.f63671e, "hwBadgeNum", Integer.valueOf(i10), new String[0]);
                Bundle bundle = new Bundle();
                bundle.putString("package", com.igexin.push.core.d.f63669c);
                bundle.putString("class", a(com.igexin.push.core.d.f63671e));
                bundle.putInt("badgenumber", i10);
                Uri uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
                Uri uri2 = Uri.parse("content://com.hihonor.android.launcher.settings/badge/");
                if (TextUtils.isEmpty(com.igexin.push.core.d.f63671e.getContentResolver().getType(uri))) {
                    uri = uri2;
                }
                com.igexin.push.core.d.f63671e.getContentResolver().call(uri, "change_badge", (String) null, bundle);
                return true;
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.c("CU", th2.getMessage());
        }
        return false;
    }

    private static Intent b(String str, int i10) throws URISyntaxException {
        boolean z10;
        int iLastIndexOf = str.lastIndexOf(35);
        if (iLastIndexOf < 0) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        String str2 = null;
        int i11 = iLastIndexOf + 1;
        boolean z11 = true;
        if (str.regionMatches(i11, "action(", 0, 7)) {
            int i12 = i11 + 7;
            int iIndexOf = str.indexOf(41, i12);
            String strSubstring = str.substring(i12, iIndexOf);
            z10 = true;
            i11 = iIndexOf + 1;
            str2 = strSubstring;
        } else {
            z10 = false;
        }
        Intent intent = new Intent(str2);
        if (str.regionMatches(i11, "categories(", 0, 11)) {
            int i13 = i11 + 11;
            int iIndexOf2 = str.indexOf(41, i13);
            while (i13 < iIndexOf2) {
                int iIndexOf3 = str.indexOf(33, i13);
                if (iIndexOf3 < 0 || iIndexOf3 > iIndexOf2) {
                    iIndexOf3 = iIndexOf2;
                }
                if (i13 < iIndexOf3) {
                    intent.addCategory(str.substring(i13, iIndexOf3));
                }
                i13 = iIndexOf3 + 1;
            }
            i11 = iIndexOf2 + 1;
            z10 = true;
        }
        if (str.regionMatches(i11, "type(", 0, 5)) {
            int i14 = i11 + 5;
            int iIndexOf4 = str.indexOf(41, i14);
            intent.setType(str.substring(i14, iIndexOf4));
            i11 = iIndexOf4 + 1;
            z10 = true;
        }
        if (str.regionMatches(i11, "launchFlags(", 0, 12)) {
            int i15 = i11 + 12;
            int iIndexOf5 = str.indexOf(41, i15);
            intent.setFlags(Integer.decode(str.substring(i15, iIndexOf5)).intValue());
            if ((i10 & 4) == 0) {
                intent.setFlags((~(67 | 128)) & intent.getFlags());
            }
            i11 = iIndexOf5 + 1;
            z10 = true;
        }
        if (str.regionMatches(i11, "component(", 0, 10)) {
            int i16 = i11 + 10;
            int iIndexOf6 = str.indexOf(41, i16);
            int iIndexOf7 = str.indexOf(33, i16);
            if (iIndexOf7 >= 0 && iIndexOf7 < iIndexOf6) {
                intent.setComponent(new ComponentName(str.substring(i16, iIndexOf7), str.substring(iIndexOf7 + 1, iIndexOf6)));
            }
            i11 = iIndexOf6 + 1;
            z10 = true;
        }
        if (str.regionMatches(i11, "extras(", 0, 7)) {
            int i17 = i11 + 7;
            int iIndexOf8 = str.indexOf(41, i17);
            int i18 = -1;
            if (iIndexOf8 == -1) {
                throw new URISyntaxException(str, "EXTRA missing trailing ')'", i17);
            }
            if (intent.getExtras() == null) {
                intent.putExtras(new Bundle());
            }
            Bundle extras = intent.getExtras();
            while (i17 < iIndexOf8) {
                int iIndexOf9 = str.indexOf(61, i17);
                int i19 = i17 + 1;
                if (iIndexOf9 <= i19 || i17 >= iIndexOf8) {
                    throw new URISyntaxException(str, "EXTRA missing '='", i17);
                }
                char cCharAt = str.charAt(i17);
                String strSubstring2 = str.substring(i19, iIndexOf9);
                int i20 = iIndexOf9 + 1;
                int iIndexOf10 = str.indexOf(33, i20);
                if (iIndexOf10 == i18 || iIndexOf10 >= iIndexOf8) {
                    iIndexOf10 = iIndexOf8;
                }
                if (i20 >= iIndexOf10) {
                    throw new URISyntaxException(str, "EXTRA missing '!'", i20);
                }
                String strSubstring3 = str.substring(i20, iIndexOf10);
                if (cCharAt == 'B') {
                    extras.putBoolean(strSubstring2, Boolean.parseBoolean(strSubstring3));
                } else if (cCharAt == 'S') {
                    extras.putString(strSubstring2, Uri.decode(strSubstring3));
                } else if (cCharAt == 'f') {
                    extras.putFloat(strSubstring2, Float.parseFloat(strSubstring3));
                } else if (cCharAt == 'i') {
                    extras.putInt(strSubstring2, Integer.parseInt(strSubstring3));
                } else if (cCharAt == 'l') {
                    extras.putLong(strSubstring2, Long.parseLong(strSubstring3));
                } else {
                    if (cCharAt != 's') {
                        switch (cCharAt) {
                            case 'b':
                                extras.putByte(strSubstring2, Byte.parseByte(strSubstring3));
                                break;
                            case 'c':
                                extras.putChar(strSubstring2, Uri.decode(strSubstring3).charAt(0));
                                break;
                            case 'd':
                                try {
                                    extras.putDouble(strSubstring2, Double.parseDouble(strSubstring3));
                                } catch (NumberFormatException unused) {
                                    throw new URISyntaxException(str, "EXTRA value can't be parsed", iIndexOf10);
                                }
                                break;
                            default:
                                throw new URISyntaxException(str, "EXTRA has unknown type", iIndexOf10);
                        }
                        throw new URISyntaxException(str, "EXTRA value can't be parsed", iIndexOf10);
                    }
                    extras.putShort(strSubstring2, Short.parseShort(strSubstring3));
                }
                char cCharAt2 = str.charAt(iIndexOf10);
                if (cCharAt2 == ')') {
                    intent.putExtras(extras);
                } else {
                    if (cCharAt2 != '!') {
                        throw new URISyntaxException(str, "EXTRA missing '!'", iIndexOf10);
                    }
                    i17 = iIndexOf10 + 1;
                    i18 = -1;
                }
            }
            intent.putExtras(extras);
        } else {
            z11 = z10;
        }
        intent.setData(z11 ? Uri.parse(str.substring(0, iLastIndexOf)) : Uri.parse(str));
        if (intent.getAction() != null) {
            return intent;
        }
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static boolean b(int i10, boolean z10) {
        try {
            if (com.igexin.push.core.d.f63671e == null || !"vivo".equalsIgnoreCase(n.a())) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra("packageName", com.igexin.push.core.d.f63671e.getPackageName());
            Intent launchIntentForPackage = com.igexin.push.core.d.f63671e.getPackageManager().getLaunchIntentForPackage(com.igexin.push.core.d.f63671e.getPackageName());
            if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
                return false;
            }
            int iIntValue = ((Integer) o.c(com.igexin.push.core.d.f63671e, "vivoBadgeNum", 0, new String[0])).intValue();
            if (!z10) {
                i10 += iIntValue;
            }
            o.a(com.igexin.push.core.d.f63671e, "vivoBadgeNum", Integer.valueOf(i10), new String[0]);
            intent.putExtra(PushClientConstants.TAG_CLASS_NAME, launchIntentForPackage.getComponent().getClassName());
            intent.putExtra("notificationNum", i10);
            intent.addFlags(16777216);
            com.igexin.push.core.d.f63671e.sendBroadcast(intent, com.igexin.push.core.d.az);
            return true;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.c("CU", th2.getMessage());
            return false;
        }
    }

    public static boolean c(int i10, boolean z10) {
        try {
            if (com.igexin.push.core.d.f63671e == null || !"oppo".equalsIgnoreCase(n.a())) {
                return false;
            }
            int iIntValue = ((Integer) o.c(com.igexin.push.core.d.f63671e, "oppoBadgeNum", 0, new String[0])).intValue();
            if (!z10) {
                i10 += iIntValue;
            }
            o.a(com.igexin.push.core.d.f63671e, "oppoBadgeNum", Integer.valueOf(i10), new String[0]);
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("packageName", com.igexin.push.core.d.f63671e.getPackageName());
            intent.putExtra("number", i10);
            intent.putExtra("upgradeNumber", i10);
            List<ResolveInfo> listQueryBroadcastReceivers = com.igexin.push.core.d.f63671e.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                com.igexin.push.core.d.f63671e.sendBroadcast(intent, com.igexin.push.core.d.az);
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i10);
            com.igexin.push.core.d.f63671e.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            return true;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.c("CU", e10.getMessage());
            return false;
        }
    }
}
