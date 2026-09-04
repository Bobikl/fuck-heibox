package com.heytap.mcssdk.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.heytap.msp.push.notification.PushNotification;

/* JADX INFO: compiled from: NotificationHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static Notification a(Context context, String str, PushNotification.Builder builder) {
        Notification.Builder builder2 = new Notification.Builder(context);
        if (Build.VERSION.SDK_INT >= 26) {
            builder2.setChannelId(com.heytap.mcssdk.manage.a.f59932a);
        }
        builder2.setGroup(str);
        builder2.setGroupSummary(true);
        if (e(builder2, builder)) {
            return builder2.build();
        }
        return null;
    }

    public static StatusBarNotification[] b(NotificationManager notificationManager, String str) {
        return notificationManager.getActiveNotifications();
    }

    public static NotificationManager c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (NotificationManager) context.getSystemService("notification");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean d(NotificationManager notificationManager, String str, int i10) {
        StatusBarNotification[] statusBarNotificationArrB = b(notificationManager, str);
        if (statusBarNotificationArrB != null && statusBarNotificationArrB.length != 0) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArrB) {
                if (statusBarNotification.getId() == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean e(Notification.Builder builder, PushNotification.Builder builder2) {
        int iconRes = builder2.getIconRes();
        int iconLevel = builder2.getIconLevel();
        Icon icon = builder2.getIcon();
        if (icon != null) {
            builder.setSmallIcon(icon);
            return true;
        }
        if (iconRes != 0 && iconLevel != 0) {
            builder.setSmallIcon(iconRes, iconLevel);
            return true;
        }
        if (iconRes == 0) {
            return false;
        }
        builder.setSmallIcon(iconRes);
        return true;
    }
}
