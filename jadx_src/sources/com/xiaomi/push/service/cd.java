package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.fq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cd {
    private static int a(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.s.a(map.get("notification_top_period"), 0));
    }

    @TargetApi(19)
    private static Notification a(Notification notification, int i10, String str, aw awVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString("message_id"))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> listM720b = awVar.m720b();
        if (listM720b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listM720b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i10 == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    private static com.xiaomi.push.ah.a a(Context context, String str, int i10, String str2, Notification notification) {
        return new ce(i10, str2, context, str, notification);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static void m746a(Context context, String str, int i10, String str2, Notification notification) {
        if (com.xiaomi.push.j.m521a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            c(context, str, i10, str2, notification);
        }
    }

    static void a(Context context, Map<String, String> map, fq fqVar, long j10) {
        if (map == null || fqVar == null || !com.xiaomi.push.j.m521a(context) || !m747a(map)) {
            return;
        }
        int iA = a(map);
        int iB = b(map);
        if (iA <= 0 || iB > iA) {
            com.xiaomi.channel.commonutils.logger.b.d("set top notification failed - period:" + iA + " frequency:" + iB);
            return;
        }
        fqVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j10);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iB > 0) {
            bundle.putInt("mipush_n_top_fre", iB);
        }
        bundle.putInt("mipush_n_top_prd", iA);
        fqVar.addExtras(bundle);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m747a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z10 = Boolean.parseBoolean(str);
        com.xiaomi.channel.commonutils.logger.b.c("top notification' repeat is " + z10);
        return z10;
    }

    private static int b(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.s.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, String str) {
        return "n_top_update_" + i10 + lg.a.f131412e + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public static void c(Context context, String str, int i10, String str2, Notification notification) {
        aw awVarA;
        Notification notificationA;
        int iMin;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (notificationA = a(notification, i10, str2, (awVarA = aw.a(context, str)))) == null) {
            return;
        }
        boolean z10 = notification != null;
        if (notificationA.getGroupAlertBehavior() != 1) {
            com.xiaomi.push.bk.a((Object) notificationA, "mGroupAlertBehavior", (Object) 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = notificationA.extras.getLong("mipush_org_when", 0L);
        int i11 = notificationA.extras.getInt("mipush_n_top_fre", 0);
        int i12 = notificationA.extras.getInt("mipush_n_top_prd", 0);
        if (i12 <= 0 || i12 < i11) {
            return;
        }
        long j11 = ((long) (i12 * 1000)) + j10;
        if (j10 >= jCurrentTimeMillis || jCurrentTimeMillis >= j11) {
            iMin = 0;
        } else if (i11 > 0) {
            iMin = (int) Math.min((j11 - jCurrentTimeMillis) / 1000, i11);
        }
        if (!z10) {
            if (iMin > 0) {
                notificationA.when = jCurrentTimeMillis;
                com.xiaomi.channel.commonutils.logger.b.m62a("update top notification: " + str2);
                awVarA.a(i10, notificationA);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationA);
                builderRecoverBuilder.setPriority(0);
                builderRecoverBuilder.setWhen(jCurrentTimeMillis);
                Bundle extras = builderRecoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    builderRecoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.b.m62a("update top notification to common: " + str2);
                awVarA.a(i10, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("schedule top notification next update delay: " + iMin);
            com.xiaomi.push.ah.a(context).m145a(b(i10, str2));
            com.xiaomi.push.ah.a(context).b(a(context, str, i10, str2, (Notification) null), iMin);
        }
    }
}
