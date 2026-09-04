package com.huawei.hms.push;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.core.app.o0;
import com.huawei.hms.support.log.HMSLog;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: CommFun.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    private static int a() {
        return d() ? 603979776 : 536870912;
    }

    public static long a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Date date = new Date();
            int hours = (date.getHours() * 2) + (date.getMinutes() / 30);
            String strConcat = str.concat(str);
            HMSLog.i("PushSelfShowLog", "startIndex is " + hours + ",ap is:" + strConcat + ",length is:" + strConcat.length());
            int length = strConcat.length();
            for (int i10 = hours; i10 < length; i10++) {
                if (strConcat.charAt(i10) != '0') {
                    long minutes = ((long) (((i10 - hours) * 30) - (date.getMinutes() % 30))) * 60000;
                    HMSLog.d("PushSelfShowLog", "startIndex is:" + hours + " i is:" + i10 + " delay:" + minutes);
                    if (minutes >= 0) {
                        return minutes;
                    }
                    return 0L;
                }
            }
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", "error ", e10);
        }
        return 0L;
    }

    public static Boolean a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                int size = listQueryIntentActivities.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (listQueryIntentActivities.get(i10).activityInfo != null && str.equals(listQueryIntentActivities.get(i10).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", e10.toString(), e10);
        }
        return Boolean.FALSE;
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.i("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    public static void a(Context context, int i10) {
        if (context == null) {
            HMSLog.e("PushSelfShowLog", "context is null");
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(i10);
            }
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", "removeNotifiCationById err:" + e10.toString());
        }
    }

    public static void a(Context context, Intent intent) {
        try {
            int intExtra = intent.getIntExtra("selfshow_auto_clear_id", 0);
            HMSLog.d("PushSelfShowLog", "setDelayAlarm(cancel) alarmNotityId " + intExtra);
            if (intExtra == 0) {
                return;
            }
            Intent intent2 = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
            intent2.setPackage(context.getPackageName()).setFlags(32);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, intExtra, intent2, a());
            if (broadcast == null || alarmManager == null) {
                HMSLog.d("PushSelfShowLog", "alarm not exist");
            } else {
                HMSLog.d("PushSelfShowLog", "alarm cancel");
                alarmManager.cancel(broadcast);
            }
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", "cancelAlarm err:" + e10.toString());
        }
    }

    public static void a(Context context, Intent intent, long j10) {
        try {
            HMSLog.d("PushSelfShowLog", "enter setAPDelayAlarm(interval:" + j10 + "ms.");
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j10, PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() / 1000), intent, b()));
            }
        } catch (Exception e10) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error" + e10.toString());
        }
    }

    public static boolean a(Context context) {
        return "com.huawei.hwid".equals(context.getPackageName());
    }

    public static int b() {
        return c() ? 67108864 : 134217728;
    }

    public static Intent b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    private static boolean c() {
        return true;
    }

    public static boolean c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                HMSLog.d("PushSelfShowLog", str + " is installed");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean f() {
        return true;
    }
}
