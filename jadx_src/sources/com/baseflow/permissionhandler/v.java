package com.baseflow.permissionhandler;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PermissionUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f40301a = "sp_permission_handler_permission_was_denied_before";

    private static String a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && e(context, null, str)) {
            return str;
        }
        if (i10 >= 29) {
            if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (e(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    static int b(@p0 Activity activity, String str) {
        if (activity == null) {
            return 0;
        }
        boolean zL = l(activity, str);
        boolean z10 = true;
        boolean z11 = !f(activity, str);
        if (!zL) {
            z10 = z11;
        } else if (z11) {
            z10 = false;
        }
        if (!zL && z10) {
            h(activity, str);
        }
        return (zL && z10) ? 4 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @TargetApi(22)
    static List<String> c(Context context, int i10) {
        String strA;
        String strA2;
        String strA3;
        ArrayList arrayList = new ArrayList();
        switch (i10) {
            case 0:
            case 37:
                if (e(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (e(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (e(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                }
                return arrayList;
            case 2:
                if (e(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (e(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (e(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i10 != 4 || Build.VERSION.SDK_INT < 29) {
                    if (e(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (e(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    }
                } else if (e(context, arrayList, eg.s.f118679f)) {
                    arrayList.add(eg.s.f118679f);
                }
                return arrayList;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (e(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                return arrayList;
            case 8:
                if (e(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 > 29 && e(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (e(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (e(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (e(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (e(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (e(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i11 >= 26 && e(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (e(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                }
                return arrayList;
            case 13:
                if (e(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (e(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (e(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                }
                return arrayList;
            case 15:
                if (e(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i12 = Build.VERSION.SDK_INT;
                if ((i12 < 29 || (i12 == 29 && Environment.isExternalStorageLegacy())) && e(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 16:
                if (e(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (e(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                return arrayList;
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (e(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                }
                return arrayList;
            case 21:
                if (e(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && e(context, arrayList, eg.v.f118685f)) {
                    arrayList.add(eg.v.f118685f);
                }
                return arrayList;
            case 23:
                if (e(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
                return arrayList;
            case 24:
                if (e(context, arrayList, eg.u.f118683f)) {
                    arrayList.add(eg.u.f118683f);
                }
                return arrayList;
            case 27:
                if (e(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (strA = a(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(strA);
                }
                return arrayList;
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (strA2 = a(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(strA2);
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (strA3 = a(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(strA3);
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                return arrayList;
            case 34:
                if (e(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                }
                return arrayList;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && e(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
                return arrayList;
            case 36:
                if (e(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                return arrayList;
        }
    }

    private static PackageInfo d(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    private static boolean e(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo packageInfoD = d(context);
        if (packageInfoD == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfoD.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @w0(api = 23)
    static boolean f(@n0 Activity activity, String str) {
        return !androidx.core.app.b.P(activity, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static int g(String str) {
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2062386608:
                if (str.equals("android.permission.READ_SMS")) {
                    b10 = 0;
                }
                break;
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    b10 = 1;
                }
                break;
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    b10 = 2;
                }
                break;
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    b10 = 3;
                }
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    b10 = 4;
                }
                break;
            case -1813079487:
                if (str.equals(eg.v.f118685f)) {
                    b10 = 5;
                }
                break;
            case -1783097621:
                if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    b10 = 6;
                }
                break;
            case -1561629405:
                if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    b10 = 7;
                }
                break;
            case -1479758289:
                if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    b10 = 8;
                }
                break;
            case -1238066820:
                if (str.equals("android.permission.BODY_SENSORS")) {
                    b10 = 9;
                }
                break;
            case -1164582768:
                if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                    b10 = 10;
                }
                break;
            case -909527021:
                if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    b10 = 11;
                }
                break;
            case -895679497:
                if (str.equals("android.permission.RECEIVE_MMS")) {
                    b10 = 12;
                }
                break;
            case -895673731:
                if (str.equals("android.permission.RECEIVE_SMS")) {
                    b10 = 13;
                }
                break;
            case -798669607:
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    b10 = 14;
                }
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    b10 = 15;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    b10 = 16;
                }
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    b10 = 17;
                }
                break;
            case 52602690:
                if (str.equals("android.permission.SEND_SMS")) {
                    b10 = 18;
                }
                break;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    b10 = 19;
                }
                break;
            case 175802396:
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    b10 = 20;
                }
                break;
            case 214526995:
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
            case 361658321:
                if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    b10 = 22;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    b10 = 23;
                }
                break;
            case 603653886:
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    b10 = 24;
                }
                break;
            case 610633091:
                if (str.equals("android.permission.WRITE_CALL_LOG")) {
                    b10 = com.google.common.base.a.C;
                }
                break;
            case 691260818:
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    b10 = com.google.common.base.a.D;
                }
                break;
            case 710297143:
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    b10 = 27;
                }
                break;
            case 784519842:
                if (str.equals("android.permission.USE_SIP")) {
                    b10 = 28;
                }
                break;
            case 970694249:
                if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    b10 = 29;
                }
                break;
            case 1166454870:
                if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    b10 = 30;
                }
                break;
            case 1271781903:
                if (str.equals("android.permission.GET_ACCOUNTS")) {
                    b10 = 31;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    b10 = 32;
                }
                break;
            case 1777263169:
                if (str.equals(eg.u.f118683f)) {
                    b10 = 33;
                }
                break;
            case 1780337063:
                if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    b10 = 34;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    b10 = 35;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    b10 = 36;
                }
                break;
            case 2024715147:
                if (str.equals(eg.s.f118679f)) {
                    b10 = 37;
                }
                break;
            case 2062356686:
                if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                    b10 = 38;
                }
                break;
            case 2114579147:
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    b10 = 39;
                }
                break;
            case 2133799037:
                if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    b10 = 40;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 8:
            case 12:
            case 13:
            case 18:
                return 13;
            case 1:
            case 24:
                return 0;
            case 2:
                return 17;
            case 3:
            case 10:
            case 17:
            case 19:
            case 25:
            case 28:
            case 40:
                return 8;
            case 4:
            case 16:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case 9:
                return 12;
            case 11:
                return 31;
            case 14:
                return 30;
            case 15:
            case 32:
                return 15;
            case 20:
                return 9;
            case 21:
            case 31:
            case 36:
                return 2;
            case 22:
                return 35;
            case 23:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case 29:
                return 34;
            case 30:
                return 29;
            case 33:
                return 24;
            case 34:
                return 19;
            case 35:
                return 7;
            case 37:
                return 4;
            case 38:
                return 28;
            case 39:
                return 18;
            default:
                return 20;
        }
    }

    private static void h(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean(f40301a, true).apply();
    }

    @n0
    static Integer i(@p0 Integer num, @p0 Integer num2) {
        HashSet hashSet = new HashSet();
        hashSet.add(num);
        hashSet.add(num2);
        return j(hashSet);
    }

    @n0
    static Integer j(@n0 Collection<Integer> collection) {
        if (collection.contains(4)) {
            return 4;
        }
        if (collection.contains(2)) {
            return 2;
        }
        if (collection.contains(0)) {
            return 0;
        }
        return collection.contains(3) ? 3 : 1;
    }

    static int k(@p0 Activity activity, String str, int i10) {
        if (i10 == -1) {
            return b(activity, str);
        }
        return 1;
    }

    private static boolean l(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean(f40301a, false);
    }
}
